package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FormSteps extends BaseSteps{

    public FormSteps() throws Exception {
    }
    @Given("^I am navigated to the form$")
    public void navigateToForm() throws Exception {
        getFormPage().launchApp();
        Assert.assertEquals(true,getFormPage().ifNavigatedToForm());
    }

    @When("^I provide a contact name (.*?)$")
    public void iProvideAContactName(String name) throws Exception {
        getFormPage().enterContactName(name);
    }

    @When("^I provide address 1 (.*?)$")
    public void iProvideAddress1(String address) throws Exception {
        getFormPage().enterAddressLine1(address);
    }

    @When("^I provide a country (.*?)$")
    public void iProvideACountry(String country) throws Exception {
        getFormPage().enterCountry(country);
    }

    @When("^I provide a phone number (.*?)$")
    public void iProvideAPhoneNumber(String phone) throws Exception {
        getFormPage().enterPhoneNumber(phone);
    }

    @When("^I provide an email address (.*?)$")
    public void iProvideAnEmailAddress(String email) throws Exception {
        getFormPage().enterEmailAddress(email);
    }

    @Then("^I should not see the word invalid in the contact name field$")
    public void iShouldNotSeeTheWordInvalidInTheContactNameField() throws Exception {
        Assert.assertEquals(true, getFormPage().isContactInvalidDisplayed());
    }

    @When("^I provide address line one (.*?)$")
    public void iProvideAddressLineAddress(String address) throws Exception {
        getFormPage().enterAddressLine1(address);
    }

    @Then("I should not see the word invalid in the address line one field")
    public void iShouldNotSeeTheWordInvalidInTheAddressLineField() throws Exception {
        Assert.assertEquals(true, getFormPage().isAddressLine1InvalidDisplayed());
    }

    @And("I clear the address line one field")
    public void iClearTheAddressLineOneField() throws Exception {
        getFormPage().clearAddressLineOneField();
    }
}
