@smoke
Feature: F04_Search | user search on products

  Scenario Outline: user could search using product name
    When user search on  "<product name>"
    Then Verify URL
    And  verify each result contains the search words

    Examples:
      | product name |
      | book |
      | laptop |
      | nike |

  Scenario Outline: user could search using SKU
    Given user search with "<SKU>"
    When user clicks open the product
    And  verify result contains the search words

    Examples:
      | SKU|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|

