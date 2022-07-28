package com.orangeHRM;

import java.util.Map;

import com.OrangeHRMpages.EmpListPage;
import com.OrangeHRMpages.LoginPage;

public class AddEmpTestCase extends BaseClass {

	public static void main(String[] args) throws Exception{
		launchBrowser("chrome");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		LoginPage loginPage=new LoginPage();
		EmpListPage empListPage=new EmpListPage();
		loginPage.login("Admin","admin123");
		Map<String,Object>empDetails=empListPage.addEmp("cyber","","succes",false,null,null);
		empListPage.searchEmp(empDetails);
		//Map<String,Object>updateEmp=empListPage.addEmp("","tech","",false,null,null);
		//empListPage.updateEmp(empDetails, null, null);
		
		
	}

}
