package com.cao.interview.merchantsguide2galaxy.service;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.cao.interview.merchantsguide2galaxy.constant.ConstantValues;
import com.cao.interview.merchantsguide2galaxy.service.impl.GalaxyDataConverter;
import com.cao.interview.merchantsguide2galaxy.service.impl.RomanDataConverter;
import com.cao.interview.merchantsguide2galaxy.utils.StringUtils;


public class AbstractDataConverterTest {

	@Test
	public void test() {
		String currentLine;
		BufferedReader br = null;
		String fileName = "test.txt";
		try {
			File file = new File(AbstractDataConverterTest.class.getClassLoader().getResource(fileName).getFile()); 
		    br = new BufferedReader(new FileReader(file));
			while ((currentLine = br.readLine()) != null) {
				if (!StringUtils.isEmpty(currentLine)
						&& currentLine.startsWith(ConstantValues.HOW.getString())) {
					parseQuestions(currentLine);
				} else {
					//parseAssertion(currentLine);
				}
			}
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}
	
	private void parseQuestions(String theInput) throws Exception {
		if ((theInput.startsWith(ConstantValues.HOW_MUCH.getString())
				|| theInput.startsWith(ConstantValues.HOW_MANY.getString()))) {
			double aResult = convertInputValues(theInput);
			if (aResult != -1 && aResult != 0) {
				System.out.println(aResult);
			} else {
				System.out.println("InValid Input! No Results");
			}
		}
	}

	private double convertInputValues(String theInput) throws Exception {
		List<Object> aRomanValueList = getRomanValues(theInput);
		if (aRomanValueList == null || aRomanValueList.isEmpty()) {
			return 0;
		} else {
			return getResult(aRomanValueList);
			
		}
	}
	
	private List<Object> getRomanValues(String theInput) {
		return (List<Object>) new GalaxyDataConverter<>().converter(theInput);
	}
	
	private double getResult(List<Object> aRomanValueList) {
		return (double) new RomanDataConverter<>().converter(aRomanValueList);
	}

}
