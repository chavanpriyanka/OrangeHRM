package com.orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

//Parent class created
public class BaseClass {

	 protected static WebDriver driver;
	 //globally variable declared(WebDriver --class name)
	 
	public void login(String username,String password) 
	{
//locate username text-box field
driver.findElement(By.id("txtUsername")).sendKeys(username);

//locate password text-box field
driver.findElement(By.id("txtPassword")).sendKeys(password);

//locate login button and click on the same
driver.findElement(By.id("btnLogin")).click();
	
	}
	
	//launch browser non static method created ---browser name store
	public static void launchBrowser(String browserName) {
		
		//pass browsername parameter in switch
		switch(browserName){
		
		//case for chrome browser
	case "chrome":
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	break;
	
	//case for firefox browser
	case "mozilla":
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	break;
	
	//case for edge browser
	case "edge":
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	break;
	
		//case for default browser
		default:
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
	
		}
	}
}
	
