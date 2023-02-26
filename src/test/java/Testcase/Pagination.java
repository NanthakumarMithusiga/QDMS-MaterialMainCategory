package Testcase;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Log;
import Pages.page;
import Base.initial;

public class Pagination extends initial {
  page LPD = new page();


  @Test

  public void paginationtest() throws InterruptedException, IOException {

    PageFactory.initElements(driver, LPD);
    page.username.sendKeys("Admin");
    Thread.sleep(2000);
    page.password.sendKeys("tokyo@admin");
    Thread.sleep(2000);
    page.Login.click();
    Thread.sleep(2000);
    page.master.click();
    // Thread.sleep(5000);

    boolean actualvisibility1 = page.pagination.isDisplayed();
    boolean expectedvisibility1 = true;
    boolean visibility1 = true;
    testcase = extent.createTest("1.element Visibility");

    try {
      AssertJUnit.assertEquals(expectedvisibility1, actualvisibility1);
    } catch (AssertionError e) {
      visibility1 = false;
    }

    if (visibility1) {
      testcase.log(Status.INFO, "actualvalue is :" + actualvisibility1);
      testcase.log(Status.INFO, "expectedvalue is :" + expectedvisibility1);
      testcase.log(Status.PASS, "correct");
    } else {

      testcase.log(Status.INFO, "actualvalue is :" + actualvisibility1);
      testcase.log(Status.INFO, "expectedvalue is :" + expectedvisibility1);
      testcase.log(Status.FAIL, "no element");
    }
    
    boolean actualenability = page.pagination.isDisplayed();
    boolean expectedenability = true;
    boolean enability = true;
    testcase = extent.createTest("2.element enability");

    try {
      AssertJUnit.assertEquals(expectedenability, actualenability);
    } catch (AssertionError e) {
      enability = false;
    }

    if (enability) {
      testcase.log(Status.INFO, "actualvalue is :" + actualenability);
      testcase.log(Status.INFO, "expectedvalue is :" + expectedenability);
      testcase.log(Status.PASS, "correct");
    } else {

      testcase.log(Status.INFO, "actualvalue is :" + actualenability);
      testcase.log(Status.INFO, "expectedvalue is :" + expectedenability);
      testcase.log(Status.FAIL, "no element");
    }
    
    //default index page
    boolean ActualDefaultPageIndex = page.DefaultPaginationPage.isDisplayed();
    boolean ExpectedDefaultPageIndex = true;
    testcase = extent.createTest("3.PAGINATION-DEFAULT-PAGE-INDEX");
    try {
      AssertJUnit.assertEquals(ActualDefaultPageIndex, ExpectedDefaultPageIndex);
      testcase.log(Status.INFO, "Actual Default Index Page :- " + ActualDefaultPageIndex);
      testcase.log(Status.INFO, "Expected Default Index Page :- " + ExpectedDefaultPageIndex);
      testcase.log(Status.PASS, "Correct Default Index Page");
    } catch (AssertionError e) {
      testcase.log(Status.INFO, "Actual Default Index Page :- " + ActualDefaultPageIndex);
      testcase.log(Status.INFO, "Expected Default Index Page:- " + ExpectedDefaultPageIndex);
      testcase.log(Status.FAIL, "Wrong Default Index Page");
    }
    
 
    //Refresh pagination into default page 
    page.NextPageBtn.click();
    Thread.sleep(20000);
    driver.navigate().refresh();
    Thread.sleep(2000);
    boolean ActualDefaultPageIndex1 = page.DefaultPaginationPage.isDisplayed();
    boolean ExpectedDefaultPageIndex1 = true;
    testcase = extent.createTest("PAGINATION-REFERESH-INTO-DEFAULT-PAGE");
    try {
        AssertJUnit.assertEquals(ActualDefaultPageIndex1, ExpectedDefaultPageIndex1);
        testcase.log(Status.INFO, "Actual Default Index Page :- " + ActualDefaultPageIndex1);
        testcase.log(Status.INFO, "Expected Default Index Page :- " + ExpectedDefaultPageIndex1);
        testcase.log(Status.PASS, "Correct Default Index Page");
    } catch (AssertionError e) {
        testcase.log(Status.INFO, "Actual Default Index Page :- " + ActualDefaultPageIndex1);
        testcase.log(Status.INFO, "Expected Default Index Page:- " + ExpectedDefaultPageIndex1);
        testcase.log(Status.FAIL, "Wrong Default Index Page");
    }




    Thread.sleep(2000);



  }

}
