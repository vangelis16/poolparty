package newpackage;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResolveQualityIssue extends OpenBrowserAndLoginToPoolParty {
	
	/** 
	 * @author Angel
	 */
	
	@Test
	public void resolveQualityIssue() throws Exception {
		
	openChromeBrowser();
	loginToPoolParty();
		
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement elem = wait.until(ExpectedConditions.elementToBeClickable(By.id("yui-rec18")));
		
	// double click on "Test Project - quality report #2" 
	Actions actions = new Actions(driver);
	WebElement el1 = driver.findElement(By.id("yui-rec18"));
	actions.doubleClick(el1).perform();
		
	Thread.sleep(3000);
	
	// enter "SearchAutoCompleteInput" in global search field
	WebElement el2 = driver.findElement(By.id("SearchAutoCompleteInput"));
	el2.clear();
	el2.sendKeys("Principle of relativity");
	
	// click on "Search" button 
	WebElement el3 = driver.findElement(By.className("marginLeft5"));
	el3.click();
	
	
	WebDriverWait wait1 = new WebDriverWait(driver, 10);
	WebElement elem1 = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Principle of relativity")));
	
	// click on "Principle of relativity" link
	WebElement el4 = driver.findElement(By.linkText("Principle of relativity"));
	el4.click();
	
	Thread.sleep(3000);
	
	// Verify “ Theory of relativity” is listed under the box of “Related Concepts"
	WebElement el5 = driver.findElement(By.id("list_related"));
	el5.isEnabled();
	

	// click on "Delete" button
	WebElement el6 = driver.findElement(By.xpath("//table//div[9]//a[1]"));
	el6.click();
	
	// enter "Test Project - quality report #2" in global search field
	WebElement el7 = driver.findElement(By.id("SearchAutoCompleteInput"));
	el7.clear();
	el7.sendKeys("Test Project - quality report #2");
	
	// click on "Search" button 
	WebElement el8 = driver.findElement(By.className("marginLeft5"));
	el8.click();
	
	Thread.sleep(3000);
	
	//click on "Quality Management" section
	WebElement el9 = driver.findElement(By.linkText("Quality Management"));
	el9.click();
	
	WebDriverWait wait2 = new WebDriverWait(driver, 10);
	WebElement elem2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Regenerate')]")));
	
	//check the button label "Regenerate"
	WebElement el10 = driver.findElement(By.xpath("//button[contains(text(),'Regenerate')]"));
	el10.click();
		
	// verify issue "Relation Clashes"
	WebElement el11 = driver.findElement(By.id("issueReports-7-label"));
	el11.isEnabled();
	
	// number of issues decreased by one
	if (el11.getText() != "Relation Clashes (7)") {
		System.out.println("Number of issues is 7");
	}
	
	
	Thread.sleep(2000);
	
	closeChromeBrowser();
	
		
	}
		
}