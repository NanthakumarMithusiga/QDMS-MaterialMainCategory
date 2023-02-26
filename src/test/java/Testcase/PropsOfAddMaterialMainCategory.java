package Testcase;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.AssertJUnit;
import com.aventstack.extentreports.Status;
import Base.initial;
import Pages.page;

public class PropsOfAddMaterialMainCategory extends initial{
  
  
  
  
  //STEP1-Check the Propoerties of MainCategory textbook
  
  public static void propsofmaincatTextbox() {
    
    testcase = extent.createTest("STEP-01-CHECKING THE PROPERTIES OF MAINCATEGORY TEXTBOX");
    
    
    try {
     // boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isDisplayed();
      boolean Value = page.maincatTextbox.isDisplayed();
      //Thread.sleep(2000);
      TestCasePrint("1. Functionality - visibility-maincatTextbox", "true", String.valueOf(Value));
  } catch (Exception e) {
      TestCasePrint("1. Functionality - visibility-maincatTextbox", "true", String.valueOf(e));
  }
    
    
    try {
     // boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isDisplayed();
      boolean Value = page.maincatTextbox.isEnabled();
      //Thread.sleep(2000);
      TestCasePrint("1. Functionality - Enability-maincatTextbox", "true", String.valueOf(Value));
  } catch (Exception e) {
      TestCasePrint("1. Functionality - Enability-maincatTextbox", "true", String.valueOf(e));
  }
  }
  
  //STEP2-Check the Propoerties of PREFIX textbook
    
    public static void propsofprefixTextbox() {
      
      testcase = extent.createTest("STEP-02-CHECKING THE PROPERTIES OF PREFIX TEXTBOX");
      
      try {
       // boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isDisplayed();
        boolean Value = page.prefixTextbox.isDisplayed();
        //Thread.sleep(2000);
        TestCasePrint("1. Functionality - visibility-prefixTextbox", "true", String.valueOf(Value));
    } catch (Exception e) {
        TestCasePrint("1. Functionality - visibility-prefixTextbox", "true", String.valueOf(e));
    }
      
      
      try {
       // boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isDisplayed();
        boolean Value = page.prefixTextbox.isEnabled();
        //Thread.sleep(2000);
        TestCasePrint("1. Functionality - Enability-prefixTextbox", "true", String.valueOf(Value));
    } catch (Exception e) {
        TestCasePrint("1. Functionality - Enability-prefixTextbox", "true", String.valueOf(e));
    }
 }
    
    
    //STEP3-CHECK THE PROPERTIES OF MAINTYPE TEXTBOOK
   
      public static void propsofmainTypeTextbox() {
        
        testcase = extent.createTest("STEP-04-CHECKING THE PROPERTIES OF MAINTYPE TEXTBOX");
        
        try {
         // boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isDisplayed();
          boolean Value = page.maintypeDropdown.isDisplayed();
          //Thread.sleep(2000);
          TestCasePrint("1. Functionality - visibility-maintypeDropdown", "true", String.valueOf(Value));
      } catch (Exception e) {
          TestCasePrint("1. Functionality - visibility-maintypeDropdown", "true", String.valueOf(e));
      }
        
        
        try {
         // boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isDisplayed();
          boolean Value = page.maintypeDropdown.isEnabled();
          //Thread.sleep(2000);
          TestCasePrint("1. Functionality - Enability-maintypeDropdown", "true", String.valueOf(Value));
      } catch (Exception e) {
          TestCasePrint("1. Functionality - Enability-maintypeDropdown", "true", String.valueOf(e));
      }
        
        
    
  }
      
      
      //STEP4-CHECK THE PROPERTIES OF MAINCATEGORICAL MODAL
      
      public static void propsofmaincategorymodal() {
        
        try {
         // boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isDisplayed();
          boolean Value = page.addMaterialMainCategorymodal.isDisplayed();
          //Thread.sleep(2000);
          TestCasePrint("1. Functionality - visibility-addMaterialMainCategorymodal", "true", String.valueOf(Value));
      } catch (Exception e) {
          TestCasePrint("1. Functionality - visibility-addMaterialMainCategorymodal", "true", String.valueOf(e));
      }
        
        try {
          //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
          boolean Value = page.addMaterialMainCategorymodal.isEnabled();
          //Thread.sleep(2000);
          TestCasePrint("2. Functionality - enabilty-addMaterialMainCategorymodal", "true", String.valueOf(Value));
      } catch (Exception e) {
          TestCasePrint("2. Functionality - enabilty-addMaterialMainCategorymodal", "true", String.valueOf(e));
      }
        
        try {
          //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
          Point Value = page.addMaterialMainCategorymodal.getLocation();
          System.out.println(Value);
          //Thread.sleep(2000);
          TestCasePrint("3. UI - position-addMaterialMainCategorymodal", "(478, 100)", String.valueOf(Value));
      } catch (Exception e) {
          TestCasePrint("3. UI - position-addMaterialMainCategorymodal", "(478, 100)", String.valueOf(e));
      }
        
        try {
          //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
          String Value = page.addMaterialMainCategorymodal.getCssValue("background-color");
          System.out.println(Value);
          //Thread.sleep(2000);
          TestCasePrint("4. UI - background-color-addMaterialMainCategorymodal", "rgba(255, 255, 255, 1)", String.valueOf(Value));
      } catch (Exception e) {
          TestCasePrint("4. UI - background-color-addsbu addMaterialMainCategorymodal", "rgba(255, 255, 255, 1)", String.valueOf(e));
      }
        
        try {
          //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
          String Value = page.addMaterialMainCategorymodal.getCssValue("border-color");
          System.out.println(Value);
          //Thread.sleep(2000);
          TestCasePrint("5. UI - border-color-addMaterialMainCategorymodal", "rgba(0, 0, 0, 0.85)", String.valueOf(Value));
      } catch (Exception e) {
          TestCasePrint("5. UI - border-color-addMaterialMainCategorymodal", "rgba(0, 0, 0, 0.85)", String.valueOf(e));
      }
        
        try {
          //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
          String Value = page.addMaterialMainCategorymodal.getCssValue("overflow");
          System.out.println(Value);
          //Thread.sleep(2000);
          TestCasePrint("5. UI - overflow-addMaterialMainCategorymodal", "visible", String.valueOf(Value));
      } catch (Exception e) {
          TestCasePrint("5. UI - overflow-addMaterialMainCategorymodal", "visible", String.valueOf(e));
      }
        
        try {
          //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
          String Value = page.addMaterialMainCategorymodal.getCssValue("margin");
          System.out.println(Value);
          //Thread.sleep(2000);
          TestCasePrint("6. UI - margin-addMaterialMainCategorymodal", "0px", String.valueOf(Value));
      } catch (Exception e) {
          TestCasePrint("6. UI - margin-addMaterialMainCategorymodal", "0px", String.valueOf(e));
      }
        
        try {
          //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
          String Value = page.addMaterialMainCategorymodal.getCssValue("cursor");
          System.out.println(Value);
          //Thread.sleep(2000);
          TestCasePrint("7. UI - cursor-addMaterialMainCategorymodal", "auto", String.valueOf(Value));
      } catch (Exception e) {
          TestCasePrint("7. UI - cursor-addMaterialMainCategorymodal", "auto", String.valueOf(e));
      }
        
        try {
          //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
          String Value = page.addMaterialMainCategorymodal.getCssValue("z-index");
          System.out.println(Value);
          //Thread.sleep(2000);
          TestCasePrint("8. UI - z-index-addMaterialMainCategorymodal", "auto", String.valueOf(Value));
      } catch (Exception e) {
          TestCasePrint("8. UI - z-index-addMaterialMainCategorymodal", "auto", String.valueOf(e));
      }
        
        try {
          //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
          String Value = page.addMaterialMainCategorymodal.getCssValue("header");
          System.out.println(Value);
          //Thread.sleep(2000);
          TestCasePrint("9. UI - header-addMaterialMainCategorymodal", "", String.valueOf(Value));
      } catch (Exception e) {
          TestCasePrint("9. UI - header-addMaterialMainCategorymodal", "", String.valueOf(e));
      }
        
        try {
          //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
          Dimension x = page.addMaterialMainCategorymodal.getSize();
          int Value=x.getHeight();
          System.out.println(Value);
          //Thread.sleep(2000);
          TestCasePrint("10. UI - Height-addMaterialMainCategorymodal", "393", String.valueOf(Value));
      } catch (Exception e) {
          TestCasePrint("10. UI - Height-addMaterialMainCategorymodal", "393", String.valueOf(e));
      }
        
        try {
          //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
          Dimension x = page.addMaterialMainCategorymodal.getSize();
          int Value=x.getWidth();
          System.out.println(Value);
          //Thread.sleep(2000);
          TestCasePrint("11. UI - Width-addMaterialMainCategorymodal", "410", String.valueOf(Value));
      } catch (Exception e) {
          TestCasePrint("11. UI - Width-addMaterialMainCategorymodal", "410", String.valueOf(e));
      }
        
       try {
          //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
          String Value = page.addMaterialMainCategorymodal.getText();
          System.out.println(Value);
          //Thread.sleep(2000);
          TestCasePrint("12. UI - content-addMaterialMainCategorymodal", "Add Material Main Category * Main Category: * Prefix: * Main Type: Enter Main Type CancelSave", String.valueOf(Value));
      } catch (Exception e) {
          TestCasePrint("12. UI - content-addMaterialMainCategorymodal", "Add Material Main Category * Main Category: * Prefix: * Main Type: Enter Main Type CancelSave", String.valueOf(e));
      }
             
        
 }
      
      //CHECK THE PROPERTIES OF SAVE BUTTON
      
      public static void propsofSavebtn() {
        
        testcase = extent.createTest("STEP-04-CHECKING THE PROPERTIES OF SAVE BUTTON");
        
        try {
          // boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isDisplayed();
           boolean Value = page.savebtn.isDisplayed();
           //Thread.sleep(2000);
           TestCasePrint("1. Functionality - visibility-save button", "true", String.valueOf(Value));
       } catch (Exception e) {
           TestCasePrint("1. Functionality - visibility-save button", "true", String.valueOf(e));
       }
         
         try {
           //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
           boolean Value = page.savebtn.isEnabled();
           //Thread.sleep(2000);
           TestCasePrint("2. Functionality - enabilty-save button", "true", String.valueOf(Value));
       } catch (Exception e) {
           TestCasePrint("2. Functionality - enabilty-save button", "true", String.valueOf(e));
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
