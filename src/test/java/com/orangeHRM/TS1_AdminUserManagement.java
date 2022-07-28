package com.orangeHRM;

import org.openqa.selenium.By;

public class TS1_AdminUserManagement extends BaseClass {

	public static void main(String[] args) {
		launchBrowser("chrome");
		
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList");
    	 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
         driver.findElement(By.id("txtPassword")).sendKeys("admin123");
         driver.findElement(By.id("btnLogin")).click();
         driver.findElement(By.id("menu_pim_addEmployee")).click();
         driver.findElement(By.id("firstName")).sendKeys("Pratik");
         driver.findElement(By.id("lastName")).sendKeys("Solapure");
         driver.findElement(By.id("btnSave")).click();
         driver.findElement(By.id("menu_admin_viewAdminModule")).click();
         driver.findElement(By.id("searchSystemUser_userName")).sendKeys("PS@78");
         
         driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Priyanka Chavan");

         driver.findElement(By.id("searchBtn")).click();
         
         driver.findElement(By.id("ohrmList_chkSelectRecord_49")).click();
         
         driver.findElement(By.id("btnDelete")).click();
         
         driver.findElement(By.id("dialogDeleteBtn")).click();
         }

}
