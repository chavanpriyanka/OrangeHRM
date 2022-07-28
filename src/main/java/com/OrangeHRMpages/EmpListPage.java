package com.OrangeHRMpages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.orangeHRM.BaseClass;
import com.orangeHRM.Util;

public class EmpListPage extends BaseClass {

	private CharSequence username;
	private CharSequence middleName;
	public Map<String,Object> addEmp(String fName, String mName, String lName, boolean isUser, String uName, String pwd){
		Map<String,Object> empDetails=new HashMap<>();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("firstName")).sendKeys(fName);
		driver.findElement(By.id("middleName")).sendKeys(mName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
		String empId=driver.findElement(By.id("employeeId")).getAttribute("value");
		empDetails.put("empId", empId);
		empDetails.put("firstName",fName);
		empDetails.put("middleName",mName);
		empDetails.put("lastName",lName);
		if(isUser) {
			driver.findElement(By.id("chkLogin")).click();
			driver.findElement(By.id("user_name")).sendKeys(uName);
			driver.findElement(By.id("uswr_password")).sendKeys(pwd);
			driver.findElement(By.id("re_password")).sendKeys(pwd);
		}
		driver.findElement(By.id("btnSave")).click();
		return empDetails;
	}
	
	public void searchEmp(Map<String,Object> empDetails) throws Exception{
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(empDetails.get("empId").toString());
		driver.findElement(By.id("searchBtn")).click();
		WebElement searchResult=driver.findElement(By.xpath("//tr[@class='odd']/td[2]/a"));
		Util.waitForElementToVisisble(searchResult);
		Util.validate(searchResult.getText(),empDetails.get("empId").toString());
		//Util.validate(emp, empDeatils.get("firstName'));	
	}
	/*	public void updateEmp(Map<String, Object> empDetails,String mn, String un) throws Exception{
    driver.findElement(By.id("menu_pim_viewEmployeeList")).click();	
	driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys(un);
	driver.findElement(By.id("searchBtn")).click();
    driver.findElement(By.id("ohrmList_chkSelectAll")).click();
    driver.findElement(By.id("btnSave")).click();
    driver.findElement(By.id("middleName")).sendKeys(mn);
	driver.findElement(By.id("btnSave")).click();	
		}
*/
	
		}
		
	
