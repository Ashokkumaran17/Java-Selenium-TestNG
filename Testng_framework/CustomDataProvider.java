package java_Selenium_automation.Testng_framework;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
    @DataProvider(name ="LoginDataProvider")
    public Object[][] get_data(){
        Object[][] data ={{"Ashok@gmail.com","Ak1234"},{"Ashoka@gmail.com","mk1234"},{"Ashokar@gmail.com","Tk1234"}};
        return data;
    }
}
