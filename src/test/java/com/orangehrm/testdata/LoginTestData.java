package com.orangehrm.testdata;

import com.orangehrm.entity.LoginDetails;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public final class LoginTestData {

	private static final PodamFactory PODAM_FACTORY=new PodamFactoryImpl();
	
	private LoginTestData() {	}

	public static LoginDetails getValidLoginDetails() {
		return PODAM_FACTORY.manufacturePojo(LoginDetails.class);
	}
}
