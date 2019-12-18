package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	
	//var
	
	public WebDriver driver;
	
	public String url = "http://127.0.0.1/orangehrm-2.6/login.php";
	
	public String un = "admin";
	
	public String pw = "admin123";
	
	public String firstname = "dilip";
	
	public String lastname = "sahu";
	
	public String hrms = "OrangeHRM - New Level of HR Management";
	
	public String empid = "0021";
	
	
	
	//obj
	
	public String txt_loginname = "txtUserName";
	
	public String txt_password = "txtPassword";
	
	public String btn_login = "Submit";
	
	public String link_logout = "Logout";
	
	public String link_frame = "rightMenu";
	
	public String add_btn = "//div[@class='actionbar']//input[1]";
	
	public String first_name = "//input[@id='txtEmpFirstName']";
	
	public String last_name = "//input[@id='txtEmpLastName']";
	
	public String save = "//input[@id='btnEdit']";
	
	public String check_box = "//input[contains(@value,'0012')]";
	
	public String delete = "//div[@class='actionbar']//input[2]";
	
	public String welcome = "//ul[@id='option-menu']/li[1]";
	
	public String link_pimmenu = "PIM";
	
	public String addsub = "//span[contains(text(),'Add Employee')]";
	
	public String link_emplylist = "Employee List";                 ////input[@id='loc_name']
	
	public String select = "//select[@id='loc_code']";
	
	public String search = "//input[@id='loc_name']";
	
	public String search_btn = "//input[@type='button'][@value='Search']";
	
	public String check = "//input[@class='checkbox'][@value='0021']";
	
	public String delete_checkbox = "//div[@class='actionbar']//input[2]";
	
	
	
	
	
	
	
	
	
	
			
			
			
	
	
	

	
	
	
	

	
		
	

}
