package com.e2etests.automation.page_objects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2etests.automation.utils.ConfigFileReader;

public class RegisterPage {
	
	
	/*@FindBy*/
	@FindBy(how = How.NAME, using = "firstName")
	public static WebElement firstname;	
	
	@FindBy(how = How.NAME, using = "lastName")
	public static WebElement lastname;	
	
	@FindBy(how = How.NAME, using = "phone")
	public static WebElement phonee;	
	
	@FindBy(how = How.ID, using = "userName")
	public static WebElement username ;
	
	@FindBy(how = How.NAME, using = "address1")
	public static WebElement address;	
	
	@FindBy(how = How.NAME, using = "city")
	public static WebElement City;	
	
	@FindBy(how = How.NAME, using = "state")
	public static WebElement State;	
	
	@FindBy(how = How.NAME, using = "postalCode")
	public static WebElement postalcode1 ;
	
	@FindBy(how = How.NAME, using = "country")
	public static WebElement countryy;	
	
	@FindBy(how = How.ID, using = "email")
	public static WebElement emaill;	
	
	@FindBy(how = How.NAME, using = "password")
	public static WebElement passwordd;	
	
	@FindBy(how = How.NAME, using = "confirmPassword")
	public static WebElement confirmPasswordd ;
	
	@FindBy(how = How.NAME, using = "submit")
	public static WebElement submitbouton ;
	
	@FindBy(how = How.TAG_NAME, using = "br")
	public static WebElement  dashboard;	

}
