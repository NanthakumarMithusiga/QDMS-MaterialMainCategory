package Testcase;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Base.initial;
import Pages.page;

public class testcase1 extends initial{
    page pg = new page();

    @Test
    public void test() throws InterruptedException, IOException {

      PageFactory.initElements(driver, pg);
      page.username.sendKeys("Admin");
      page.password.sendKeys("tokyo@admin");
      page.Login.click();
      Thread.sleep(2000);
      page.master.click();
      Thread.sleep(2000);
      page.material.click();

  }

}
