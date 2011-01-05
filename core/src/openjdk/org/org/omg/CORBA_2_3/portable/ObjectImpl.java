/*
 * Copyright (c) 1999, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
/*
 * Licensed Materials - Property of IBM
 * RMI-IIOP v1.0
 * Copyright IBM Corp. 1998 1999  All Rights Reserved
 *
 */

package org.omg.CORBA_2_3.portable;

import org.omg.CORBA_2_3.portable.Delegate;

/**
 * ObjectImpl class is the base class for all stubs.  It provides the
 * basic delegation mechanism.  It extends org.omg.CORBA.portable.ObjectImpl
 * and provides new methods defined by CORBA 2.3.
 *
 * @see org.omg.CORBA.portable.ObjectImpl
 * @author  OMG
 * @since   JDK1.2
 */


public abstract class ObjectImpl extends org.omg.CORBA.portable.ObjectImpl {

    /** Returns the codebase for this object reference.
     * @return the codebase as a space delimited list of url strings or
     * null if none.
     */
    public java.lang.String _get_codebase() {
	org.omg.CORBA.portable.Delegate delegate = _get_delegate();
	if (delegate instanceof Delegate)
	    return ((Delegate) delegate).get_codebase(this);
	return null;
    }
}
