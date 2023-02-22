package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Objects;

public class MainPage extends BasePage {

    public MainPage(String URL) {
        super(URL);
    }

    @FindBy(linkText = "Signup / Login")
    WebElement SignupLoginButton;

    @FindBy(xpath = "//*[@id='header']/div/div/div/div[2]/div/ul/li[8]/a")
    WebElement ContactUsButton;

    public void CheckSiteVisibility(){
        String title = driver.getTitle();
        if (!Objects.equals(title, "Automation Exercise")){
            System.out.println("Wrong website or title is not displayed correctly.");
        }
        else {
            System.out.println("Right title visible; we are on the required website.");
        }
    }

    public void ClickOnContactUsButton(){
        ContactUsButton.click();
    }

    public void CheckIfSomeoneIsLoggedIn(String username){
        String LoginCheckerText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(10) > a"))).getText();
        if (!Objects.equals(LoginCheckerText, "Logged in as " + username)){
            System.out.println("Wrong user logged in.");
        }
        else {System.out.println(username + " is logged in");}
    }

    public void ClickOnSignupLoginButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("slider-carousel")));
        wait.until(ExpectedConditions.elementToBeClickable(SignupLoginButton)).click();
    }

    public void ClickOnDeleteAccountButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[10]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/delete_account']"))).click();
    }
}
