package java_Selenium_automation.Testng_framework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class Testng_Grouping_test_pgm {
    public static final String email_id = "selenium_java_2023@yopmail.com";
    public static final String Pwd = "Java2023";
    WebDriver driver;
    @Test(groups = {"smoke","Regression"})
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver.exe");
        // Instantiate a ChromeDriver class.
        driver = new ChromeDriver();

        // Maximize the browser
        driver.manage().window().maximize();
        //Wait for 30 sec
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Launch Website
        driver.get("http://www.automationpractice.pl/index.php");
        //Get the Title of the page
        String page_title = driver.getTitle();
        System.out.println("Title is :" + page_title);
        if (page_title.equals("My Shop")){
            System.out.println("Home page Title Verification passed");
        }else {
            System.out.println("Home page Title Verification Failed!!!");
        }
    }

    @Test(groups = {"smoke","Regression"})
    //@Test(groups = {"Regression"})
    public void teardown(){
        //driver.close();
        driver.quit();

    }
}
