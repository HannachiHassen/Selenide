package com.orangehrm.base;

import static com.codeborne.selenide.Selenide.open;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import com.codeborne.selenide.logevents.SelenideLogger;

import io.qameta.allure.selenide.AllureSelenide;

public class TestSetup {
	
	@BeforeAll
	  static void setupAllureReports() {
	    //Logs element interaction steps to the allure report
	    SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
	  }
}
