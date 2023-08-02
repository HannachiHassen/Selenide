package com.orangehrm.enums;

public enum LeftMenuComponentType {

	ADMIN("Admin"),
	PIM("PIM"),
	LEAVE("Leave"),
	TIME("Time"),
	RECRUITMENT("Recruitment"),
	MY_INFO("My Info"),
	PERFORMANCE("Performance"),
	DASHBOARD("Dashboard"),
	DIRECTORY("Directory"),
	MAINTENANCE("Maintenance"),
	BUZZ("Buzz");
	
	private final String menuName; 
	
	LeftMenuComponentType(String menuName) {
		this.menuName= menuName;
	}

	public String getMenuName() {
		return menuName;
	}
}
