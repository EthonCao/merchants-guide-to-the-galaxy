package com.cao.interview.merchantsguide2galaxy.app;

import com.cao.interview.merchantsguide2galaxy.dataHandler.ParserManager;

/**
 * Main Application
 * <p>Title: MainApp</p>  
 * <p>Description: </p>  
 * @author Cao
 * @date 2019年8月26日
 */
public class MainApp {
	public static void main(String[] args) {
		String fileName = "SampleInput.txt";
		try {
			ParserManager aConvertor = ParserManager.getInstance();
			aConvertor.parseInput(fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
