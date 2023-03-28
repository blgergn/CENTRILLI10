package com.cydeo.step_definitions;

import com.cydeo.pages.ContactsPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    LoginPage loginPage=new LoginPage();

    ContactsPage contactsPage=new ContactsPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://qa.centrilli.com/");
    }

    @When("user enters email")
    public void user_enters_email() {
        loginPage.email.sendKeys("posmanager10@info.com");
    }

    @When("user enters password")
    public void user_enters_password() {
        loginPage.password.sendKeys("posmanager");
    }

    @When("user clicks log in button")
    public void user_clicks_log_in_button() {
        loginPage.clickButton.click();
    }

    @Then("user should be on the home page")
    public void user_should_be_on_the_home_page() throws InterruptedException {
        Thread.sleep(5000);
        BrowserUtils.verifyURLContains("inbox");
    }

    @Then("user clicks Contacts module")
    public void user_clicks_contacts_module() throws InterruptedException {
        Thread.sleep(10000);
        contactsPage.contactsModule.click();
        Thread.sleep(5000);

    }

    @Then("user should be on the contacts page")
    public void user_should_be_on_the_contacts_page() throws InterruptedException {
        Thread.sleep(5000);
        String expectedTitle="Contacts - Odoo";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
