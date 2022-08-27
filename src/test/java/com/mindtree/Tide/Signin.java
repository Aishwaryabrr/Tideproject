package com.mindtree.Tide;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
public class Signin {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://tide.com/en-us");
	   driver.manage().window().maximize();
	   WebDriverWait wd=new WebDriverWait(driver,30);
		  wd.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"lilo3746-wrapper\"]/div/a"))).click();
		   driver.findElement(By.xpath("//span[@class='login-register']")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@class='event_internal_link']")).click();
		  for(String mychild:driver.getWindowHandles()) {
			   driver.switchTo().window(mychild);   
		   }
		    driver.findElement(By.xpath("//*[@id=\"scroll\"]/div/div/div/div/div[2]/form/div[7]/div/button")).click();
		    for(String mychild1:driver.getWindowHandles()) {
				   driver.switchTo().window(mychild1);   
			   }
	        driver.findElement(By.xpath("//*[@id=\"content\"]/main/div/div[2]/div/div[3]/div[2]/div/form/div[2]")).click();
	        driver.findElement(By.xpath("//*[@id='login-email']")).sendKeys("aishwarya4718@gmail.com");
	        driver.findElement(By.xpath("//*[@id='login-password']")).click();
	 	   driver.findElement(By.xpath("//*[@id='login-password']")).sendKeys("aish@123A");
	      
	   
	   
	   
	}}
