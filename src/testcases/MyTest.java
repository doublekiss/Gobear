package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.testng.asserts.Assertion;

import pages.GobearHomePage;
import pages.ResultPage;

public class MyTest {
	//Please download correct chromedriver.exe for your Chrome version and update strDriverPath
	String strDriverPath = "tools\\chromedriver81.0.exe";    
    WebDriver driver;
    SoftAssert softAssert = new SoftAssert();

    GobearHomePage objHomePage;
    ResultPage objResultPage;

    @BeforeTest
    public void setup(){
    	System.setProperty("webdriver.chrome.driver", strDriverPath);        
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.gobear.com/ph?x_session_type=UAT");
        
    }
    
    //FILTER tests ----------------------------------------------    
    @Test(enabled = false)
    public void test01() throws Exception {
    	System.out.println("---Test01--------------------------------------");
    	objResultPage.selectShowAll();
    	softAssert.assertTrue(objResultPage.getNumberOfProviderFound() >= 3, "Test01: Number of plans found >= 3");
    	
    }
    @Test(enabled = false)
    public void test02() throws Exception {
    	System.out.println("---Test02--------------------------------------");
    	objResultPage.selectPromosOnly();
    	softAssert.assertTrue(objResultPage.getNumberOfProviderFound() == 0, "Test02: Number of plans found == 0");
    }
    
    @Test(enabled = false)
    public void test03() throws Exception {
    	System.out.println("---Test03--------------------------------------");
    	objResultPage.selectFPGInsurance();
    	softAssert.assertTrue(objResultPage.getNumberOfProviderFound() > 0, "Test03: Nummber of plans found > 0");
    }
    @Test(enabled = false)
    public void test04() throws Exception {
    	System.out.println("---Test04--------------------------------------");
    	objResultPage.selectPacificCross();
    	softAssert.assertTrue(objResultPage.getNumberOfProviderFound() > 0, "Test04: Nummber of plans found > 0");
    }
    @Test(enabled = false)
    public void test05() throws Exception {
    	System.out.println("---Test05--------------------------------------");
    	objResultPage.selectPrudentialGuarantee();
    	softAssert.assertTrue(objResultPage.getNumberOfProviderFound() > 0, "Test05: Nummber of plans found > 0");
    }
    @Test(enabled = false)
    public void test06() throws Exception {
    	System.out.println("---Test06--------------------------------------");
    	objResultPage.selectStandardInsurance();
    	softAssert.assertTrue(objResultPage.getNumberOfProviderFound() > 0, "Test06: Nummber of plans found > 0");
    }
    
    @Test(enabled = false)
    public void test07(int intBegin, int intEnd) throws Exception {
    	System.out.println("---Test07--------------------------------------");
    	objResultPage.selectPersonalAccident(intBegin, intEnd);
    	softAssert.assertTrue(objResultPage.getNumberOfProviderFound() > 0, "Test07: Nummber of plans found > 0");
    }
    @Test(enabled = false)
    public void test08(int intBegin, int intEnd) throws Exception {
    	System.out.println("---Test08--------------------------------------");
    	objResultPage.selectMedicalTrveling(intBegin, intEnd);
    	softAssert.assertTrue(objResultPage.getNumberOfProviderFound() > 0, "Test08: Nummber of plans found > 0");
    }
    
    //SORT tests ----------------------------------------------    
    @Test(enabled = false)
    public void test09() throws Exception {
    	System.out.println("---Test09--------------------------------------");
    	objResultPage.selectPromotion();
    	softAssert.assertTrue(objResultPage.getNumberOfProviderFound() > 0, "Test09: Nummber of plans found > 0");
    }
    @Test(enabled = false)
    public void test10() throws Exception {
    	System.out.println("---Test10--------------------------------------");
    	objResultPage.selectPriceLowToHigh();
    	softAssert.assertTrue(objResultPage.getNumberOfProviderFound() > 0, "Test10: Nummber of plans found > 0");
    }
    @Test(enabled = false)
    public void test11() throws Exception {
    	System.out.println("---Test11--------------------------------------");
    	objResultPage.selectPriceHighToLow();
    	softAssert.assertTrue(objResultPage.getNumberOfProviderFound() > 0, "Test11: Nummber of plans found > 0");
    }
    @Test(enabled = false)
    public void test12() throws Exception {
    	System.out.println("---Test12--------------------------------------");
    	objResultPage.selectScoreHighToLow();
    	softAssert.assertTrue(objResultPage.getNumberOfProviderFound() > 0, "Test12: Nummber of plans found > 0");
    }
    @Test(enabled = false)
    public void test13() throws Exception {
    	System.out.println("---Test13--------------------------------------");
    	objResultPage.selectSingleTrip();
    	softAssert.assertTrue(objResultPage.getNumberOfProviderFound() > 0, "Test13: Nummber of plans found > 0");
    }
    @Test(enabled = false)
    public void test14() throws Exception {
    	System.out.println("---Test14--------------------------------------");
    	objResultPage.selectAnnualTrip();
    	softAssert.assertTrue(objResultPage.getNumberOfProviderFound() > 0, "Test14: Nummber of plans found > 0");
    }
    @Test(enabled = false)
    public void test15() throws Exception {
    	System.out.println("---Test15--------------------------------------");
    	objResultPage.selectJustMe();
    	softAssert.assertTrue(objResultPage.getNumberOfProviderFound() > 0, "Test15: Nummber of plans found > 0");
    }
    @Test(enabled = false)
    public void test16() throws Exception {
    	System.out.println("---Test16--------------------------------------");
    	objResultPage.selectMyFamily();
    	softAssert.assertTrue(objResultPage.getNumberOfProviderFound() > 0, "Test16: Nummber of plans found > 0");
    }
    @Test(enabled = false)
    public void test17() throws Exception {
    	System.out.println("---Test17--------------------------------------");
    	objResultPage.select2Persons();
    	softAssert.assertTrue(objResultPage.getNumberOfProviderFound() > 0, "Test17: Nummber of plans found > 0");
    }
    @Test(enabled = false)
    public void test18(String strDestination) throws Exception {
    	System.out.println("---Test18--------------------------------------");
    	objResultPage.selectDestination(strDestination);
    	softAssert.assertTrue(objResultPage.getNumberOfProviderFound() > 0, "Test18: Nummber of plans found > 0");
    }
    @Test(enabled = false)
    public void test19(String strStartDate, String strEndDate) throws Exception {
    	System.out.println("---Test19--------------------------------------");
    	objResultPage.selectStartDate(strStartDate);
    	objResultPage.selectEndDate(strEndDate);
    	softAssert.assertTrue(objResultPage.getNumberOfProviderFound() > 0, "Test19: Nummber of plans found > 0");
    }
    
    @Test(enabled = true)
    public void testBasic01() throws Exception{
    	objHomePage = new GobearHomePage(driver);
    	objHomePage.gotoInsuranceTravelResult("singletrip");
    	objResultPage = new ResultPage(driver);
    	objResultPage.closePopup();
    	
    	//FILTER section tests--------------------------------------------
    	objResultPage.clickSeeMore();
    	test01();
    	test02();
    	objResultPage.clickClearAll();
    	test03();
    	objResultPage.clickClearAll();
    	test04();
    	objResultPage.clickClearAll();
    	test05();
    	objResultPage.clickClearAll();
    	test06();    	
    	objResultPage.clickClearAll();
    	test07(10, -10);
    	objResultPage.clickClearAll();
    	test08(20, -30);
    	objResultPage.clickClearAll();
    	
    	//SORT section tests--------------------------------------------
    	objResultPage.clickSeeLess();
    	test09();
    	test10();
    	test11();
     	test12();
     	
     	//DETAILS section tests--------------------------------------------
    	test13();
    	test14();
    	objResultPage.selectSingleTrip();
    	test15();
    	test16();
    	test17();
    	objResultPage.selectJustMe();
    	test18("Thailand");
    	test18("Philippines");
    	test19("3", "9");
    	driver.navigate().refresh();
    	test19("12", "22");
    	
    	softAssert.assertAll();
    }

    @Test(enabled = false)
    public void testBasic02() throws Exception{
    	objHomePage = new GobearHomePage(driver);
    	objHomePage.gotoInsuranceTravelResult("singletrip");
    	objResultPage = new ResultPage(driver);
    	objResultPage.closePopup();
    	
    	//DETAILS section tests--------------------------------------------
    	test19("11", "18");
    	driver.navigate().refresh();
    	test19("16", "22");
    	driver.navigate().refresh();
    	test18("Japan");
    	test18("Thailand");
    	test18("Hong Kong");
    	test13();
    	test14();
    	objResultPage.selectSingleTrip();
    	test17();
    	test15();
    	test16();
    	objResultPage.selectJustMe();
    	
    	
    	//FILTER section tests--------------------------------------------
    	objResultPage.clickSeeMore();
    	test07(20, -20);
    	objResultPage.clickClearAll();
    	test08(30, -15);
    	objResultPage.clickClearAll();
    	test01();
    	test02();
    	objResultPage.clickClearAll();
    	test03();
    	objResultPage.clickClearAll();
    	test04();
    	objResultPage.clickClearAll();
    	test05();
    	objResultPage.clickClearAll();
    	test06();
    	objResultPage.clickClearAll();    	
	    
    	//SORT section tests--------------------------------------------
    	objResultPage.clickSeeLess();
    	test11();
    	test10();
    	test12();
     	test09();     	     	
    	
    	softAssert.assertAll();
    }
    
    @Test(enabled = false)
    public void testStretch() throws Exception{
    	objHomePage = new GobearHomePage(driver);
    	objHomePage.gotoInsuranceTravelResult("singletrip");
    	objResultPage = new ResultPage(driver);
    	objResultPage.closePopup();
    	
    	//Do these selects then verify----------------------------------
    	objResultPage.clickSeeMore();
    	objResultPage.selectFPGInsurance();
    	objResultPage.selectPersonalAccident(30, -35);
    	objResultPage.selectPriceHighToLow();
    	objResultPage.selectMyFamily();
    	objResultPage.selectDestination("Thailand");
    	objResultPage.selectStartDate("12");
    	objResultPage.selectEndDate("28");
    	softAssert.assertTrue(objResultPage.getNumberOfProviderFound() > 0, "Test09: Nummber of plans found > 0");
    	
    	objResultPage.selectSingleTrip();
    	objResultPage.selectPacificCross();
    	objResultPage.selectMedicalTrveling(20, -30);
    	objResultPage.selectPriceLowToHigh();
    	objResultPage.select2Persons();
    	objResultPage.selectStartDate("15");
    	objResultPage.selectEndDate("21");
    	objResultPage.selectDestination("Hong Kong");    	
    	softAssert.assertTrue(objResultPage.getNumberOfProviderFound() > 0, "Test09: Nummber of plans found > 0");
    	
    	objResultPage.selectStartDate("4");
    	objResultPage.selectEndDate("24");
    	objResultPage.selectFPGInsurance();
    	objResultPage.selectDestination("Japan");
    	objResultPage.selectMedicalTrveling(10, -50);
    	objResultPage.selectPriceLowToHigh();
    	objResultPage.selectPrudentialGuarantee();
    	objResultPage.selectJustMe();
    	softAssert.assertTrue(objResultPage.getNumberOfProviderFound() > 0, "Test09: Nummber of plans found > 0");
    	
    	//...add more selects and verify here
    	
    	softAssert.assertAll();
    }    
    
    
   
    @AfterTest
	public void tearDown() throws Exception {
		driver.close();
	}
    
}
