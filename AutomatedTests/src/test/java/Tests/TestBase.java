package Tests;

import Utils.Utils;
import io.github.cdimascio.dotenv.Dotenv;
import org.testng.annotations.*;

public abstract class TestBase {

    protected Dotenv urls = Dotenv.configure()
            .filename("URLs.env")
            .load();

    public TestBase(){}

    @AfterClass
    public static void CleanupDriver(){
        Utils.DriverQuit();
    }
}