package Testcase;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Base.initial;
import Pages.page;

public class SourceFieldEnable extends initial {
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
    page.material1.click();
    Thread.sleep(2000);
    page.addmaterialbtn.click();
    Thread.sleep(2000);
    page.sburadiobtn.click();
    Thread.sleep(2000);
    page.subcategorydd.click();
    Thread.sleep(2000);
    page.RMfield.click();
    Thread.sleep(2000);
    SourceFieldMethod.propsofSourcefieldRM();
    Thread.sleep(2000);
    page.sourcefieldbox.click();
    Thread.sleep(2000);
    page.place.click();
    Thread.sleep(2000);

    page.subcategorydd.click();
    Thread.sleep(2000);
    page.FPfield.click();
    Thread.sleep(2000);
    SourceFieldMethod.propsofSourcefieldFP();
    Thread.sleep(2000);


  }

}
