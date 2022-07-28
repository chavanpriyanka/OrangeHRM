package com.orangeHRM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class AmazonAssignment extends BaseClass {

	public static void main(String[] args) throws AWTException {
		
		launchBrowser("chrome");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		Actions act =new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//a[text()=\"Best Sellers\"]"))).build().perform();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
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
					
	                driver.quit();
	                
}
}

