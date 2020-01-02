import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestAutomation {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish_Dwivedi03\\Downloads\\serenity-cucumber-starter-master\\TestDemo\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try{
            driver.get("https://google.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            Thread.sleep(5000);
            WebElement searchform = driver.findElement(By.name("f"));
            WebElement searchBox = searchform.findElement(By.name("q"));
            searchBox.sendKeys("Infosys");
            System.out.println(searchBox);
//
//            searchBox.submit();
//            Thread.sleep(5000);
//            WebElement news = driver.findElement(By.linkText("News"));
//            news.click();
//            Thread.sleep(5000);
//            WebElement images = driver.findElement(By.linkText("Images"));
//            images.click();
//            Thread.sleep(5000);
//            WebElement maps = driver.findElement(By.linkText("Maps"));
//            maps.click();
//            Thread.sleep(5000);
//            driver.navigate().back();
//            WebElement books = driver.findElement(By.linkText("Books"));
//            books.click();
//            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            driver.quit();
        }
    }
}
