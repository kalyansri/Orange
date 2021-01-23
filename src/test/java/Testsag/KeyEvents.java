package Testsag;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KeyEvents {
	public WebDriver driver;
	
	 //WebDriver driver = new EdgeDriver();
	@BeforeTest
	public void Key() {
		//System.setProperty("webdriver.edge.driver", "D:\\ecl sel\\edgedriver_win64\\msedgedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\ecl sel\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		//System.getProperty("PathIntExp");
		//driver = new EdgeDriver();
	}
		
		@Test(priority=1)
					
		public void Addremove() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println("Pwd Sucess");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Add/Remove Elements')]")).click();
		
		driver.findElement(By.tagName("button")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
		driver.navigate().back();
	}
		@Test(priority=2)
		
		public void BrkIma() {
			driver.findElement(By.linkText("Broken Images")).click();
			driver.navigate().back();
		}
		@Test(enabled=false)
		
		public void chadom() {
			driver.findElement(By.linkText("Challenging DOM")).click();
			driver.findElement(By.partialLinkText("bar")).click();
			driver.navigate().back();
		}
		@Test(priority=4)
		
		public void checkbox() throws InterruptedException {
			driver.findElement(By.linkText("Checkboxes")).click();
			Thread.sleep(5000);	
			WebElement d = driver.findElement(By.xpath("//input[@type=\'checkbox\']"));
			d.click();
			System.out.println("The checkbox is selection state is - " + "checkbox isSelected()");
			driver.navigate().back();
			//WebElement e = driver.findElement(By.linkText("Checkboxes"));
			//e.click();
			//driver.findElement(By.tagName("input")).isSelected();
		}
	@Test(enabled=false)
	public void Keys() throws InterruptedException {
		//Actions action = new Actions(driver);
		//action.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.id("target")).sendKeys(Keys.SPACE);
		Thread.sleep(5000);
		driver.navigate().back();
	
	}
	
	@Test(priority=5)
	public void ContMenu() throws InterruptedException {
		//Actions action = new Actions(driver);
		//action.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'Context Menu')]")).click();
		
		Actions action = new Actions(driver);
		WebElement elementloc= driver.findElement(By.id("hot-spot"));
		action.contextClick(elementloc).perform();
		action.sendKeys(org.openqa.selenium.Keys.ESCAPE);
		//Thread.sleep(5000);
		driver.navigate().back();
	
	}
	@Test(priority=6)
	public void DispEle() throws InterruptedException {
		//Actions action = new Actions(driver);
		//action.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.linkText("Disappearing Elements")).click();
	
		//driver.navigate().back();
	
}
	}