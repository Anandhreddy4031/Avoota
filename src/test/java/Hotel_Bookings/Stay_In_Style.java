package Hotel_Bookings;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class Stay_In_Style {
    @Test
    public void stay() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //Url
        Methods implument=new Methods();
        implument.url(driver);
        //Login
        //implument.login(driver);
        //Clicking on munnar
        WebElement mun=driver.findElement(By.xpath("(//div[text()='MUNNAR'])[1]"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", mun);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Search city, hotel, area...']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='MUNNAR, DEVIKOLAM, KERALA, INDIA']")).click();
        //Checkin
        implument.checkin_out(driver);
        //Rooms 1 Adding 1 person
        driver.findElement(By.xpath("//button[@class='guests-button search-input-div']")).click();
        //Adding child 1 age
        driver.findElement(By.xpath("(//button[text()='+'])[2]")).click();
        WebElement age4=driver.findElement(By.xpath("//select[@class='child-age-select']"));
        Select sel4=new Select(age4);
        sel4.selectByValue("12");
        //Apply
        driver.findElement(By.xpath("//button[text()='Apply']")).click();
        Thread.sleep(1000);
        //Modify search
        driver.findElement(By.xpath("//button[@class='search-button-search-result']")).click();
        Thread.sleep(1000);
        //Price per night
        driver.findElement(By.xpath("//label[text()='₹0 - ₹3,000']")).click();
        //Clicking on hotel
        driver.findElement(By.xpath("//h2[text()='Grand Valley Resort']")).click();
        //Transfering to new tab
        implument.tab(driver);
        //Clicking on reserve
        Thread.sleep(6000);
        driver.findElement(By.xpath("(//button[text()='Reserve'])[1]")).click();
        //Primary guest details
        Thread.sleep(8000);
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Anandh");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Reddy");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("pallianandh@gmail.com");
        driver.findElement(By.xpath("//select[@name='countryCode']")).click();
        driver.findElement(By.xpath("//option[@value='+91']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("8463954032");
        //Adding multiple guest 1
        driver.findElement(By.xpath("//button[@class='guest-details__add']")).click();
        driver.findElement(By.xpath("//input[@class='guest-form__checkbox']")).click();
        driver.findElement(By.xpath("//select[@class='guest-form__select']")).click();
        driver.findElement(By.xpath("//option[@value='Miss']")).click();
        driver.findElement(By.xpath("(//input[@placeholder='First Name'])[1]")).sendKeys("bharathi");
        driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]")).sendKeys("kumare");
        //Done
        driver.findElement(By.xpath("//button[@class='select-guest__button--save2']")).click();
        //Special requirement
        driver.findElement(By.xpath("//div[@aria-hidden='true']")).click();
        driver.findElement(By.xpath("//div[text()='Large bed']")).click();
        driver.findElement(By.xpath("//textarea[@placeholder='Write something...']")).sendKeys("Nothing to say");
        Thread.sleep(4000);
        //Close browser
        driver.quit();
    }
}
