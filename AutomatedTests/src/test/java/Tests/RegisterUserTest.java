package Tests;

import Utils.Utils;
import Pages.*;
import org.testng.annotations.Test;

public class RegisterUserTest extends TestBase {

    @Test
    public void RegisterUser() throws InterruptedException {
        MainPage mainPage = new MainPage(urls.get("MAIN_URL"));
        SignUpLoginPage signUpLoginPage = new SignUpLoginPage(urls.get("SIGNUP_LOGIN_URL"));
        AccountDetailsPage accountDetailsPage = new AccountDetailsPage("SIGNUP_URL");
        AccountCreatedPage accountCreatedPage = new AccountCreatedPage(urls.get("ACCOUNT_CREATED_URL"));
        DeleteAccountPage deleteAccountPage = new DeleteAccountPage(urls.get("ACCOUNT_DELETED_URL"));
        mainPage.ClickOnSignupLoginButton();
        signUpLoginPage.NewUserSignup();
        accountDetailsPage.FillDetails();
        accountCreatedPage.ClickContinueButton();
        mainPage.ClickOnDeleteAccountButton();
        deleteAccountPage.ClickContinueButton();
    }
}
