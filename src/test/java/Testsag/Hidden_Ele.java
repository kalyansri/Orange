package Testsag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Ele {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Execution after setting ChromeDriver path in System Variables");
		System.getProperty("Pathsel");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://uitestpractice.com/Students/Index");
		driver.findElement(By.xpath("//tbody//tr[2]//td[4]//button[1]")).click();
		//((JavascriptExecutor)driver)args.
	
		
	}

}
