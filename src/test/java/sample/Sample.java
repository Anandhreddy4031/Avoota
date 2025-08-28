package sample;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Sample {
    @Test
    public void avot() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://avoota.com");

/*// Enter text in search box
        WebElement searchBox = driver.findElement(By.xpath("//input[@class='search-input search-input-div destination-input']"));
        searchBox.sendKeys("Hyderabad");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement shadowHost = driver.findElement(By.cssSelector("selector-for-shadow-host"));
        SearchContext shadowRoot = (SearchContext) js.executeScript("return arguments[0].shadowRoot", shadowHost);

// Then search inside
        WebElement option = shadowRoot.findElement(By.xpath("//div[contains(text(),'Hyderabad, Telangana, India')]"));
        option.click();*/
        driver.findElement(By.xpath("//input[@placeholder='Search city, hotel, area...']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("(//span[text()='Hyderabad'])[1]")).click();
        Thread.sleep(1500);
        //hyderbad
        driver.findElement(By.xpath("//input[@value='Hyderabad']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//span[text()='HYDERABAD, TELANGANA, INDIA']"));


    }
}
