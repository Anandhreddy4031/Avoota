package Hotel_Bookings;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class Hotel_Booking {
    WebDriver driver=new ChromeDriver();
    @Test
    public void booking() throws InterruptedException {
        //Navigate to url
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
        //Checkin
        WebElement in=driver.findElement(By.xpath("(//span[@class='date-value'])[1]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(1000);
        js.executeScript("arguments[0].click();", in);
        Thread.sleep(1000);
        //selecting checkin date
        WebElement d=driver.findElement(By.xpath("(//button[text()='1'])[2]"));
        js.executeScript("arguments[0].click();", d);
        Thread.sleep(1000);
        //Done
        WebElement don=driver.findElement(By.xpath("//button[text()='Done']"));
        js.executeScript("arguments[0].click();", don);
        Thread.sleep(1000);
        //Checkout
        WebElement out=driver.findElement(By.xpath("(//span[@class='date-value'])[2]"));
        js.executeScript("arguments[0].click();", out);
        Thread.sleep(1000);
        //Selecting checkout date
        WebElement da=driver.findElement(By.xpath("//button[text()='2']"));
        js.executeScript("arguments[0].click();", da);
        Thread.sleep(1000);
        //Done
        WebElement done=driver.findElement(By.xpath("//button[text()='Done']"));
        js.executeScript("arguments[0].click();", done);
        Thread.sleep(1000);
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
        Thread.sleep(1000);
        //Price per night
        driver.findElement(By.xpath("//label[text()='₹0 - ₹3,000']")).click();
        Thread.sleep(1000);
        //Clicking on hotel
        driver.findElement(By.xpath("//h2[text()='Super Townhouse RCC Sunrise']")).click();
        //window handling
        String originalWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
            }
        }
        Thread.sleep(8000);
        //Clicking on reserve
        driver.findElement(By.xpath("(//button[text()='Reserve'])[1]")).click();
        //Primary guest details
        Thread.sleep(6000);
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Anandh");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Reddy");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("pallianandh@gmail.com");
        driver.findElement(By.xpath("//select[@name='countryCode']")).click();
        driver.findElement(By.xpath("//option[@value='+91']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("8463954032");
        //Guest details
        driver.findElement(By.xpath("//button[@class='guest-details__add']")).click();
        driver.findElement(By.xpath("(//input[@placeholder='First Name'])[1]")).sendKeys("Ashok");
        driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]")).sendKeys("Palli");
        //Adding multiple guest 3
        driver.findElement(By.xpath("//button[@class='guest-form__save-button']")).click();
        driver.findElement(By.xpath("(//input[@placeholder='First Name'])[1]")).sendKeys("Palli");
        driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]")).sendKeys("nagesh");
        //Adding multiple guest 4
        driver.findElement(By.xpath("//button[@class='guest-form__save-button']")).click();
        driver.findElement(By.xpath("(//input[@placeholder='First Name'])[1]")).sendKeys("rakesh");
        driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]")).sendKeys("reddy");
        //Adding multiple guest 5
        driver.findElement(By.xpath("//button[@class='guest-form__save-button']")).click();
        driver.findElement(By.xpath("(//input[@placeholder='First Name'])[1]")).sendKeys("Palli");
        driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]")).sendKeys("Adi");
        //Adding multiple guest 6
        driver.findElement(By.xpath("//button[@class='guest-form__save-button']")).click();
        driver.findElement(By.xpath("(//input[@placeholder='First Name'])[1]")).sendKeys("gopi");
        driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]")).sendKeys("reddy");
        //Adding multiple guest 7
        driver.findElement(By.xpath("//button[@class='guest-form__save-button']")).click();
        driver.findElement(By.xpath("(//input[@placeholder='First Name'])[1]")).sendKeys("Palli");
        driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]")).sendKeys("gopi");
        //Adding multiple guest 8
        driver.findElement(By.xpath("//button[@class='guest-form__save-button']")).click();
        driver.findElement(By.xpath("(//input[@placeholder='First Name'])[1]")).sendKeys("venkat");
        driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]")).sendKeys("reddy");
        //Adding multiple guest 9
        driver.findElement(By.xpath("//button[@class='guest-form__save-button']")).click();
        driver.findElement(By.xpath("(//input[@placeholder='First Name'])[1]")).sendKeys("Nagesh");
        driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]")).sendKeys("reddy");
        driver.findElement(By.xpath("//input[@class='guest-form__checkbox']")).click();
        //Adding multiple guest 10
        driver.findElement(By.xpath("//button[@class='guest-form__save-button']")).click();
        driver.findElement(By.xpath("(//input[@placeholder='First Name'])[1]")).sendKeys("sunil");
        driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]")).sendKeys("reddy");
        driver.findElement(By.xpath("//input[@class='guest-form__checkbox']")).click();
        //Adding multiple guest 11
        driver.findElement(By.xpath("//button[@class='guest-form__save-button']")).click();
        driver.findElement(By.xpath("(//input[@placeholder='First Name'])[1]")).sendKeys("mahesh");
        driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]")).sendKeys("kumar");
        driver.findElement(By.xpath("//input[@class='guest-form__checkbox']")).click();
        //Adding multiple guest 12
        driver.findElement(By.xpath("//button[@class='guest-form__save-button']")).click();
        driver.findElement(By.xpath("(//input[@placeholder='First Name'])[1]")).sendKeys("Naveen");
        driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]")).sendKeys("reddy");
        driver.findElement(By.xpath("//input[@class='guest-form__checkbox']")).click();
        //Adding multiple guest 13
        driver.findElement(By.xpath("//button[@class='guest-form__save-button']")).click();
        driver.findElement(By.xpath("(//input[@placeholder='First Name'])[1]")).sendKeys("bharath");
        driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]")).sendKeys("kumar");
        driver.findElement(By.xpath("//input[@class='guest-form__checkbox']")).click();
        //Done
        driver.findElement(By.xpath("//button[@class='select-guest__button--save2']")).click();
        //Special requirement
        driver.findElement(By.xpath("//div[@aria-hidden='true']")).click();
        WebElement drop= driver.findElement(By.xpath("//div[text()='Large bed']"));
        js.executeScript("arguments[0].click();", drop);

        driver.findElement(By.xpath("//textarea[@placeholder='Write something...']")).sendKeys("Nothing to say");

        Thread.sleep(4000);
    }
    // closes browser even if test fails
    @AfterMethod()
    public void quit() {
        if (driver != null) {
            driver.quit();
        }
    }
}
