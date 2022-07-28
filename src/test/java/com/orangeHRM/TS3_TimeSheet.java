package com.orangeHRM;

import org.openqa.selenium.By;

public class TS3_TimeSheet extends BaseClass{

		public static void main(String[] args) {
			launchBrowser("chrome");
	        driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList");
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	        driver.findElement(By.id("btnLogin")).click();
	        driver.findElement(By.id("menu_pim_addEmployee")).click();
	        driver.findElement(By.id("firstName")).sendKeys("Cyber");
	        driver.findElement(By.id("lastName")).sendKeys("Success");
	        
	        driver.findElement(By.id("btnSave")).click();
	        
	        driver.findElement(By.id("menu_time_viewTimeModule")).click();
	        
	        driver.findElement(By.id("menu_time_Timesheets")).click();
	        
	        driver.findElement(By.id("employee")).click();
	        
	        driver.findElement(By.id("employee")).sendKeys("Cyber Success");
	        
	        driver.findElement(By.id("btnView")).click();
	                   
		}
}
