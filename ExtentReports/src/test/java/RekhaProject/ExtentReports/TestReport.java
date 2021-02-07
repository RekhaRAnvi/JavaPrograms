package RekhaProject.ExtentReports;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestReport {
	@Test
    public void Test() {
    // TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver.exe"); // path of chromedriver 
    WebDriver driver = new ChromeDriver();

      driver.get("https://google.com");
      driver.manage().window().maximize();
      driver.getTitle();

  }
}