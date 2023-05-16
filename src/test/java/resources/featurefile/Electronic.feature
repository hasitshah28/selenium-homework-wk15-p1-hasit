Feature: Electronic Test

  As a user i should navigate to cellphone page and products are added and place order successfully

  @sanity @regression
  Scenario:User should navigate to Cell Phone page successfully
    Given I am on homepage
    When I mouse hover to Electronics Tab
    And I mouse hover and click on Cell Phones tab
    Then I should navigate to Cell Phone page

  @smoke @regression
  Scenario:User should add product to Cart and Place the Order Successfully
    Given I am on homepage
    When I mouse hover to Electronics Tab
    And I mouse hover and click on Cell Phones tab
    Then I should navigate to Cell Phone page
    And I click on List view tab
    And I click on Nokia Lumia 1020
    Then I should see Nokia Lumia 1020
    And I should see price $349.00
    And I change the Qty to 2
    And I click on Add to Cart
    Then I should see The product is added to your shopping cart
    And I click cross
    And I mouse hover on Shopping cart and click on Go to Cart
    Then I should see text Shopping cart
    And I should see Qty is 2
    And I should see price is $698.00
    And I click on check box of terms and service
    And I click on Checkout
    Then I should see Welcome Please Sign In!
    And I click on Login Tab
    And I fill on all mandatory details
    And I click on continue
    And I click on radio button “Next Day Air($0.00)”
    And I click again on continue
    And I click on radio button "Credit Card" and click on continue
    And I select "Master card" from credit card dropdown
    And I fill in all details
    And I click on continue again
    Then I should see payment method is "Credit card"
    And I should see shipping method is "Next Day Air"
    And i should see total is “$2,950.00”
    And I click on confirm
    Then I should see the Thank you message
    And I should see message your order has been successfully processed
    And I click on continue4
    Then I should see the text Welcome to our store
