package java_Selenium_automation.Testng_framework;

import org.testng.annotations.Test;

public class Testng_Data_privider_pgm2 {
    //Another example
    @Test(dataProvider ="LoginDataProvider",dataProviderClass = CustomDataProvider.class)
    public void login_test_2(String email_id, String pwd){
        System.out.println("Email Id is :"+email_id+" Password is: "+pwd);

    }
}
