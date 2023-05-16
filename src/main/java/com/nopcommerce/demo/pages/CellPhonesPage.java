package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonesPage extends Utility {

    private static final Logger log = LogManager.getLogger(CellPhonesPage.class.getName());

    public CellPhonesPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement getTextCellPhone;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listView;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Nokia Lumia 1020')]")
    WebElement nokiaLumia1020;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement getTextNokia;
    // By getTextNokia = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement getPrice;
    //By getPrice = By.xpath("//span[@id='price-value-20']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
    WebElement changeQty;
    //By changeQty = By.xpath("//input[@id='product_enteredQuantity_20']");
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCart;
    //By addToCart = By.xpath("//button[@id='add-to-cart-button-20']");
    @CacheLookup
    @FindBy(xpath = "//p[text()='The product has been added to your ']")
    WebElement addToCartSuccessfully;
    //By addToCartSuccessfully = By.xpath("//p[text()='The product has been added to your ']");
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement crossButton;
    // By crossButton = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCart;
    //By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCart;
    //By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");

    public String verifyTextCellPhone() {
        log.info("Get Text Cell Phone" + getTextCellPhone.toString()+ "<br>");
        return getTextFromElement(getTextCellPhone);
    }

    public void clickOnListView() {
        clickOnElement(listView);
        log.info("Click on List View" + listView.toString() +"<br");
    }

    public void clickOnNokiaLumia1020() {
        clickOnElement(nokiaLumia1020);
        log.info("Click on List View" + listView.toString() + "<br>");
    }

    public String verifyTextNokiaLumia1020() {
        log.info("Click on List View" + listView.toString()+ "<br>");
        return getTextFromElement(getTextNokia);
    }

    public String verifyPrice() {
        log.info("Get Price Text" + getPrice.toString() +"<br>");
        return getTextFromElement(getPrice);
    }

    public void changeThatQty() {
        clickOnElement(changeQty);
        changeQty.clear();
        sendTextToElement(changeQty, "2");
        log.info("Change Qty" + changeQty.toString()+ "<br>");

    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
        log.info("Click on Add to Cart" + addToCart.toString() +"<br>");
    }

    public String verifyAddToCartSuccessfully() {
        log.info("Get text Add to Cart Successfully" + addToCartSuccessfully.toString()+"<br>");
        return getTextFromElement(addToCartSuccessfully);
    }

    public void clickOnCrossButton() {
        clickOnElement(crossButton);
        log.info("Click on Cross Button" + crossButton.toString() + "<br>");
    }

    public void mouseHoverToShoppingCart() {
        mouseHoverToElement(shoppingCart);
        clickOnElement(goToCart);
        log.info("Mouse hover to Shopping cart" + goToCart.toString()+ "<br>");

    }
}
