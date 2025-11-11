package Grihda;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Adding_Employee {
    @Test
    public void adding() throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://localhost:3001");
        driver.manage().window().maximize();
        //Login
        driver.findElement(By.id("employeeId")).sendKeys("Test1");
        Thread.sleep(1500);
        driver.findElement(By.id("password")).sendKeys("12345");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//button[@type='submit']")).submit();
        Thread.sleep(3000);
        Actions act=new Actions(driver);
            //Employee
        driver.findElement(By.xpath("//span[text()='Employees']")).click();
        Thread.sleep(1500);
        //Adding employee
        driver.findElement(By.xpath("//button[@class='add-employee-btn']")).click();
        Thread.sleep(1500);
        //First name text field
        driver.findElement(By.id("firstName")).sendKeys("Anandh");
        Thread.sleep(1500);
        //Last name text field
        driver.findElement(By.id("lastName")).sendKeys("Reddy");
        Thread.sleep(1500);
        //Employee id text field
        driver.findElement(By.id("employeeId")).sendKeys("grihda1");
        Thread.sleep(1500);
        //Phone number text field
        driver.findElement(By.id("mobileNumber")).sendKeys("8463954032");
        Thread.sleep(1500);
        //Email text field
        driver.findElement(By.id("emailId")).sendKeys("anandhreddy4031@gmail.com");
        Thread.sleep(1500);
        //Address text field
        driver.findElement(By.id("address")).sendKeys("Hyderabad");
        Thread.sleep(1500);
        //Role checkbox
        driver.findElement(By.xpath("(//input[@class='form-checkbox'])[2]")).click();
        Thread.sleep(1500);
        //Professional information
        //Job role
        driver.findElement(By.id("designation")).click();
        driver.findElement(By.xpath("//option[@value='Team Lead']")).click();
        //Years of experience
        driver.findElement(By.id("experience")).sendKeys("3");
        //Services
        driver.findElement(By.xpath("//button[text()='Property Monitoring Services']")).click();
        driver.findElement(By.xpath("//button[text()='Property Documentation Services']")).click();
        driver.findElement(By.xpath("//button[text()='Legal Realty Services']")).click();
        //Skill level
        driver.findElement(By.xpath("//button[text()='Expert']")).click();
        //Add employee button
        driver.findElement(By.xpath("//button[@type='submit']")).submit();
        Thread.sleep(4000);
            //Contact
        driver.findElement(By.xpath("//span[text()='Contacts']")).click();
        //Full name text field
        driver.findElement(By.name("fullName")).sendKeys("Anandh");
        Thread.sleep(1000);
        //Whatsapp number
        driver.findElement(By.name("whatsappNumber")).sendKeys("7412589635");
        Thread.sleep(1000);
        //Save button
        driver.findElement(By.xpath("//button[@class='save-btn']")).click();
        Thread.sleep(4000);
        //Close browser
        driver.quit();

    }
}
