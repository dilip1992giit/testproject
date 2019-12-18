package com.hrms.lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utility.Log;

public class General extends Global {

	// all re usable function

	public void openApplication() {

		System.setProperty("webdriver.gecko.driver",
				"E:\\MANUAL TESTING\\automation\\softwares\\geckodriver-v0.26.0-win64\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.navigate().to(url);

		System.out.println("application opend");
		
		Log.info("started exicution");

	}

	public void Wait() {

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}

	public void hrmstittle() {

		if (driver.getTitle().equals(hrms)) {

			System.out.println("tittle is matched");
		} else {

			System.out.println("tittle is not matched " + driver.getTitle());
		}

	}

	public void closeApplication() {

		driver.quit();

		System.out.println("application closed");
		
		Log.info("apllication closed");

	}

	public void login() throws InterruptedException {

		driver.findElement(By.name(txt_loginname)).sendKeys(un);

		driver.findElement(By.name(txt_password)).sendKeys(pw);

		driver.findElement(By.name(btn_login)).click();

		System.out.println("login completed");
		
		Log.info("login completed");

		Thread.sleep(3000);

	}

	public void tittle() {

		System.out.println(driver.getTitle());

	}

	public void welcometext() {

		driver.findElement(By.xpath(welcome)).getText().matches("Welcome Admin");

	}

	public void logout() {

		driver.findElement(By.linkText(link_logout)).click();

		System.out.println("logout completed");
		
		Log.info("logout completed");

	}

	public void pim() {

		Actions ac = new Actions(driver);

		WebElement pimmainmenu = driver.findElement(By.linkText(link_pimmenu));

		ac.moveToElement(pimmainmenu).build().perform();
		
	}

	public void emplylist() {

		driver.findElement(By.linkText("Employee List")).click();

		System.out.println("click on emplylist");
		
		Log.info("click on emplylist");

	}

	public void empid() {

		driver.switchTo().frame(link_frame);

		Select st1 = new Select(driver.findElement(By.xpath(select)));

		st1.selectByVisibleText("Emp. ID");

		System.out.println("emply id");
		
		Log.info("emply id");
		
		driver.switchTo().defaultContent();
		
		

	}

	public void searchfor() {
		
		driver.switchTo().frame(link_frame);
		
		driver.findElement(By.xpath(search)).sendKeys(empid);
		
		driver.switchTo().defaultContent();
		
	

	}

	public void search() {
		
		driver.switchTo().frame(link_frame);

		driver.findElement(By.xpath(search_btn)).click();
		
		driver.switchTo().defaultContent();
	}

	public void checkbox() {
		
		driver.switchTo().frame(link_frame);

		driver.findElement(By.xpath(check)).click();
		
		driver.switchTo().defaultContent();
	}

	public void delete() {
		
		driver.switchTo().frame(link_frame);

		driver.findElement(By.xpath(delete_checkbox)).click();
		
		driver.switchTo().defaultContent();

	}
	
	public void exitframe() {
		
		driver.switchTo().defaultContent();
		
		
		
	}

	public void addemp() {

		Actions ac = new Actions(driver);

		driver.findElement(By.xpath(addsub)).click();

	}

	public void enter() {

		driver.switchTo().frame(link_frame);

		driver.findElement(By.xpath(first_name)).sendKeys(firstname);

		driver.findElement(By.xpath(last_name)).sendKeys(lastname);

		driver.findElement(By.xpath(save)).click();

		driver.switchTo().defaultContent();

	}

	public void addEmp() throws Exception {

		driver.switchTo().frame(link_frame);

		driver.findElement(By.xpath(add_btn)).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath(first_name)).sendKeys(firstname);

		driver.findElement(By.xpath(last_name)).sendKeys(lastname);

		driver.findElement(By.xpath(save)).click();

		Thread.sleep(3000);

		System.out.println("new empl added");
		
		Log.info("new empl added");

		driver.switchTo().defaultContent();

	}

	public void delEmp() throws InterruptedException {

		driver.switchTo().frame(link_frame);

		driver.findElement(By.xpath(check_box)).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath(delete)).click();

		System.out.println("delete is completed");

		driver.switchTo().defaultContent();

	}

}
