package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.e2etests.automation.page_objects.AuthentificationPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AuthentificationStepDefinition {

	private AuthentificationPage authentificationPage;
	

	public AuthentificationStepDefinition() {
		this.authentificationPage = new AuthentificationPage();
	}

	@Given("je me connecte sur l application Mercury")
	public void jeMeConnecteSurLApplicationMercury() {
		authentificationPage.goToUrl();

	}

	@When("je saisie le username {string}")
	public void jeSaisieLeUsername(String name) {
		authentificationPage.fillUserName(name);

	}

	@When("je saisie le password {string}")
	public void jeSaisieLePassword(String password) {
		authentificationPage.fillPassword(password);

	}

	@When("je clique sur le bouton submit")
	public void jeCliqueSurLeBoutonSubmit() {
		authentificationPage.clicOnButtonSubmit();

	}

	@Then("je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {
		String message = AuthentificationPage.welcomMessage.getText();
		Assert.assertEquals(text, message);
	   
	}




}
