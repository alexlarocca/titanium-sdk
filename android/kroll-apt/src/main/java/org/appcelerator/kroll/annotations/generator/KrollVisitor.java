/**
 * TiDev Titanium Mobile
 * Copyright TiDev, Inc. 04/07/2022-Present
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */
package org.appcelerator.kroll.annotations.generator;

public interface KrollVisitor<T> {
	boolean visit(T element, Object arg);
}
