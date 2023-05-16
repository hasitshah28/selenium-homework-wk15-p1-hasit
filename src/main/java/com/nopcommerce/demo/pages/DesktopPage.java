package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DesktopPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    public DesktopPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement sortByPosition;
    @CacheLookup
    @FindBy(tagName = "h2")
    List<WebElement> productList;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement addToCart;


    public void sortByPositionByNameZtoA() {
        selectByValueFromDropDown(sortByPosition, "6");
        log.info("Select Sort By position Name: Z to A" + sortByPosition.toString() + "<br>");
    }

    public ArrayList<String> defaultProductList() {
        log.info("Select Sort By position Name: Z to A" + productList.toString() + "<br>");
        // Get all the products name and stored into array list
        List<WebElement> products = productList;
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        return originalProductsName;
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
        log.info("Click on Add to Cart" + addToCart.toString()+ "<br>");
    }
}
