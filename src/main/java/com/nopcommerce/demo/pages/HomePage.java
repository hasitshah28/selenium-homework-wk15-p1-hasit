package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li")
    List<WebElement> topMenuTab;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerTab;
    @CacheLookup
    @FindBy(xpath = "//h2[text()='Welcome to our store']")
    WebElement getTextWelcome;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement pageNavigationText;

    @CacheLookup
    // @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    @FindBy(xpath ="(//a[text()='Electronics '])[1]")
    WebElement mouseHoverToElectronic;
    @CacheLookup
    // @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']")
    @FindBy(xpath="(//a[text()='Cell phones '])[1]")
    WebElement getMouseHoverToElectronicAndClickOnCellPhone;

    public void selectMenu(String menu) {
        try {
            List<WebElement> list = topMenuTab;
            for (WebElement listOfElement : list) {
                if (listOfElement.getText().equals(menu)) {
                    listOfElement.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            List<WebElement> list = topMenuTab;
        }
        log.info("Clicking on login link : " + topMenuTab.toString() + "<br>");
    }
    public void clickOnComputerTab() {
        clickOnElement(computerTab);
        log.info("click on Computer Tab" + computerTab.toString()+ "<br>");
    }
    public String verifyWelcomeText() {
        log.info("Verify Welcome Text" + getTextWelcome.toString() + "<br>");
        return getTextFromElement(getTextWelcome);
    }
    public String getPageNavigationText() {
        log.info("Verify page navigation" + pageNavigationText.toString()+ "<br>");
        return getTextFromElement(pageNavigationText);
    }
    public void setMouseHoverToElectronic(){
        mouseHoverToElement(mouseHoverToElectronic);
        log.info("mouse hove to electronic" + mouseHoverToElectronic.toString()+ "<br>");
    }
    public void setGetMouseHoverToElectronicAndClickOnCellPhone(){
        mouseHoverToElementAndClick(getMouseHoverToElectronicAndClickOnCellPhone);
        log.info("mouse hover to electronic and click on cellphone" + getMouseHoverToElectronicAndClickOnCellPhone.toString() +"<br>");
    }
}
