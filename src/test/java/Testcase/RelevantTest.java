package Testcase;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Base.initial;
import Pages.page;
import Pages.page;
import Base.initial;


public class RelevantTest extends initial {
  page pg = new page();
  RelTestFunc ob = new RelTestFunc();

  @Test
  public void test() throws InterruptedException, IOException {

    PageFactory.initElements(driver, pg);
    page.username.sendKeys("Admin");
    page.password.sendKeys("tokyo@admin");
    page.Login.click();
    Thread.sleep(2000);
    page.master.click();
    Thread.sleep(2000);
    
    //click Material
    page.material.click();
    Thread.sleep(2000);
    
    //click maincategory
    page.maincategory.click();
    Thread.sleep(5000);
    
    //click search icon
    page.search.click();
    Thread.sleep(5000);
    
    //send data to searchTextbox
    page.searchTextbox.sendKeys("Concrete");
    Thread.sleep(5000);
    
    //click the filter 
    page.filter.click();
    Thread.sleep(5000);
    
    //call checkbox Method
    ob.checkboxMethod();
    Thread.sleep(2000);
    
    //call propsofsavebtn Method
    RelTestFunc.propsofSavebtn();
    Thread.sleep(2000);
    
    //click save button
    page.savebtn.click();
    Thread.sleep(5000);
    
    //call checking Method
    ob.checking();
    Thread.sleep(2000);
    
    //check the properties of cancel button
    RelTestFunc.propsofCancelbtn();
    Thread.sleep(2000);



  }
}
