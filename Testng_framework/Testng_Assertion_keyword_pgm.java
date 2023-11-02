package java_Selenium_automation.Testng_framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testng_Assertion_keyword_pgm {

    @Test(priority = 1)
    void test1(){
        Assert.assertEquals(5,5,"Test is passed");

    }
    @Test(priority = 2)
    void test2(){
        Assert.assertEquals("Ashok","Ashok","Test is passed");


    }
    //Enabled = false helps to avoid to execute this func.
    @Test(priority = 3,enabled = false)
    void test3(){
        Assert.assertEquals("A","A","Test is passed");

    }
    @Test(priority = 4)
    void test4(){
       //Assert.assertTrue( 5,true);
        Assert.assertTrue(true,"Test is passed");

    }
}
