package com.orangehrm.entity;

import com.orangehrm.strategy.FirstNameStrategy;
import com.orangehrm.strategy.LastNameStrategy;
import lombok.Data;
import uk.co.jemos.podam.common.PodamStrategyValue;
import uk.co.jemos.podam.common.PodamStringValue;

@Data
public class EmployeeDetails {
	@PodamStrategyValue(FirstNameStrategy.class)
	private String firstName;
	@PodamStrategyValue(LastNameStrategy.class)
	private String lastName;
	private String middleName;
	
	@PodamStringValue(strValue = "resources/images.png")
	private String profilePicturePath;
}