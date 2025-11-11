package Grihda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Employee {
    @Test
    public void employe(){
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://localhost:3001");
        driver.manage().window().maximize();
        //Login
        driver.findElement(By.id("employeeId")).sendKeys("GRIHDATEST2");
        driver.findElement(By.id("password")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit']")).submit();
        //My task
        driver.findElement(By.xpath("//span[text()='My Tasks']")).click();
        //Update
        driver.findElement(By.xpath("(//button[@class='update-btn-emp'])[1]")).click();
        //Task status
        driver.findElement(By.xpath("//option[@value='IN_PROGRESS']")).click();
        //Progress notes
        driver.findElement(By.xpath("//textarea[@placeholder='Add Notes Current Progress']")).sendKeys("Current Progress");
        //Update task button
        driver.findElement(By.xpath("//button[@class='update-btn']")).click();




    }
}
