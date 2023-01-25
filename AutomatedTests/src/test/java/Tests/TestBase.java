package Tests;

import io.github.cdimascio.dotenv.Dotenv;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    //static public LoginPage loginPage;
    //static public ProfilePage profilePage;
    String driverPath = "C:\\Users\\Gargameth\\Desktop\\chromedriver.exe";
    public static WebDriver driver;

    private final Dotenv dotenv = Dotenv.configure()
            .filename("URLs.env")
            .load();

    private final String location = dotenv.get("MAIN_URL");

    public TestBase(){}

    @Test
    public void CheckIfBuildWorkingTest(){
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(location);
        System.out.println("Page reached, and closed.");
    }

    @AfterAll
    public static void CleanupDriver(){
        driver.quit();
    }

}
