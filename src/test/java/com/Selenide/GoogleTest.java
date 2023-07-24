package com.Selenide;

import static com.codeborne.selenide.Selenide.open;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class GoogleTest {

	public GoogleTest() {
	}
	
	@Test	
	void testUsingWebDriverRunner() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		WebDriverRunner.setWebDriver(driver);
		open("https://www.google.com");		
		WebDriverRunner.getWebDriver().quit();
	}
	@Test
	void testUsingWebDriverRunnerWithChromeProvider() {
		Configuration.browser = ChromeProvider.class.getName();
		open("https://www.google.com");		
	}
}
