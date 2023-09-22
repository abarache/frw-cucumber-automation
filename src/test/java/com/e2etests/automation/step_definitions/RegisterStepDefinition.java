package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.RegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {
	
private RegisterPage registerPage;
	
	public RegisterStepDefinition() {
		this.registerPage = new RegisterPage();
	}
	

	@Given("Je clique sur le bouton REGISTER")
	public void jeCliqueSurLeBoutonREGISTER() {
	   
	    
	}
	@When("je renseigne le First Name {string}")
	public void jeRenseigneLeFirstName(String string) {
	    
	 
	}
	@When("Je renseigne le Last Name {string}")
	public void jeRenseigneLeLastName(String string) {
	    
	    
	}
	@When("Je renseigne le Phone {string}")
	public void jeRenseigneLePhone(String string) {
	    
	    
	}
	@When("je renseigne le Email {string}")
	public void jeRenseigneLeEmail(String string) {
	    
		
	}
	@When("je renseigne l Address {string}")
	public void jeRenseigneLAddress(String string) {
	  
		
	}
	@When("je renseigne City {string}")
	public void jeRenseigneCity(String string) {
	   
	}
	@When("je rensigne State\\/Province {string}")
	public void jeRensigneStateProvince(String string) {
	    
	}
	@When("je rensigne Postal Code {string}")
	public void jeRensignePostalCode(String string) {
	    
	}
	@When("je rensigne Country {string}")
	public void jeRensigneCountry(String string) {
	  
	}
	@When("je renseigne l User Name {string}")
	public void jeRenseigneLUserName(String string) {
	  
	}
	@When("je rensigne le Password {string}")
	public void jeRensigneLePassword(String string) {
	  
	}
	@When("je renseigne le Confirm Password {string}")
	public void jeRenseigneLeConfirmPassword(String string) {
	   
	}
	@Then("je clique sur le bouton Envoyer")
	public void jeCliqueSurLeBoutonEnvoyer() {
	    
	}
	@Then("je me redirige vers la homepage {string}")
	public void jeMeRedirigeVersLaHomepage(String string) {
	  
	}



	
	
	
	
	
	
	
	
	
	

}
