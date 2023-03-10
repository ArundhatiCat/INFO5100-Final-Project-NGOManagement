/* Copyright (C) 2004 - 2008  db4objects Inc.  http://www.db4o.com

This file is part of the db4o open source object database.

db4o is free software; you can redistribute it and/or modify it under
the terms of version 2 of the GNU General Public License as published
by the Free Software Foundation and as clarified by db4objects' GPL 
interpretation policy, available at
http://www.db4o.com/about/company/legalpolicies/gplinterpretation/
Alternatively you can write to db4objects, Inc., 1900 S Norfolk Street,
Suite 350, San Mateo, CA 94403, USA.

db4o is distributed in the hope that it will be useful, but WITHOUT ANY
WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
for more details.

You should have received a copy of the GNU General Public License along
with this program; if not, write to the Free Software Foundation, Inc.,
59 Temple Place - Suite 330, Boston, MA  02111-1307, USA. */
package EDU.purdue.cs.bloat.inline;

import java.util.*;

import EDU.purdue.cs.bloat.editor.*;

/**
 * An <Tt>InlineContext</tt> gives access to the <Tt>CallGraph</tt> for the
 * program whose classes are being operated on by BLOAT.
 */
public interface InlineContext extends EditorContext {

	/**
	 * Returns the call graph for the program.
	 */
	public CallGraph getCallGraph();

	/**
	 * Sets the root methods for this <tt>InlineContext</tt>.
	 * 
	 * @param roots
	 *            The root methods (<tt>MemberRef</tt>s) of the program
	 * @throws IllegalStateException
	 *             Call graph has already been created with different roots.
	 */
	public void setRootMethods(Set roots);

	/**
	 * Returns an <tt>InlineStats</tt> object for getting statistics about
	 * inlining.
	 */
	public InlineStats getInlineStats();

	/**
	 * Notes that all classes, methods, and fields in a package should be
	 * "ignored" by inlining. That is, methods won't be inlined, classes won't
	 * be involved in specialization, etc. Note that it is exceptable to just
	 * add a prefix of a package name. For instance, adding "java" will ignore
	 * java.lang.Object, java.io.File, etc.
	 */
	public void addIgnorePackage(String name);

	/**
	 * Notes that a class should be ignored by inlining. That is, none of its
	 * methods will be inlined and it won't be involved in specialization.
	 */
	public void addIgnoreClass(Type type);

	/**
	 * Notes that a method should be ignored by inlining. That is, it will not
	 * be inlined.
	 */
	public void addIgnoreMethod(MemberRef method);

	/**
	 * Notes that a field should be ignored by inlining.
	 */
	public void addIgnoreField(MemberRef field);

	/**
	 * Returns <tt>true</tt> if a class should be ignored by inlining.
	 */
	public boolean ignoreClass(Type type);

	/**
	 * Returns <tt>true</tt> if a method should be ignored by inlining.
	 */
	public boolean ignoreMethod(MemberRef method);

	/**
	 * Returns <tt>true</tt> if a field should be ignored by inlining.
	 */
	public boolean ignoreField(MemberRef field);

	/**
	 * Sets whether or not we ignore all system classes.
	 */
	public void setIgnoreSystem(boolean ignoreSystem);
}
