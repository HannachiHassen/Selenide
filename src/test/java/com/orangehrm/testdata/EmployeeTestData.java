package com.orangehrm.testdata;

import com.orangehrm.entity.EmployeeDetails;

import uk.co.jemos.podam.api.PodamFactoryImpl;

public final class EmployeeTestData {

	private EmployeeTestData() {	}
	
	public static EmployeeDetails getRandomEmployeeDetails() {
		return new PodamFactoryImpl().manufacturePojo(EmployeeDetails.class);
	}

}
