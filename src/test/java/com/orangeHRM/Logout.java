package com.orangeHRM;

//import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout extends BaseClass {

	public static void main(String[] args) {
		
		launchBrowser("chrome");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

    BaseClass baseClass = new BaseClass();
	baseClass.login("Admin", "admin123");
	
	driver.findElement(By.id("welcome")).click();
	
	//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	//wait.until(ExpectedConditions.elementToBeClickable(By.linkText("linkText"))).click();
	driver.findElement(By.linkText("Logout")).click();
	
	}
}
