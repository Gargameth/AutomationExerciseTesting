package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountCreatedPage extends BasePage {
    public AccountCreatedPage(String URL) {
        super(URL);
    }

    @FindBy(xpath = "//*[@id='form']/div/div/div/div/a")
    WebElement ContinueButton;

    public void ClickContinueButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title")));
        ContinueButton.click();
    }
}