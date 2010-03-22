/*
 * StorageCondition.java
 *
 * Copyright (C) 2004-2007 Peter Graves
 * $Id: StorageCondition.java 12288 2009-11-29 22:00:12Z vvoutilainen $
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
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
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

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class StorageCondition extends SeriousCondition
{
  public StorageCondition()
  {
  }

  public StorageCondition(SubLObject initArgs)
  {
    super(initArgs);
  }

  public StorageCondition(String message)
  {
    super(message);
  }

  @Override
  public SubLObject typeOf()
  {
    return LispSymbols.STORAGE_CONDITION;
  }

  @Override
  public SubLObject classOf()
  {
    return StandardClass.STORAGE_CONDITION;
  }

  @Override
  public SubLObject typep(SubLObject type)
  {
    if (type == LispSymbols.STORAGE_CONDITION)
      return T;
    if (type == StandardClass.STORAGE_CONDITION)
      return T;
    return super.typep(type);
  }
}
