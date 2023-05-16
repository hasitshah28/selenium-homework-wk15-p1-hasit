package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.CellPhonesPage;
import com.nopcommerce.demo.pages.CheckOutPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ElectronicTestSteps {
    @When("^I mouse hover to Electronics Tab$")
    public void iMouseHoverToElectronicsTab() throws InterruptedException {
        Thread.sleep(1000);
        new HomePage().setMouseHoverToElectronic();
    }

    @And("^I mouse hover and click on Cell Phones tab$")
    public void iMouseHoverAndClickOnCellPhonesTab() throws InterruptedException {
        Thread.sleep(1000);
        new HomePage().setGetMouseHoverToElectronicAndClickOnCellPhone();
    }

    @Then("^I should navigate to Cell Phone page$")
    public void iShouldNavigateToCellPhonePage() {
        Assert.assertEquals(new CellPhonesPage().verifyTextCellPhone(), "Cell phones");
    }

    @And("^I click on List view tab$")
    public void iClickOnListViewTab() {
        new CellPhonesPage().clickOnListView();
    }

    @And("^I click on Nokia Lumia (\\d+)$")
    public void iClickOnNokiaLumia(int arg0) throws InterruptedException {
        Thread.sleep(2000);
        new CellPhonesPage().clickOnNokiaLumia1020();
    }

    @Then("^I should see Nokia Lumia (\\d+)$")
    public void iShouldSeeNokiaLumia(int arg0) {
        Assert.assertEquals(new CellPhonesPage().verifyTextNokiaLumia1020(), "Nokia Lumia 1020");
    }

    @And("^I should see price \\$(\\d+)\\.(\\d+)$")
    public void iShouldSeePrice$(int arg0, int arg1) {
        Assert.assertEquals(new CellPhonesPage().verifyPrice(), "$349.00");
    }

    @And("^I change the Qty to (\\d+)$")
    public void iChangeTheQtyTo(int arg0) {
        new CellPhonesPage().changeThatQty();
    }

    @And("^I click on Add to Cart$")
    public void iClickOnAddToCart() {
        new CellPhonesPage().clickOnAddToCart();
    }

    @Then("^I should see The product is added to your shopping cart$")
    public void iShouldSeeTheProductIsAddedToYourShoppingCart() {
        Assert.assertEquals( new CellPhonesPage().verifyAddToCartSuccessfully(), "The product has been added to your shopping cart");
    }

    @And("^I click cross$")
    public void iClickCross() {
        new CellPhonesPage().clickOnCrossButton();
    }

    @And("^I mouse hover on Shopping cart and click on Go to Cart$")
    public void iMouseHoverOnShoppingCartAndClickOnGoToCart() {
        new CellPhonesPage().mouseHoverToShoppingCart();
    }

    @Then("^I should see text Shopping cart$")
    public void iShouldSeeTextShoppingCart() {
        new ShoppingCartPage().verifyShoppingCartText();
    }

    @And("^I should see Qty is (\\d+)$")
    public void iShouldSeeQtyIs(int arg0) {
        Assert.assertEquals(new ShoppingCartPage().verifyQty(), "2");
    }

    @And("^I should see price is \\$(\\d+)\\.(\\d+)$")
    public void iShouldSeePriceIs$(int arg0, int arg1) {
        Assert.assertEquals(new ShoppingCartPage().verifyPriceText(),"$698.00");
    }

    @And("^I click on check box of terms and service$")
    public void iClickOnCheckBoxOfTermsAndService() {
        new ShoppingCartPage().clickOnCheckBox();
    }

    @And("^I click on Checkout$")
    public void iClickOnCheckout() {
        new ShoppingCartPage().clickOnCheckOut();
    }

    @Then("^I should see Welcome Please Sign In!$")
    public void iShouldSeeWelcomePleaseSignIn() {
        Assert.assertEquals(new CheckOutPage().verifyWelcomeText(), "Welcome, Please Sign In!");
    }

    @And("^I click on Login Tab$")
    public void iClickOnLoginTab() throws InterruptedException {
        new CheckOutPage().enterLogindetailsAndClickOnLoginButton();
        Thread.sleep(1000);
        new CheckOutPage().clickOnCheckOutBox();
        new CheckOutPage().clickOnCheckOutButton();
    }
}
