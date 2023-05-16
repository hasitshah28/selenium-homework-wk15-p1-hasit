Feature: Computer Page

  @sanity @regression
  Scenario: User should verify Product are arranged in Alphabetical order
    Given I am on homepage
    When I click on Computer tab
    And I click on desktop tab
    And I select sort by position Name: Z to A
    Then I should verify product will arrange in descending order

  @smoke @regression
  Scenario: User should add product to shopping cart successfully
    Given I am on homepage
    When I click on Computer tab
    And I click on desktop tab
    And I select sort by position Name: A to Z
    And I click on Add to Cart button
    Then I should see build your computer
    And I select processor 2.2 GHz Intel Pentium Dual-Core E2200
    And I select ram 8GB [+$60.00]
    And I select HDD radio "400 GB [+$100.00]
    And I select OS radio "Vista Premium [+$60.00]
    And I check two Check boxes Microsoft Office [+$50.00] and Total Commander [+$5.00]
    And I verify the price $1,475.00
    And I click on add To Cart
    Then I should see "The product has been added to your shopping cart" on Top green Bar
    And I click on close button
    And I mouseHover on Shopping cart and Click on GO TO CART button.
    Then I should see Shopping cart
    And I cahnge the quantity of product and udpate shopping cart
    Then I should see price Total"$2,950.00"
    And I click on check box of terms and condition
    And I click on checkout button
    Then I should see welcom message
    And I click on checkoutguest tab
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

