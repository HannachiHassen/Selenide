package com.orangehrm.pagecomponents;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.orangehrm.enums.LeftMenuComponentType;

import lombok.SneakyThrows;

public class LeftMenuComponent {
	
	private static final SelenideElement PIM= $(byText("PIM"));
	private static final String MENU_NAME= "%s";
	
	public void selectAMenuFromLeftMenuBar(LeftMenuComponentType menuType) {
		//String.format(MENU_NAME, menuName);
		$(byText(menuType.getMenuName())).shouldBe(Condition.enabled).click();
	}
	
	 /*
	   I would not prefer to use the below method just to write fluent code
	   It introduces complexities. But I will leave it to your choice.
	   */
	  @SneakyThrows
	  public <T> T getInstanceOfClass(Class<T> clazz) {
	    return clazz.getDeclaredConstructor()
	        .newInstance();
	  }
}
