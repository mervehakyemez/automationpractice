package com.automatedtest.sample.homepage;

import com.automatedtest.sample.basepage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;


public class HomePage extends BasePage {

    private static final String HOME_PAGE_URL = "http://automationpractice.com/";

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    private WebElement signInButton;

    @FindBy(id = "email")
    private WebElement emailTextbox;

    @FindBy(id = "passwd")
    private WebElement passwordTextbox;

    @FindBy(id = "SubmitLogin")
    private WebElement submitButton;

    @FindBy(xpath = "(//div[@class='header_user_info'])[1]")
    private WebElement userNameLabel;

    @FindBy(xpath = "(//a[@title='Dresses'])[2]")
    private WebElement dressesButton;

    @FindBy(xpath = "(//a[contains(text(),'Casual Dresses')])[3]")
    private WebElement casualDressesButton;

    @FindBy(xpath = "//a[@class='product-name' and @title='Printed Dress']")
    private WebElement firstItemButton;

    @FindBy(xpath = "//h1[@itemprop='name']")
    private WebElement itemNameLabelOnItemDetailPage;

    @FindBy(xpath = "(//a[contains(text(),'Summer Dresses')])[3]")
    private WebElement summerDressesButton;

    @FindBy(xpath = "//a[@class='product-name' and @title='Printed Summer Dress'][1]")
    private WebElement summerDressPageFirstItemButton;

    @FindBy(xpath = "//h1[@itemprop='name']")
    private WebElement itemNameLabelOnSummerDressItemDetailPage;

    @FindBy(xpath = "//p[@id='add_to_cart']")
    private WebElement summerDressesAddToCartButton;

    @FindBy(id = "search_query_top")
    private WebElement searchTextbox;

    @FindBy(xpath = "//button[@type='submit' and @name='submit_search']")
    private WebElement searchButton;

    @FindBy(xpath = "//span[contains(text(),'summer')]")
    private WebElement itemNameLabelOnSearchPage;

    @FindBy(xpath = "//a[@class='product-name' and @title='Printed Chiffon Dress']")
    private WebElement searchPageSecondItemButton;

    @FindBy(xpath = "//p[@id='add_to_cart']")
    private WebElement searchPageAddToCartButton;

    @FindBy(xpath = "//h1[@itemprop='name']")
    private WebElement secondItemNameLabelOnSearchItemDetailPage;

    @FindBy(xpath = " //a[@title='View my shopping cart']")
    private WebElement viewMyShoppingCartButton;

    @FindBy(xpath = "//a[@id='button_order_cart']")
    private WebElement checkOutButton;

    @FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
    private WebElement proceedToCheckoutButtonOnInformationPopupForOrder;

    @FindBy(xpath = "(//span[contains(text(), 'Proceed to checkout')])[2]")
    private WebElement proceedToCheckoutButtonOnSummaryPage;

    @FindBy(xpath = "(//span[contains(text(), 'Proceed to checkout')])[2]")
    private WebElement proceedToCheckoutButtonOnAddressPage;

    @FindBy(xpath = "//label[contains(text(),'I agree to the terms of service and will adhere to them unconditionally.')]")
    private WebElement proceedToCheckboxOnShippingPage;

    @FindBy(xpath = "(//span[contains(text(),'Proceed to checkout')])[2]")
    private WebElement proceedToCheckoutButtonOnShippingPage;

    @FindBy(xpath = "//a[@title='Pay by check.']")
    private WebElement paymentTypeButtonOnPaymentPage;

    @FindBy(xpath = "//span[contains(text(),'I confirm my order')]")
    private WebElement confirmButtonOnPaymentPage;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    private WebElement successAlertMessageForOrderLabel;

    @FindBy(xpath = "//span[contains(text(),'Order history and details')]")
    private WebElement orderHistoryAndDetailsButton;

    @FindBy(xpath = "//tr[@class='first_item ']")
    private WebElement lastOrder;

    HomePage() {
        PageFactory.initElements(driver, this);
    }

    void goToHomePageAutomation() {
        driver.get(HOME_PAGE_URL);
        wait.forLoading(5);
    }

    void ClickSignInButton() {
        this.signInButton.click();
    }

    void EnterUsername(String username) {
        this.emailTextbox.sendKeys(username);
    }

    void EnterPassword(String password) {
        this.passwordTextbox.sendKeys(password);
    }

    void ClickSubmitButton() {
        this.submitButton.click();
    }

    void checkUsername(String username) {
        wait.forElementToBeDisplayed(10, this.userNameLabel, "User Name Label");
        String usernameText = this.userNameLabel.getText();
        assertTrue(usernameText.contains(username));
    }

    void ClickDressesButton() {
        wait.forElementToBeDisplayed(10, this.dressesButton, "Dresses Button");
        this.dressesButton.click();
    }

    void ClickCasualDressesButton() {
        wait.forElementToBeDisplayed(10, this.casualDressesButton, "Casual Dresses Button");
        this.casualDressesButton.click();
    }

    void ClickFirstItemButton() {
        wait.forElementToBeDisplayed(10, this.firstItemButton, "First Item Button");
        this.firstItemButton.click();
    }

    void checkCasualDressesPage(String itemLabelName) {
        wait.forElementToBeDisplayed(10, this.itemNameLabelOnItemDetailPage, "Item Label Name");
        String itemlabelNameText = this.itemNameLabelOnItemDetailPage.getText();
        assertTrue(itemlabelNameText.contains(itemLabelName));
    }

    void ClickSummerDressesButton() {
        wait.forElementToBeDisplayed(10, this.summerDressesButton, "Summer Dresses Button");
        this.summerDressesButton.click();
    }

    void ClickSummerDressPageFirstItemButton() {
        wait.forElementToBeDisplayed(10, this.summerDressPageFirstItemButton, "Summer Dress Page First Item Button");
        this.summerDressPageFirstItemButton.click();
    }

    void checkSummerDressesPage(String summerDressPageItemLabelName) {
        wait.forElementToBeDisplayed(10, this.itemNameLabelOnSummerDressItemDetailPage, "Summer Dress Page Item Label Name");
        String summerDressPageItemLabelNameText = this.itemNameLabelOnSummerDressItemDetailPage.getText();
        assertTrue(summerDressPageItemLabelNameText.contains(summerDressPageItemLabelName));
    }

    void ClickSummerDressesAddToCartButton() {
        wait.forElementToBeDisplayed(10, this.summerDressesButton, "Summer Dresses Add to Cart Button");
        this.summerDressesAddToCartButton.click();
    }

    void EnterSummer(String text) {
        this.searchTextbox.sendKeys(text);
    }

    void ClickSearchButton(){
        this.searchButton.click();
    }

    void checkSearchPage(String searchItemLabelName) {
        wait.forElementToBeDisplayed(10, this.itemNameLabelOnSearchPage, "Search Item Label Name");
        String searchItemLabelNameText = this.itemNameLabelOnSearchPage.getText();
        assertTrue(searchItemLabelNameText.contains(searchItemLabelName));
    }

    void ClickSearchPageSecondItemButton() {
        wait.forElementToBeDisplayed(20, this.searchPageSecondItemButton, "Search Page Second Item Button");
        this.searchPageSecondItemButton.click();
    }

    void ClickAddToCartonSearchPageButton() {
        wait.forElementToBeDisplayed(20, this.searchPageAddToCartButton, "Search Page First Item Button");
        this.searchPageAddToCartButton.click();
    }

    void ClickViewMyShoppingCartButton() {
        wait.forElementToBeDisplayed(10, this.viewMyShoppingCartButton, "Cart Button");
        this.viewMyShoppingCartButton.click();
    }

    void ClickCheckOutButton() {
        wait.forElementToBeDisplayed(10, this.checkOutButton, "Check Out Cart Button");
        this.checkOutButton.click();
    }

    void ClickProceedToCheckOutButtonOnInformationPopup() {
        wait.forElementToBeDisplayed(15, this.proceedToCheckoutButtonOnInformationPopupForOrder, "Proceed To Check Out Button on Information Popup for Order");
        this.proceedToCheckoutButtonOnInformationPopupForOrder.click();
    }

    void ClickProceedToCheckOutButtonOnSummaryPage() {
        wait.forElementToBeDisplayed(15, this.proceedToCheckoutButtonOnSummaryPage, "Proceed To Check Out Cart Button on Summary page");
        this.proceedToCheckoutButtonOnSummaryPage.click();
    }

    void ClickProceedToCheckOutButtonOnAddressPage() {
        wait.forElementToBeDisplayed(15, this.proceedToCheckoutButtonOnAddressPage, "Proceed To Check Out Cart Button on Address page");
        this.proceedToCheckoutButtonOnAddressPage.click();
    }

    void ClickCheckboxOnShippingPage() {
        wait.forElementToBeDisplayed(15, this.proceedToCheckboxOnShippingPage, "Proceed To Checkbox on Shipping page");
        this.proceedToCheckboxOnShippingPage.click();
    }

    void ClickProceedToCheckOutButtonOnShippingPage() {
        wait.forElementToBeDisplayed(15, this.proceedToCheckoutButtonOnShippingPage, "Proceed To Check Out Cart Button on Shipping page");
        this.proceedToCheckoutButtonOnShippingPage.click();
    }

    void ClickPaymentMethodButtonOnPaymentPage() {
        wait.forElementToBeDisplayed(15, this.paymentTypeButtonOnPaymentPage, "Payment Method Button on Payment page");
        this.paymentTypeButtonOnPaymentPage.click();
    }

    void ClickCofirmButtonOnPaymentPage() {
        wait.forElementToBeDisplayed(15, this.confirmButtonOnPaymentPage, "Confirm Button on Payment page");
        this.confirmButtonOnPaymentPage.click();
    }

    void checkSuccessOrderMessage(String successOrderMessage) {
        wait.forElementToBeDisplayed(10, this.successAlertMessageForOrderLabel, "Success Order Message Label");
        String orderMessageText = this.successAlertMessageForOrderLabel.getText();
        assertTrue(orderMessageText.contains(successOrderMessage));
    }

    void clickUserNameLabel() {
        wait.forElementToBeDisplayed(10, this.userNameLabel, "User Name Label");
        this.userNameLabel.click();
    }

    void clickOrderHistoryAndDetailsButton() {
        wait.forElementToBeDisplayed(10, this.orderHistoryAndDetailsButton, "Order History And Details Button");
        this.orderHistoryAndDetailsButton.click();
    }

    void checkLastOrder() {
        wait.forElementToBeDisplayed(10, this.lastOrder, "Last Order Table");

        if( this.lastOrder.isDisplayed()){
            System.out.println("Order is successful");
        }
        else {
            System.out.println("Order is not successful!");
            Assert.fail();
        }
    }
    void CheckSuccessOrderFromOrderHistoryAndDetailsPage() {
        clickUserNameLabel();
        clickOrderHistoryAndDetailsButton();
        checkLastOrder();
    }
}
