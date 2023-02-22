package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.Objects;

public class ContactUsPage extends BasePage {

    public ContactUsPage(String URL) {
        super(URL);
    }

    @FindBy(xpath = "//*[@id=\"contact-page\"]/div[2]/div[1]/div/h2")
    WebElement GetInTouchSign;

    @FindBy(name = "name")
    WebElement NameInputField;

    @FindBy(name = "email")
    WebElement EmailInputField;

    @FindBy(name = "subject")
    WebElement SubjectInputField;

    @FindBy(id = "message")
    WebElement MessageInputField;

    @FindBy(name = "upload_file")
    WebElement UploadFileOption;

    @FindBy(xpath = "//*[@id=\"contact-us-form\"]/div[6]/input")
    WebElement SubmitButton;

    @FindBy(className = "alert-success")
    WebElement MessageSentSuccessfully;

    @FindBy(className = "btn-success")
    WebElement ReturnToHomeButton;

    public void VerifyPage(String verificationString){
        if(!Objects.equals(GetInTouchSign.getText().toUpperCase(), verificationString.toUpperCase())){
            System.out.println("Either text or the site you are on is incorrect.");
        }
        else {System.out.println("Get in touch site verified.");}
    }

    public void VerifyMessageSent(){
        if(!Objects.equals(MessageSentSuccessfully.getText(), "Success! Your details have been submitted successfully.")){
            System.out.println("Message wasn't sent successfully.");
        }
        else {System.out.println("Message sent with success.");}
    }

    public void EnterName(String name){
        NameInputField.sendKeys(name);
    }

    public void EnterEmail(String email){
        EmailInputField.sendKeys(email);
    }

    public void EnterSubject(String subject){
        SubjectInputField.sendKeys(subject);
    }

    public void EnterMessage(String message){
        MessageInputField.sendKeys(message);
    }

    public void UploadFile(){
        File file = new File("src/test/resources/ImageOfTheMakaker.jpg");
        UploadFileOption.sendKeys(file.getAbsolutePath());
    }

    public void ClickSubmit() {
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("arguments[0].scrollIntoView()", SubmitButton);
        SubmitButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void ClickOnReturnButton() {
        WebElement iframe = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/ins")));
        ((JavascriptExecutor)driver)
                .executeScript("arguments[0].remove();", iframe);
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("arguments[0].scrollIntoView()", ReturnToHomeButton);
        ReturnToHomeButton.click();
        ReturnToHomeButton.click();
    }
}
