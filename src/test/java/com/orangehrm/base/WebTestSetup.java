package com.orangehrm.base;

import com.codeborne.selenide.Configuration;
import com.orangehrm.factory.ConfigFactory;
import com.orangehrm.factory.FrameworkConfig;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class WebTestSetup extends TestSetup{

    private static final FrameworkConfig CONFIG = ConfigFactory.config();
    private static final String URL =CONFIG.webURL();
    @BeforeEach
    void setUp(){
        Configuration.headless=false;
        open(URL);
    }
}
