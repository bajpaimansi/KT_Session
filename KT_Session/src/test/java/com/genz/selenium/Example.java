package com.genz.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example
{
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\MANSI BAJPAI\\eclipse-workspace\\KT_Session\\src\\test\\resources\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/frames");
	Thread.sleep(3000);
	WebElement iframeMsg1 = driver.findElement(By.xpath("//iframe[contains(@id, 'frame1')]"));        
	driver.switchTo().frame(iframeMsg1);

	WebElement body = driver.findElement(By.cssSelector("body"));
	System.out.println(body.getText());
	System.out.println("https://demoqa.com/frames");
	
}
}
//iframe[@id='frame1']
//iframe[@id='frame2']