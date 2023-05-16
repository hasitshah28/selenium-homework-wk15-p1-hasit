package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends Utility {

    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());

    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement getWelcomeText;
    // By getWelcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement checkOutAsGuest;
    //By checkOutAsGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    @CacheLookup
    @FindBy(id = "Email")
    WebElement loginLink;
    //By loginLink = By.id("Email");

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordLink;
    //By passwordLink = By.name("Password");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    //By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement checkOutBox;
    //By checkOutBox = By.id("termsofservice");
    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkOutButton;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement cityName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postCode;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;
    @CacheLookup
    @FindBy(name = "save")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countrySelection;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_StateProvinceId")
    WebElement stateSelection;
    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement radioButton;
    @CacheLookup
    @FindBy(xpath = "//div[@id='shipping-method-buttons-container']/button")
    WebElement continueButton1;
    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creditCard;
    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement cardType;

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName;
    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement month;
    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement year;
    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cvvCode;
    @CacheLookup
    @FindBy(xpath = "//div[@id='payment-info-buttons-container']/button")
    WebElement continueButton2;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]")
    WebElement continueButton3;
    @CacheLookup
    @FindBy(xpath = "//div[@class='payment-method-info']/ul/li")
    WebElement paymentMethod;
    @CacheLookup
    @FindBy(xpath = "//div[@class='shipping-method-info']/ul/li")
    WebElement shippingMethod;
    @CacheLookup
    @FindBy(xpath = "//tr[@class ='order-total']/td[2]/span//strong[text()='$698.00']")
    WebElement totalPrice;
    @CacheLookup
    @FindBy(xpath = "//div[@id='confirm-order-buttons-container']//button")
    WebElement confirmButton;
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Thank you']")
    WebElement getThankYouText;
    @CacheLookup
    @FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")
    WebElement getOrderPlacedText;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 order-completed-continue-button']")
    WebElement continueButton4;
    @CacheLookup
    @FindBy(xpath = "//h2[text()='Welcome to our store']")
    WebElement getWelcomeToOurStore;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutLink;
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continue5;

    public String verifyWelcomeText() {
        // Reporter.log("Get text Welcome" + getWelcomeText.toString()+"<br>");
        log.info("Get text Welcome" + getWelcomeText.toString()+"<br>");
        return getTextFromElement(getWelcomeText);
    }

    public void clickOnCheckOutAsGuest() {
        clickOnElement(checkOutAsGuest);
        // Reporter.log("Click on checkout automation" + checkOutAsGuest.toString()+ "<br>");
        log.info("Click on checkout automation" + checkOutAsGuest.toString()+ "<br>");

    }

    public void enterLogindetailsAndClickOnLoginButton() {
        sendTextToElement(loginLink, "Jane098@gmail.com");
        log.info("Enter login details" + loginLink.toString()+ "<br>");
        sendTextToElement(passwordLink, "qwer123");

        log.info("Enter password details" + passwordLink.toString()+ "<br>");
        clickOnElement(loginButton);

        log.info("Click on Login button" + loginButton.toString()+ "<br");


    }

    public void clickOnCheckOutBox() {
        clickOnElement(checkOutBox);

        log.info("Click on Check Out Box" + checkOutBox.toString()+ "<br>");

    }

    public void clickOnCheckOutButton() {
        clickOnElement(checkOutButton);
        log.info("Click on Check Out Button" + checkOutButton.toString()  +"<br>");

    }

    public void enterMandatoryDetails() {
        selectByVisibleTextFromDropDown(countrySelection, "United States");

        log.info("Select Country" + countrySelection.toString()+ "<br>");
        selectByVisibleTextFromDropDown(stateSelection, "AA (Armed Forces Americas)");

        log.info("Select State" + stateSelection.toString()+"<br>");
        sendTextToElement(cityName, "WashingtonDC");

        log.info("Select City" + cityName.toString()+ "<br>");
        sendTextToElement(address, "121,Soho Road");

        log.info("Enter Address" + address.toString()+ "<br>");
        sendTextToElement(postCode, "Q123TQ");

        log.info("Enter Post Code" + postCode.toString() + "<br>");
        sendTextToElement(phoneNumber, "1234567890");

        log.info("Enter Phone Number" + phoneNumber.toString() + "<br>");
        clickOnElement(continue5);

        log.info("click on continue" + continue5.toString()+ "<br>");

    }

    public void clickOnContinue() {
        clickOnElement(continueButton);
        log.info("Click on Continue Button" + continueButton.toString() + "<br>");

    }

    public void clickOnradioButton() {
        clickOnElement(radioButton);
        log.info("Click on Radio Button" + radioButton.toString()+ "<br>");

    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton1);
        log.info("Click on Continue Button" + continueButton1.toString()+ "<br>");

    }

    public void clickOnCreditCard() {
        clickOnElement(creditCard);
        log.info("Click on Credit card option" + creditCard.toString()+"<br>");

    }

    public void selectCardType() {
        selectByVisibleTextFromDropDown(cardType, "Visa");
        log.info("Select Card Type" + cardType.toString() +"<br>");

    }

    public void enterCardDetails() {
        sendTextToElement(cardHolderName, "Jay Raj");
        log.info("Select Card Holder name" + cardHolderName.toString()+ "<br>");


        sendTextToElement(cardNumber, "5555 5555 5555 4444");
        log.info("Enter Card number" + cardNumber.toString()+ "<br>");


        selectByVisibleTextFromDropDown(month, "04");
        log.info("Enter month" + month.toString() + "<br>");


        selectByVisibleTextFromDropDown(year, "2026");
        log.info("Select year" + year.toString() + "<br>");


        sendTextToElement(cvvCode, "123");
        log.info("Enter CVV" + cvvCode.toString()+ "<br>");

    }

    public void clickOnContinueButton2() {
        clickOnElement(continueButton2);
        log.info("Click on Continue Button" + continueButton2.toString()+ "<br>");

    }

    public void clickOnContinueButton3() {
        clickOnElement(continueButton3);
        log.info("Click on Continue Button" + continueButton3.toString()+ "<br>");

    }

    public String verifyPaymentMethod() {
        log.info("Get Text Payment Method" + paymentMethod.toString()+ "<br>");

        return getTextFromElement(paymentMethod);
    }

    public String verifyShippingMethod() {
        log.info("Get Text Shipping Method" + shippingMethod.toString()+ "<br>");

        return getTextFromElement(shippingMethod);
    }

    public String verifyTotalPrice() {
        log.info("Get Text Total Price" + totalPrice.toString()+ "<br>");

        return getTextFromElement(totalPrice);
    }

    public void clickOnConfirm() {
        clickOnElement(confirmButton);
        log.info("Click on Confirm button" + confirmButton.toString()+ "<br>");

    }

    public String verifyThankYouMessage() {
        log.info("Get Text Thank You" + getThankYouText.toString()+ "<br>");
        return getTextFromElement(getThankYouText);
    }

    public String verifyOrderPlacedMessageText() {
        log.info("Get Text Order Placed" + getOrderPlacedText.toString()+ "<br>");
        return getTextFromElement(getOrderPlacedText);
    }

    public void clickOnContinueButton4() {
        clickOnElement(continueButton4);
        log.info("Click on continue button" + continueButton4.toString()+ "<br>");
    }

    public String verifyWelcomeToOurStoreText() {
        log.info("Get Text Welcome to Our Store" + getWelcomeToOurStore.toString()+ "<br>");
        return getTextFromElement(getWelcomeToOurStore);
    }

    public void clickOnLogOutLink() {
        clickOnElement(logoutLink);
        log.info("Click on Log out Link" + loginLink.toString()+ "<br>");

    }

    public String verifyCurrentUrl() {
        log.info("Get text of Current URL" + driver.getCurrentUrl().toString()+ "<br>");
        return driver.getCurrentUrl();
    }
}
