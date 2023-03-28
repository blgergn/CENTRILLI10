package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
    public ContactsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@data-menu='68']")
    public WebElement contactsModule;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createButton;

    @FindBy(xpath ="(//input[contains(@id,'o_field_input_')])[2]")
    public WebElement name;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "(//li[@class='active'])[2]")
    public WebElement contactName;

    @FindBy(xpath = "//button[@aria-label='list']")
    public WebElement listViewButton;

    @FindBy(xpath = "//button[@aria-label='kanban']")
    public WebElement kanbanBoardButton;

    @FindBy(xpath = "//div[@class='o_kanban_view o_res_partner_kanban o_kanban_ungrouped']")
    public WebElement kanbanBoard;

    @FindBy(xpath = "//div[@class='o_content']")
    public WebElement listView;


    @FindBy(xpath = "//button[@accesskey='j']")
    public WebElement discardButton;


    @FindBy(xpath ="//div[@class='modal-body']")
    public WebElement alertMessage;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement okButton;

    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement editButton;


    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement namebox;






}
