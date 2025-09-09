package Hotel_Bookings;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class Trending_Hotels {
    @Test
    public void trending() throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        //url
        Methods implument = new Methods();
        implument.url(driver);
        //login
        //implument.login(driver);
        //Clicking on hotel
        WebElement hotel=driver.findElement(By.xpath("//h4[text()='Anmol Continental']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hotel);
        //Transfering to new tab
        implument.tab(driver);
        //Check-in
        implument.checkin_out(driver);
        //Clicking on reserve
        driver.findElement(By.xpath("(//button[@class='reserve-btn'])[2]")).click();
        //Primary guest details
        Thread.sleep(6000);
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Anandh");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Reddy");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("pallianandh@gmail.com");
        driver.findElement(By.xpath("//select[@name='countryCode']")).click();
        driver.findElement(By.xpath("//option[@value='+91']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("8463954032");
        //Special requirement
        driver.findElement(By.xpath("//div[@aria-hidden='true']")).click();
        driver.findElement(By.xpath("//div[text()='Large bed']")).click();
        driver.findElement(By.xpath("//textarea[@placeholder='Write something...']")).sendKeys("Nothing to say");
        Thread.sleep(4000);
        //Close browser
        driver.quit();
    }
}
