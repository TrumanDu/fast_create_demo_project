package com.aibibang.constant;

/**
 * session属性
 * 
 *
 */
public enum SessionAttr {

	USER_LOGIN("USER_LOGIN"),
	USER_ROLES("USER_ROLES"),
	USER_MENUS("USER_MENUS");
	
	private SessionAttr(String name) {
		this.name = name;
	}

	private String name;

	public String getValue() {
	
		return this.name;
	}
	
	
}