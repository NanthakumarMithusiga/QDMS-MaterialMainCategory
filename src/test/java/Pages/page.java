package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Base.initial;

public class page extends initial {
  
  @FindBy(xpath = "//input[@type='text']")
  public static WebElement username;

  @FindBy(xpath = "//input[@name='password'][@id='password']")
  public static WebElement password;
  
  @FindBy(xpath = "//button[@type]")
  public static WebElement Login;

  @FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div/div[1]/a/div/div")
  public static WebElement master;
 
  @FindBy(xpath="/html/body/div[1]/div/section/section/header/ul/li[3]/span/a")
  public static WebElement material;
  
  @FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[1]/div/div[1]/div[1]")
  public static WebElement maincategory;

  @FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[4]/span/span/span")
  public static WebElement filter;
  
  @FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[3]/label/span/input")
  public static WebElement checkbox;
  
  @FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[2]/div[3]/div/button[2]/span")
  public static WebElement savebtn;
  
  @FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div[6]/div/button/span")
  public static WebElement addmaterialbtn;
  
  @FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[3]/button/span")
  public static WebElement addmainmaterialbtn;
  
  @FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[1]/div/div[5]")
  public static WebElement material1;
  
  @FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/form/div[1]/div[1]/label[2]/span[1]/input")
  public static WebElement sburadiobtn;
  
  @FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/form/div[2]/div[2]/div/div[1]/div")
  public static WebElement subcategorydd;
  
  @FindBy(xpath="/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div[5]/div/span")
  public static WebElement FPfield;
  
  @FindBy(xpath="/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div[1]/div/span")
  public static WebElement RMfield;
  
  @FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/form/div[5]/div[1]/div/div[1]/div/div")
  public static WebElement sourcefield;
  
  @FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/form/div[5]/div[1]/div/div[1]/div/div")
  public static WebElement sourcefieldbox;
  
  @FindBy(xpath="/html/body/div[5]/div/div/div/div[2]/div[1]/div/div/div[1]/div")
  public static WebElement place;
  
  @FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[3]/div/button[1]/span")
  public static WebElement cancelbtn;
  
  @FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]/span")
  public static WebElement updatebtn;
  
  @FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div/div/div/ul")
  public static WebElement pagination;
  
  @FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div/div/div/ul/li[3]/a")
  public static WebElement DefaultPaginationPage;
  
  @FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div/div/div/ul/li[5]/button/span/svg")
  public static WebElement NextPageBtn;
  
  @FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div/div/div/ul/li[4]/a")
  public static WebElement PaginationSecoundPage;
 
  @FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[5]/span/span[1]/span/svg")
  public static WebElement editicon;
  
  @FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[1]/table/thead/tr/th[1]/div/span[2]/span")
  public static WebElement search;
  
  @FindBy(xpath="/html/body/div[3]/div/div/div/div/input")
  public static WebElement searchTextbox;
  
  @FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[1]/div/input")
  public static WebElement maincatTextbox;
  
  @FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[2]/div/input")
  public static WebElement prefixTextbox;
  
  @FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[3]/div/div[1]/div")
  public static WebElement maintypeDropdown;
  
  @FindBy(xpath="/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div[1]/div")
  public static WebElement FPDropdownOption;
  
  @FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[3]/div/div[1]/div/span[2]")
  public static WebElement RMDropdownOption;
  
  @FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]")
  public static WebElement addMaterialMainCategorymodal;
  
 
  

  
  
  
  
  
  
  
  
  
  
}
