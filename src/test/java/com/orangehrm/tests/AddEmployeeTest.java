package com.orangehrm.tests;

import static com.codeborne.selenide.Selenide.*;

import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Configuration;
import com.orangehrm.entity.EmployeeDetails;
import com.orangehrm.pages.AddEmployeePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.testdata.EmployeeTestData;


class AddEmployeeTest {

	EmployeeDetails employee = EmployeeTestData.getRandomEmployeeDetails();
	
	@Test
	void testAddEmployee() {
		open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		new LoginPage()
		.loginToApplication()
		.getLeftMenuComponent()
		.selectAMenuFromLeftMenuBar("PIM");
		
		new AddEmployeePage()
		.addNewEmployee(employee)
		.checkWhetherEmployeeCreated();
	}
}
