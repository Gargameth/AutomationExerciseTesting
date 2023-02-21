package Pages;

import dev.failsafe.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AccountCreatedPage extends BasePage {
    public AccountCreatedPage(String URL) {
        super(URL);
    }

    @FindBy(xpath = "//*[@id='form']/div/div/div/div/a")
    WebElement ContinueButton;

    public void ClickContinueButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title")));
        ContinueButton.click();
        WebElement iframe = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/ins")));
        ((JavascriptExecutor)driver)
                .executeScript("arguments[0].remove();", iframe);
        ContinueButton.click();
    }
}