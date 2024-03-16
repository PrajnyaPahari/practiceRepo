package com.allinaz.testsample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nasscom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://nasscom.in/";
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//li[normalize-space()='register']")).click();
		driver.findElement(By.id("edit-field-fname-reg-0-value")).sendKeys("admin");
		driver.findElement(By.id("edit-field-lname-0-value")).sendKeys("admin");
		driver.findElement(By.id("edit-mail")).sendKeys("sample@smail.com");
		driver.findElement(By.id("edit-field-company-name-registration-0-value")).sendKeys("sampleOrg");
		Select profileSelect = new Select(driver.findElement(By.id("edit-field-business-focus-reg")));
		profileSelect.selectByVisibleText("IT Consulting");
		driver.findElement(By.xpath("//input[@id='edit-submit--2']")).click();
		String errTextString = driver.findElement(By.xpath("//div[@aria-label='Error message']")).getText();
		System.out.println(errTextString);
		
		

	}

}
