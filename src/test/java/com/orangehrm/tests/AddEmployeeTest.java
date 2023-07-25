package com.orangehrm.tests;

import static com.codeborne.selenide.Selenide.*;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Configuration;
import com.orangehrm.pages.EmployeeInformationPage;
import com.orangehrm.pages.LoginPage;

class AddEmployeeTest {

	@Test
	void testAddEmployee() {
		Configuration.timeout = 30000;
		open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		new LoginPage()
		.loginToApplication()
		.getLeftMenuComponent()
		.selectAMenuFromLeftMenuBar("PIM");
		
		new EmployeeInformationPage()
		.addNewEmployee();

	}
}
