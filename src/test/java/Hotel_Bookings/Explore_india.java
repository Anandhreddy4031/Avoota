package Hotel_Bookings;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Explore_india {
    @Test
    public void india() throws InterruptedException{
        WebDriver driver= new ChromeDriver();
        //Url
        Methods implument = new Methods();
        implument.url(driver);
        //login
        //implument.login(driver);
        //Clicking on hyderabad
        WebElement hyd= driver.findElement(By.xpath("//span[text()='Hyderabad']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hyd);
        //Clicking on search bar
        driver.findElement(By.xpath("//input[@placeholder='Search city, hotel, area...']")).click();
        //Clicking on city local
        driver.findElement(By.xpath("//span[text()='HYDERABAD, TELANGANA, INDIA']")).click();
        //Check-in-out
        implument.checkin_out(driver);
        //Clicking on room
        driver.findElement(By.xpath("//button[@class='guests-button search-input-div']")).click();
        //Adding guest
        driver.findElement(By.xpath("(//button[text()='+'])[1]")).click();
        //Clicking on apply
        driver.findElement(By.xpath("//button[@class='apply-guests-button']")).click();
        //Clicking on modify search
        Thread.sleep(4000);
        WebElement m=driver.findElement(By.xpath("//button[@class='search-button-search-result']"));
        js.executeScript("arguments[0].click();", m);
        Thread.sleep(4000);
        //Price per night
        driver.findElement(By.xpath("//label[text()='₹8,000 - ₹15,000']")).click();
        Thread.sleep(6000);
        //Clicking on hotel
        driver.findElement(By.xpath("//h2[text()='ITC Kohenur, a Luxury Collection Hotel, Hyderabad']")).click();
        //Transfering to new tab
        implument.tab(driver);
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
        //Adding multiple guest 1
        driver.findElement(By.xpath("//button[@class='guest-details__add']")).click();
        driver.findElement(By.xpath("(//input[@placeholder='First Name'])[1]")).sendKeys("bharath");
        driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]")).sendKeys("kumar");
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
