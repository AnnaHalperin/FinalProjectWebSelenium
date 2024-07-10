package june;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebDriverEx01 {
    WebDriver driver;
    @BeforeClass
    public void startSession(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }
     @AfterClass
    public void closeSession(){
        driver.quit();
     }

     @Test
    public void test01VerifyBubblesExist(){
        driver.navigate().to("https://www.bing.com/");
        driver.navigate().back();
         System.out.println("Title is:"+ driver.getTitle());
         String source=driver.getPageSource();
         String keyword="bubble";
         if(source.contains(keyword))
         {
             System.out.println("Exists");
         }
         else{
             System.out.println("Not Exist");
         }
     }
}
