package com.galaxy.now.utils;

/**
 * StringUtils method validate String related logic
 */
public class StringUtils {

	public static boolean isEmpty(Object str) {
		return (str == null || "".equals(str));
	}
}
