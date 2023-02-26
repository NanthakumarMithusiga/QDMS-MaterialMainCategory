package Testcase;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.AssertJUnit;
import com.aventstack.extentreports.Status;
import Base.initial;
import Pages.page;
import Pages.page;
import Pages.page;

public class RelTestFunc extends initial {
  boolean expectselect;
  
/*  public static void search() throws InterruptedException {
    page.search.click();
    Thread.sleep(2000);
    page.search.sendKeys("Concrete");
    Thread.sleep(2000);
  }*/
  
  
  public void checkboxMethod() throws InterruptedException {
    boolean value = page.checkbox.isSelected();
    System.out.println("actual:" + value);
    Thread.sleep(2000);
    page.checkbox.click();
    Thread.sleep(2000);
    
    expectselect = page.checkbox.isSelected();
    System.out.println("actual:" + value);
    System.out.println("Expected:" + expectselect);
    
    testcase = extent.createTest("STEP-01-CLICKING MATERIALMAINCATERGORY BUTTON");
    testcase = extent.createTest("STEP-02-CLICKING RELEAVANT TEST");
    testcase = extent.createTest("STEP-03-CHECKING THE FUNCTIONALITY OF CHECKBOX");

    if (value) {
        if (!expectselect) {
            TestCasePrint("1. FUNCTIONALITY ", "false", String.valueOf(expectselect));
        } else {
            TestCasePrint("1. FUNCTIONALITY ", "false", String.valueOf(expectselect));
        }
    } else if (!value) {
        if (expectselect) {
            TestCasePrint("1. FUNCTIONALITY -of checkbox", "true", String.valueOf(expectselect));
        } else {
            TestCasePrint("1. FUNCTIONALITY -of checkbox", "true", String.valueOf(expectselect));
        }
    }

}

public void checking() throws InterruptedException {
    testcase = extent.createTest("STEP-06-CHECKING WHETHER THE CHANGES HAVE SAVED");
    page.filter.click();
    Thread.sleep(2000);
    boolean current = page.checkbox.isSelected();
    if (current == expectselect) {
        TestCasePrint("1. saved sucessfully", String.valueOf(expectselect), String.valueOf(current));
    } else {
        TestCasePrint("1.saved sucessfully", String.valueOf(expectselect), String.valueOf(current));

    }
}


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
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     String Value = page.savebtn.getCssValue("opacity");
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("3. UI - opacity-save button", "1", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("3. UI - opacity-save button", "1", String.valueOf(e));
 }
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     String Value = page.savebtn.getCssValue("font-size");
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("4. UI - fontsize-save button", "14px", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("4. UI - fontsize-save button", "14px", String.valueOf(e));
 }
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     String Value = page.savebtn.getCssValue("padding");
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("5. UI - padding-save button", "4px 15px", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("5. UI - padding-save button", "4px 15px", String.valueOf(e));
 }
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     String Value = page.savebtn.getCssValue("border-radius");
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("6. UI - border-radius-save button", "2px", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("6. UI - border-radius-save button", "2px", String.valueOf(e));
 }
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     String Value = page.savebtn.getCssValue("cursor");
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("7. UI - cursor-save button", "pointer", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("7. UI - cursor-save button", "pointer", String.valueOf(e));
 }
   
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     String Value = page.savebtn.getText();
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("8. UI - spelling-save button", "Save", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("8. UI - spelling-save button", "Save", String.valueOf(e));
 }
   
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     String Value = page.savebtn.getCssValue("font-family");
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("9. UI - font-family-save button", "Roboto, sans-serif", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("9. UI - font-family-save button", "Roboto, sans-serif", String.valueOf(e));
 }
   
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     Point Value = page.savebtn.getLocation();
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("10. UI - position-save button", "(941, 605)", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("10. UI - position-save button", "(941, 605)", String.valueOf(e));
 }
   
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     String Value = page.savebtn.getCssValue("box-shadow");
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("11. UI - box-shadow-save button", "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("11. UI - box-shadow-save button", "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px", String.valueOf(e));
 }
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     String Value = page.savebtn.getCssValue("font-weight");
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("12. UI - font-weight-save button", "400", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("12. UI - font-weight-save button", "400", String.valueOf(e));
 }
   
   
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     String Value = page.savebtn.getCssValue("background-color");
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("13. UI - background-color-save button", "rgba(0, 19, 40, 1)", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("13. UI - background-color-save button", "rgba(0, 19, 40, 1)", String.valueOf(e));
 }
   
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     String Value = page.savebtn.getCssValue("color");
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("14. UI - font-color-save button", "rgba(255, 255, 255, 1)", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("14. UI -font-color-save button", "rgba(255, 255, 255, 1)", String.valueOf(e));
 }
   
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     String Value = page.savebtn.getCssValue("border-color");
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("15. UI - border-color-save button", "rgb(255, 255, 255)", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("15. UI - border-color-save button", "rgb(255, 255, 255)", String.valueOf(e));
 }
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     Dimension x = page.savebtn.getSize();
     int Value=x.getHeight();
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("16. UI - Height-save button", "32", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("16. UI - Height-save button", "32", String.valueOf(e));
 }
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     Dimension x = page.savebtn.getSize();
     int Value=x.getWidth();
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("17. UI - Width-save button", "60", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("17. UI - Width-save button", "60", String.valueOf(e));
 }
  
  
  
  
   testcase = extent.createTest("STEP-05-CLICK THE SAVE BUTTON");
  
  
  
  
  
}


public static void propsofCancelbtn() {
  
  testcase = extent.createTest("STEP-07-CHECKING THE PROPERTIES OF CANCEL BUTTON");
  try {
    // boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isDisplayed();
     boolean Value = page.cancelbtn.isDisplayed();
     //Thread.sleep(2000);
     TestCasePrint("1. Functionality - visibility-cancel button", "true", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("1. Functionality - visibility-cancel button", "true", String.valueOf(e));
 }
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     boolean Value = page.cancelbtn.isEnabled();
     //Thread.sleep(2000);
     TestCasePrint("2. Functionality - enabilty-cancel button", "true", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("2. Functionality - enabilty-cancel button", "true", String.valueOf(e));
 }
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     String Value = page.cancelbtn.getCssValue("opacity");
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("3. UI - opacity-cancel button", "1", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("3. UI - opacity-cancel button", "1", String.valueOf(e));
 }
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     String Value = page.cancelbtn.getCssValue("font-size");
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("4. UI - fontsize-cancel button", "14px", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("4. UI - fontsize-cancel button", "14px", String.valueOf(e));
 }
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     String Value = page.cancelbtn.getCssValue("padding");
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("5. UI - padding-cancel button", "0px", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("5. UI - padding-cancel button", "0px", String.valueOf(e));
 }
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     String Value = page.cancelbtn.getCssValue("border-radius");
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("6. UI - border-radius-cancel button", "0px", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("6. UI - border-radius-cancel button", "0px", String.valueOf(e));
 }
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     String Value = page.cancelbtn.getCssValue("cursor");
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("7. UI - cursor-cancel button", "pointer", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("7. UI - cursor-cancel button", "pointer", String.valueOf(e));
 }
   
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     String Value = page.cancelbtn.getText();
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("8. UI - spelling-cancel button", "Cancel", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("8. UI - spelling-cancel button", "Cancel", String.valueOf(e));
 }
   
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     String Value = page.cancelbtn.getCssValue("font-family");
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("9. UI - font-family-cancel button", "Roboto, sans-serif", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("9. UI - font-family-cancel button", "Roboto, sans-serif", String.valueOf(e));
 }
   
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     Point Value = page.cancelbtn.getLocation();
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("10. UI - position-cancel button", "(874, 610)", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("10. UI - position-cancel button", "(874, 610)", String.valueOf(e));
 }
   
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     String Value = page.cancelbtn.getCssValue("box-shadow");
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("11. UI - box-shadow-cancel button", "none", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("11. UI - box-shadow-cancel button", "none", String.valueOf(e));
 }
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     String Value = page.cancelbtn.getCssValue("font-weight");
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("12. UI - font-weight-cancel button", "400", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("12. UI - font-weight-cancel button", "400", String.valueOf(e));
 }
   
   
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     String Value = page.cancelbtn.getCssValue("background-color");
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("13. UI - background-color-cancel button", "rgba(0, 0, 0, 0)", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("13. UI - background-color-cancel button", "rgba(0, 0, 0, 0)", String.valueOf(e));
 }
   
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     String Value = page.cancelbtn.getCssValue("color");
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("14. UI - font-color-cancel button", "rgba(0, 0, 0, 0.85)", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("14. UI -font-color-cancel button", "rgba(0, 0, 0, 0.85)", String.valueOf(e));
 }
   
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     String Value = page.cancelbtn.getCssValue("border-color");
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("15. UI - border-color-cancel button", "rgba(0, 0, 0, 0.85)", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("15. UI - border-color-cancel button", "rgba(0, 0, 0, 0.85)", String.valueOf(e));
 }
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     Dimension x = page.cancelbtn.getSize();
     int Value=x.getHeight();
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("16. UI - Height-cancel button", "22", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("16. UI - Height-cancel button", "22", String.valueOf(e));
 }
   
   try {
     //boolean Value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).isEnabled();
     Dimension x = page.cancelbtn.getSize();
     int Value=x.getWidth();
     System.out.println(Value);
     //Thread.sleep(2000);
     TestCasePrint("17. UI - Width-cancel button", "43", String.valueOf(Value));
 } catch (Exception e) {
     TestCasePrint("17. UI - Width-cancel button", "43", String.valueOf(e));
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
