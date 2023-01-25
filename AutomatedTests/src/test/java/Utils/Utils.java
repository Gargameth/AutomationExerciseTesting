package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {

    public static WebDriver driver;
    public Utils(){
    }
    public static WebDriver GetDriver(){
        if (driver == null) {
            String path = "C:\\Users\\Gargameth\\Desktop\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", path);
            driver = new ChromeDriver();
        }
        return driver;
    }
    public static void DriverQuit(){
        driver.quit();
        driver = null;
    }
}
