  package Testcase;

  import java.io.IOException;
  import org.openqa.selenium.support.PageFactory;
  import org.testng.annotations.Test;
  import Base.initial;
  import Pages.page;
  import Pages.page;
  import Base.initial;


    public class AddMaterialMainCategoryFunctionality  extends initial {
      page pg = new page();
      RelTestFunc ob=new RelTestFunc();

      @Test
      public void test() throws InterruptedException, IOException {

        PageFactory.initElements(driver, pg);
        page.username.sendKeys("Admin");
        page.password.sendKeys("tokyo@admin");
        page.Login.click();
        Thread.sleep(2000);
        
        //click master
        page.master.click();
        Thread.sleep(2000);
        
        // click Material
        page.material.click();
        Thread.sleep(2000);
        
        //click addmainmaterial button
        page.addmainmaterialbtn.click();
        Thread.sleep(2000);
        
        //check the properties of maincatModal
        PropsOfAddMaterialMainCategory.propsofmaincategorymodal();
        Thread.sleep(2000);
        
        
        //check the properties of MaincategoryTextbox
        PropsOfAddMaterialMainCategory.propsofmaincatTextbox();
        Thread.sleep(2000);
        
        //click maincategoryTextbox
        page.maincatTextbox.click();
        Thread.sleep(2000);
        
        //send data to maincategoryTextbox
        page.maincatTextbox.sendKeys("xyz");
        Thread.sleep(2000);
        
        //check the properties of prefixTextbox
        PropsOfAddMaterialMainCategory.propsofprefixTextbox();
        Thread.sleep(2000);
        
        //click prefixTextbox
        page.prefixTextbox.click();
        Thread.sleep(2000);
        
        //send data to prefixTextbox
        page.prefixTextbox.sendKeys("cvb");
        Thread.sleep(2000);
        
        //check the properties of MainTypeTextbox
        PropsOfAddMaterialMainCategory.propsofmainTypeTextbox();
        Thread.sleep(2000);
        
        
        //click mainTypedropdown
        page.maintypeDropdown.click();
        Thread.sleep(2000);
        
        //click the Finish Product Option
        page.FPDropdownOption.click();
        Thread.sleep(2000);
        
        //click save button
        page.savebtn.click();
        Thread.sleep(2000);

      
        

        
        
      }
  }



