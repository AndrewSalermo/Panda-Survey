package com.example;

//import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.PageLoadStrategy;

//import java.time.Duration;

public class Main 
{
    public static void main(String[] args) 
    {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1200");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        WebDriver driver = new ChromeDriver(options);
        
        
        driver.get("https://www.pandaguestexperience.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"CN1\"]")).sendKeys("1623");
        driver.findElement(By.xpath("//*[@id=\"CN2\"]")).sendKeys("6538");
        driver.findElement(By.xpath("//*[@id=\"CN3\"]")).sendKeys("2787");
        driver.findElement(By.xpath("//*[@id=\"CN4\"]")).sendKeys("0338");
        driver.findElement(By.xpath("//*[@id=\"CN5\"]")).sendKeys("0412");
        driver.findElement(By.xpath("//*[@id=\"CN6\"]")).sendKeys("05");

        
        
        driver.findElement(By.id("NextButton")).click();

        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        List<WebElement> NButton = driver.findElements(By.id("NextButton")); 
        
        while (NButton.size() != 0) {
             //driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
            List<WebElement> optionB = driver.findElements(By.className("radioSimpleInput"));
            
            List<WebElement> email = driver.findElements(By.id("S000057"));

            if (email.size() != 0) {
                email.get(0).sendKeys("andrewesalermo@yahoo.com");

                WebElement email2 = driver.findElement(By.id("S000064"));
                email2.sendKeys("andrewesalermo@yahoo.com");

                driver.close();


            }

            for (int i = 0; i < optionB.size(); i++) {
                optionB.get(i).click();
                i+=4;
                if (optionB.size() == 2) {
                    optionB.get(1).click();
                }
                
            }
        
            NButton = driver.findElements(By.id("NextButton"));
            NButton.get(0).click();
        }



        
    }
}