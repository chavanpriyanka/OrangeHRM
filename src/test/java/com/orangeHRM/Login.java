package com.orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login extends Util{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver","C:\\Program Files\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		//login("Admin","admin123");
		
		driver.findElement(By.id("welcome")).click();
		
		//Util.waitForElementToClick(By.linkText("Logout"));
		
		Util.fluentWait(driver.findElement(By.linkText("Logout")));
		
		driver.findElement(By.linkText("Logout")).click();
	}

}
