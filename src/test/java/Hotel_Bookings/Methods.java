package Hotel_Bookings;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class Methods {

    @Test
    public void url(WebDriver driver) throws InterruptedException {
        //Implicit wait statement
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Maximizing the browser
        driver.manage().window().maximize();
        //Navigating to avoota.com
        driver.get("https://avoota.com");
    }
    @Test
    public void login(WebDriver driver) throws InterruptedException{
        //login
        driver.findElement(By.xpath("//span[@class='login-text']")).click();
        driver.findElement(By.xpath("//input[@class='phone-input']")).sendKeys("8463954031");
        driver.findElement(By.xpath("//button[@class='otp-btn']")).click();
        Thread.sleep(20000);
        driver.findElement(By.xpath("//button[text()='Verify OTP']")).click();
        Thread.sleep(2000);
    }
    @Test
    public void checkin_out(WebDriver driver) throws InterruptedException{
        //Checkin
        WebElement in=driver.findElement(By.xpath("(//span[@class='date-value'])[1]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", in);
        //selecting checkin date
        WebElement d=driver.findElement(By.xpath("(//button[text()='1'])[2]"));
        js.executeScript("arguments[0].click();", d);
        //Done
        WebElement don=driver.findElement(By.xpath("//button[text()='Done']"));
        js.executeScript("arguments[0].click();", don);
        //Checkout
        WebElement out=driver.findElement(By.xpath("(//span[@class='date-value'])[2]"));
        js.executeScript("arguments[0].click();", out);
        //Selecting checkout date
        WebElement da=driver.findElement(By.xpath("//button[text()='2']"));
        js.executeScript("arguments[0].click();", da);
        //Done
        WebElement done=driver.findElement(By.xpath("//button[text()='Done']"));
        js.executeScript("arguments[0].click();", done);
    }
    @Test
    public void rooms(WebDriver driver) throws InterruptedException{
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
    }
    @Test
    public void tab(WebDriver driver) throws InterruptedException{
        // Wait for new window handle
        String originalWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        Thread.sleep(9000);
    }
    @Test
    public void guestdetails(WebDriver driver)throws InterruptedException{
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
        driver.findElement(By.xpath("//select[@class='guest-form__select']")).click();
        driver.findElement(By.xpath("(//option[@value='Mrs'])[1]")).click();
        driver.findElement(By.xpath("(//input[@placeholder='First Name'])[1]")).sendKeys("Palli");
        driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]")).sendKeys("kumare");
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
    }
}

