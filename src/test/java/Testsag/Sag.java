package Testsag;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sag {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Execution after setting ChromeDriver path in System Variables");
		//System.setProperty("webdriver.chrome.driver", "D:\\ecl sel\\chromedriver\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		System.getProperty("Pathsel");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//driver.wait(5);
		
		String PageTitle = driver.getTitle();
		System.out.println("Page Title is: "+ PageTitle);
	
		//Deleting all the cookies
		driver.manage().deleteAllCookies();
		
		JavascriptExecutor test = (JavascriptExecutor)driver; 
		test.executeScript("document.getElementsByName('q')[0].value='mia'");
		
			
		if(driver.findElements(By.linkText("Gmail")).size()!=0){
			 System.out.println("Element is there"); 
			}
	else{ 
			 System.out.println("Element is no"); 
			}
		
		if(driver.getPageSource().contains("AScii")){
			 System.out.println("Text is present"); 
			}else{
			 System.out.println("Text is not present"); 
			}
		
		
		if(driver.findElement(By.id("searchform")).isDisplayed()){ 
			  System.out.println("element is visible"); 
			}else{ 
			  System.out.println("element is not visible"); 
			}
		
		//driver.get("http://demo.automationtesting.in/Register.html");
		
		
		//Specifiying pageLoadTimeout and Implicit wait
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
}

