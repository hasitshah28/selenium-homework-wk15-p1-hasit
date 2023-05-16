package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Collections;

public class ComputerPageTestSteps {

    @When("^I click on Computer tab$")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputerTab();

    }

    @And("^I click on desktop tab$")
    public void iClickOnDesktopTab() {
        new ComputerPage().clickOnDesktop();

    }

    @And("^I select sort by position Name: Z to A$")
    public void iSelectSortByPositionNameZToA() {
        new DesktopPage().sortByPositionByNameZtoA();
    }

    @Then("^I should verify product will arrange in descending order$")
    public void iShouldVerifyProductWillArrangeInDescendingOrder()  {
        ArrayList<String> originalProductList = new DesktopPage().defaultProductList();
        System.out.println(originalProductList);
        Collections.reverse(originalProductList);
        System.out.println(originalProductList);
        new DesktopPage().sortByPositionByNameZtoA();
        ArrayList<String> afterSortByZtoAList =new DesktopPage().defaultProductList();
        System.out.println(originalProductList);
        Assert.assertEquals(afterSortByZtoAList, afterSortByZtoAList);
    }

    @And("^I select sort by position Name: A to Z$")
    public void iSelectSortByPositionNameAToZ() {
        new DesktopPage().defaultProductList();

    }

    @And("^I click on Add to Cart button$")
    public void iClickOnAddToCartButton() throws InterruptedException {
        Thread.sleep(2000);
        new DesktopPage().clickOnAddToCart();
    }


    @Then("^I should see build your computer$")
    public void iShouldSeeBuildYourComputer() throws InterruptedException {
        Thread.sleep(1000);
        String expectedMessage = "Build your own computer";
        String actualMessage = new AddToCartPage().verifyBuildYourOwnComputerText();
        Assert.assertEquals(expectedMessage, actualMessage, "Not displayed");
    }


    @And("^I select processor (\\d+)\\.(\\d+) GHz Intel Pentium Dual-Core E(\\d+)$")
    public void iSelectProcessorGHzIntelPentiumDualCoreE(int arg0, int arg1, int arg2) {
        new AddToCartPage().selectProcessor();
    }

    @And("^I select ram (\\d+)GB \\[\\+\\$(\\d+)\\.(\\d+)\\]$")
    public void iSelectRamGB$(int arg0, int arg1, int arg2) {
        new AddToCartPage().selectRam();
    }

    @And("^I select HDD radio \"(\\d+) GB \\[\\+\\$(\\d+)\\.(\\d+)\\]$")
    public void iSelectHDDRadioGB$(int arg0, int arg1, int arg2) {
        new AddToCartPage().selectHDD();
    }

    @And("^I select OS radio \"Vista Premium \\[\\+\\$(\\d+)\\.(\\d+)\\]$")
    public void iSelectOSRadioVistaPremium$(int arg0, int arg1) {
        new AddToCartPage().selectOS();
    }

    @And("^I check two Check boxes Microsoft Office \\[\\+\\$(\\d+)\\.(\\d+)\\] and Total Commander \\[\\+\\$(\\d+)\\.(\\d+)\\]$")
    public void iCheckTwoCheckBoxesMicrosoftOffice$AndTotalCommander$(int arg0, int arg1, int arg2, int arg3) {
        new AddToCartPage().selectSoftware();
    }

    @And("^I verify the price \\$(\\d+),(\\d+)\\.(\\d+)$")
    public void iVerifyThePrice$(int arg0, int arg1, int arg2) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(new AddToCartPage().verifyThePrice(), "$1,475.00", "Wrong Price");
    }

    @And("^I click on add To Cart$")
    public void iClickOnAddToCart() {
        new AddToCartPage().clickOnAddToCart();
    }

    @Then("^I should see \"([^\"]*)\" on Top green Bar$")
    public void iShouldSeeOnTopGreenBar(String arg0) {
        Assert.assertEquals(new AddToCartPage().verifyAddToCartSuccessfully(), "The product has been added to your shopping cart");
    }

    @And("^I click on close button$")
    public void iClickOnCloseButton() {
        new AddToCartPage().clickOnCrossButton();
    }
    @And("^I mouseHover on Shopping cart and Click on GO TO CART button\\.$")
    public void iMouseHoverOnShoppingCartAndClickOnGOTOCARTButton() {
        new AddToCartPage().mouceHoverToShopingCart();
        new AddToCartPage().clickOnGoToCart();
    }

    @Then("^I should see Shopping cart$")
    public void iShouldSeeShoppingCart() {
        Assert.assertEquals(new ShoppingCartPage().verifyShoppingCartText(), "Shopping cart");
    }

    @And("^I cahnge the quantity of product and udpate shopping cart$")
    public void iCahngeTheQuantityOfProductAndUdpateShoppingCart() {
        new  ShoppingCartPage().changeTheQuantity();
    }

    @Then("^I should see price Total\"([^\"]*)\"$")
    public void iShouldSeePriceTotal(String arg0) {
        Assert.assertEquals(new ShoppingCartPage().verifyTotalPrice(), "$2,950.00");
    }
    @And("^I click on check box of terms and condition$")
    public void iClickOnCheckBoxOfTermsAndCondition() {
        new ShoppingCartPage().clickOnCheckBox();
    }

    @And("^I click on checkout button$")
    public void iClickOnCheckoutButton() {
        new ShoppingCartPage().clickOnCheckOut();
    }

    @Then("^I should see welcom message$")
    public void iShouldSeeWelcomMessage() {
        Assert.assertEquals(new CheckOutPage().verifyWelcomeText(), "Welcome, Please Sign In!");
    }

    @And("^I click on checkoutguest tab$")
    public void iClickOnCheckoutguestTab() {
        new CheckOutPage().clickOnCheckOutAsGuest();
    }

    @And("^I fill on all mandatory details$")
    public void iFillOnAllMandatoryDetails() {
        new GuestCheckOutPage().enterDetails();
    }

    @And("^I click on continue$")
    public void iClickOnContinue() {
        new GuestCheckOutPage().clickOnContinueButton();
    }

    @And("^I click on radio button “Next Day Air\\(\\$(\\d+)\\.(\\d+)\\)”$")
    public void iClickOnRadioButtonNextDayAir$(int arg0, int arg1) {
        new GuestCheckOutPage().clickOnNextDayAir();
    }
    @And("^I click again on continue$")
    public void iClickAgainOnContinue() {
        new GuestCheckOutPage().clickOnContinue();
    }

    @And("^I click on radio button \"([^\"]*)\" and click on continue$")
    public void iClickOnRadioButtonAndClickOnContinue(String arg0)  {
        new  GuestCheckOutPage().clickOnCreditCard();
        new GuestCheckOutPage().clickOnContinues();
    }

    @And("^I select \"([^\"]*)\" from credit card dropdown$")
    public void iSelectFromCreditCardDropdown(String arg0) {
        new  GuestCheckOutPage().selectMasterCard();
    }

    @And("^I fill in all details$")
    public void iFillInAllDetails() {
        new GuestCheckOutPage().enterDetailsOfCard();
    }
    @And("^I click on continue again$")
    public void iClickOnContinueAgain() {
        new GuestCheckOutPage().clickOnContinueButton3();
    }
    @Then("^I should see payment method is \"([^\"]*)\"$")
    public void iShouldSeePaymentMethodIs(String arg0) {
        Assert.assertEquals(new GuestCheckOutPage().verifyCreditCardPaymentMethod(), "Payment Method: Credit Card");
    }

    @And("^I should see shipping method is \"([^\"]*)\"$")
    public void iShouldSeeShippingMethodIs(String arg0) {
        Assert.assertEquals(new GuestCheckOutPage().verifyShippingMethod(), "Shipping Method: Next Day Air");
    }

    @And("^i should see total is “\\$(\\d+),(\\d+)\\.(\\d+)”$")
    public void iShouldSeeTotalIs$(int arg0, int arg1, int arg2) {
        Assert.assertEquals(new GuestCheckOutPage().verifyTotalPrice(), "$2,950.00");
    }

    @And("^I click on confirm$")
    public void iClickOnConfirm() {
        new GuestCheckOutPage().clickOnConfirm();
    }

    @Then("^I should see the Thank you message$")
    public void iShouldSeeTheThankYouMessage() {
        Assert.assertEquals(new GuestCheckOutPage().verifyThankYouMessage(), "Thank you");
    }

    @And("^I should see message your order has been successfully processed$")
    public void iShouldSeeMessageYourOrderHasBeenSuccessfullyProcessed() {
        Assert.assertEquals( new GuestCheckOutPage().verifyOrderPlacedSuccessfullyText(), "Your order has been successfully processed!");
    }

    @And("^I click on continue(\\d+)$")
    public void iClickOnContinue(int arg0) {
        new GuestCheckOutPage().clickOnContinueButton4();
    }
    @Then("^I should see the text Welcome to our store$")
    public void iShouldSeeTheTextWelcomeToOurStore() {
        Assert.assertEquals( new HomePage().verifyWelcomeText(), "Welcome to our store");
    }
}


