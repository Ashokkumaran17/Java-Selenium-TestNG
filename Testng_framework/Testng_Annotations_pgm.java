package java_Selenium_automation.Testng_framework;

import org.testng.annotations.*;

public class Testng_Annotations_pgm {

    @BeforeClass
    void test1(){
        System.out.println("BeforeClass test Started");
    }
    @BeforeMethod
    void test2(){
        System.out.println("BeforeMethod test Started");
    }

    @Test(priority = 1)
    void test3(){
        System.out.println("Welcome to Java Selenium");

    }
    @Test(priority = 2)
    void test4(){
        System.out.println("Welcome to Java Selenium with BDD");

    }
    //Enabled = false helps to avoid to execute this func.
    @Test(priority = 3,enabled = false)
    void test11(){
        System.out.println("Welcome to Java BDD With RestAssured");

    }
    @Test(priority = 4)
    void test12(){
        System.out.println("Welcome to Java With RestAssured");

    }
    @BeforeTest
    void test5(){
        System.out.println("BeforeTest Started");
    }
    @AfterTest
    void test6(){
        System.out.println("AfterTest finished");
    }
    @AfterClass
    void test7(){
        System.out.println("AfterClass test finished");
    }
    @AfterMethod
    void test8(){
        System.out.println("AfterMethod finished");
    }
    @BeforeSuite
    void test9(){
        System.out.println("BeforeSuite test Started");
    }
    @AfterSuite
    void test10(){
        System.out.println("AfterSuite test finished");
    }

}
