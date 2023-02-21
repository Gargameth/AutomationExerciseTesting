package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Objects;

public class DeleteAccountPage extends BasePage {
    public DeleteAccountPage(String URL) {
        super(URL);
    }

    public void ClickContinueButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='form']/div/div/div/div/a")));
    }

    public void CheckDeleteAccountSignVisibility(){
        String deleteAccountSign = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b"))).getText();
        if (!Objects.equals(deleteAccountSign, "Account Deleted!")){
            System.out.println("Either the account wasn't deleted, or you are at the wrong site.");
        }
        else {System.out.println("Account successfully deleted.");}
    }
}
