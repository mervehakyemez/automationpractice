package com.automatedtest.sample.homepage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;

public class HomePageSteps {


    private HomePage homePage;

    public HomePageSteps() {
        this.homePage = new HomePage();
    }

    @Given("A user navigates to HomePage")
    public void aUserNavigatesToHomePage() {
        this.homePage.goToHomePageAutomation();
    }

    @Then("Click SignIn Button")
    public void clickSignInButton() {
        this.homePage.ClickSignInButton();
    }

    @Then("Enter user email to email textbox")
    public void enterUserEmailToEmailTextbox() {
        this.homePage.EnterUsername("mervehakyemezz@gmail.com");
    }

    @Then("Enter user password to password textbox")
    public void enterUserPasswordToPasswordTextbox() {
        this.homePage.EnterPassword("merve123");
    }

    @Then("Click on submit button")
    public void clickOnSubmitButton() {
        this.homePage.ClickSubmitButton();
    }

    @Then("Login check")
    public void loginCheck() {
        this.homePage.checkUsername("Monica Kenneth");
    }

    @Then("^Login check with \"([^\"]*)\"$")
    public void loginCheckWith(String username) {
        this.homePage.checkUsername(username);
    }

    @Then("Click on Dresses Button")
    public void clickOnDressesButton() {
        this.homePage.ClickDressesButton();
    }

    @Then("Click on Casual Dresses button")
    public void clickOnCasualDressesButton() {
        this.homePage.ClickCasualDressesButton();
    }

    @Then("Click on first item on Casual Dresses Page")
    public void clickOnFirstItemOnCasualDressesPage() {
        this.homePage.ClickFirstItemButton();
    }

    @Then("^Page check with item name \"([^\"]*)\"$")
    public void pageCheckWithItemName(String itemNameText) {
        this.homePage.checkCasualDressesPage(itemNameText);
    }

    @Then("Click on Summer Dresses button")
    public void clickOnSummerDressesButton() {
        this.homePage.ClickSummerDressesButton();
    }

    @Then("Click on first item on Summer Dresses Page")
    public void clickOnFirstItemOnSummerDressesPage() {
        this.homePage.ClickSummerDressPageFirstItemButton();
    }

    @Then("Check page with  item name \"([^\"]*)\"$")
    public void checkSummerPageWithItemName(String summerDressItemNameText) {
        this.homePage.checkSummerDressesPage(summerDressItemNameText);
    }

    @Then("Click on Add to cart button on Summer Dress Page")
    public void clickOnAddToCartButtonOnSummerDressPage() {
        this.homePage.ClickSummerDressesAddToCartButton();
    }

    @Then("Enter summer to search textbox")
    public void enterSummerToSearchTextbox() {
        this.homePage.EnterSummer("summer");
    }

    @Then("Click on search button")
    public void clickOnSearchButton() {
        this.homePage.ClickSearchButton();
    }

    @Then("Check Search page with item name \"([^\"]*)\"$")
    public void checkSearchPageWithItemName(String searchItemNameText) {
        this.homePage.checkSearchPage(searchItemNameText);
    }

    @Then("Click on second item on Search Page")
    public void clickOnSecondItemOnSearchPage() {
        this.homePage.ClickSearchPageSecondItemButton();
    }

    @Then("Click on Add to cart button on Search Page")
    public void clickOnAddToCartButtonOnSearchPage() {
        this.homePage.ClickAddToCartonSearchPageButton();
    }

    @Then("Click on Cart button")
    public void clickOnCartButton() {
        this.homePage.ClickViewMyShoppingCartButton();
    }

    @Then("Click on Check Out button")
    public void clickOnCheckOutButton() {
        this.homePage.ClickCheckOutButton();
    }

    @Then("Click on Proceed to Checkout button on Information Popup for Order")
    public void clickOnProceedToCheckoutButtonOnInformationPopupForOrder() {
        this.homePage.ClickProceedToCheckOutButtonOnInformationPopup();
    }

    @Then("Click on Proceed to Checkout button on Summary page")
    public void clickOnProceedToCheckoutButtonOnSummaryPage() {
        this.homePage.ClickProceedToCheckOutButtonOnSummaryPage();
    }

    @Then("Click on Proceed to Checkout button on Address page")
    public void clickOnProceedToCheckoutButtonOnAddressPage() {
        this.homePage.ClickProceedToCheckOutButtonOnAddressPage();
    }

    @Then("Click on Checkbox on Shipping page")
    public void clickOnCheckboxOnShippingPage() {
        this.homePage.ClickCheckboxOnShippingPage();
    }

    @Then("Click on Proceed to Checkout button on Shipping page")
    public void clickOnProceedToCheckoutButtonOnShippingPage() {
        this.homePage.ClickProceedToCheckOutButtonOnShippingPage();
    }

    @Then("Click on any payment method button on Payment page")
    public void clickOnAnyPaymentMethodButtonOnPaymentPage() {
        this.homePage.ClickPaymentMethodButtonOnPaymentPage();
    }

    @Then("Click on Confirm button on Payment page")
    public void clickOnConfirmButtonOnPaymentPage() {
        this.homePage.ClickCofirmButtonOnPaymentPage();
    }

    @Then("Check the success order message")
    public void checkTheSuccessOrderMessage() {

    }

    @Then("^Check the success order message is \"([^\"]*)\"$")
    public void checkTheSuccessOrderMessageIs(String successOrderMessage) {
        this.homePage.checkSuccessOrderMessage(successOrderMessage);
    }

    @Then("Check the success order from Order History And Details Page")
    public void checkTheSuccessOrderFromOrderHistoryAndDetailsPage() {
        this.homePage.CheckSuccessOrderFromOrderHistoryAndDetailsPage();
    }
}
