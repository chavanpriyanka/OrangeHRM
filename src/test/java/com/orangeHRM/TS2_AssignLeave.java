package com.orangeHRM;

import org.openqa.selenium.By;

public class TS2_AssignLeave extends BaseClass{

		public static void main(String[] args) {
			
			launchBrowser("chrome");
			
	         driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList");
			 
			 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	         
	         driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	         
	         driver.findElement(By.id("btnLogin")).click();
	         
	         driver.findElement(By.id("menu_pim_addEmployee")).click();
	         
	         driver.findElement(By.id("firstName")).sendKeys("Genelia");
	         
	         driver.findElement(By.id("lastName")).sendKeys("Dsouza");
	         
	         driver.findElement(By.id("btnSave")).click();
	         
	         driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
	         
	         driver.findElement(By.id("menu_leave_assignLeave")).click();
	         
	         driver.findElement(By.id("assignleave_txtEmployee_empName")).sendKeys("Genelia Dsouza");
	         
	         driver.findElement(By.xpath("//option[@value=\"9\"]")).click();
	         
	         driver.findElement(By.id("assignleave_txtFromDate")).clear();
	         
	         driver.findElement(By.id("assignleave_txtFromDate")).sendKeys("2022-07-15");
	         
	         driver.findElement(By.id("assignleave_txtFromDate")).clear();
	         
	         driver.findElement(By.id("assignleave_txtToDate")).sendKeys("2022-07-15");
	         
	         driver.findElement(By.id("assignBtn")).click();
	         
	         driver.findElement(By.id("confirmOkButton")).click();
	         
		}
}
