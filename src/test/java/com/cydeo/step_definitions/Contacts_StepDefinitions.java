package com.cydeo.step_definitions;

import com.cydeo.pages.ContactsPage;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Contacts_StepDefinitions {

    ContactsPage contactsPage=new ContactsPage();

    @When("user clicks create button")
    public void user_clicks_create_button() throws InterruptedException {
        Thread.sleep(5000);
        contactsPage.createButton.click();
    }

    @When("user enters name {string}")
    public void user_enters_name(String string) {
        contactsPage.name.sendKeys("Lindsay");
    }

    @When("user clicks save button")
    public void user_clicks_save_button()  {
        contactsPage.saveButton.click();

    }

    @Then("user should create his\\/her new contact")
    public void user_should_create_his_her_new_contact() {
        Assert.assertTrue(contactsPage.contactName.isDisplayed());
    }


    @When("user clicks List view button")
    public void user_clicks_list_view_button() {
        contactsPage.listViewButton.click();
    }

    @Then("user should see contacts with the List view")
    public void user_should_see_contacts_with_the_list_view() {
        Assert.assertTrue(contactsPage.listView.isDisplayed());
    }

    @And("user clicks Kanban Board button")
    public void user_clicks_kanban_board_button() throws InterruptedException {
        Thread.sleep(5000);
        contactsPage.kanbanBoardButton.click();
    }

    @Then("user should see contacts with the Kanban Board")
    public void user_should_see_contacts_with_the_kanban_board() {
        Assert.assertTrue(contactsPage.kanbanBoard.isDisplayed());
    }

    @When("user clicks discard button")
    public void user_clicks_discard_button() throws InterruptedException {
        Thread.sleep(5000);
        contactsPage.discardButton.click();
    }


    Faker faker=new Faker();
    @And("user enter his\\/her name")
    public void user_enter_his_her_name() {
        contactsPage.name.sendKeys(faker.name().name());
    }

    @Then("user should see the alert message")
    public void userShouldSeeTheAlertMessage() {
        Assert.assertTrue(contactsPage.alertMessage.isDisplayed());
    }

    @Then("user clicks ok button")
    public void user_clicks_ok_button() throws InterruptedException {
        Thread.sleep(5000);
        contactsPage.okButton.click();
        Thread.sleep(5000);
    }


    @Then("user enters name")
    public void user_enters_name() {
        contactsPage.namebox.sendKeys("Lindsay05");
    }
    @Then("user should create her new contact")
    public void user_should_create_her_new_contact() {
        Assert.assertTrue(contactsPage.contactName.isDisplayed());
    }
    @When("user clicks edit button")
    public void user_clicks_edit_button() {
        contactsPage.editButton.click();
    }
    @When("user change her name")
    public void user_change_her_name() throws InterruptedException {
        Thread.sleep(5000);
        contactsPage.namebox.sendKeys("Lindsay06");
        Thread.sleep(10000);
    }
    @Then("user should change her contact and see the new contact name")
    public void user_should_change_her_contact_and_see_the_new_contact_name() {
        String expectedResult="Lindsay06";
        String actualResult=contactsPage.contactName.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @And("user delete her name")
    public void userDeleteHerName() {
        contactsPage.namebox.clear();
    }


}
