package java_Selenium_automation.Testng_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Testng_framework_pgm {
    public static final String email_id = "selenium_java_2023@yopmail.com";
    public static final String Pwd = "Java2023";
    WebDriver driver;
    public static void main(String[] args){
        Testng_framework_pgm driver_obj = new Testng_framework_pgm();
        //Call the setup func
        driver_obj.setup();
        //Call the Sign In button click func
        driver_obj.SignIn_Btn_test();
        //Call login test func
        driver_obj.Login_test();
        //Call logout func
        driver_obj.logout_test();
        //call Teardown func
        driver_obj.teardown();


    }
    @Test(priority=1)
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
    @Test(priority = 2)
    public void SignIn_Btn_test(){
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
    @Test(priority = 3)
    public void Login_test(){
        //wait for Email Id Label box
        WebDriverWait wait_account_btn = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait_account_btn.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Enter the Email Id
        WebElement usr_email_id = driver.findElement(By.id("email"));
        usr_email_id.click();
        usr_email_id.sendKeys(email_id);
        //Enter the Password
        WebElement usr_pwd = driver.findElement(By.id("passwd"));
        usr_pwd.click();
        usr_pwd.sendKeys(Pwd);
        //Click Submit button
        WebElement submit_btn = driver.findElement(By.id("SubmitLogin"));
        submit_btn.click();
        //div[@id="center_column"]/p[@class="alert alert-success"]
        //WebElement create_account_msg = driver.findElement(By.xpath("//div[@id='center_column']/p[@class='alert alert-success']"));
        WebElement login_success = driver.findElement(By.xpath("//a[@class='logout']"));
        String text_msg = login_success.getText();
        if (text_msg.equalsIgnoreCase("Sign out")){
            System.out.println("Login successful");

        }else {
            System.out.println("Failed to login the Account!!!");

        }

    }
    @Test(priority = 4)
    public void logout_test(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebDriverWait wait_logout_btn = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait_logout_btn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='logout']")));

        //Click Logout btn
        WebElement logout_btn = driver.findElement(By.xpath("//a[@class='logout']"));
        logout_btn.click();
        WebDriverWait wait_sign_in_btn = new WebDriverWait(driver,Duration.ofSeconds(40));
        wait_sign_in_btn.until(ExpectedConditions.visibilityOfElementLocated(By.className("login")));
        //Wait for 40 sec
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        //Get the Title of the page
        String home_page_title = driver.getTitle();
        System.out.println("*******************************************************");
        System.out.println("Home Page Title is :" + home_page_title);
        if (home_page_title.equals("Login - My Shop")){
            System.out.println("Logout Successful");
        }else {
            System.out.println("Failed to do Logout!!!");
        }
        System.out.println("*******************************************************");

    }
    @Test(priority = 5)
    public void teardown(){
        //driver.close();
        driver.quit();

    }

}
