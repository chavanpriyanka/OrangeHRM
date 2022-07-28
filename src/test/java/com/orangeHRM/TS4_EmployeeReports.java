package com.orangeHRM;

import org.openqa.selenium.By;

public class TS4_EmployeeReports extends BaseClass{

	public static void main(String[] args) {
        launchBrowser("chrome");
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList"); 
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_pim_addEmployee")).click();
        driver.findElement(By.id("firstName")).sendKeys("123");
        driver.findElement(By.id("lastName")).sendKeys("444");
        driver.findElement(By.id("btnSave")).click();
        driver.findElement(By.id("menu_time_viewTimeModule")).click();
        
        driver.findElement(By.id("menu_time_Reports")).click();
        
        driver.findElement(By.id("menu_time_displayEmployeeReportCriteria")).click();
        
        driver.findElement(By.id("employee_empName")).click();
        
        driver.findElement(By.id("employee_empName")).sendKeys("123444");
        
        driver.findElement(By.id("only_include_approved_timesheets")).click();
        
        driver.findElement(By.id("viewbutton")).click();
        
	}

}
