package Tests;

import Pages.MainPage;
import Utils.Utils;
import io.github.cdimascio.dotenv.Dotenv;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

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

    @AfterAll
    public static void CleanupDriver(){
        Utils.DriverQuit();
    }
}
