package com.cao.galaxy.utils;

/**
 * StringUtils method validate String related logic
 */
public class StringUtils {

	public static boolean isEmpty(Object str) {
		return (str == null || "".equals(str));
	}
}
