package com.cao.interview.merchantsguide2galaxy.constant;

/**
 * Key words Mapper
 * <p>Title: ConstantValues</p>  
 * <p>Description: </p>  
 * @author Cao
 * @date 2019年8月26日
 */
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
