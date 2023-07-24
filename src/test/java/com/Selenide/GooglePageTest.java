package com.Selenide;

import java.time.Duration;
import java.util.List;

import javax.annotation.Nonnull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.codeborne.selenide.CheckResult;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Driver;

import org.junit.jupiter.api.Assertions;

import io.github.bonigarcia.wdm.WebDriverManager;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;

public class GooglePageTest {
	
	public GooglePageTest() {		
	}
	
    @Test
    void testGoogleSearchUsingSelenium(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")))
                .sendKeys("Selenide Testing");
        List<WebElement> elements=driver.findElements(By.xpath("//h3"));

        Assertions.assertEquals(11, elements.size());
        Assertions.assertTrue(elements.stream().map(WebElement::getText)
                .anyMatch(e->e.equalsIgnoreCase("Selenide Testing")));
        driver.quit();
    }
    @Test
    void testGoogleSearchUsingSelenide(){
    	Configuration.timeout=5000;
        open("https://www.google.com");
        $(By.name("q"))
                .shouldBe(visible)
                .setValue("Selenide Testing")
                .pressEnter();
        $$x("//h3")
                .shouldBe(CollectionCondition.sizeGreaterThan(6))
                .shouldHave(size(17))                
                .shouldHave(containExactTextsCaseSensitive("Selenide - Concise UI Tests in Java"))
                .shouldHave(CollectionCondition.itemWithText("Selenide - Concise UI Tests in Java"))
                .shouldHave(CollectionCondition.anyMatch("at least one of the element should contains testing selenide", e->e.getText().equalsIgnoreCase("Selenide - Concise UI Tests in Java")));
    }
    
    @Test
    void testCustomConditionUsingSelenide(){
    	Configuration.timeout=5000;
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        $(byName("username"))
                .shouldHave(GooglePageTest.placeholder("Username"));
    }
    
    public static Condition placeholder(String expectedplaceholder) {
    	return new Condition("placeholder with value " +expectedplaceholder) {
    		@Nonnull
    		@Override
    		public CheckResult check(Driver driver, WebElement element) {
    		    String placeholderValue=element.getAttribute("placeholder") == null ? "" : element.getAttribute("placeholder");
    		    boolean isPlaceholderValueMatches =placeholderValue.equalsIgnoreCase(expectedplaceholder);
    			return new CheckResult(isPlaceholderValueMatches, placeholderValue);
    		}
    	};
    }
}
