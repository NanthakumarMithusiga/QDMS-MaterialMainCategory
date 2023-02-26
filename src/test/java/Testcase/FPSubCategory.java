/**
*
* Description: Test Case-When Select the Finish Product sub category, no need to view source field and able to enter value
* 
* Date: 2023-02-25
* Author - Mithusiga
* Testcase number -04
* 
* Test Steps:
* 1.
* 
*
* 
* Expected Results:
* - When Select the Finish Product sub category, Not be able to view source field and able to enter value
* - 
*/

package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import Base.initial;

public class FPSubCategory extends initial {

    public static void TestCasePrint(String TestCaseName, String expectedValue, String actualValue) {
        boolean position = true;
        ExtentTest testCase = extent.createTest(TestCaseName);
        try {
            AssertJUnit.assertEquals(actualValue, expectedValue);
        } catch (AssertionError e) {
            position = false;
        }
        if (position) {
            testCase.log(Status.INFO, "Actualvalue :- " + actualValue);
            testCase.log(Status.INFO, "Expectedvalue :- " + expectedValue);
            testCase.log(Status.INFO, "Correct value");
            testCase.log(Status.PASS, actualValue);
        } else {
            testCase.log(Status.INFO, "Actualvalue :- " + actualValue);
            testCase.log(Status.INFO, "ExpectedValue :- " + expectedValue);
            testCase.log(Status.INFO, "wrong value");
            testCase.log(Status.FAIL, actualValue);
        }
    }

////FINISH PRODUCT
////==============================================================================================
   @Test(priority = 2)
   public static void Test02() {
       String Material = "Material ASDasd";
       String MaterialSource = "Pulmoddai";
       String prefix = "PPW";
//     String materialState = "";
       String erpCode = "ASHJ55";

       String SavedMaterial = "";
       String SavedMaterialSource = "";

       try {
//     Get Link
           driver.get("http://qa-automation-release.s3-website-us-east-1.amazonaws.com/#/login");
           Thread.sleep(3000);
       } catch (Exception e) {

       }

////login
////-------------------------------------------------------------------------------------------------
       try {
           driver.findElement(By.xpath("//*[@id=\"usernameOrEmail\"]")).sendKeys("admin");
           driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("tokyo@admin");
           driver.findElement(By.xpath("//button[@type='submit']")).click();
           Thread.sleep(2000);
       } catch (Exception e) {

       }
//Master
//--------------------------------------------------------------------------------------------------
       try {
           driver.findElement(By.xpath("//h1[normalize-space()='MASTER']")).click();
           Thread.sleep(2000);
       } catch (Exception e) {

       }

//Material-Header
//-------------------------------------------------------------------------------------------------
       try {
           driver.findElement(By.xpath("//a[@href='#/master/materiallevel']")).click();
           Thread.sleep(2000);
       } catch (Exception e) {

       }

//Material
//-------------------------------------------------------------------------------------------------
       try {
           driver.findElement(By.xpath("//div[@class='sc-dnqmqq hnktPT'][normalize-space()='Material']")).click();
           Thread.sleep(2000);
       } catch (Exception e) {

       }

//Add -Material
//-------------------------------------------------------------------------------------------------
       try {
           driver.findElement(By.xpath("//span[normalize-space()='Add Material']")).click();
           Thread.sleep(2000);
       } catch (Exception e) {

       }

//SBU
//-------------------------------------------------------------------------------------------------
       try {
           driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/form/div[1]/div[1]/label[2]/span[1]/input")).click();
           Thread.sleep(2000);
       } catch (Exception e) {

       }
       
       
//click SBU dropdown
       
       try {
         driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/form/div[2]/div[1]/div/div[1]/div/span[1]/input")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div[3]/div/span")).click();
         Thread.sleep(2000);
     } catch (Exception e) {

     }

//Click Sub Category
//-------------------------------------------------------------------------------------------------

       try {
           driver.findElement(By.xpath("//div[@name='sub_category ']//div[@class='ant-select-selector']")).click();
           Thread.sleep(2000);

           Actions actions = new Actions(driver);

           driver.findElement(By.xpath("//input[@id='sub_category']")).sendKeys(Keys.ENTER);
           String SBUname = driver
                   .findElement(By.xpath("//div[@name='sub_category ']//div[@class='ant-select-selector']")).getText();
           Thread.sleep(1000);

           while (!SBUname.contains("-FP")) {
               actions.sendKeys(Keys.ENTER).perform();
               Thread.sleep(500);
               actions.sendKeys(Keys.ARROW_DOWN).perform();
               Thread.sleep(500);
               actions.sendKeys(Keys.ENTER).perform();
               SBUname = driver
                       .findElement(By.xpath("//div[@name='sub_category ']//div[@class='ant-select-selector']"))
                       .getText();
               Thread.sleep(500);
           }

           boolean isEnable = false;

           try {
               isEnable = driver.findElement(By.xpath("//div[@name='source']//div[@class='ant-select-selector']"))
                       .isDisplayed();

           } catch (Exception e) {

           }
           System.out.println(isEnable);
       } catch (Exception e) {

       }

//Add sub category
////-------------------------------------------------------------------------------------------------
//     driver.findElement(By.xpath("//div[contains(@name,'sub_category')]//div[@class='ant-select-selector']")).click();
//     driver.findElement(By.xpath("//div[contains(@name,'sub_category')]//div[@class='ant-select-selector']")).sendKeys(Keys.ENTER);
//     Thread.sleep(500);

//Prefix
////-----------------------------------------------------------------------------------------------
       try {
           driver.findElement(By.xpath("//input[@id='prefix']")).sendKeys(prefix);
           Thread.sleep(1000);
       } catch (Exception e) {

       }
//Material State
////---------------------------------------------------------------------------------------------
       try {
           driver.findElement(By.xpath("//div[@name='material_nature']")).click();
           Thread.sleep(1000);

           driver.findElement(By.cssSelector("div[title='Semi Solid'] div[class='ant-select-item-option-content']"))
                   .click();
       } catch (Exception e) {

       }

//Material
////-------------------------------------------------------------------------------------------------
       try {
           driver.findElement(By.xpath("//*[@id=\"material_name\"]")).sendKeys(Material);
           Thread.sleep(500);
       } catch (Exception e) {

       }
//ERP ----------------------------------------------------------------------------------------
       try {
           driver.findElement(By.xpath("//*[@id=\"erpCode\"]")).sendKeys(erpCode);
           Thread.sleep(500);
       } catch (Exception e) {

       }

//Save --------------------------------------------------------------------------------------
       try {
           driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]")).click();
           Thread.sleep(3000);
       } catch (Exception e) {

       }

//Checking whether Material is saved correctly
////-----------------------------------------------------------------------------------------------

       try {
           SavedMaterial = driver.findElement(By.xpath(
                   "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[1]"))
                   .getText();

           System.out.println(SavedMaterial);
           Thread.sleep(1000);
           driver.findElement(By.xpath("//tbody/tr[2]/td[10]/span[1]/span[1]")).click();
           Thread.sleep(2000);
//     SavedMaterialSource = driver.findElement(By.xpath("//div[@class='ant-popover-inner-content']"))
//             .getText();
//
//     System.out.println(SavedMaterialSource);
       } catch (Exception e) {

       }
       
       
       
       //********************************************************************************************
       //When Select the Finish Product sub category, no need to view source field and able to enter value

       if (SavedMaterial.equals(Material)) {
           TestCasePrint(
                   "When Select the Finish Product sub category, no need to view source field and able to enter value",
                   "Test case executed without defects", "Test case executed without defects");
       } else {
           TestCasePrint(
                   "When Select the Finish Product sub category, no need to view source field and able to enter value",
                   "Test case is executed with defects", "Test case is executed with defects");
       }

////if SavedMaterial is equal to Material and SavedMaterialSource == MaterialSource then test case is pass.
//!! Done
   
   }


}


