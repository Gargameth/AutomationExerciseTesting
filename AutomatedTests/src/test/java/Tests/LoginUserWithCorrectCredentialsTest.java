package Tests;

import Pages.DeleteAccountPage;
import Pages.MainPage;
import Pages.SignUpLoginPage;
import org.testng.annotations.Test;

public class LoginUserWithCorrectCredentialsTest extends TestBase {

    @Test
    public void LoginWithValidUsernamePasswordTest(){
        MainPage mainPage = new MainPage(urls.get("MAIN_URL"));
        SignUpLoginPage signUpLoginPage = new SignUpLoginPage("SIGNUP_LOGIN_URL");
        DeleteAccountPage deleteAccountPage = new DeleteAccountPage("ACCOUNT_DELETED_URL");
        mainPage.NavigateToUrl();
        mainPage.CheckSiteVisibility();
        mainPage.ClickOnSignupLoginButton();
        signUpLoginPage.VerifySiteVisibility();
        signUpLoginPage.LogInUser();
        mainPage.CheckIfSomeoneIsLoggedIn("Makakers");
        mainPage.ClickOnDeleteAccountButton();
        deleteAccountPage.CheckDeleteAccountSignVisibility();
        deleteAccountPage.ClickContinueButton();
    }
}
