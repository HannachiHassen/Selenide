package com.Selenide;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

public class HomePage {
        
    private static final SelenideElement EMPLOYEE_NAME = $x("//input[@placeholder='type for hints...']");
    private static final String EMPLOYEE_STATUS = "//div[text()='-- Select --']";
    private static final SelenideElement EMPLOYEE_STATUS_1 = $(Selectors.byText("-- Select --"));
    private static final String FREELANCE = "//*[text()='%s']";
       
    public HomePage fillEmployeeDetails() {
    	EMPLOYEE_NAME.shouldBe(visible).setValue("Hassen");
    	$x(EMPLOYEE_STATUS).shouldBe(Condition.visible).click();
    	EMPLOYEE_STATUS_1.shouldBe(visible).click();
    	$x(String.format(FREELANCE, "freelance")).shouldBe(Condition.visible).click();
    	return this;
    }

    public void checkWhetherFreeLanceTextIsVisible() {
    	$x(FREELANCE).shouldBe(Condition.text("Freelance"));
    }
}