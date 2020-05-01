package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultPage {
	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;
	
    By btnSeeMore = By.cssSelector(".more > .rippleJS");
    By btnSeeLess = By.cssSelector(".less > .rippleJS");
    By btnCancel = By.xpath("//div[3]/button/link");
    By btnNextTip = By.xpath("//div[3]/button[2]/link");
    By btnGotIt = By.xpath("//button[text()='Got it']");
   
    
    //FILTER section --------------------------------------------
    By rdShowAll = By.xpath("//label[contains(.,'Show all')]");
    By rdPromosOnly = By.xpath("//label[contains(.,'Promos only')]");
    
    By lbFPGInsurance = By.xpath("//label[contains(.,'FPG Insurance')]");
    By lbPacificCross = By.xpath("//label[contains(.,'Pacific Cross')]");
    By lbPrudentialGuarantee = By.xpath("//label[contains(.,'Prudential Guarantee')]");
    By lbStandardInsurance = By.xpath("//label[contains(.,'Standard Insurance')]");
    
    By beginnodePersonalAccident = By.xpath("//div[@id='collapseSeemore']/div/div/div/div[5]");
    By endnodePersonalAccident = By.xpath("//div[@id='collapseSeemore']/div/div/div/div[6]");
    By beginnodeMedicalTrveling = By.xpath("//div[@id='collapseSeemore']/div[2]/div/div/div[5]");
    By endnodeMedicalTrveling = By.xpath("//div[@id='collapseSeemore']/div[2]/div/div/div[6]");
    
    //SORT section ----------------------------------------------
    By rdPromotion = By.xpath("//*[@id='collapseTwo']/div/div[1]/div/label");
    By rdPriceLowToHigh = By.xpath("//*[@id='collapseTwo']/div/div[2]/div/label");
    By rdPriceHighToLow = By.xpath("//*[@id='collapseTwo']/div/div[3]/div/label");
    By rdScoreHighToLow = By.xpath("//*[@id='collapseTwo']/div/div[4]/div/label");
    
    //DETAILS section --------------------------------------------
    By rdSingleTrip = By.xpath("//*[@id='detailCollapse']/div/div[1]/div/div[1]/label");
    By rdAnnualTrip = By.xpath("//*[@id='detailCollapse']/div/div[1]/div/div[2]/label");
    By rdJustMe = By.xpath("//*[@id='detailCollapse']/div/div[2]/div/div/div[1]/label");
    By rdMyFamily = By.xpath("//*[@id='detailCollapse']/div/div[2]/div/div/div[2]/label");
    By rd2Persons = By.xpath("//*[@id='detailCollapse']/div/div[2]/div/div/div[3]/label");
    By btnDestination = By.xpath("//*[@id='detailCollapse']/div/div[3]/div/div/div/button/span[1]");
    By cldStartDate = By.xpath("//*[@id='detailCollapse']/div/div[4]/div[1]/div/div/input");
    By cldEndDate = By.xpath("//*[@id='detailCollapse']/div/div[4]/div[2]/div/div/input");
    By dateWidgetFrom = By.xpath("//div[@class='datepicker-days']/table/tbody");
    
 
    
    //other sections of page--------------------------------------
    By lnkClearAll = By.xpath("//a[text()='CLEAR ALL']");
    By btnGoToProvider = By.xpath("//a[contains(text(),'GO TO PROVIDER')]");
    By lbNumberOfPlansFound = By.xpath("//h5[contains(.,'plans found')]");
    
    public ResultPage(WebDriver driver){
        this.driver = driver;
        this.js = ((JavascriptExecutor) driver);
        this.wait = new WebDriverWait(driver, 10);
    }
    
    public void closePopup() throws InterruptedException {
    	if (driver.findElement(btnCancel).isDisplayed()) {
    		driver.findElement(btnCancel).click();

    		wait.until(ExpectedConditions.visibilityOfElementLocated(btnGotIt));    		
    		if (driver.findElement(btnGotIt).isDisplayed()) {
        		driver.findElement(btnGotIt).click();
    		}
    	}
    	
    }
    
    public void clickClearAll() throws Exception {    	
    	driver.findElement(lnkClearAll).click();
    	waitPageAlreadyLoaded();
    }
    public void clickSeeMore() throws Exception {
    	driver.findElement(btnSeeMore).click();
    	waitPageAlreadyLoaded();
    }
    public void clickSeeLess() throws Exception {
    	driver.findElement(btnSeeLess).click();
    	waitPageAlreadyLoaded();
    }
    
    //FILTER methods --------------------------------------------
    public void selectShowAll() throws Exception {
    	scrollToView(rdShowAll);
    	driver.findElement(rdShowAll).click();
    	waitPageAlreadyLoaded();
    }
    public void selectPromosOnly() throws Exception {
    	scrollToView(rdPromosOnly);
    	driver.findElement(rdPromosOnly).click();
    	waitPageAlreadyLoaded();
    }
    
    public void selectFPGInsurance() throws Exception {
    	scrollToView(lbFPGInsurance);
    	driver.findElement(lbFPGInsurance).click();
    	waitPageAlreadyLoaded();
    }
    public void selectPacificCross() throws Exception {
    	scrollToView(lbPacificCross);
    	driver.findElement(lbPacificCross).click();
    	waitPageAlreadyLoaded();
    }
    public void selectPrudentialGuarantee() throws Exception {
    	scrollToView(lbPrudentialGuarantee);
    	driver.findElement(lbPrudentialGuarantee).click();
    	waitPageAlreadyLoaded();
    }
    public void selectStandardInsurance() throws Exception {
    	scrollToView(lbStandardInsurance);
    	driver.findElement(lbStandardInsurance).click();
    	waitPageAlreadyLoaded();
    }
    
    public void selectPersonalAccident(int intBeginRange, int intEndRange) throws Exception {
    	scrollToView(beginnodePersonalAccident);
    	Actions builder = new Actions(driver);
    	
    	Action mouseOverHome = builder
                .moveToElement(driver.findElement(beginnodePersonalAccident))
                .clickAndHold()
                .moveByOffset(intBeginRange, 0)
                .click()
                .build();         
        mouseOverHome.perform(); 
        
        mouseOverHome = builder
                .moveToElement(driver.findElement(endnodePersonalAccident))
                .clickAndHold()
                .moveByOffset(intEndRange, 0)
                .click()
                .build();         
        mouseOverHome.perform();
        
        waitPageAlreadyLoaded();
    }
    
    public void selectMedicalTrveling(int intBeginRange, int intEndRange) throws Exception {
    	scrollToView(beginnodeMedicalTrveling);
    	Actions builder = new Actions(driver);
    	
    	Action mouseOverHome = builder
                .moveToElement(driver.findElement(beginnodeMedicalTrveling))
                .clickAndHold()
                .moveByOffset(intBeginRange, 0)
                .click()
                .build();         
        mouseOverHome.perform(); 
        
        mouseOverHome = builder
                .moveToElement(driver.findElement(endnodeMedicalTrveling))
                .clickAndHold()
                .moveByOffset(intEndRange, 0)
                .click()
                .build();         
        mouseOverHome.perform();
        
        waitPageAlreadyLoaded();
    }
    
    public void waitPageAlreadyLoaded() throws Exception {
    	Thread.sleep(500);    	
    	new WebDriverWait(driver, 3).until(driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
    }
    
    public void printNumberOfProvider() throws Exception {
    	System.out.println("***Number of Providers found: " + driver.findElements(btnGoToProvider).size());
    	System.out.println("***Number of Plans found text is displayed: '" + driver.findElement(lbNumberOfPlansFound).getText() + "'");
    }
    
    public int getNumberOfProviderFound() throws Exception {
    	return driver.findElements(btnGoToProvider).size();
    }
    public int getNumberOfPlansFound() throws Exception {
    	String strNoPlansText = driver.findElement(lbNumberOfPlansFound).getText();
    	return Integer.parseInt(strNoPlansText.substring(0, strNoPlansText.indexOf(" ")));
    }
    
    //SORT methods --------------------------------------------
    public void selectPromotion() throws Exception {
    	scrollToView(rdPromotion);
    	driver.findElement(rdPromotion).click();
    	waitPageAlreadyLoaded();
    }
    public void selectPriceHighToLow() throws Exception {
    	scrollToView(rdPriceHighToLow);
    	driver.findElement(rdPriceHighToLow).click();
    	waitPageAlreadyLoaded();
    }
    public void selectPriceLowToHigh() throws Exception {
    	scrollToView(rdPriceLowToHigh);
    	driver.findElement(rdPriceLowToHigh).click();
    	waitPageAlreadyLoaded();
    }
    public void selectScoreHighToLow() throws Exception {
    	scrollToView(rdScoreHighToLow);
    	driver.findElement(rdScoreHighToLow).click();
    	waitPageAlreadyLoaded();
    }
    
    //DETAILS methods -----------------------------------------
    public void selectSingleTrip() throws Exception {
    	scrollToView(rdSingleTrip);
    	driver.findElement(rdSingleTrip).click();
    	waitPageAlreadyLoaded();
    }
    public void selectAnnualTrip() throws Exception {
    	scrollToView(rdAnnualTrip);
    	driver.findElement(rdAnnualTrip).click();
    	waitPageAlreadyLoaded();
    }
    public void selectJustMe() throws Exception {
    	scrollToView(rdJustMe);
    	driver.findElement(rdJustMe).click();
    	waitPageAlreadyLoaded();
    }
    public void selectMyFamily() throws Exception {
    	scrollToView(rdMyFamily);
    	driver.findElement(rdMyFamily).click();
    	waitPageAlreadyLoaded();
    }
    public void select2Persons() throws Exception {
    	scrollToView(rd2Persons);
    	driver.findElement(rd2Persons).click();
    	waitPageAlreadyLoaded();
    }
    
    public void selectDestination(String strDestination) throws Exception {
    	scrollToView(btnDestination);
    	driver.findElement(btnDestination).click();
    	waitPageAlreadyLoaded();
    	
    	By by = By.xpath("//span[text()='" + strDestination + "']/following-sibling::link");
    	scrollToView(by);
    	driver.findElement(by).click();
    	waitPageAlreadyLoaded();		
    }
    private void selectDate(String strDate, boolean bReverse) throws Exception {
    	//This is from date picker table
        WebElement dateWidgetFromWe = driver.findElement(dateWidgetFrom);
 
        //This are the rows of the from date picker table
        List<WebElement> rows = dateWidgetFromWe.findElements(By.tagName("tr"));
        
        //Reverse the list to have the searching begins from the last row to the first row
        if (bReverse) {Collections.reverse(rows);}
        
        //DatePicker is a table. Thus we can navigate to each cell
        //and if a cell matches with the wanted date then we will click it.
        outerloop:
        for (WebElement row: rows) {
            //Select date
        	List<WebElement> dates = row.findElements(By.tagName("td"));
        	for (WebElement date: dates) {
	            if (date.getText().equals(strDate)) {
	                date.click();
	                waitPageAlreadyLoaded();
	                break outerloop;
	            }
        	}
        }
        
    }
    public void selectStartDate(String strDate) throws Exception {
    	scrollToView(cldStartDate);
    	driver.findElement(cldStartDate).click();
    	selectDate(strDate, false);
    	waitPageAlreadyLoaded();
    }
    public void selectEndDate(String strDate) throws Exception {
    	scrollToView(cldEndDate);
    	driver.findElement(cldEndDate).click();
    	selectDate(strDate, true);
    	waitPageAlreadyLoaded();
    }
    
    
    
    
    public void highLighterMethod(WebElement element){
    	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }
    public void scrollToView(By by) throws Exception {
    	WebElement we = driver.findElement(by);
    	this.js.executeScript("arguments[0].scrollIntoView();", we);
    	this.js.executeScript("window.scrollBy(0, -200)");
    }
    
}
