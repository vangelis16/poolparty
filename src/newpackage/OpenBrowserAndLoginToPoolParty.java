package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserAndLoginToPoolParty {
	
	public WebDriver driver = null;
	
	public void openChromeBrowser() {
	System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://virtuoso.poolparty.biz/PoolParty");
	}
	
	public void loginToPoolParty() throws Exception {
		
	// enter user name
	WebElement el1 = driver.findElement(By.id("pptusername"));
	el1.sendKeys("terziyskia");
	    
	//enter password
	WebElement el2 = driver.findElement(By.name("pptpassword"));
	el2.sendKeys("H8VToVF6GQ8m");
		
	//click on "Login" button
	WebElement el3 = driver.findElement(By.className("loginForm-submit"));
	el3.click();
		
	Thread.sleep(3000);
	
	}
	
	public void closeChromeBrowser() {
		driver.quit();
	}
	
	
}
