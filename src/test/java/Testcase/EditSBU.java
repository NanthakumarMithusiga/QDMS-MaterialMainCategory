package Testcase;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import Base.initial;
import Pages.page;
//import Testcase.Editsbu;

public class EditSBU extends initial {
  page pg = new page();

  @Test
  public void test2() throws InterruptedException, IOException {

    PageFactory.initElements(driver, pg);
    page.username.sendKeys("Admin");
    page.password.sendKeys("tokyo@admin");
    page.Login.click();
    Thread.sleep(2000);
    page.master.click();
    Thread.sleep(2000);
    page.material.click();
    Thread.sleep(2000);
   // page.editicon.click();
   // Thread.sleep(2000);
   
}
}







