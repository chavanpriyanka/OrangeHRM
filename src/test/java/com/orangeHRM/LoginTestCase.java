package com.orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

//child class extends parent class
public class LoginTestCase extends BaseClass{
		
	//main method
	public static void main(String[] args) {
		
		//child class object creation
		//LoginTestCase obj=new LoginTestCase();
		
		//with the help of obj(reference variable) called launchbrowser non static method which is there present in base class
		BaseClass.launchBrowser("chrome");
		
		//navigate to orangehrm url
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		
		WebElement restUserName=null;
		
		try {
			
			//locate Forgot your password with the help of partial link text and click on the same
			driver.findElement(By.partialLinkText("Forgot your")).click();
			
			//locate orangehrmusername textbox 
			restUserName=driver.findElement(By.id("securityAuthentication_userName"));
			
			//enter any random username
			restUserName.sendKeys("test@test.com");
			
			//locate Reset password textbox and click on the same
			driver.findElement(By.id("btnSearchValues")).click();
			
			//click operation not gets performed
			restUserName.click();
			
			//clear operation not gets performed
			restUserName.clear();

	}catch(StaleElementReferenceException | ElementNotVisibleException e) {
		
		//page will get refresh
		driver.navigate().refresh();
		
	}
	}
}
