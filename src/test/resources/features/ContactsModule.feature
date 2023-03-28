@CENTRIL10-483
Feature: Centrilli contacts functionality and verifications

  Background: For the scenarios in the feature file, user is expected to be on contacts page
    Given user is on the login page
    When user enters email
    And user enters password
    And user clicks log in button
    Then user should be on the home page
    And user clicks Contacts module
    Then user should be on the contacts page

  @CENTRIL10-361
  Scenario: User should be able to create new contact
    When user clicks create button
    And user enters name "Lindsay"
    And user clicks save button
    Then user should create her new contact

    @CENTRIL10-362
  Scenario: User should be able to choose Kanban or List view
    When user clicks List view button
    Then user should see contacts with the List view
    And user clicks Kanban Board button
    Then user should see contacts with the Kanban Board

      @CENTRIL10-481
  Scenario: User should be able to discard without editing anything
    When user clicks create button
    And user clicks discard button
    Then user should be on the contacts page


  #Scenario: User should be able to discard after editing his/her contact
    #When user clicks create button
    #And user enter his/her name
    #And user clicks discard button
    #Then user should see the alert message
    #And user clicks ok button
    #Then user should be on the contacts page

  @CENTRIL10-482
  Scenario: User should be able to edit her contact
    When user clicks create button
    And user enters name
    And user clicks save button
    Then user should create her new contact
    When user clicks edit button
    And user delete her name
    And user change her name
    And user clicks save button
    Then user should change her contact and see the new contact name
