package com.orangehrm.pagecomponents;

import static com.codeborne.selenide.Selectors.*;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Condition;

public class LeftMenuComponent {
	
	private static final SelenideElement PIM= $(byText("PIM"));
	private static final String MENU_NAME= "%s";
	
	public void selectAMenuFromLeftMenuBar(String menuName) {
		String.format(MENU_NAME, menuName);
		$(byText(menuName)).shouldBe(Condition.enabled).click();
	}
}
