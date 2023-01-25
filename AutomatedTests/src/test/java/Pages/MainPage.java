package Pages;

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
        wait.until(ExpectedConditions.elementToBeClickable(SignupLoginButton)).click();
    }
}
