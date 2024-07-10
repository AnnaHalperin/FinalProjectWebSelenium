package june;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class WebDriverEx03 {
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
    public void Test01() {
        System.out.println("Hello");
    }
}

