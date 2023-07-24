package com.Selenide;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class Selector {

	/**
	 * Selenium
	 */
	@FindBy(css="css-value")
	private WebElement userName;
	
	/**
	 * Selenide
	 */
	@FindBy(css="css-value")
	private WebElement userNameSelenide;
	
	/**
	 * pagemethod
	 */
	$(userNameSelenide).setValue("testing");
	
	/**
	 * page factory initialization
	 */
	HomePage homepage=Selenide.page(HomePage.class);
	
    /**
     * recommended approach
     */
	private static final SelenideElement USER_NAME= $("css-value");
	private static final SelenideElement USER_NAME_1=$(By.cssSelector("css-value"));
	private static final SelenideElement USER_NAME_2=$(Selectors.byCssSelector("css-value"));
	private static final SelenideElement USER_NAME_3=$(byCssSelector("css-value"));
	private static final SelenideElement USER_NAME_4=element(byCssSelector("css-value"));
	
	/**
	 * Using Selenium for submit button
	 */
	@FindBy(xpath = "//button[text()='submit']")
    private WebElement submit;
    
	/**
	 * Using Selenide for submit button
	 */
    private static final SelenideElement SUBMIT_BUTTON = $x("//button[text()='submit']");
    private static final SelenideElement SUBMIT_BUTTON_1 = $(By.xpath("//button[text()='submit']"));
    private static final SelenideElement SUBMIT_BUTTON_2 = $(Selectors.byXpath("//button[text()='submit']"));
    private static final SelenideElement SUBMIT_BUTTON_3 = $(Selectors.byText("submit"));
    private static final SelenideElement SUBMIT_BUTTON_4 = $(byText("submit"));
    private static final SelenideElement SUBMIT_BUTTON_5 = $(byTagAndText("button","submit"));
    private static final SelenideElement SUBMIT_BUTTON_6 = $(byTagAndText("button","submit"), 0);   
    
    /**
     * Using Selenium for text in submit button
     */
    @FindBy(xpath = "//button[contains(text(),'submit']")
    private WebElement submitWithContainsText;
    
    /**
     * Using Selenide for text in submit button
     */
    private static final SelenideElement SUBMIT_BUTTON_CONTAINS = $(withText("submit"));
    private static final SelenideElement SUBMIT_BUTTON_CONTAINS_1 = $(withTagAndText("button","submit"));
    private static final SelenideElement SUBMIT_BUTTON_CONTAINS_2 = $(withTextCaseInsensitive("submit")); 
    
    /**
     * using Selenium for data
     */
    @FindBy(xpath = "//input[@data-id='data-value']")
    private WebElement employeeNameUsingAttribute;
    
    /**
     * Using Selenide for data
     */
    private static final SelenideElement EM_NAME_USING_ATTRIBUTE = $x("//input[@data-id='data-value']");
    private static final SelenideElement EM_NAME_USING_ATTRIBUTE_1 = $(byAttribute("data-id","data-value"));
    
    /**
     * Using Selenium for list of elements
     */
    @FindBy(xpath = "//h3")
    private List <WebElement> elements;
    
    /**
     * Using Selenide for list of elements
     */
    private static final ElementsCollection ELEMENTS = $$x("//h3");
    private static final ElementsCollection ELEMENTS_1 = $$x(byXpath("//h3"));
    private static final ElementsCollection ELEMENTS_2 = $$x(By.xpath("//h3"));
    private static final ElementsCollection ELEMENTS_3 = elements(byXpath("//h3"));
    private static final SelenideElement ELEMENTS_4 = elements(byXpath("//h3")).get(4);
    
    /**
     * Selenium
     */
    private static final By EMPLOYEE_ROLE_USING_TITLE =By.xpath("//div[@title='title-value']");
    
    /**
     * Selenide
     */
    private static final SelenideElement EMPLOYEE_ROLE_USING_TITLE_1 = $x("//div[@title='title-value']");
    private static final SelenideElement EMPLOYEE_ROLE_USING_TITLE_2 = $(byAttribute("title", "title-value"));
    private static final SelenideElement EMPLOYEE_ROLE_USING_TITLE_3 = $(byTitle("title-value"));
    
    /**
     * Selenium
     */
    private static final By EMPLOYEE_ROLE_USING_VALUE =By.xpath("//div[@value='value123']");
    
    /**
     * Selenide
     */
    private static final SelenideElement EMPLOYEE_ROLE_USING_VALUE_1 = $(By.xpath("//div[@value='value123']"));
    private static final SelenideElement EMPLOYEE_ROLE_USING_VALUE_2 = $x("div[@value='value123");
    private static final SelenideElement EMPLOYEE_ROLE_USING_VALUE_3 = $(byAttribute("value", "value123"));
    private static final SelenideElement EMPLOYEE_ROLE_USING_VALUE_4 = $(byValue("value123"));
    private static final SelenideElement EMPLOYEE_ROLE_USING_VALUE_5 = element(byValue("value123"));    
    
}
