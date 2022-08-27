package com.mindtree.Tide;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class add {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://tide.com/en-us");
		   driver.manage().window().maximize();
		   WebDriverWait wd=new WebDriverWait(driver,30);
		  wd.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"lilo3746-wrapper\"]/div/a"))).click();
          driver.findElement(By.xpath("//*[@id=\"carousel__1hGWzfOCYOPdzihtXedEWa\"]/div[1]/div/ul[1]/li[3]/div/div[2]/div/div/div/div/div/a")).click();
	}

}
