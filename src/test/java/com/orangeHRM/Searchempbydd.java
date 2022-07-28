package com.orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Searchempbydd extends BaseClass {
	
	public static void main(String[] args) {
	
			//launch the browser 
			launchBrowser("chrome");
			
			//maximize window
			driver.manage().window().maximize();
			
			//launch url
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			
			LoginTestCase loginTestCase = new LoginTestCase();
			//Enter login details
			loginTestCase.login("Admin", "admin123");
			
			//Locate PIM module and click on the same
			driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
			//locate add button and click on the same
			driver.findElement(By.id("btnAdd")).click();
			
			//Store values of firstname and lastname in variables
    		String firstname="Cristanio";
    		String lastname="Ronaldo";
    		
    		//locate firstname 
    		driver.findElement(By.id("firstName")).sendKeys(firstname);
    		
    		//locate username
    		driver.findElement(By.id("lastName")).sendKeys(lastname);
    		
    		//locate save button and click on the same
    		driver.findElement(By.id("btnSave")).click();
    		
    		//locate edit button and click on the same
    		driver.findElement(By.id("btnSave")).click();
    		
    		//locate job and click on the same
    		driver.findElement(By.linkText("Job")).click();
    		
    		driver.findElement(By.id("btnSave")).click();
    				
    		//locate job title dropdown
    		driver.findElement(By.id("job_sub_unit"));
    	
    		//create instance
    		WebElement subUnit=driver.findElement(By.id("job_sub_unit"));
    			
    		//create instance of select class and pass the reference of dropdown to the constructor
    		Select select=new Select(subUnit);
    		
    		//select the dropdown value by value index value
    		select.selectByValue("4");
    		
    		driver.findElement(By.id("btnSave")).click();
    
    		//Locate PIM module and click on the same
			driver.findElement(By.id("menu_pim_viewPimModule")).click();
    		
			//-------------search by sub unit---------------------
			
    		//locate empl status dropdown
    		driver.findElement(By.id("job_sub_unit"));
    		
    		//create instance
    		WebElement empStatusDropDown=driver.findElement(By.id("job_sub_unit"));
    			
    		//create instance of select class and pass the reference of dropdown to the constructor
    		Select select1=new Select(empStatusDropDown);
    		
    		//select the dropdown value by index 
    		select1.selectByIndex(4);
    		
    		//select the dropdown value by text
    		//select.selectByVisibleText("Development");
    		
    		//select the dropdown value by value attribute value
    		//select.selectByValue("3");
    		
    		//locate Search button and click on the same
    		driver.findElement(By.id("searchBtn")).click();
    			
    	  //---------------------search by job title-------------------------
    		
    		//locate job title dropdown
    		/*driver.findElement(By.id("empsearch_job_title"));
    		
    		//create instance
    		WebElement empJobDropdown=driver.findElement(By.id("empsearch_job_title"));
    		
    		//create instance of select class and pass the reference of dropdown to the constructor
    		Select select1=new Select(empJobDropdown);
    		
    		//select the dropdown value by index 
    		select1.selectByIndex(1);
    		
    		//locate Search button and click on the same
    		driver.findElement(By.id("searchBtn")).click();*/
    		
    		
    		//-------------------search by include--------------------------------
    		//locate include dropdown
    		/*driver.findElement(By.id("empsearch_termination"));
    		
    		//create instance
    		WebElement includeDropdown=driver.findElement(By.id("empsearch_termination"));
    		
    		//create instance of select class and pass the reference of dropdown to the constructor
    		Select select11=new Select(includeDropdown);
    		
    		//select the dropdown value by index 
    		select11.selectByIndex(0);
    		
    		//locate Search button and click on the same
    		driver.findElement(By.id("searchBtn")).click();*/			
	}
		
	}

