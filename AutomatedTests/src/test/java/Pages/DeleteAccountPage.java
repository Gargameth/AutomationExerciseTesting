package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DeleteAccountPage extends BasePage {
    public DeleteAccountPage(String URL) {
        super(URL);
    }

    public void ClickContinueButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='form']/div/div/div/div/a")));
    }
}
