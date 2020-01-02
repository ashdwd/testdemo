package Framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {

    @FindBy(linkText = "News")
    WebElement newsLink;

    @FindBy(linkText = "Images")
    WebElement imagesLink;

    @FindBy(linkText = "Maps")
    WebElement mapsLink;

    @FindBy(linkText = "Books")
    WebElement booksLink;

    WebDriver driver;

    public SearchResultPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnLink(String linkText){
        switch (linkText.toLowerCase()){
            case "news":
                newsLink.click();
                break;
            case "images":
                imagesLink.click();
                break;
            case "maps":
                mapsLink.click();
                break;
            case "books":
                booksLink.click();
                break;
        }
    }


    public String getTitle() {
        return driver.getTitle();
    }
}
