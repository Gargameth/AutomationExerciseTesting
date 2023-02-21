package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Objects;

public class SignUpLoginPage extends BasePage {
    public SignUpLoginPage(String URL) {
        super(URL);
    }

    @FindBy(css = "#form > div > div > div.col-sm-4.col-sm-offset-1 > div > h2")
    WebElement LoginTitle;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement LoginEmail;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    WebElement LoginPassword;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/button")
    WebElement LoginButton;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    WebElement SignupName;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement SignupEmail;

    public void VerifySiteVisibility(){
        if (!Objects.equals(LoginTitle.getText(), "Login to your account")){
            System.out.println("'Login to your account' either not displayed, or wrong website is being viewed.");
        }
        else {System.out.println("'Login to your account' visible.");}
    }
    public void NewUserSignup(){
        SignupName.sendKeys("Makakers");
        SignupEmail.sendKeys("something@something");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#form > div > div > div:nth-child(3) > div > form > button"))).click();
    }

    public void LogInUser(){
        LoginEmail.sendKeys("something@something");
        LoginPassword.sendKeys("falvimakako");
        LoginButton.click();
    }
}
