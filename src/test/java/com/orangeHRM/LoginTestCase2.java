package com.orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase2{
	
	static WebDriver driver;

	public static void login(String username,String password) 
	{
//locate username text-box field
driver.findElement(By.id("txtUsername")).sendKeys(username);

//locate password text-box field
driver.findElement(By.id("txtPassword")).sendKeys(password);

//locate login button and click on the same
driver.findElement(By.id("btnLogin")).click();
	
	}

	public static void main(String[] args) throws InterruptedException{
		 
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Eclipse\\chromedriver.exe");
	
	//launch the chrome browser
	driver=new ChromeDriver();
	
	//navigate to generate url
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	
	//invalid UN valid PD
	login("priyanka","admin123");
	
	
	//valid UN invalid PD
	login("Admin","admin1234");

	
	//valid UN blank PD
	login("Admin","");
	
	
	//blank UN valid PD
	login("","admin123");
	
	
	//invalid UN invalid PD
	login("abcad","456admin");
	
	//valid US valid PD
	login("Admin","admin123");
	
	
	}
}
	
	