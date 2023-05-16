package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement getShoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement changeQty;

    @CacheLookup
    @FindBy(xpath="(//strong[text()='$2,950.00'])[2]")
    WebElement getPriceText;
    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement updateCart;
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement checkBox;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOut;

    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement getQty;
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement getTextPrice;


    public String verifyShoppingCartText() {

        log.info("Verify Shopping cart text" + getShoppingCartText.toString() +"<br>");
        return getTextFromElement(getShoppingCartText);
    }
    public void changeTheQuantity() {
        clickOnElement(changeQty);
        driver.findElement(By.xpath("//input[@class='qty-input']")).clear();
        sendTextToElement(changeQty,"2");
        clickOnElement(updateCart);
        log.info("Change the quantity" + changeQty.toString()+"<br>");

    }
    public String verifyTotalPrice(){

        log.info("Verify Total price " + getPriceText.toString()+"<br>");
        return getTextFromElement(getPriceText);
    }
    public void clickOnCheckBox() {
        clickOnElement(checkBox);

        log.info("click on checkbox " + checkBox.toString()+"<br>");
    }
    public void clickOnCheckOut(){
        clickOnElement(checkOut);

        log.info("click on checkout" + getPriceText.toString()+"<br>");
    }
    public String verifyQty(){

        log.info("click on checkout" + getQty.toString()+"<br>");
        String expectedQty = "2";
        WebElement actualElement = getQty;
        String actualQty = actualElement.getAttribute("value");
        return actualQty;
    }
    public String verifyPriceText(){
        log.info("verify price text" + getTextPrice.toString()+"<br>");
        return getTextFromElement(getTextPrice);
    }

}
