package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods{
	public CreateLead(RemoteWebDriver inWardDriver) {
		this.driver=inWardDriver;
	}
	public CreateLead enterCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		return this;
		
	}
public CreateLead enterFirstName(String firstName) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	return this;
	}
public CreateLead enterLastName(String lastName) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	return this;
}
public ViewLeadPage ClickOnCreateLeadButton() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadPage(driver);
}

}
