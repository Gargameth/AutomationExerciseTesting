package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {

    public MainPage(String URL) {
        super(URL);
    }

    @FindBy(linkText = "Signup / Login")
    WebElement SignupLoginButton;

    public void ClickOnSignupLoginButton(){
        driver.get(url);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("slider-carousel")));
        wait.until(ExpectedConditions.elementToBeClickable(SignupLoginButton)).click();
    }

    public void ClickOnDeleteAccountButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[10]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/delete_account']"))).click();
    }
}
