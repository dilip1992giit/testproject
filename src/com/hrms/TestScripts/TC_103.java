package com.hrms.TestScripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_103 {

	//public static void main(String[] args) throws Exception {
	
	
	
	@Test
	public void TC_103() throws Exception {
		
		DOMConfigurator.configure("log4j.xml");

		General obj = new General();

		obj.openApplication();

		obj.Wait();

		obj.tittle();

		obj.login();

		obj.pim();

		obj.emplylist();

		obj.empid();

		obj.searchfor();

		obj.search();

		obj.checkbox();

		obj.delete();

		obj.logout();

		obj.closeApplication();

	}

}
