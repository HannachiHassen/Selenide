package com.orangehrm.pages;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class AddAminPage {
   private static final SelenideElement ADD_ADMIN_BUTTON = $(byText("Add"));
   private static final SelenideElement USER_ROLE_ADMIN = $(byText("User RoleAdmin"));
   public SelenideElement divSelect = $(byText("-- Select --"));
   private static final SelenideElement EMPLOYEE_NAME=$(byXpath("//input[@placeholder='Type for hints...']"));
   private static final SelenideElement STATUS=$(byText("StatusEnabled"));
   private static final SelenideElement USERNAME=$(byText("Username"));
   private static final SelenideElement PASSWORD=$("");
   private static final SelenideElement CONFIRM_PASSWORD=$("");
   private static final SelenideElement SAVE_BUTTON=$(byText("Save"));
   private static final ElementsCollection SUCCESS_MESSAGE = $$(byText("Success"));

   public AddAminPage AddNewAdmin(){
      ADD_ADMIN_BUTTON.shouldBe(enabled).click();
      USER_ROLE_ADMIN.shouldBe(visible).setValue("Admin").click();
      divSelect.shouldBe(visible).selectOption("Admin");
      EMPLOYEE_NAME.shouldBe(visible).setValue("TEST");
      STATUS.shouldBe(visible).setValue("Enabled").click();
      USERNAME.shouldBe(visible).setValue("admin");
      PASSWORD.shouldBe(visible).setValue("");
      CONFIRM_PASSWORD.shouldBe(visible).setValue("");
      SAVE_BUTTON.shouldBe(enabled).click();
      return this;
   }

   public void checkWhetherAdminCreated() {
      SUCCESS_MESSAGE.first().shouldHave(visible, textCaseSensitive("Success"));
   }
}