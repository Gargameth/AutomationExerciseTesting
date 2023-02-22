package Tests;

import Pages.ContactUsPage;
import Pages.MainPage;
import org.testng.annotations.Test;

public class ContactUsFormTest extends TestBase {

    @Test
    public void ContactUsFormFillTest() {
        MainPage mainPage = new MainPage(urls.get("MAIN_URL"));
        ContactUsPage contactUsPage = new ContactUsPage("CONTACT_US_URL");
        mainPage.NavigateToUrl();
        mainPage.CheckSiteVisibility();
        mainPage.ClickOnContactUsButton();
        contactUsPage.VerifyPage("Get in Touch");
        contactUsPage.EnterName("Makakers");
        contactUsPage.EnterEmail("makakers@makakers.com");
        contactUsPage.EnterSubject("Found a weirdo with sum lego.");
        contactUsPage.EnterMessage("So I found this. Any relations, anyone? He is eating a lot, and occupies my bed all day.");
        contactUsPage.UploadFile();
        contactUsPage.ClickSubmit();
        contactUsPage.VerifyMessageSent();
        contactUsPage.ClickOnReturnButton();
        mainPage.CheckSiteVisibility();
    }
}