package Testcase;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import Base.initial;
import Pages.page;

public class trycatchExercise extends initial {

boolean Val=true;
  page pg = new page();
  RelTestFunc ob=new RelTestFunc();

  @Test
  public void test() throws InterruptedException, IOException {

    PageFactory.initElements(driver, pg);
    page.username.sendKeys("Admin");
    page.password.sendKeys("tokyo@admin");
    page.Login.click();
    Thread.sleep(2000);
    page.master.click();
    Thread.sleep(2000);
    
    // click Material
    page.material.click();
    Thread.sleep(2000);
    
    //click addmainmaterial button
    page.addmainmaterialbtn.click();
    Thread.sleep(2000);
    
    try {
     // boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isDisplayed();
      boolean Value = page.maincatTextbox.isDisplayed();
      //Thread.sleep(2000);
      TestCasePrint("1. Functionality - visibility-maincatTextbox", "true", String.valueOf(Value));
      
      try {
        // boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isDisplayed();
         boolean Value1 = page.maincatTextbox.isEnabled();
         //Thread.sleep(2000);
         TestCasePrint("2. Functionality - Enability-maincatTextbox", "true", String.valueOf(Value1));
      
         
         try {
           // boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isDisplayed();
            String Value2 = page.maincatTextbox.getCssValue("border-color");
            //Thread.sleep(2000);
            TestCasePrint("3. Functionality - border-color-maincatTextbox", "rgb(217, 217, 217)", String.valueOf(Value2));
         }
         catch (Exception e) {
           TestCasePrint("5. UI - overflow-addMaterialMainCategorymodal", "visible", String.valueOf(e));
       }
         

      }
      
      catch (Exception e) {
        TestCasePrint("5. UI - overflow-addMaterialMainCategorymodal", "visible", String.valueOf(e));
    }
   
    }
      
    
    catch (Exception e) {
      TestCasePrint("5. UI - overflow-addMaterialMainCategorymodal", "visible", String.valueOf(e));
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
