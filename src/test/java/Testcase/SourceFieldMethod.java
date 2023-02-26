package Testcase;

import org.testng.AssertJUnit;
import com.aventstack.extentreports.Status;
import Base.initial;
import Pages.page;
import Base.initial;

public class SourceFieldMethod extends initial {

  public static void test11() {
    //if(end==RM)
    //  page.sourcefield.isDisplayed()=true;
   // else
    //  page.sourcefield.isDisplayed()=false;


  }
  
  public static void test22() {
    //if(end==RM)
    //  page.sourcefield.isDisplayed()=true;
   // else
    //  page.sourcefield.isDisplayed()=false;
      
    

  }
  
 public static void propsofSourcefieldRM() {
    
    try {
     // boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isDisplayed();
      boolean Value = page.sourcefield.isDisplayed();
      //Thread.sleep(2000);
      TestCasePrint("1. Functionality - visibility-sourceFieldforRM", "true", String.valueOf(Value));
  } catch (Exception e) {
      TestCasePrint("1. Functionality - visibility-sourceFieldforRM", "true", String.valueOf(e));
  }

    
    try {
     // boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isDisplayed();
      boolean Value = page.sourcefield.isEnabled();
      //Thread.sleep(2000);
      TestCasePrint("2. Functionality - Enability-sourceFieldforRM", "true", String.valueOf(Value));
  } catch (Exception e) {
      TestCasePrint("2. Functionality - Enability-sourceFieldforRM", "true", String.valueOf(e));
  }
    
    try {
      // boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isDisplayed();
       boolean Value = page.sourcefieldbox.isDisplayed();
       //Thread.sleep(2000);
       TestCasePrint("1. Functionality - visibility-sourceFieldboxforFP", "true", String.valueOf(Value));
   } catch (Exception e) {
       TestCasePrint("1. Functionality - visibility-sourceFieldboxforFP", "true", String.valueOf(e));
   }

    try {
      // boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isDisplayed();
       boolean Value = page.sourcefieldbox.isEnabled();
       //Thread.sleep(2000);
       TestCasePrint("2. Functionality - Enability-sourceFieldboxforFP", "true", String.valueOf(Value));
   } catch (Exception e) {
       TestCasePrint("2. Functionality - Enability-sourceFieldboxforFP", "true", String.valueOf(e));
   }

}
 
 
 public static void propsofSourcefieldFP() {
   
   try {
    // boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isDisplayed();
     boolean Value = page.sourcefield.isDisplayed();
     //Thread.sleep(2000);
     TestCasePrint("1. Functionality - visibility-sourceFieldforFP", "false", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("1. Functionality - visibility-sourceFieldforFP", "false", String.valueOf(e));
 }

}

 public static void TestCasePrint(String TestCaseName, String ExpectedValue, String ActualValue) {


   boolean position = true;
   testcase = extent.createTest(TestCaseName);
   try {
     AssertJUnit.assertEquals(ExpectedValue, ActualValue);
   } catch (AssertionError e) {
     position = false;
   }
   if (position) {
     testcase.log(Status.INFO, "Actualvalue :- " + ActualValue);
     testcase.log(Status.INFO, "Expectedvalue :- " + ExpectedValue);
     testcase.log(Status.INFO, "Correct value");
     testcase.log(Status.PASS, "");
   } else {
     testcase.log(Status.INFO, "Actualvalue :- " + ActualValue);
     testcase.log(Status.INFO, "ExpectedValue :- " + ExpectedValue);
     testcase.log(Status.INFO, "wrong value");
     testcase.log(Status.FAIL, "");
   }

 }
}
 
 
 
