package Testsag;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyEvents {
	
	@Test
	public void Key() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\ecl sel\\edgedriver_win64\\msedgedriver.exe");
		//System.getProperty("PathIntExp");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		//option 1:
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		//driver.findElement(By.id("target")).sendKeys(Keys.SPACE);
		Thread.sleep(5000);
		String text=driver.findElement(By.id("result")).getText();
		System.out.println("text");
		Assert.assertEquals(text, "You entered: ENTER");
	}
}