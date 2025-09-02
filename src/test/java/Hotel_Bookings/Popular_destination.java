package Hotel_Bookings;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Popular_destination {
    @Test
    public void goa() throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        //url
        Methods implument=new Methods();
        implument.url(driver);
        //login
        //implument.login(driver);
        //Clicking on goa
        driver.findElement(By.xpath("//div[text()='GOA']")).click();
        Thread.sleep(1000);
        //Clicking on search bar
        driver.findElement(By.xpath("//input[contains(@class,'search-input search-input-div destination-input')]")).click();
        Thread.sleep(1000);
        //Clicking on local area
        driver.findElement(By.xpath("//span[text()='GOA, INDIA']")).click();
        Thread.sleep(1000);
        //Clicking on search
        driver.findElement(By.xpath("//span[text()='Modify Search']")).click();
        Thread.sleep(2000);
        //Price per night
        driver.findElement(By.xpath("(//div[@class='filter-item'])[2]")).click();
        Thread.sleep(2000);
        //Clicking on hotel
        WebElement hotel=driver.findElement(By.xpath("//h2[text()='La Casita']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hotel);
        //Transfering to new tab
        implument.tab(driver);
        //Check-in-out
        implument.checkin_out(driver);
        Thread.sleep(2000);
        //Clicking on room
        driver.findElement(By.xpath("//span[@class='guests-summary']")).click();
        //Adding guest
        driver.findElement(By.xpath("(//button[text()='+'])[1]")).click();
        //Clicking on Apply
        driver.findElement(By.xpath("//button[@class='apply-guests-button']")).click();
        //Clicking on update
        driver.findElement(By.id("search-button-text")).click();
        //Clicking on reserve
        driver.findElement(By.xpath("(//button[@class='reserve-btn'])[2]")).click();
        //Primary guest details
        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Anandh");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Reddy");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("pallianandh@gmail.com");
        driver.findElement(By.xpath("//select[@name='countryCode']")).click();
        driver.findElement(By.xpath("//option[@value='+91']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("8463954032");
        //Adding multiple guest 1
        /*driver.findElement(By.xpath("//button[@class='guest-details__add']")).click();
        driver.findElement(By.xpath("(//input[@placeholder='First Name'])[1]")).sendKeys("bharath");
        driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]")).sendKeys("kumar");
        //Done
        driver.findElement(By.xpath("//button[@class='select-guest__button--save2']")).click();*/
        //Special requirement
        driver.findElement(By.xpath("//div[@aria-hidden='true']")).click();
        driver.findElement(By.xpath("//div[text()='Large bed']")).click();
        driver.findElement(By.xpath("//textarea[@placeholder='Write something...']")).sendKeys("Nothing to say");
        Thread.sleep(4000);
        //Close browser
        driver.quit();

    }
}
