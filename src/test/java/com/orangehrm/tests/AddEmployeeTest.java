package com.orangehrm.tests;

import com.orangehrm.base.WebTestSetup;
import org.junit.jupiter.api.Test;

import com.orangehrm.base.TestSetup;
import com.orangehrm.entity.EmployeeDetails;
import com.orangehrm.entity.LoginDetails;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.testdata.EmployeeTestData;
import com.orangehrm.testdata.LoginTestData;

class AddEmployeeTest extends WebTestSetup {

	private final EmployeeDetails employeeDetails = EmployeeTestData.getRandomEmployeeDetails();
	private final LoginDetails loginDetails = LoginTestData.getValidLoginDetails();

	@Test
	void testAddEmployee() {

		LoginPage.getInstance()
				.loginToApplication(loginDetails)
				.navigateToAddEmployeePage()
				.addNewEmployee(employeeDetails)
				.checkWhetherEmployeeCreated();
	}
}
