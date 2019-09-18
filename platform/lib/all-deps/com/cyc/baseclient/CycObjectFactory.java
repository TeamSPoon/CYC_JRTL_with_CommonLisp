package com.cyc.baseclient;

//// External Imports
import com.cyc.base.cycobject.CycAssertion;
import com.cyc.baseclient.cycobject.CycVariable;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.baseclient.cycobject.CycArrayList;
import com.cyc.baseclient.cycobject.CycSymbol;
import com.cyc.baseclient.cycobject.CycGuid;
import com.cyc.baseclient.cycobject.ByteArray;
import com.cyc.baseclient.cycobject.CycNumber;
import com.cyc.baseclient.cycobject.CycNart;
import com.cyc.baseclient.cycobject.DefaultCycAssertion;
import com.cyc.baseclient.cycobject.CycFort;
import com.cyc.base.cycobject.CycConstantI;
import com.cyc.base.cycobject.Nart;
import com.cyc.base.cycobject.CycObject;
import com.cyc.base.cycobject.Guid;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import com.cyc.baseclient.util.LRUCache;
import com.cyc.baseclient.xml.TextUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * Provides the way to create cyc objects and reuse previously cached instances.<br>
 *
 * All methods are static.<p>
 *
 * Collaborates with the <tt>CycConnection</tt> class which manages the api connections.
 *
 * @version $Id: CycObjectFactory.java 150787 2014-04-26 01:55:03Z nwinant $
 * @author Stephen L. Reed
 */
public class CycObjectFactory {

  /**
   * Least Recently Used Cache of CycSymbols, so that a reference to an existing <tt>CycSymbol</tt>
   * is returned instead of constructing a duplicate.
   */
  protected final static LRUCache cycSymbolCache = new LRUCache(500, 500, true);
  /**
   * Built in CycSymbols.
   */
  public static final CycSymbol t = makeCycSymbol("T", false);
  public static final CycSymbol nil = makeCycSymbol("NIL", false);
  public static final CycSymbol quote = makeCycSymbol("QUOTE", false);
  public static final CycSymbol backquote = makeCycSymbol("`", false);
  public static final CycSymbol cons = makeCycSymbol("CONS", false);
  public static final CycSymbol dot = makeCycSymbol(".", false);
  public static final CycSymbol nul = makeCycSymbol(":NULL", false);
  /** the free constant */
  public static CycConstantI FREE_CONSTANT = CycConstant.makeFreeConstant();
  /** the invalid constant */
  public static CycConstantI INVALID_CONSTANT = CycConstant.makeInvalidConstant();
  /** the invalid nart */
  public static Nart INVALID_NART = CycNart.makeInvalidNart();
  /** the invalid assertion */
  public static CycAssertion INVALID_ASSERTION = DefaultCycAssertion.makeInvalidAssertion();
  /**
   * The api command which is intercepted by the CycProxy agent to close the CycAccess object
   * associated with the connection between this agent and the particular cyc image.
   */
  public static final CycArrayList END_CYC_CONNECTION = (new CycArrayList(makeCycSymbol(
          "end-cyc-connection")));
  /**
   * the default size of the constant cache by name
   */
  public static final int CONSTANT_CACHE_BY_NAME_SIZE = 10000;
  /**
   * Least Recently Used Cache of CycConstants, so that a reference to an existing <tt>CycConstant</tt>
   * is returned instead of constructing a duplicate. Indexed via the name, so is optimised for the ascii api.
   */
  protected static LRUCache cycConstantCacheByName = new LRUCache(1000,
          CONSTANT_CACHE_BY_NAME_SIZE, true);
  /**
   * the default size of the constant cache by GUID
   */
  public static final int CONSTANT_CACHE_BY_GUID_SIZE = 10000;
  /**
   * Least Recently Used Cache of CycConstants, so that a reference to an existing <tt>CycConstant</tt>
   * is returned instead of constructing a duplicate. Indexed via the guid.
   */
  protected static LRUCache cycConstantCacheByGuid = new LRUCache(
          CONSTANT_CACHE_BY_GUID_SIZE, CONSTANT_CACHE_BY_GUID_SIZE, true);
  /**
   * the default size of the CycNumber cache
   */
  public static final int NUMBER_CACHE_SIZE = 500;
  /**
   * Least Recently Used Cache of CycNumbers, so that a reference to an existing <tt>CycNumber</tt>
   * is returned instead of constructing a duplicate.
   */
  protected static LRUCache<Number, CycNumber> cycNumberCache =
          new LRUCache<Number, CycNumber>(NUMBER_CACHE_SIZE, NUMBER_CACHE_SIZE,
          true);
  /**
   * Least Recently Used Cache of guids, so that a reference to an existing <tt>CycGuid</tt>
   * is returned instead of constructing a duplicate.
   */
  protected static LRUCache guidCache = new LRUCache(500, 500, true);
  /**
   * the default size of the variable cache
   */
  public static final int VARIABLE_CACHE_SIZE = 500;
  /**
   * A variable name suffix used to make unique names.
   */
  protected static int suffix = 1;

  /**
   * Constructs a new <tt>CycSymbol</tt> object.
   *
   * @param symbolNameAnyCase a <tt>String</tt> name.
   */
  public static CycSymbol makeCycSymbol(String symbolNameAnyCase) {
    String symbolName = CycSymbol.canonicalizeName(symbolNameAnyCase);
    CycSymbol cycSymbol = (CycSymbol) cycSymbolCache.get(symbolName);
    if (cycSymbol == null) {
      cycSymbol = new CycSymbol(symbolName);
      cycSymbolCache.put(symbolName, cycSymbol);
    }
    return cycSymbol;
  }

  public static CycSymbol makeCycSymbol(String packageNameCaseSensitive,
          String symbolNameCaseSensitive) {
    CycSymbol cycSymbol = null;
    String symbolName = symbolNameCaseSensitive;
    if ((packageNameCaseSensitive != null) && (!"".equals(
            packageNameCaseSensitive))) {
      symbolName = packageNameCaseSensitive + ":" + symbolNameCaseSensitive;
    }
    cycSymbol = (CycSymbol) cycSymbolCache.get(symbolNameCaseSensitive);
    if (cycSymbol == null) {
      cycSymbol = new CycSymbol(packageNameCaseSensitive,
              symbolNameCaseSensitive);
      cycSymbolCache.put(symbolName, cycSymbol);
    }
    return cycSymbol;
  }

  /**
   * Constructs a new <tt>CycSymbol</tt> object.
   *
   * @param symbolNameAnyCase a <tt>String</tt> name.
   * @see com.cyc.baseclient.cycobject.CycSymbol
   */
  public static CycSymbol makeCycSymbol(String symbolNameAnyCase,
          boolean shouldQuote) {
    String symbolName = CycSymbol.canonicalizeName(symbolNameAnyCase);
    CycSymbol cycSymbol = (CycSymbol) cycSymbolCache.get(symbolName);
    if (cycSymbol == null || cycSymbol.shouldQuote() != shouldQuote) {
      cycSymbol = new CycSymbol(symbolName, shouldQuote);
      cycSymbolCache.put(symbolName, cycSymbol);
    }
    return cycSymbol;
  }

  public static CycSymbol makeCycBoolean(final boolean b) {
    return (b) ? t : nil;
  }

  /**
   * Resets the <tt>CycSymbol</tt> cache.
   */
  public static void resetCycSymbolCache() {
    cycSymbolCache.clear();
    cycSymbolCache.put(CycSymbol.canonicalizeName("NIL"), nil);
    cycSymbolCache.put(CycSymbol.canonicalizeName("QUOTE"), quote);
    cycSymbolCache.put(CycSymbol.canonicalizeName("CONS"), cons);
    cycSymbolCache.put(CycSymbol.canonicalizeName("."), dot);
    cycSymbolCache.put(CycSymbol.canonicalizeName("T"), t);
    cycSymbolCache.put(CycSymbol.canonicalizeName("`"), backquote);
    cycSymbolCache.put(CycSymbol.canonicalizeName(":NULL"), nul);
  }
  /** The number of symbols that should be in a freshly reset cache. */
  public static final int RESET_SYMBOL_CACHE_SIZE = 7;

  /** Return the :FREE constant (a singleton).
   *
   * @return the :FREE constant (a singleton)
   */
  public static CycConstantI getFreeConstant() {
    return FREE_CONSTANT;
  }

  /**
   * Retrieves the <tt>CycSymbol</tt> with <tt>symbolName</tt>,
   * returning null if not found in the cache.
   *
   * @return a <tt>CycSymbol</tt> if found in the cache, otherwise <tt>null</tt>
   */
  public static CycSymbol getCycSymbolCache(String symbolName) {
    return (CycSymbol) cycSymbolCache.get(symbolName);
  }

  /**
   * Removes the <tt>CycSymbol</tt> from the cache if it is contained within.
   */
  public static void removeCycSymbolCache(CycSymbol cycSymbol) {
    Object element = cycSymbolCache.get(cycSymbol.toString());
    if (element != null) {
      cycSymbolCache.put(cycSymbol.toString(), null);
    }
  }

  /**
   * Returns the size of the <tt>CycGuid</tt> object cache.
   *
   * @return an <tt>int</tt> indicating the number of <tt>CycSymbol</tt> objects in the cache
   */
  public static int getCycSymbolCacheSize() {
    return cycSymbolCache.size();
  }

  /**
   * Resets all the caches.
   */
  public static void resetCaches() {
    resetCycConstantCaches();
    resetCycSymbolCache();
    resetCycVariableCache();
    resetGuidCache();
  }

  /**
   * Resets the Cyc constant caches.
   */
  public static void resetCycConstantCaches() {
    cycConstantCacheByName = new LRUCache(CONSTANT_CACHE_BY_NAME_SIZE,
            CONSTANT_CACHE_BY_NAME_SIZE, true);
    cycConstantCacheByGuid = new LRUCache(CONSTANT_CACHE_BY_GUID_SIZE,
            CONSTANT_CACHE_BY_NAME_SIZE, true);
  }

  /**
   * Adds the <tt>CycConstant</tt> to the cache by name and by guid
   *
   * @param cycConstant the Cyc constant to be added to the cache
   */
  public static void addCycConstantCache(final CycConstantI cycConstant) {
    if (cycConstant.getName() != null && cycConstant.getGuid() != null) {
      cycConstantCacheByName.put(cycConstant.getName(), cycConstant);
      cycConstantCacheByGuid.put(cycConstant.getGuid().toString(), cycConstant);
    }
  }

  /**
   * Retrieves the <tt>CycConstant</tt> with name, returning null if not found in the cache.
   */
  public static CycConstant getCycConstantCacheByName(String name) {
    return (CycConstant) cycConstantCacheByName.get(name);
  }

  /**
   * Retrieves the <tt>CycConstant</tt> with guid, returning null if not found in the cache.
   */
  public static CycConstant getCycConstantCacheByGuid(Guid guid) {
    return (CycConstant) cycConstantCacheByGuid.get(guid.toString());
  }

  /**
   * Removes the <tt>CycConstant</tt> from the caches if it is contained within.
   *
   * @param cycConstant the Cyc constant
   */
  public static void removeCaches(final CycConstantI cycConstant) {
    if (cycConstant.getName() != null) {
      Object element = cycConstantCacheByName.get(cycConstant.getName());
      if (element != null) {
        cycConstantCacheByName.put(cycConstant.getName(), null);
      }
    }
    if (cycConstant.getGuid() != null) {
      Object element = cycConstantCacheByGuid.get(cycConstant.getGuid());
      if (element != null) {
        cycConstantCacheByGuid.put(cycConstant.getGuid(), null);
      }
    }
  }

  /**
   * Returns the size of the <tt>CycConstant</tt> object cache by id.
   *
   * @return an <tt>int</tt> indicating the number of <tt>CycConstant</tt> objects in the cache by id
   */
  public static int getCycConstantCacheByNameSize() {
    return cycConstantCacheByName.size();
  }

  /**
   * Constructs a new <tt>CycVariable</tt> object using the variable name.
   *
   * @param name a <tt>String</tt> name.
   */
  public static CycVariable makeCycVariable(String name) {
    /*
     * if (name.startsWith("?")) name = name.substring(1);
     */
    return CycVariableFactory.get(name);
  }

  /**
   * Constructs a new <tt>CycVariable</tt> object by suffixing the given
   * variable.
   *
   * @param modelCycVariable a <tt>CycVariable</tt> to suffix
   */
  public static CycVariable makeUniqueCycVariable(CycVariable modelCycVariable) {
    return CycVariableFactory.get(modelCycVariable.name + "-" + suffix++);
  }
  private static Pattern variableNumericSuffixPattern = Pattern.compile(
          "-([0-9]*)$");

  /**
   * Return a CycVariable that is guaranteed to be different from all the
   * variables in existingVariables. If
   * <code>modelCycVariable</code> is already
   * different from those in
   * <code>existingVariables</code>, it may be returned.
   *
   * @param modelCycVariable
   * @param existingVariables
   * @return the new variable
   */
  public static CycVariable makeUniqueCycVariable(CycVariable modelCycVariable,
          Collection<CycObject> existingVariables) {
    if (!existingVariables.contains(modelCycVariable)) {
      return modelCycVariable;
    } else {
      CycVariable newVar;
      Matcher matcher = variableNumericSuffixPattern.matcher(
              modelCycVariable.name);
      if (matcher.find()) {
        Integer num = Integer.parseInt(matcher.group(1)) + 1;
        do {
          newVar = CycVariableFactory.get(modelCycVariable.name.substring(0,
                  matcher.start() + 1) + num++);
        } while (existingVariables.contains(newVar));
      } else {
        Integer num = 1;
        do {
          newVar = CycVariableFactory.get(modelCycVariable.name + "-" + num++);
        } while (existingVariables.contains(newVar));
      }
      return newVar;
    }
  }

  /**
   * Resets the <tt>CycVariable</tt> cache.
   */
  @Deprecated
  public static void resetCycVariableCache() {
    CycVariableFactory.reset();
  }

  /**
   * Adds the <tt>CycVariable<tt> to the cache.
   */
  @Deprecated
  public static void addCycVariableCache(CycVariable cycVariable) {
    if (cycVariable.name == null) {
      throw new RuntimeException("Invalid variable for caching " + cycVariable);
    }
    CycVariableFactory.add(cycVariable);
  }

  /**
   * Retrieves the <tt>CycVariable</tt> with <tt>name</tt>, returning null if
   * not found in the cache.
   *
   * @return a <tt>CycVariable</tt> if found in the cache, otherwise
   * <tt>null</tt>
   */
  @Deprecated
  public static CycVariable getCycVariableCache(String name) {
    return CycVariableFactory.get(name);
  }

  /**
   * Removes the <tt>CycVariable</tt> from the cache if it is contained
   * within.
   */
  @Deprecated
  public static void removeCycVariableCache(CycVariable cycVariable) {
    CycVariableFactory.remove(cycVariable);
  }

  /**
   * Returns the size of the <tt>CycVariable</tt> object cache.
   *
   * @return an <tt>int</tt> indicating the number of <tt>CycVariable</tt>
   * objects in the cache
   */
  public static int getCycVariableCacheSize() {
    return CycVariableFactory.size();
  }

  /**
   * Constructs a new <tt>CycNumber</tt> object from a <tt>Number</tt>.
   *
   * @param num a <tt>Number</tt> number.
   * @see java.lang.Number
   */
  public static CycNumber makeCycNumber(Number num) {
    CycNumber cycNumber = (CycNumber) cycNumberCache.get(num);
    if (cycNumber == null) {
      cycNumber = new CycNumber(num);
      cycNumberCache.put(num, cycNumber);
    }
    return cycNumber;
  }

  /**
   * Resets the <tt>CycNumber</tt> cache.
   */
  public static void resetCycNumberCache() {
    cycNumberCache = new LRUCache(NUMBER_CACHE_SIZE, NUMBER_CACHE_SIZE, true);
  }

  /**
   * Adds the <tt>CycNumber</tt> to the cache.
   */
  public static void addCycNumberCache(CycNumber cycNumber) {
    if (cycNumber.getNumber() == null) {
      throw new RuntimeException("Invalid number for caching " + cycNumber);
    }
    cycNumberCache.put(cycNumber.getNumber().doubleValue(), cycNumber);
  }

  /**
   * Retrieves the <tt>CycNumber</tt> with <tt>num</tt>,
   * returning null if not found in the cache.
   *
   * @return a <tt>CycVariable</tt> if found in the cache, otherwise
   * <tt>null</tt>
   */
  public static CycNumber getCycNumberCache(Double num) {
    return (CycNumber) cycNumberCache.get(num);
  }

  /**
   * Removes the <tt>CycVariable</tt> from the cache if it is contained within.
   */
  public static void removeCycNumberCache(CycNumber cycNumber) {
    Object element = cycNumberCache.get(cycNumber.getNumber().doubleValue());
    if (element != null) {
      cycNumberCache.put(cycNumber.getNumber().doubleValue(), null);
    }
  }

  /**
   * Returns the size of the <tt>CycNumber</tt> object cache.
   *
   * @return an <tt>int</tt> indicating the number of <tt>CycVariable</tt> objects in the cache
   */
  public static int getCycNumberCacheSize() {
    return cycNumberCache.size();
  }

  /**
   * Returns a cached <tt>CycGuid</tt> object or construct a new
 CycGuid object from a guid string if the guid is not found in the cache.
   *
   * @param guidString a <tt>String</tt> form of a GUID.
   */
  public static CycGuid makeGuid(String guidString) {
    CycGuid guid = (CycGuid) guidCache.get(guidString);
    if (guid == null) {
      guid = new CycGuid(guidString);
      addGuidCache(guid);
    }
    return guid;
  }

  public static CycGuid makeGuid(byte[] data) {
    final CycGuid guid = new CycGuid(data);
    final String guidString = guid.getGuidString();
    return makeGuid(guidString);
  }

  /**
   * Adds the <tt>CycGuid</tt> to the cache.
   */
  public static void addGuidCache(CycGuid guid) {
    guidCache.put(guid.getGuidString(), guid);
  }

  /**
   * Resets the <tt>CycGuid</tt> cache.
   */
  public static void resetGuidCache() {
    guidCache = new LRUCache(500, 500, true);
  }

  /**
   * Retrieves the <tt>CycGuid</tt> with <tt>guidName</tt>,
   * returning null if not found in the cache.
   *
   * @return the <tt>CycGuid</tt> if it is found in the cache, otherwise
   * <tt>null</tt>
   */
  public static CycGuid getGuidCache(String guidName) {
    return (CycGuid) guidCache.get(guidName);
  }

  /**
   * Removes the <tt>CycGuid</tt> from the cache if it is contained within.
   */
  public static void removeGuidCache(CycGuid guid) {
    Object element = guidCache.get(guid.getGuidString());
    if (element != null) {
      guidCache.put(guid.getGuidString(), null);
    }
  }

  /**
   * Returns the size of the <tt>CycGuid</tt> object cache.
   *
   * @return an <tt>int</tt> indicating the number of <tt>CycGuid</tt> objects in the cache
   */
  public static int getGuidCacheSize() {
    return guidCache.size();
  }

  /**
   * Unmarshals a cyc object from an XML representation.
   *
   * @param xmlString the XML representation of the cyc object
   * @return the cyc object
   */
  public static Object unmarshal(final String xmlString)
          throws IOException, ParserConfigurationException, SAXException {
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    dbf.setNamespaceAware(true);
    DocumentBuilder db = dbf.newDocumentBuilder();
    Document doc = db.parse(new InputSource(new ByteArrayInputStream(
            xmlString.getBytes())));
    return unmarshalElement(doc.getDocumentElement(), doc);
  }

  /**
   * Unmarshals a cyc object from the given element in an XML Document object.
   *
   * @param element the element representing the cyc object
   * @param document the XML document containing the element
   * @return the cyc object
   */
  private static Object unmarshalElement(final Element element,
          final Document document) throws IOException {
    String elementName = element.getTagName();
    if (elementName.equals("guid")) {
      return unmarshalGuid(element);
    } else if (elementName.equals("symbol")) {
      return unmarshalCycSymbol(element);
    } else if (elementName.equals("variable")) {
      return unmarshalCycVariable(element);
    } else if (elementName.equals("constant")) {
      return unmarshalCycConstant(element, document);
    } else if (elementName.equals("nat")) {
      return unmarshalCycNart(element, document);
    } else if (elementName.equals("list")) {
      return unmarshalCycList(element, document);
    } else if (elementName.equals("string")) {
      return TextUtil.undoEntityReference(element.getTextContent());
    } else if (elementName.equals("integer")) {
      return new Integer(element.getTextContent().trim());
    } else if (elementName.equals("double")) {
      return new Double(element.getTextContent().trim());
    } else if (elementName.equals("byte-vector")) {
      return unmarshalByteArray(element, document);
    } else if (elementName.equals("assertion")) {
      return unmarshalCycAssertion(element);
    } else {
      throw new IOException("Invalid element name " + elementName);
    }
  }

  /**
   * Unmarshals a CycGuid from the given element in an XML Document object.
   *
   * @param guidElement the guid xml element
   * @return the guid or cached reference to an existing guid object
   */
  private static CycGuid unmarshalGuid(Element guidElement) {
    String guidString = guidElement.getTextContent().trim();
    CycGuid guid = getGuidCache(guidString);
    if (guid != null) {
      return guid;
    }
    return makeGuid(guidString);
  }

  /**
   * Unmarshals a CycSymbol from the given element in an XML Document object.
   *
   * @param cycSymbolElement the CycSymbol xml element
   * @return the CycSymbol or cached reference to an existing CycSymbol object
   */
  private static CycSymbol unmarshalCycSymbol(Element cycSymbolElement) {
    String symbolName = TextUtil.undoEntityReference(
            cycSymbolElement.getTextContent().trim());
    CycSymbol cycSymbol = getCycSymbolCache(symbolName);
    if (cycSymbol != null) {
      return cycSymbol;
    }
    return makeCycSymbol(symbolName);
  }

  /**
   * Unmarshals a DefaultCycAssertion from the given element in an XML Document object.
   *
   * @param cycAssertionElement the DefaultCycAssertion xml element
   * @return the DefaultCycAssertion object
   */
  private static DefaultCycAssertion unmarshalCycAssertion(
          Element cycAssertionElement) {
    //TODO
    CycArrayList hlFormula = new CycArrayList();
    CycFort mt = null;
    return new DefaultCycAssertion(hlFormula, mt);
  }

  /**
   * Unmarshals a CycVariable from the given element in an XML Document object.
   *
   * @param cycVariableElement the CycVariable xml element
   * @return the CycVariable or cached reference to an existing CycVariable object
   */
  private static CycVariable unmarshalCycVariable(Element cycVariableElement) {
    String name = TextUtil.undoEntityReference(
            cycVariableElement.getTextContent().trim());
    CycVariable cycVariable = getCycVariableCache(name);
    if (cycVariable != null) {
      return cycVariable;
    }
    return makeCycVariable(name);
  }

  private static Element getChild(Element parent, String tagName) {
    NodeList nodes = parent.getChildNodes();
    for (int i = 0, size = nodes.getLength(); i < size; i++) {
      Node node = nodes.item(i);
      if (node.getNodeType() == Node.ELEMENT_NODE) {
        String possibleTagName = node.getLocalName();
        if (tagName.equals(possibleTagName)) {
          return (Element) node;
        }
      }
    }
    return null;
  }

  private static Element getFirstChildElement(Element parent) {
    NodeList nodes = parent.getChildNodes();
    for (int i = 0, size = nodes.getLength(); i < size; i++) {
      Node node = nodes.item(i);
      if (node.getNodeType() == Node.ELEMENT_NODE) {
        return (Element) node;
      }
    }
    return null;
  }

  /**
   * Unmarshals a CycConstant from the given element in an XML Document object.
   *
   * @param cycConstantElement the element representing the CycConstant
   * @param document the XML document containing the element
   * @return the CycConstant
   */
  private static CycConstant unmarshalCycConstant(
          final Element cycConstantElement,
          final Document document) {
    CycConstant cycConstant = null;
    CycGuid guid = null;
    Node guidElement = getChild(cycConstantElement, "guid");
    if (guidElement != null) {
      guid = makeGuid(guidElement.getTextContent().trim());
      cycConstant = getCycConstantCacheByGuid(guid);
      if (cycConstant != null) {
        return cycConstant;
      }
    }
    String name = null;
    Node nameElement = getChild(cycConstantElement, "name");
    if (nameElement != null) {
      name = TextUtil.undoEntityReference(nameElement.getTextContent().trim());
      cycConstant = getCycConstantCacheByName(name);
      if (cycConstant != null) {
        return cycConstant;
      }
    }
    cycConstant = new CycConstant(name, guid);
    if (guid != null || name != null) {
      addCycConstantCache(cycConstant);
    }
    return cycConstant;
  }

  /**
   * Unmarshals a CycNart from the given element in an XML Document object.
   *
   * @param cycNartElement the element representing the CycNart
   * @param document the XML document containing the element
   * @return the CycNart
   */
  private static CycNart unmarshalCycNart(final Element cycNartElement,
          final Document document) throws IOException {
    CycFort functor = null;
    Element functorElement = getChild(cycNartElement, "functor");
    if (functorElement != null) {
      Element cycConstantFunctorElement = getChild(functorElement, "constant");
      Element cycNartFunctorElement = getChild(functorElement, "nat");
      if (cycConstantFunctorElement != null) {
        if (cycNartFunctorElement != null) {
          throw new IOException("Invalid CycNart functor" + functorElement);
        }
        functor = unmarshalCycConstant(cycConstantFunctorElement, document);
      } else if (cycNartFunctorElement != null) {
        functor = unmarshalCycNart(cycNartFunctorElement, document);
      } else {
        throw new IOException(
                "Missing functor constant/nart from CycNart " + cycNartElement);
      }
    }
    NodeList argElements = cycNartElement.getElementsByTagName("arg");
    CycArrayList arguments = new CycArrayList();
    for (int i = 0; i < argElements.getLength(); i++) {
      if (argElements.item(i) instanceof Element) {
        Element argElement = (Element) argElements.item(i);
        arguments.add(unmarshalElement(getFirstChildElement(argElement),
                document));
      }
    }
    CycArrayList nartCycList = new CycArrayList();
    nartCycList.add(functor);
    nartCycList.addAll(arguments);
    CycNart cycNart = new CycNart(nartCycList);
    return cycNart;
  }

  /**
   * Unmarshals a CycArrayList from the given element in an XML Document object.
   *
   * @param cycListElement the element representing the CycArrayList
   * @param document the XML document containing the element
   * @return the CycArrayList
   */
  private static CycArrayList unmarshalCycList(final Element cycListElement,
          final Document document)
          throws IOException {
    NodeList elements = cycListElement.getChildNodes();
    CycArrayList cycList = new CycArrayList();
    for (int i = 0, size = elements.getLength(); i < size; i++) {
      Node node = elements.item(i);
      if (node.getNodeType() == Node.ELEMENT_NODE) {
        Element element = (Element) node;
        if (element.getTagName().equals("dotted-element")) {
          cycList.setDottedElement(unmarshalElement(getFirstChildElement(
                  element), document));
        } else {
          cycList.add(unmarshalElement(element, document));
        }
      }
    }
    return cycList;
  }

  /**
   * Unmarshals a ByteArray from the given element in an XML Document object.
   *
   * @param byteArrayElement the element representing the CycArrayList
   * @param document the XML document containing the element
   * @return the ByteArray
   */
  private static ByteArray unmarshalByteArray(Element byteArrayElement,
          Document document)
          throws IOException {
    NodeList elements = byteArrayElement.getChildNodes();
    ArrayList arrayList = new ArrayList();
    for (int i = 0, size = elements.getLength(); i < size; i++) {
      Node node = elements.item(i);
      if (node.getNodeType() == Node.ELEMENT_NODE) {
        Element element = (Element) node;
        if (element.getTagName().equals("byte")) {
          arrayList.add(new Byte(element.getTextContent().trim()));
        }
      }
    }
    byte[] bytes = new byte[arrayList.size()];
    for (int i = 0; i < arrayList.size(); i++) {
      bytes[i] = ((Byte) arrayList.get(i)).byteValue();
    }
    return new ByteArray(bytes);
  }

  private static class CycVariableFactory {

    /**
     * Least Recently Used Cache of CycVariables, so that a reference to an
     * existing <tt>CycVariable</tt> is returned instead of constructing a
     * duplicate.
     */
    private static LRUCache cycVariableCache = new LRUCache(
            VARIABLE_CACHE_SIZE, VARIABLE_CACHE_SIZE, true);

    private static CycVariable get(String name) {
      CycVariable cycVariable = (CycVariable) cycVariableCache.get(name);
      if (cycVariable == null) {
        cycVariable = new CycVariable(name);
        cycVariableCache.put(name, cycVariable);
      }
      return cycVariable;
    }

    private static void add(CycVariable var) {
      cycVariableCache.put(var.name, var);
    }

    private static void remove(CycVariable var) {
      cycVariableCache.remove(var.name);
    }

    private static int size() {
      return cycVariableCache.size();
    }

    private static void reset() {
      cycVariableCache.clear();
    }
  }
}
