/* $Id: FloatingPointInferenceParameter.java 143897 2013-03-05 22:14:32Z baxter $
 *
 * Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */

package org.opencyc.inference.params;

//// Internal Imports

/**
 * <P>InferenceParameter is designed to...
 *
 * <P>Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author tbrussea
 * @date August 2, 2005, 10:25 AM
 * @version $Id: FloatingPointInferenceParameter.java 143897 2013-03-05 22:14:32Z baxter $
 */
public interface FloatingPointInferenceParameter extends InferenceParameter {
  double getMinValue();
  double getMaxValue();
}