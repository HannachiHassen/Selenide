package com.orangehrm.base;

import static com.codeborne.selenide.Selenide.open;

public class TestSetup {

	void setUp() {
		open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

}
