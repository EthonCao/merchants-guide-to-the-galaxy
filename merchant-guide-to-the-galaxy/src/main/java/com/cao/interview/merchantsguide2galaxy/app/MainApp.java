package com.cao.interview.merchantsguide2galaxy.app;

import com.cao.interview.merchantsguide2galaxy.dataHandler.ParserManager;

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
