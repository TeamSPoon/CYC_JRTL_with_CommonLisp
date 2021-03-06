/*
 * ShellScriptMode.java
 *
 * Copyright (C) 1998-2002 Peter Graves
 * $Id: ShellScriptMode.java,v 1.1.1.1 2002/09/24 16:09:28 piso Exp $
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
 */

package org.armedbear.j;

import java.awt.event.KeyEvent;

public final class ShellScriptMode extends AbstractMode implements Constants,
    Mode
{
    private static final ShellScriptMode mode = new ShellScriptMode();

    private ShellScriptMode()
    {
        super(SHELL_SCRIPT_MODE, SHELL_SCRIPT_MODE_NAME);
        keywords = new Keywords(this);
    }

    public static final ShellScriptMode getMode()
    {
        return mode;
    }

    @Override
	public final String getCommentStart()
    {
        return "# ";
    }

    @Override
	public final Formatter getFormatter(Buffer buffer)
    {
        return new ShellScriptFormatter(buffer);
    }

    @Override
	protected void setKeyMapDefaults(KeyMap km)
    {
        km.mapKey(KeyEvent.VK_ENTER, 0, "newlineAndIndent");
    }

    private static final String validChars =
        "-./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz";

    @Override
	public boolean isIdentifierStart(char c)
    {
        return validChars.indexOf(c) >= 0;
    }

    @Override
	public boolean isIdentifierPart(char c)
    {
        return validChars.indexOf(c) >= 0;
    }
}
