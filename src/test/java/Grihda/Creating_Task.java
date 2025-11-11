package Grihda;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;


public class Creating_Task {
    @Test
    public void service_request() throws InterruptedException, AWTException {
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
        JavascriptExecutor js=(JavascriptExecutor) driver;
              // Leads
        driver.findElement(By.xpath("//span[text()='Leads']")).click();
        //Create task
        driver.findElement(By.xpath("(//button[text()='Create Task'])[1]")).click();
        //Property type
        driver.findElement(By.name("propertyType")).click();
        driver.findElement(By.xpath("//option[@value='commercial']")).click();
        //Property & service details
        //District
        driver.findElement(By.xpath("//option[text()='Suryapet']")).click();
        //Pincode
        driver.findElement(By.xpath("//input[@placeholder='Enter Pincode']")).sendKeys("508233");
        //Service types dropdown
        driver.findElement(By.name("serviceType")).click();
        //Selecting service from dropdown
        driver.findElement(By.xpath("//option[text()='LEGAL REALTY SERVICES']")).click();
        //Sub service dropdown
        driver.findElement(By.name("subService")).click();
        //Selecting sub service from dropdown
        driver.findElement(By.xpath("//option[text()='Revenue Court Representation']")).click();
        //Base price text field
        driver.findElement(By.name("estimatedCost")).sendKeys("5000");
        //PreferredDate
        driver.findElement(By.name("preferredDate")).sendKeys("25-10-2025");
        //ServiceDescription
        driver.findElement(By.name("serviceDescription")).sendKeys("Service description");
        //Create task button
        //driver.findElement(By.xpath("//button[@type='submit']")).submit();
        Thread.sleep(4000);
        /*        //Service request
        driver.findElement(By.xpath("//span[text()='Service Requests']")).click();
        Thread.sleep(2000);
        //Create task or created
        WebElement create=driver.findElement(By.xpath("(//button[text()='Create Task' or text()='Created'])[1]"));
       // WebElement create=driver.findElement(By.xpath("//div[@role='row'][.//span[text()='600071']]//button[text()='Create Task']"));
        if (create.isEnabled()) {
            Thread.sleep(2000);
            create.click();
            Thread.sleep(1500);
            //Special
            driver.findElement(By.xpath("//textarea[@class='form-textarea']")).sendKeys("special instructions");
            Thread.sleep(2000);
            //Employee
            WebElement empl=driver.findElement(By.xpath("//input[@class='modal-input ']"));
            empl.sendKeys("test2 reddy");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//span[@class='emp-name']")).click();
            Thread.sleep(1500);
            //Level dropdown
            driver.findElement(By.xpath("//option[@value='Medium']")).click();
            driver.findElement(By.xpath("//option[@value='High']")).click();
            //Date
            driver.findElement(By.xpath("//input[@type='date']")).sendKeys("25-10-2025");
            //Create task
            driver.findElement(By.xpath("//button[@type='submit']")).submit();
        }else {
            System.out.println("Subtask already created");
        }
        Thread.sleep(4000);
        //Assign or re-assign task
        WebElement assign=driver.findElement(By.xpath("(//button[text()='Assign'])[1]"));
        if (assign.isDisplayed()) {
            //Created
            WebElement created = driver.findElement(By.xpath("(//button[text()='Created'])[1]"));
            if (created.isEnabled()) {
                js.executeScript("arguments[0].click();", assign);
                Thread.sleep(1500);
                //Employee
                WebElement empl = driver.findElement(By.xpath("//input[@type='text']"));
                empl.sendKeys("test2 reddy");
                Thread.sleep(1500);
                driver.findElement(By.xpath("//span[@class='emp-name']")).click();
                Thread.sleep(1500);
                //Date
                driver.findElement(By.xpath("//input[@type='date']")).sendKeys("20-10-2025");
                Thread.sleep(1500);
                //Notes
                driver.findElement(By.xpath("//textarea[@class='modal-textarea']")).sendKeys("Notes / Instructions");
                //Submit
                driver.findElement(By.xpath("//button[@class='btn assign-btn']")).click();
            } else {
                System.out.println("Task Assigned");
            }
        }else {
            System.out.println("Task already Assigned");
        }
        Thread.sleep(4000);
        //Reassign
        WebElement reassign=driver.findElement(By.xpath("(//button[text()='Re Assign'])[1]"));
        if (reassign.isDisplayed()) {
            js.executeScript("arguments[0].click();", reassign);
            Thread.sleep(1500);
            //Employee
            WebElement empl=driver.findElement(By.xpath("//input[@type='text']"));
            empl.sendKeys("test2 reddy");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//span[@class='emp-name']")).click();
            Thread.sleep(1500);
            //Date
            driver.findElement(By.xpath("//input[@type='date']")).sendKeys("24-10-2025");
            Thread.sleep(1500);
            //Notes
            driver.findElement(By.xpath("//textarea[@class='modal-textarea']")).sendKeys("Notes / Instructions");
            //Submit
            driver.findElement(By.xpath("//button[@class='btn assign-btn']")).click();
        } else {
            System.out.println("Task already Reassigned");
            }*/
        Thread.sleep(4000);
        //Close browser
        driver.quit();
    }
}
