package Testsag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Test_pract {
	public WebDriver driver;
	
	
	@BeforeTest
	public void Test() {
		System.setProperty("webdriver.chrome.driver", "D:\\ecl sel\\chromedriver\\chromedriver.exe");
		//System.getProperty("Pathsel");
		driver = new ChromeDriver();
		}
		
		@Test(priority=1)
		public void Home() throws InterruptedException {
		driver.manage().window().maximize();
		System.out.println("Home page is visible");
		driver.get("http://uitestpractice.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("AjaxCall")).click();
		}
		
		@Test(priority=2)
		
		public void Forms() {
		driver.findElement(By.linkText("Form")).click();
		}
		
		@Test(priority=3)
		
		public void Controls() {
			driver.findElement(By.linkText("Controls")).click();
		}
		
		@Test(priority=4)
		public void Widgets() {
			driver.findElement(By.linkText("Widgets")).click();
		}
		
		@Test(priority=5)
		public void Actions() {
			driver.findElement(By.linkText("Actions")).click();
		}
		
		@Test(priority=6)
		public void SwitchTo() {
			driver.findElement(By.linkText("Switch to")).click();
		}
		@Test(priority=7)
		public void Select() {
			driver.findElement(By.linkText("Select")).click();
		}
		
		
	}


