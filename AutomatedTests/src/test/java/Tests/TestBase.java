package Tests;

import Pages.MainPage;
import Utils.Utils;
import io.github.cdimascio.dotenv.Dotenv;
import org.testng.annotations.*;

public class TestBase {
    private final Dotenv dotenv = Dotenv.configure()
            .filename("URLs.env")
            .load();

    private final String location = dotenv.get("MAIN_URL");

    public TestBase(){}

    @Test
    public void CheckIfBuildWorkingTest(){
        MainPage mainPage = new MainPage(location);
        mainPage.ClickOnSignupLoginButton();
    }

    @AfterClass
    public static void CleanupDriver(){
        Utils.DriverQuit();
    }
}
