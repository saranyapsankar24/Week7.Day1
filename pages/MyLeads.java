package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class MyLeads extends ProjectSpecificMethods{
	public MyLeads(RemoteWebDriver inWardDriver) {
		this.driver=inWardDriver;
	}
public CreateLead clickOnCreateLeadLink() {
	driver.findElement(By.linkText("Create Lead")).click();
	return new CreateLead(driver);
}
}
