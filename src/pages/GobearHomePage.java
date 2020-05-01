package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;

public class GobearHomePage {
	WebDriver driver;
	
    By linkInsurance = By.xpath("//a[contains(@href, '#Insurance')]");
    By linkTravel = By.linkText("TRAVEL"); 
    By sbbTrip = By.xpath("//button/span[2]");
    By itemSingleTrip = By.xpath("//div[@id='travel-form']/div/div/div/div/ul/li/a/link");
    By itemAnnualTrip = By.xpath("//div[@id='travel-form']/div/div/div/div/ul/li[2]/a/link");
    By bntShowMyResults = By.cssSelector(".btn-block > .rippleJS");

    public GobearHomePage(WebDriver driver){
        this.driver = driver;
    }

    public void gotoInsuranceTravelResult(String sTrip) throws InterruptedException{
    	driver.findElement(linkInsurance).click();
    	driver.findElement(linkTravel).click();
    	
    	driver.findElement(sbbTrip).click();    	
    	if (sTrip == "singletrip") {
    		driver.findElement(itemSingleTrip).click();
    	} else {
    		driver.findElement(itemAnnualTrip).click();
    	}
    	
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].scrollIntoView();", driver.findElement(bntShowMyResults)); 
    	js.executeScript("window.scrollBy(0, -200)");
    	driver.findElement(bntShowMyResults).click();
    }
}
