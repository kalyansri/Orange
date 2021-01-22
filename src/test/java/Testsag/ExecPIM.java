package Testsag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Home.LocatOrange;
import Home.LocatorsPIM;


@Test
public class ExecPIM {
	public WebDriver driver;
	LocatorsPIM LP;
	
	@BeforeTest
	public void Pim() {
		System.setProperty("webdriver.chrome.driver", "D:\\ecl sel\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
	
	// this is one test case
		@Test(priority=1)
	public void Testpim() throws InterruptedException {
		driver.manage().window().maximize();
		System.out.println("entered pim menu");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		//LP=new LocatorsPIM(driver);
		//LP.clicklogin();
		Thread.sleep(2000);
	}
	
	
	

}
