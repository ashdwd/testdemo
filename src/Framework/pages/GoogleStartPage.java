package Framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleStartPage {

    @FindBy(name = "q")
    WebElement searchBox;

    @FindBy(xpath = "//input[@aria-label='Google Search']")
    WebElement searchButton;

    WebDriver driver;

    public GoogleStartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchText(String searchText){
        searchBox.sendKeys(searchText);
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public void clickOnGoogleSearch(){
        searchButton.click();
    }

}
