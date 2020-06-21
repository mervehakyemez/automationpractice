Feature: Home page

  @check_success_login
  Scenario: Check Success Login
    Given A user navigates to HomePage
    Then Click SignIn Button
    Then Enter user email to email textbox
    Then Enter user password to password textbox
    Then Click on submit button
    Then Login check with "Merve Hakyemez"

  @check_search_summer_page_and_give_an_order_then_check_the_order
  Scenario: Check Search Summer Page Is Open Last
    Given A user navigates to HomePage
    Then Click SignIn Button
    Then Enter user email to email textbox
    Then Enter user password to password textbox
    Then Click on submit button
    Then Login check with "Merve Hakyemez"
    Then Click on Dresses Button
    Then Click on Summer Dresses button
    Then Click on first item on Summer Dresses Page
    Then Check page with  item name "Printed Summer Dress"
    Then Click on Add to cart button on Summer Dress Page
    Then Enter summer to search textbox
    Then Click on search button
    Then Click on second item on Search Page
    Then Click on Add to cart button on Search Page
    Then Click on Cart button
    Then Click on Proceed to Checkout button on Summary page
    Then Click on Proceed to Checkout button on Address page
    Then Click on Checkbox on Shipping page
    Then Click on Proceed to Checkout button on Shipping page
    Then Click on any payment method button on Payment page
    Then Click on Confirm button on Payment page
    Then Check the success order message is "Your order on My Store is complete."
    Then Check the success order from Order History And Details Page




