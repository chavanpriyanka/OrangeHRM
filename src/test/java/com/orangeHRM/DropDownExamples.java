package com.orangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownExamples extends BaseClass{

	public static void main(String[] args) throws Exception{
		//launch the browser 
		launchBrowser("chrome");
		
		//launch url
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		LoginTestCase loginTestCase = new LoginTestCase();
		//Enter login details
		loginTestCase.login("Admin", "admin123");
		
		//Locate PIM module and click on the same
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		//locate empl status dropdown
		WebElement empStatusDropDown=driver.findElement(By.id("empsearch_employee_status"));
		
		//create instance of select class and pass the reference of dropdown to the constructor
		Select select=new Select(empStatusDropDown);
		
		//select the dropdown value by index 
		select.selectByIndex(1);
		
		//select the dropdown value by text
		select.selectByVisibleText("Full-Time Contract");
		
		//select the dropdown value by value attribute value
		select.selectByValue("4");
		
		//select.deselectAll();
		
		//select.deselectByIndex(1);
		
		//select.deselectByValue(null);
		
		//select.deselectByVisible(null);
		
		List<WebElement> allSelectedOptions=select.getAllSelectedOptions();
		for(WebElement element:allSelectedOptions) {
			System.out.println(element.getText());
			
		}
		 
		List<WebElement> allDropDownValues=select.getOptions();
		for(WebElement element:allDropDownValues) {
			System.out.println(element.getText());
			
			if(element.getText().equals("Freelance")) {
				throw new Exception("Freelance value is present in the Employee Status Dropdown");
				}
		         }		
	              }		
	               }
