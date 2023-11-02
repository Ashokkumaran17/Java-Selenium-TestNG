package java_Selenium_automation.Testng_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class Testng_Parallel_test_pgm {
    WebDriver driver;
    //@BeforeClass
    //@Test(priority = 1)
    @BeforeMethod
    void setup(){
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
    @Test
    void SignIn_Btn_test(){
        // explicit wait - to wait for the Sign In button to be click-able
        WebDriverWait wait_sign_in_btn = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait_sign_in_btn.until(ExpectedConditions.visibilityOfElementLocated(By.className("login")));
        //Wait for 30 sec
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement sign_in_btn= driver.findElement(By.className("login"));
        sign_in_btn.click();

        // explicit wait - to wait for the create Account button to be click-able
        WebDriverWait wait_account_btn = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait_account_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='create-account_form']")));
        //display the title of the page
        String auth_page_title = driver.getTitle();
        System.out.println("Title is :" + auth_page_title);
        if (auth_page_title.equals("Login - My Shop")){
            System.out.println("Auth Title page verification Passed!!!");
        }else{
            System.out.println("Auth Title page verification failed!!!");
        }

    }
    //@AfterClass
    //@Test(priority = 3)
    @AfterMethod
    void teardown(){
        //driver.close();
        driver.quit();

    }
}
