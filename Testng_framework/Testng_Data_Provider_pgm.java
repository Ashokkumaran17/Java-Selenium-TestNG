package java_Selenium_automation.Testng_framework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testng_Data_Provider_pgm {

    @Test(dataProvider ="LoginDataProvider")
    public void login_test(String email_id, String pwd){
        System.out.println("Email Id is :"+email_id+" Password is: "+pwd);

    }

    @DataProvider(name ="LoginDataProvider")
    public Object[][] get_data(){
        Object[][] data ={{"Ashok@gmail.com","Ak1234"},{"Ashoka@gmail.com","mk1234"},{"Ashokar@gmail.com","Tk1234"}};
        return data;
    }

}
