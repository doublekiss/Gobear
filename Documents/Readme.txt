1.Install JRE 1.8
2.Install Eclipse
3.Install TestNG 7.2.0 version on Eclipse 
  - On Eclipse go to Help/Install New Software, then use the followingg link to install TestNG: https://dl.bintray.com/testng-team/testng-p2/updatesites/7.2.0.b202003151750/
4.This exercise is developed based on Page Object Model. Each page has its web elements and methods. The test will using these pages to do tests
5.On Eclipse open Gobear project, then open the test file MyTest.java, it has 3 TCs:testBasic01(), testBasic02(), testStretch()
  and 19 sub tests: test01, test02, ... test19 (single select test)
  - To run testBasic01() please update @Test(enabled = true) for it, to ignore its running please update @Test(enabled = false).The same with testBasic02(), testStretch()
  - To run test, open MyTest.java and select "Run/Run" or "Ctrl + F11" or "Run/Run As/TestNT Test"
6.The test use chromedriver.exe to control the Chrome browser, download link: https://chromedriver.chromium.org/downloads
  - Please download correct chromedriver.exe for your Chrome version and put it into folder "tools" in Gobear project
    then update the chromepath variable at line 19 in MyTest.java, Ex: strDriverPath = "tools\\chromedriver81.0.exe"

*Note:
-Because not have enough time so I make everything simple and easy to view/run/understand, objects are declared temporarily, most of them use XPath
-Some code lines are written hastily and not yet optimized
-About the Basic/Stretch tests, if have time I will create test data into an excel file and let the test do FILTER, SORT, DETAILs selects 
 according to what are written in the excel file (use data provider)
-All these TCs (testBasic01(), testBasic02(), testStretch()) have been run many times and always PASSED. 
 Use can make your own TCs by changing the order of these FILTER/SORT/DETAILS selections and then update these verify point at these lines begin: softAssert.assertTrue(...
-The verify point is just simple count the number of provider found and compare with the expected value

Many thanks,
Quang
   