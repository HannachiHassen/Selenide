package com.orangehrm.tests;

import com.orangehrm.base.WebTestSetup;
import com.orangehrm.entity.LoginDetails;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.testdata.LoginTestData;
import org.junit.jupiter.api.Test;

public class AddAdminTest extends WebTestSetup {
    private final LoginDetails loginDetails = LoginTestData.getValidLoginDetails();

    @Test
    void testAddAdmin() {

        LoginPage.getInstance()
                .loginToApplication(loginDetails)
                .navigateToAddAdminPage()
                .AddNewAdmin()
                .checkWhetherAdminCreated();
    }
}
