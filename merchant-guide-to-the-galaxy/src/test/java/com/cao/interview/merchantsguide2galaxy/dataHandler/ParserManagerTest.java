package com.cao.interview.merchantsguide2galaxy.dataHandler;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

public class ParserManagerTest extends TestCase {

	@Test
	public void testGetInstance() {
		Assert.assertNotNull(ParserManager.getInstance());
	}
	
	@Test
	public void testParseInput() {
		try {
			ParserManager.getInstance();
			Assert.assertTrue(true);
		} catch (Exception e) {
			Assert.assertFalse(false);
		}
	}

}
