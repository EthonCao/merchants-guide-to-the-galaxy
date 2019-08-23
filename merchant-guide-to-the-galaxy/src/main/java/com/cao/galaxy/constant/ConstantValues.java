package com.cao.galaxy.constant;

public enum ConstantValues {
	
	QUESTION_MARK("?"),

	IS_VALUE(" is "),

	SPACE(" "),

	HOW("how"),

	HOW_MANY("how many"),

	HOW_MUCH("how much"),

	CREDITS("Credits");
	
	
	private String string;
	
	
	private ConstantValues(String string) {
		this.string = string;
	}
    
	
    public String getString() {
    	return String.valueOf(string);
    }
}
