package java_Selenium_automation.Testng_framework;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Testng_Custom_Listener.class)
public class Testng_Main_pgm_Listener {
    @Test
    void test1(){
        Assert.assertEquals(5,5,"Test is passed");

    }
    @Test
    void test2(){
        Assert.assertEquals("Ashok","Ashok","Test is passed");


    }
    @Test
    //Enabled = false helps to avoid to execute this func.
    void test3(){
        Assert.assertEquals("A","b","Test is passed");

    }
    @Test
    void test4(){
        System.out.println("This is test 4");
        throw new SkipException("This test is Skipped");

    }
    @Test
    void test5(){
        //Assert.assertTrue( 5,true);
        Assert.assertTrue(true,"Test is passed");

    }
}
