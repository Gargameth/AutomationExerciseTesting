package Tests;

import Utils.Utils;
import io.github.cdimascio.dotenv.Dotenv;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class TestBase {

    //static public LoginPage loginPage;
    //static public ProfilePage profilePage;

    private final Dotenv dotenv = Dotenv.configure()
            .filename("URLs.env")
            .load();

    private final String location = dotenv.get("MAIN_URL");

    public TestBase(){}

    @Test
    public void CheckIfBuildWorkingTest(){
        Utils.driver = Utils.GetDriver();
        Utils.driver.get(location);
    }

    @AfterAll
    public static void CleanupDriver(){
        Utils.DriverQuit();
    }
}
