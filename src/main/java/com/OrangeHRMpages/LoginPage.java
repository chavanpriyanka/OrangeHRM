package com.OrangeHRMpages;

import org.openqa.selenium.By;

import com.orangeHRM.BaseClass;

public class LoginPage extends BaseClass {

	
	public void login(String userName,String passWord) {
		//locate username textbox field

		driver.findElement(By.id("txtUsername")).sendKeys(userName);

		driver.findElement(By.id("txtPassword")).sendKeys(passWord);

		driver.findElement(By.id("btnLogin")).click();
	}
	
//public void logout() {

}