package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageSteps {

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }


    @When("^i click on any menu from \"([^\"]*)\"$")
    public void iClickOnAnyMenuFrom(String TopmenuTab) {
        new HomePage().selectMenu(TopmenuTab);
    }

    @Then("^i navigate to selected menu page \"([^\"]*)\"$")
    public void iNavigateToSelectedMenuPage(String verifymenu ) {
        Assert.assertEquals(verifymenu,new ComputerPage().verifyComputerText(),"Computers");
    }

}
