package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LocatOrange {

	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(xpath="//input[@id=\'txtUsername\']")
	private WebElement login;
	
	@FindBy(xpath="//input[@name=\'txtPassword\']")
	private WebElement password;
	
	@FindBy(xpath="//input[@type=\'submit\']")
	private WebElement submit;
	
	//@FindBy(xpath="//b[text()=\'Admin\']")
	//private WebElement Admin;
	
	@FindBy(xpath="//li[8]/ul")
	private WebElement Usermang;
	
	//@FindBy(xpath="//div[@id='content']")
	//private WebElement Users;
	
	@FindBy(linkText="Users")
	private WebElement Users;
	
	@FindBy(xpath="//select[@id=\'searchSystemUser_userType\']")
	//@FindBy(tagName="select")
	private WebElement role;
	
	@FindBy(xpath="//select[@id=\'searchSystemUser_status\']")
	private WebElement status;
	 //Select dropdown = new Select(Users);
     //dropdown.getOptions().get(1).click();
	
	@FindBy(xpath="//input[@id=\"btnAdd\"]")
	private WebElement Add;
     
	
	//Using Select class for selecting value from dropdown  
    
	//Select dropdown = new Select(driver.findElement(By.id("menu_admin_UserManagement")));  
	//dropdown.selectByVisibleText("Users"); 
	
	public LocatOrange(WebDriver driver)
	{
		this.driver=driver;
		//PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
	}
	
	public void clicklogin()
	{
		this.login.sendKeys("Admin");
	}
	public void clickpwd()
	{
		this.password.sendKeys("admin123");
	}
	public void clicksubmit()
	{
		this.submit.click();
	}
	public void clickAdmin() throws InterruptedException
	{
		WebElement menu = driver.findElement(By.id("menu_admin_viewAdminModule"));
		Thread.sleep(2000);
        WebElement SUBMenu   = driver.findElement(By.id("menu_admin_UserManagement"));
        
        WebElement SubbMenu = driver.findElement(By.id("menu_admin_viewSystemUsers"));

        Actions action =    new Actions(driver);
        action.moveToElement(menu).perform();
        Thread.sleep(2000);
        action.click(SUBMenu).perform();
        action.click(SubbMenu).build().perform();
	}
	public void clickrole()
	{

		// Create the object of the Select class
		Select se = new Select(driver.findElement(By.xpath("//select[@id=\"searchSystemUser_userType\"]")));
		 
		// Select the option using the visible text
		se.selectByVisibleText("Admin");
		//this.role.isDisplayed();
	}
	public void clickstatus() throws InterruptedException
	{
		Select se = new Select(driver.findElement(By.xpath("//select[@id=\"searchSystemUser_status\"]")));
		se.selectByVisibleText("Enabled");
	} 
	public void clickAdd() throws InterruptedException
	{
		this.Add.submit();
	}
}
	

