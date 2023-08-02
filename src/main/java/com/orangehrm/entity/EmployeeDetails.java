package com.orangehrm.entity;

import lombok.Data;
import uk.co.jemos.podam.common.PodamStringValue;

@Data
public class EmployeeDetails {
		
	private String firstName;
	private String lastName;
	private String middleName;
	
	@PodamStringValue(strValue = "resources/images.png")	
	private String profilePicturePath;                                                                                                                                                    
}