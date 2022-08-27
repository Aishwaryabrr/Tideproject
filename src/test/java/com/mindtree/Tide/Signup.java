package com.mindtree.Tide;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;


public class Signup {

	public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://tide.com/en-us");
	   driver.manage().window().maximize();
	   Thread.sleep(2000);
	   WebDriverWait wd=new WebDriverWait(driver,30);
	  wd.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"lilo3746-wrapper\"]/div/a"))).click();
	   driver.findElement(By.xpath("//span[@class='login-register']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@class='event_internal_link']")).click();
	   for(String mychild:driver.getWindowHandles()) {
		   driver.switchTo().window(mychild);
	   }
	   driver.findElement(By.cssSelector("#name")).click();
	   driver.findElement(By.cssSelector("#name")).sendKeys("Aishwarya");
	   driver.findElement(By.xpath("//*[@id='email']")).click();
	   driver.findElement(By.xpath("//*[@id='email']")).sendKeys("aishwarya4718@gmail.com");
	   driver.findElement(By.xpath("//*[@id='password']")).click();
	   driver.findElement(By.xpath("//*[@id='password']")).sendKeys("aish@123A");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@value='CREATE ACCOUNT']")).click();
	   
	   

	}

}
