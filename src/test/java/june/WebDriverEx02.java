package june;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebDriverEx02 {
    WebDriver driver;
    final String expectedTitle = "IMDb: Ratings, Reviews, and Where to Watch the Best Movies & TV Shows";
    final String expectedURL = "https://www.imdb.com/";

    @BeforeClass
    public void startSession() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.imdb.com/");

    }

    @AfterClass
    public void closeSession() {
        driver.quit();
    }


    @Test
    public void test01VerifyTitle() {
        driver.navigate().refresh();
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test01 - Passed!");
        } else {
            System.out.println("Test01 - Failed!");
            System.out.println("Actual Title: " + actualTitle);
        }

    }

    @Test
    public void test02VerifyURL() {
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.equals(expectedURL)) {
            System.out.println("Test02 - Passed!");
        } else {
            System.out.println("Test02- Failed!");
            System.out.println("Actual Url: " + actualUrl);
        }
    }

}