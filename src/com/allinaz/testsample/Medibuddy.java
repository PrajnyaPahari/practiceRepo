package com.allinaz.testsample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Medibuddy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://www.medibuddy.in/";
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/form[1]/div[5]")).click();
		driver.findElement(By.linkText("Learn More")).click();
		driver.findElement(By.linkText("skip")).click();
		driver.findElement(By.linkText("Login using Username & Password")).click();
		driver.findElement(By.id("username")).sendKeys("john");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.id("password")).sendKeys("john1234");
		//driver.findElement(By.xpath("//img[@alt='show-password']")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
	}

}
