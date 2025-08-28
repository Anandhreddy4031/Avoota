package sample;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Avoota{
    @Test
    public void avota() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://avoota.com/");
        driver.manage().window().maximize();
        //Clicking on search text field
        driver.findElement(By.xpath("//input[@placeholder='Search city, hotel, area...']")).click();
        Thread.sleep(2000);
        //Clicking on hyderabad
        driver.findElement(By.xpath("(//span[text()='Hyderabad'])[1]")).click();
        Thread.sleep(2000);
        //Clicking on search
        driver.findElement(By.xpath("//input[@value='Hyderabad']")).click();
        Thread.sleep(2000);
        //Clicking on local areas in city
        driver.findElement(By.xpath("//span[text()='HYDERABAD, TELANGANA, INDIA']")).click();
        Thread.sleep(1500);
        //Checkin
        WebElement in=driver.findElement(By.xpath("(//span[@class='date-value'])[1]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        js.executeScript("arguments[0].click();", in);
        Thread.sleep(2000);
        //selecting checkin date
        WebElement d=driver.findElement(By.xpath("(//button[text()='1'])[2]"));
        js.executeScript("arguments[0].click();", d);
        Thread.sleep(2000);
        //Done
        WebElement don=driver.findElement(By.xpath("//button[text()='Done']"));
        js.executeScript("arguments[0].click();", don);
        Thread.sleep(2000);
        //Checkout
        WebElement out=driver.findElement(By.xpath("(//span[@class='date-value'])[2]"));
        js.executeScript("arguments[0].click();", out);
        Thread.sleep(2000);
        //Selecting checkout date
        WebElement da=driver.findElement(By.xpath("//button[text()='2']"));
        js.executeScript("arguments[0].click();", da);
        Thread.sleep(2000);
        //Done
        WebElement done=driver.findElement(By.xpath("//button[text()='Done']"));
        js.executeScript("arguments[0].click();", done);
        Thread.sleep(2000);
        //Rooms 1 Adding 1 person
        driver.findElement(By.xpath("//button[@class='guests-button search-input-div']")).click();
        //Adding room 2
        driver.findElement(By.xpath("//button[contains(@class,'add-room-button')]")).click();
        //Adding 2 persons
        driver.findElement(By.xpath("(//button[text()='+'])[3]")).click();
        //Adding room 3
        driver.findElement(By.xpath("//button[contains(@class,'add-room-button')]")).click();
        //Adding 2 persons
        driver.findElement(By.xpath("(//button[text()='+'])[5]")).click();
        //Adding child 1
        driver.findElement(By.xpath("(//button[text()='+'])[6]")).click();
        //Child 1 age
        WebElement age= driver.findElement(By.xpath("//select[@class='child-age-select']"));
        Select sel=new Select(age);
        sel.selectByValue("12");
        //Adding room 4
        driver.findElement(By.xpath("//button[contains(@class,'add-room-button')]")).click();
        //Adding 2 persons
        driver.findElement(By.xpath("(//button[text()='+'])[7]")).click();
        //Adding child 1
        driver.findElement(By.xpath("(//button[text()='+'])[8]")).click();
        //Child 1 age
        WebElement age1=driver.findElement(By.xpath("(//select[@class='child-age-select'])[2]"));
        Select sel1=new Select(age1);
        sel1.selectByValue("12");
        //Adding child 2
        driver.findElement(By.xpath("(//button[text()='+'])[8]")).click();
        //Child 2 age
        WebElement age2=driver.findElement(By.xpath("(//select[@class='child-age-select'])[3]"));
        Select sel2=new Select(age2);
        sel2.selectByValue("12");
        //Adding room 5
        driver.findElement(By.xpath("//button[contains(@class,'add-room-button')]")).click();
        //Adding child 1
        driver.findElement(By.xpath("(//button[text()='+'])[10]")).click();
        //Adding child 1 age
        WebElement age3=driver.findElement(By.xpath("(//select[@class='child-age-select'])[4]"));
        Select sel3=new Select(age3);
        sel3.selectByValue("12");
        //Adding child 2
        driver.findElement(By.xpath("(//button[text()='+'])[10]")).click();
        //Adding child 2 age
        WebElement age4=driver.findElement(By.xpath("(//select[@class='child-age-select'])[5]"));
        Select sel4=new Select(age4);
        sel4.selectByValue("12");
        Thread.sleep(1000);
        //Apply
        driver.findElement(By.xpath("//button[text()='Apply']")).click();
        Thread.sleep(1000);
        //Search
        driver.findElement(By.xpath("//button[@class='search-button']")).click();
        Thread.sleep(2000);
        //Price per night
        driver.findElement(By.xpath("//label[text()='₹0 - ₹3,000']")).click();
        Thread.sleep(2000);
        //Clicking on hotel
        driver.findElement(By.xpath("//h2[text()='Super Townhouse RCC Sunrise']")).click();
        Thread.sleep(4000);
        //Clicking on reserve
       // driver.findElement(By.id("search-button-text")).click();
       // driver.findElement(By.xpath("//button[text()='Reserve Room']/../../div[4]")).click();
        driver.findElement(By.xpath("//button[contains(@class,'reserve-btn') and text()='Reserve Room']")).click();





    }
}
