package com.allinaz.testsample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://www.salesforce.com/in/form/signup/freetrial-sales/";
		WebDriver driver= null;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.findElement(By.name("UserFirstName")).sendKeys("john");
		driver.findElement(By.name("UserLastName")).sendKeys("wick");
		driver.findElement(By.name("UserEmail")).sendKeys("jw@demo.in");
		Select selectjobTitle = new Select(driver.findElement(By.name("UserTitle")));
		selectjobTitle.selectByVisibleText("IT Manager");
		driver.findElement(By.name("CompanyName")).sendKeys("sampleCompany");
		Select selectEmp = new Select(driver.findElement(By.name("CompanyEmployees")));
		selectEmp.selectByVisibleText("1 - 25 employees");
		driver.findElement(By.name("UserPhone")).sendKeys("546661516");
		driver.findElement(By.cssSelector("body.cxt-has-fixed-nav:nth-child(2) div.container-fluid.content-container:nth-child(15) div.columnContainer.parbase.section:nth-child(1) div.columns-wrapper.bg-center-center.bg-cover.column-container-component div.container div.row.columns-wrapper:nth-child(1) div.col.text-left.col-xs-12.col-sm-6.col-md-6.col-lg-4-ten:nth-child(2) div.columnContainer.parbase.section div.columns-wrapper.container-fluid.margin-30-top-lg.margin-0-top-xs.margin-40-bottom-lg.column-container-component div.row.columns-wrapper:nth-child(2) div.col.text-left.col-xs-12.col-sm-12.col-md-12.col-lg-12 div.formContainerV2.parbase.section div.form-container-v2.sfdc-form-day.sfdc-form-closed.sfdc-form-small.bg-default form.form-builder-form.sfdc-form-adaptive-label div.msaCheckbox.checkboxInput.section:nth-child(18) div:nth-child(1) div.field > div.checkbox-ui")).click();
		Select selectCountry = new Select(driver.findElement(By.name("CompanyCountry")));
		selectCountry.selectByValue("DE");
		
		
		

	}

}
