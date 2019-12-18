package com.hrms.TestScripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_102 {

	//public static void main(String[] args) throws Exception {
	
	
	 @Test
	public void TC_102() throws Exception {
		 
		 DOMConfigurator.configure("log4j.xml");

		General obj = new General();

		obj.openApplication();

		obj.Wait();

		obj.tittle();

		obj.login();

		obj.tittle();

		obj.welcometext();

		obj.pim();

		obj.addemp();
		
		obj.enter();

		obj.Wait();

		obj.logout();

		obj.closeApplication();

	}

}
