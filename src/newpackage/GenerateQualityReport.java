package newpackage;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class GenerateQualityReport extends OpenBrowserAndLoginToPoolParty {
	

	@Test
	public void generatQualityReport() throws Exception {
		
	/**
	 * @author Angel
	 */
	
	openChromeBrowser();
	loginToPoolParty();
		
	//check that user is logged
	WebElement el1 = driver.findElement(By.className("posRel"));
	el1.isEnabled();
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement elem = wait.until(ExpectedConditions.elementToBeClickable(By.id("yui-rec18")));
	
	// double click on "Test Project - quality report #2" 
	Actions actions = new Actions(driver);
	WebElement el2 = driver.findElement(By.id("yui-rec18"));
	actions.doubleClick(el2).perform();
	
	Thread.sleep(3000);
	
	//click on "Quality Management" section
	WebElement el3 = driver.findElement(By.linkText("Quality Management"));
	el3.click();
	
	Thread.sleep(2000);
	
	//click on "Generate" button
	WebElement el4 = driver.findElement(By.xpath("//button[contains(text(),'Generate')]"));
	el4.click();
	
	WebDriverWait wait1 = new WebDriverWait(driver, 10);
	WebElement elem1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Regenerate')]")));
	
	
	//check the button label "Regenerate"
	WebElement el5 = driver.findElement(By.xpath("//button[contains(text(),'Regenerate')]"));
	el5.isEnabled();
	
	// verify issue "Relation Clashes"
	WebElement el6 = driver.findElement(By.id("issueReports-7-label"));
	el6.isDisplayed();
	
	Thread.sleep(3000);
	
	// click on "Relations Clashes" link
	WebElement el7 = driver.findElement(By.linkText("Relation Clashes (8)"));
	el7.click();
	
	// store number of issue
	if (el7.getText() != "Relation Clashes (8)") {
		System.out.println("Number of issues is 8");
	}
	
	Thread.sleep(3000);
	
	//check for "Principle of relativity - Theory of relativity" link
	WebElement el8 = driver.findElement(By.linkText("Principle of relativity - Theory of relativity"));
	el8.isEnabled();
	
	
	Thread.sleep(2000);
	
	closeChromeBrowser();
	
	}
}

