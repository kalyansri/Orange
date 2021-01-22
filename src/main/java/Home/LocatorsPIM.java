package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorsPIM {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public void clickpim() throws InterruptedException
	{
	WebElement menu = driver.findElement(By.id("menu_pim_viewPimModule"));
	Thread.sleep(2000);
    /*WebElement SUBMenu   = driver.findElement(By.id("menu_admin_UserManagement"));
    
    WebElement SubbMenu = driver.findElement(By.id("menu_admin_viewSystemUsers"));

    Actions action =    new Actions(driver);
    action.moveToElement(menu).perform();
    Thread.sleep(2000);
    action.click(SUBMenu).perform();
    action.click(SubbMenu).build().perform();
*/
}
}
