@smoke
Feature: F07_followUs | users could add product to wishlist
  Background:user click on wishlist product
    Given  if you click on wishlist button ❤️ on HTC product
  Scenario: user add product to wishlist

    Then user will see  success message "The product has been added to your wishlist" with green background color

    Scenario: User check the product in wishlist
      When wait to success message to disapear
      And go to wishlist page
      Then Check the quantity of product bigger than 0
