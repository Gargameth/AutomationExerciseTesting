package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class AccountDetailsPage extends  BasePage {

    public AccountDetailsPage(String URL) {
        super(URL);
    }

    @FindBy(id = "id_gender1")
    WebElement MaleGenderRadio;

    @FindBy(id = "id_gender2")
    WebElement FemaleGenderRadio;

    @FindBy(id = "name")
    WebElement UserName;
    @FindBy(id = "password")
    WebElement Password;

    @FindBy(id = "newsletter")
    WebElement NewsletterSubscription;

    @FindBy(id = "optin")
    WebElement SpecialOffersSubscription;

    @FindBy(id = "first_name")
    WebElement FirstName;

    @FindBy(id = "last_name")
    WebElement LastName;

    @FindBy(id = "company")
    WebElement Company;

    @FindBy(id = "address1")
    WebElement Address1;

    @FindBy(id = "address2")
    WebElement Address2;

    @FindBy(id = "state")
    WebElement State;

    @FindBy(id = "city")
    WebElement City;

    @FindBy(id = "zipcode")
    WebElement Zipcode;

    @FindBy(id = "mobile_number")
    WebElement MobileNumber;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/form/button")
    WebElement SubmitButton;
    public void FillDetails() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title")));
        Select DropDownDays = new Select(driver.findElement(By.id("days")));
        Select DropDownMonths = new Select(driver.findElement(By.id("months")));
        Select DropDownYears = new Select(driver.findElement(By.id("years")));
        Select DropDownCountry = new Select(driver.findElement(By.id("country")));
        DropDownDays.selectByVisibleText("11");
        DropDownMonths.selectByVisibleText("September");
        DropDownYears.selectByVisibleText("1990");
        DropDownCountry.selectByVisibleText("United States");
        MaleGenderRadio.click();
        UserName.sendKeys("Makakers");
        Password.sendKeys("Mananers");
        NewsletterSubscription.click();
        SpecialOffersSubscription.click();
        FirstName.sendKeys("Makakers");
        LastName.sendKeys("Mananers");
        Company.sendKeys("Durrogós");
        Address1.sendKeys("Fing utca három bé");
        Address2.sendKeys("Durr utca kab bé");
        State.sendKeys("Hungarikum");
        City.sendKeys("Bjudapeszt");
        Zipcode.sendKeys("101121210012");
        MobileNumber.sendKeys("Anythingisfineapparently");
        SubmitButton.click();
    }
}
