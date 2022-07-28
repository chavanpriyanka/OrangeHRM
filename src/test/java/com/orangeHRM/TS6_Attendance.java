package com.orangeHRM;

import org.openqa.selenium.By;

public class TS6_Attendance extends BaseClass {

		public static void main(String[] args) {
			  launchBrowser("chrome");
			  
		      driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList"); 
			  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		      driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		      driver.findElement(By.id("btnLogin")).click();
		      driver.findElement(By.id("menu_pim_addEmployee")).click();
		      driver.findElement(By.id("firstName")).sendKeys("Priyanka");
		      driver.findElement(By.id("lastName")).sendKeys("Chavan");
		      driver.findElement(By.id("btnSave")).click();
		      driver.findElement(By.id("menu_pim_viewTimeModule")).click();
		      driver.findElement(By.id("menu_attendance_Attendance")).click();
		      driver.findElement(By.id("menu_attendance_viewAttendanceRecord")).click();
		      driver.findElement(By.id("attendance_employeeName_empName")).clear();
		      driver.findElement(By.id("attendance_employeeName_empName")).sendKeys("Priyanka Chavan");
		      driver.findElement(By.id("attendance_date")).clear();
		      driver.findElement(By.id("attendance_date")).sendKeys("2020-08-18");
		      driver.findElement(By.id("btView")).click();
		      
		
		
		
		}

}
