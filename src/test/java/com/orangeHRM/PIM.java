package com.orangeHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

        public class PIM{
        	public static void main(String[] args) {	
        	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Eclipse\\chromedriver.exe");
        	
        	//launch the chrome browser
    		WebDriver driver=new ChromeDriver();
    		
    		//navigate to orangehrm url
    		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
    		
    		//locate Username text box field and enter username
    		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    		
    		//locate Password text box field and enter password
    		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    		
            //locate login button and click on the same
    		driver.findElement(By.id("btnLogin")).click();
    		
    		//locate PIM menu and click on on the same
    		driver.findElement(By.id("menu_pim_viewPimModule")).click();
    		
    		//locate add button and click on the same
    		driver.findElement(By.id("btnAdd")).click();
    		
    		//Store values of firstname and lastname in variables
    		String firstname="Cyberr1";
    		String lastname="press";
    		
    		//locate firstname 
    		driver.findElement(By.id("firstName")).sendKeys(firstname);
    		
    		//locate username
    		driver.findElement(By.id("lastName")).sendKeys(lastname);
    		
    		//locate save button and click on the same
    		driver.findElement(By.id("btnSave")).click();
    		
    		//locate PIM menu and click on the same
    		driver.findElement(By.id("menu_pim_viewPimModule")).click();
    		
    		//locate Id textbox and enter ID
    		driver.findElement(By.id("empsearch_id")).sendKeys("1234");
    		
    		//locate Search button and click on the same
    		driver.findElement(By.id("searchBtn")).click();
    		
    		//locate checkbox and click on the same
    		driver.findElement(By.id("ohrmList_chkSelectAll")).click();
    		
    		//locate Delete button and click on the same
    		driver.findElement(By.id("btnDelete")).click();
    		
    		//locate OK(confirm) button and click on the same
    		driver.findElement(By.id("dialogDeleteBtn")).click();		
    		
    		
        	}
        }
