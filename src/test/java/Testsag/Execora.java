package Testsag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Home.LocatOrange;


public class Execora {
	public WebDriver driver;
	LocatOrange LO;

	@BeforeTest
	public void Test() {
		System.setProperty("webdriver.chrome.driver", "D:\\ecl sel\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

// this is one test case
	@Test(priority = 1)
	public void Testusername() throws InterruptedException {
		driver.manage().window().maximize();
		System.out.println("Username Sucess");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		LO = new LocatOrange(driver);
		LO.clicklogin();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void TestPassword() throws InterruptedException {
		System.out.println("Pwd Sucess");
		Thread.sleep(2000);
		LO = new LocatOrange(driver);
		LO.clickpwd();
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void TestSubmit() throws InterruptedException {
		System.out.println("Submit Sucess");
		Thread.sleep(2000);
		LO = new LocatOrange(driver);
		LO.clicksubmit();
	}

	@Test(priority = 4)
	public void TestAdmin() throws InterruptedException {
		System.out.println("Admin and Users Sucess");
		Thread.sleep(5000);
		LO = new LocatOrange(driver);
		LO.clickAdmin();
	}

	@Test(priority = 5)
	public void UserRole() throws InterruptedException {
		System.out.println("User role is dropdown");
		Thread.sleep(4000);
		LO = new LocatOrange(driver);
		LO.clickrole();
	}

	@Test(priority = 6)
	public void Status() throws InterruptedException {
		System.out.println("Status role is dropdown");
		Thread.sleep(6000);
		LO = new LocatOrange(driver);
		LO.clickstatus();
	}

	@Test(priority = 7)
	public void Add() throws InterruptedException {
		System.out.println("click add button");
		Thread.sleep(6000);
		LO = new LocatOrange(driver);
		LO.clickAdd();
	}
}