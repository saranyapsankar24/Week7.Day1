package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	public ViewLeadPage(RemoteWebDriver inWardDriver) {
		this.driver=inWardDriver;
	}
public void verifyLeadID() {
	String LeadID = driver.findElement(By.id("viewLead_companyName_sp")).getText().replaceAll("[^0-9]", "");
	System.out.println(LeadID);
	
}
}
