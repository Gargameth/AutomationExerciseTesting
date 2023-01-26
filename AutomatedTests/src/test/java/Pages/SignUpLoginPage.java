package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignUpLoginPage extends BasePage {
    public SignUpLoginPage(String URL) {
        super(URL);
    }

    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement LoginEmail;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    WebElement LoginPassword;

    @FindBy(xpath = "//input[@data-qa='login-button']")
    WebElement LoginButton;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    WebElement SignupName;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement SignupEmail;

    public void NewUserSignup(){
        SignupName.sendKeys("Makakers");
        SignupEmail.sendKeys("something@something");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#form > div > div > div:nth-child(3) > div > form > button"))).click();
    }
}
