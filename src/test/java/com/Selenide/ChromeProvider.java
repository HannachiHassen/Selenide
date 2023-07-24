package com.Selenide;

import javax.annotation.Nonnull;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.codeborne.selenide.WebDriverProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeProvider implements WebDriverProvider{
	
	@Nonnull
	@Override
	public WebDriver createDriver(@Nonnull Capabilities capabilities) {
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
	}

}
