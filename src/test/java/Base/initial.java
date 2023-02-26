package Base;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class initial {
  
  public static ExtentReports extent;
  public static ExtentHtmlReporter htmlReporter;
  public static ExtentTest testcase;
  
  public static WebDriver driver;
  @BeforeSuite
  public void main() throws IOException
  {
    // TODO Auto-generated method stub
   
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://qa-automation-release.s3-website-us-east-1.amazonaws.com/#/login");
    //driver.get("http://qa-automation-release.s3-website-us-east-1.amazonaws.com/#/login");
    extentRepo();
    

  }
  public static void extentRepo() throws IOException {
    extent=new ExtentReports();
    htmlReporter=new ExtentHtmlReporter("C:\\Users\\Admin\\eclipse-workspace\\QDMS\\Report\\Report.html");
    extent.attachReporter(htmlReporter);
    
  
  }
  @AfterSuite
  public void close() {
    extent.flush();
  }
}
