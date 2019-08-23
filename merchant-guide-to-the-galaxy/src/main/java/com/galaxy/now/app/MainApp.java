package com.galaxy.now.app;

import com.galaxy.now.utils.ParserManager;

public class MainApp {
	public static void main(String[] args) {
		try {
			ParserManager aConvertor = ParserManager.getInstance();
			aConvertor.parseInput();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
