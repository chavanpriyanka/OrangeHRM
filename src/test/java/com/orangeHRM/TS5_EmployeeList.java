package com.orangeHRM;

import org.openqa.selenium.By;

public class TS5_EmployeeList extends BaseClass{

		public static void main(String[] args) {
		  launchBrowser("chrome");
		  
	      driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList"); 
		  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	      driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	      driver.findElement(By.id("btnLogin")).click();
	      driver.findElement(By.id("menu_pim_addEmployee")).click();
	      
	      driver.findElement(By.id("firstName")).sendKeys("Shin");
	      
	      driver.findElement(By.id("lastName")).sendKeys("Chan");
	      
	      driver.findElement(By.id("btnSave")).click();
	      
	      driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
	      
	      driver.findElement(By.id("empsearch_employee_name_empName")).clear();
	      
	      driver.findElement(By.id("empsearch_employee_name_empName")).click();
	      
	      driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Shin Chan");
	      
	      driver.findElement(By.id("searchBtn")).click();
		}
}
