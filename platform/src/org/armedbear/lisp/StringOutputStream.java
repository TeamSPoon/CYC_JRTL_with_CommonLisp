/*
 * StringOutputStream.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id$
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package org.armedbear.lisp;

import java.io.StringWriter;

public final class StringOutputStream extends Stream
{
    // for OLD-WORKS
    private final StringWriter stringWriter;
    // for NEW-BROKEN
    private final SeekableStringWriter seekableStringWriter;

    public StringOutputStream()
    {
        this(Symbol.CHARACTER);
    }

    StringOutputStream(LispObject elementType)
    {
        super(Symbol.STRING_OUTPUT_STREAM);
        this.setStreamElementType(elementType);
        this.eolStyle = EolStyle.RAW;
        // DONT REGRESS (true = OLD-WORKS)
        if(true) {
            initAsCharacterOutputStream(stringWriter = new StringWriter());
			seekableStringWriter = null;
        } else{
            initAsCharacterOutputStream(seekableStringWriter = new SeekableStringWriter());
            stringWriter = null;
        }
    }

    @Override
    public LispObject typeOf()
    {
        return Symbol.STRING_OUTPUT_STREAM;
    }

    @Override
    public LispObject classOf()
    {
        return BuiltInClass.STRING_OUTPUT_STREAM;
    }

    @Override
    public LispObject typep(LispObject type)
    {
        if (type == Symbol.STRING_OUTPUT_STREAM)
            return T;
        if (type == Symbol.STRING_STREAM)
            return T;
        if (type == BuiltInClass.STRING_OUTPUT_STREAM)
            return T;
        if (type == BuiltInClass.STRING_STREAM)
            return T;
        return super.typep(type);
    }

    @Override
	protected long _getFilePosition()
    {
        if (getStreamElementType() == NIL)
            return 0;
        // DONT REGRESS (true = OLD-WORKS)
        if(true) return stringWriter.getBuffer().length();
    	final long offset = getInputIndex();
        return offset;
    }

    @Override
	protected boolean _setFilePosition(LispObject arg) {
       // DONT REGRESS (true = OLD-WORKS)
        if(true) return super._setFilePosition(arg);

        if (getStreamElementType() == NIL)
            return false;

        try {
            int offset;

            if (arg == Keyword.START)
                offset = 0;
            else if (arg == Keyword.END)
                offset = seekableStringWriter.getBuffer().length();
            else {
                long n = Fixnum.getValue(arg);
                offset = (int) n; // FIXME arg might be a bignum
            }

            seekableStringWriter.seek(offset);

        	setInputIndex(offset);
        }
        catch (IllegalArgumentException e) {
            error(new StreamError(this, e));
        }

        return true;
    }

    public LispObject getBufferString()
    {
        if (getStreamElementType() == NIL)
            return new NilVector(0);
        StringBuffer sb = stringWriter.getBuffer();
        AbstractString s = new SimpleString(sb);
        sb.setLength(0);
        return s;
    }

    // ### %make-string-output-stream
    // %make-string-output-stream element-type => string-stream
    private static final Primitive MAKE_STRING_OUTPUT_STREAM =
        new Primitive("%make-string-output-stream", PACKAGE_SYS, false,
                       "element-type")
    {
        @Override
		public LispObject execute(LispObject arg)
        {
            return new StringOutputStream(arg);
        }
    };

    // ### get-output-stream-string
    // get-output-stream-string string-output-stream => string
    private static final Primitive GET_OUTPUT_STREAM_STRING =
        new Primitive("get-output-stream-string", "string-output-stream")
    {
        @Override
		public LispObject execute(LispObject arg)
        {
            if (arg instanceof StringOutputStream)
                return ((StringOutputStream)arg).getBufferString();
            return type_error(this, Symbol.STRING_OUTPUT_STREAM);
        }
    };
}
