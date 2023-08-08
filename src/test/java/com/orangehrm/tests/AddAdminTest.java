package com.orangehrm.tests;

import com.orangehrm.base.WebTestSetup;
import com.orangehrm.entity.LoginDetails;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.suite.SmokeTest;
import com.orangehrm.tags.WebTest;
import com.orangehrm.testdata.LoginTestData;
import org.junit.jupiter.api.Test;

@SmokeTest
public class AddAdminTest extends WebTestSetup {
    private final LoginDetails loginDetails = LoginTestData.getValidLoginDetails();

    @WebTest
    @Test
    void testAddAdmin() {

        LoginPage.getInstance()
                .loginToApplication(loginDetails)
                .navigateToAddAdminPage()
                .AddNewAdmin()
                .checkWhetherAdminCreated();
    }
}
