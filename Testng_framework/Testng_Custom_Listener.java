package java_Selenium_automation.Testng_framework;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Testng_Custom_Listener implements ITestListener {
    //This is belongs to ITestListener and it will execute before starting of Test set/batch
    public void onStart(ITestContext arg){
        System.out.println("Start Test Execution...."+arg.getName());

    }
    //This is belongs to ITestListener and it will execute After starting of Test set/batch
    public void onFinish(ITestContext arg){
        System.out.println("Finish Test Execution...."+arg.getName());

    }
    //This is belongs to ITestListener and it will execute before start the main Test set/batch
    public void onTestStart(ITestResult arg){
        System.out.println("Start Test...."+arg.getName());

    }
    //This is belongs to ITestListener and it will execute When a test is Skipped
    public void onTestSkipped(ITestResult arg){
        System.out.println("Skipped Test...."+arg.getName());

    }
    //This is belongs to ITestListener and it will execute When a test is Passed
    public void onTestSuccess(ITestResult arg){
        System.out.println("Passed Test ...."+arg.getName());

    }
    //This is belongs to ITestListener and it will execute When a test is Failed
    public void onTestFailure(ITestResult arg){
        System.out.println("Failed Test...."+arg.getName());

    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg){

    }

}
