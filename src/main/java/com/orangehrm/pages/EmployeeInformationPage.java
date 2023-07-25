package com.orangehrm.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;

public class EmployeeInformationPage {

	private static final SelenideElement ADD_EMPLOYEE_BUTTON = $(byTagAndText("a", "Add Employee"));
	private static final SelenideElement FIRST_NAME = $(byName("firstName"));
	private static final SelenideElement LAST_NAME = $(byName("lastName"));
	private static final SelenideElement MIDDLE_NAME = $(byName("middleName"));
	private static final SelenideElement SAVE_BUTTON = $(byText("Save"));
	private static final SelenideElement IMAGE = $(byXpath("//input[@type='file']"));
	private static final ElementsCollection SUCCESS_MESSAGE = $$(byText("Success"));

	public void addNewEmployee() {
		ADD_EMPLOYEE_BUTTON.shouldBe(visible).click();
		FIRST_NAME.shouldBe(visible).setValue("abcd123");
		LAST_NAME.shouldBe(visible).setValue("abcd12356");
		MIDDLE_NAME.shouldBe(visible).setValue("abcd1254");
		IMAGE.shouldBe(enabled).uploadFromClasspath("images.png");
		SAVE_BUTTON.shouldBe(enabled).click();
	}

}
