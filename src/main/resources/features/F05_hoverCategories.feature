@smoke
Feature: F05_hoverCategories | user clicks on random subcategory
  Scenario: user clicks on computers category
    Given user hoovers on random category
    And click on subcategory
    Then Subcategory page open successfully and with same selectedsubcategory title