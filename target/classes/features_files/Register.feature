
Feature: Register Formular
  En tant que utilisateur je souhaite rensiegner le formulaire de l application Mercury

  @Register
  Scenario: renseigner le formulaire
    Given Je clique sur le bouton REGISTER
    When je renseigne le First Name "BARACHE"
    And Je renseigne le Last Name "Amar" 
    And Je renseigne le Phone "0693234598"
    And je renseigne le Email "amar95.barache@gmail.com"
    And je renseigne l Address "9 Rue De Paris"
    And je renseigne City "Bezons"
    And je rensigne State/Province "Ile De France"
    And je rensigne Postal Code "95870"
    And je rensigne Country "FRANCE"
    And je renseigne l User Name "test"
    And je rensigne le Password "test"
    And je renseigne le Confirm Password "test"
    Then je clique sur le bouton Envoyer 
    And je me redirige vers la homepage "Dear BARACHE Amar,"

     
