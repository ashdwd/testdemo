package Framework.tests;

import Framework.pages.GoogleStartPage;
import Framework.pages.SearchResultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase_1 {

    String driverPath = "C:\\Users\\Ashish_Dwivedi03\\Downloads\\serenity-cucumber-starter-master\\TestDemo\\driver\\chromedriver.exe";

    WebDriver driver;

    GoogleStartPage googleStartPage;

    SearchResultPage searchResultPage;

    @BeforeMethod
    public void setup(){

        System.setProperty("webdriver.chrome.driver", driverPath);

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://google.com");

    }

    @Test(priority = 0)
    public void test_google_search_result(){

        googleStartPage = new GoogleStartPage(driver);
        String actualTitle = googleStartPage.getTitle();
        Assert.assertEquals(actualTitle, "Google");

        googleStartPage.searchText("");
        googleStartPage.clickOnGoogleSearch();

        searchResultPage = new SearchResultPage(driver);

        String resultPageTitle = searchResultPage.getTitle();
        Assert.assertEquals(resultPageTitle, "Infosys - Google Search");
    }

    @Test(priority = 1)
    public void test_google_news_result(){

        googleStartPage = new GoogleStartPage(driver);
        String actualTitle = googleStartPage.getTitle();
        Assert.assertEquals(actualTitle, "Google");

        googleStartPage.searchText("Infosys");
        googleStartPage.clickOnGoogleSearch();

        searchResultPage = new SearchResultPage(driver);

        String resultPageTitle = searchResultPage.getTitle();
        Assert.assertEquals(resultPageTitle, "Infosys - Google Search");
        searchResultPage.clickOnLink("news");
    }

    @Test(priority = 2)
    public void test_google_images_result(){

        googleStartPage = new GoogleStartPage(driver);
        String actualTitle = googleStartPage.getTitle();
        Assert.assertEquals(actualTitle, "Google");

        googleStartPage.searchText("Infosys");
        googleStartPage.clickOnGoogleSearch();

        searchResultPage = new SearchResultPage(driver);

        String resultPageTitle = searchResultPage.getTitle();
        Assert.assertEquals(resultPageTitle, "Infosys - Google Search");
        searchResultPage.clickOnLink("images");
    }

    @Test(priority=3)
    public void test_google_books_result(){

        googleStartPage = new GoogleStartPage(driver);
        String actualTitle = googleStartPage.getTitle();
        Assert.assertEquals(actualTitle, "Google");

        googleStartPage.searchText("Infosys");
        googleStartPage.clickOnGoogleSearch();

        searchResultPage = new SearchResultPage(driver);

        String resultPageTitle = searchResultPage.getTitle();
        Assert.assertEquals(resultPageTitle, "Infosys - Google Search");
        searchResultPage.clickOnLink("books");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
