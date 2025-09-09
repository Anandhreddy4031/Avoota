package Hotel_Bookings;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hotel_Booking1 {
    @Test
    public void room() throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        //navigating
        Methods implument=new Methods();
        implument.url(driver);
        //login
        //implument.login(driver);
        //Clicking on search text field
        driver.findElement(By.xpath("//input[@placeholder='Search city, hotel, area...']")).click();
        Thread.sleep(1000);
        //Clicking on hyderabad
        driver.findElement(By.xpath("(//span[text()='Hyderabad'])[1]")).click();
        Thread.sleep(1000);
        //Clicking on search
        driver.findElement(By.xpath("//input[@value='Hyderabad']")).click();
        Thread.sleep(1000);
        //Clicking on local areas in city
        driver.findElement(By.xpath("//span[text()='HYDERABAD, TELANGANA, INDIA']")).click();
        Thread.sleep(1500);
        //Check_in_out
        implument.checkin_out(driver);
        //Creating rooms
        implument.rooms(driver);
        //Search
        driver.findElement(By.xpath("//button[@class='search-button']")).click();
        Thread.sleep(1000);
        //Price per night
        driver.findElement(By.xpath("//label[text()='₹0 - ₹3,000']")).click();
        Thread.sleep(1000);
        //Clicking on hotel
        WebElement hotel=driver.findElement(By.xpath("//h2[text()='Super Townhouse RCC PARK VIEW INN']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hotel);
        //Transfering to new tap
        implument.tab(driver);
        //Clicking on reserve
        driver.findElement(By.xpath("(//button[text()='Reserve'])[2]")).click();
        //Primary guest details
        implument.guestdetails(driver);
        Thread.sleep(4000);
        //Close browser
        driver.quit();
    }
}
