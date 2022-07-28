package com.orangeHRM;

import java.util.Set;

import org.openqa.selenium.By;

public class WindowHandling extends BaseClass {

	public static void main(String[] args) {
		
		launchBrowser("chrome");
	
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		//locate help link and click on the same
		driver.findElement(By.linkText("Help")).click();
		
		//get parent window Id
		String parentTabId=driver.getWindowHandle();
		
		//print parent window id
		System.out.println(parentTabId);
		
		//get all open windows id in set
		Set<String> windowIds=driver.getWindowHandles();
		
		//print the set of all windows id in Set
		System.out.println(windowIds);
		
		//iterate set of window id and switch to child window
		for(String id:windowIds) {
			
			//check if the current id is not equals to parent id
			if(!id.equals(parentTabId)) {
				
				//switch to child window
				driver.switchTo().window(id);
				
				//print the title of child window
				System.out.println(driver.getTitle());
				
				//close child window
				driver.close();
				
				//switch back to parent window
				driver.switchTo().window(parentTabId);
				//driver.switchTo().defaultContent()
			}
		}
			System.out.println(driver.getTitle());	
	}
}
