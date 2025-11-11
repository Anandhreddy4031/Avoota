package Hotel_Bookings;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class My_Account {
    @Test
    public void account() throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://avoota.com/");
        driver.manage().window().maximize();
        //Sign up or login
        driver.findElement(By.xpath("//span[text()='Sign Up or Login']")).click();
        //login
        driver.findElement(By.xpath("//input[@class='phone-input']")).sendKeys("8463954031");
        driver.findElement(By.xpath("//button[@class='otp-btn']")).click();
        Thread.sleep(15000);
        //Verify
        driver.findElement(By.xpath("//button[text()='Verify OTP']")).click();
        Thread.sleep(2000);
        //My profile
        WebElement my=driver.findElement(By.xpath("//span[@class='login-text']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", my);
        //Profile
        driver.findElement(By.xpath("//button[text()='Profile']")).click();
        //Edit
        driver.findElement(By.xpath("//button[@type='button']")).click();
        Thread.sleep(2000);
        //Details
        WebElement name=driver.findElement(By.id("fullName"));
        js.executeScript("arguments[0].value='';", name);
        Thread.sleep(1000);
        name.sendKeys("Anandh");
        WebElement num=driver.findElement(By.id("mobileNumber"));
        js.executeScript("arguments[0].value='';", num);
        num.sendKeys("8463954032");
        WebElement email=driver.findElement(By.id("email"));
        js.executeScript("arguments[0].value='';", email);
        email.sendKeys("pallianandh@gmail.com");
        WebElement date=driver.findElement(By.id("dateOfBirth"));
        js.executeScript("arguments[0].value='';", date);
        date.sendKeys("12-02-2001");
        driver.findElement(By.id("gender")).click();
        driver.findElement(By.xpath("//option[@value='Male']")).click();
        driver.findElement(By.id("maritalStatus")).click();
        driver.findElement(By.xpath("//option[@value='Single']")).click();
        WebElement city=driver.findElement(By.id("city"));
        js.executeScript("arguments[0].value='';", city);
        city.sendKeys("Hyderabad");
        WebElement state=driver.findElement(By.id("state"));
        js.executeScript("arguments[0].value='';", state);
        state.sendKeys("Telangana");
        WebElement country=driver.findElement(By.id("country"));
        js.executeScript("arguments[0].value='';", country);
        country.sendKeys("India");
        driver.findElement(By.xpath("//button[@type='submit']")).submit();
        Thread.sleep(4000);
        //Close browser
        driver.quit();

    }
}
