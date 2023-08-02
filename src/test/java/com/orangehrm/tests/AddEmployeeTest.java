package com.orangehrm.tests;

import org.junit.jupiter.api.Test;

import com.orangehrm.entity.EmployeeDetails;
import com.orangehrm.entity.LoginDetails;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.testdata.EmployeeTestData;
import com.orangehrm.testdata.LoginTestData;

class AddEmployeeTest {

	EmployeeDetails employeeDetails = EmployeeTestData.getRandomEmployeeDetails();
	LoginDetails loginDetails = LoginTestData.getValidLoginDetails();

	@Test
	void testAddEmployee() {

		LoginPage.getInstance()
		.loginToApplication(loginDetails)
		.navigateToAddEmployeePage()
		.addNewEmployee(employeeDetails)
		.checkWhetherEmployeeCreated();
	}
}
