import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.*;
import utils.Constant;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;




    @BeforeTest
    public void beforeTest()
    {

    }



    @BeforeMethod
    @Parameters( value = {"browserName"})
    public void beforeMethod(String browserName)
    {
        setUpDriver(browserName);
        driver.manage().window().maximize();
        driver.get(Constant.url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }


    @AfterMethod
    public void afterMethod()
    {
        driver.quit();
    }


    @AfterTest
    public void afterTest()
    {

    }

    public void setUpDriver(String browserName)
    {
        if (browserName.equalsIgnoreCase("chrome"))
        {
            //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")  +  File.separator = "drivers" + File.separator +"chormedriver.exe)";
            System.setProperty("webdriver.chrome.driver", "C://Users//vinay//Downloads//chromedriver_win32//chromedriver.exe");
            driver = new ChromeDriver();


        }else if (browserName.equalsIgnoreCase("fireFox"))
        {
            System.setProperty("webdriver.chrome.driver", "C://Users//vinay//Downloads//chromedriver_win32//chromedriver.exe");
            driver = new ChromeDriver();

        }
        else
        {
            System.setProperty("webdriver.chrome.driver", "C://Users//vinay//Downloads//chromedriver_win32//chromedriver.exe");
            driver = new ChromeDriver();

        }
    }



}
