package com.hrms.TestScripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_101 {

	//public static void main(String[] args) throws InterruptedException {
	
	
	@Test
	public void TC101() throws Exception {
		
		DOMConfigurator.configure("log4j.xml");

		General obj = new General();

		obj.openApplication();

		obj.Wait();
		
		obj.hrmstittle();

		obj.login();
		
		obj.tittle();
		
		obj.welcometext();

		obj.logout();

		obj.closeApplication();

	}

}
