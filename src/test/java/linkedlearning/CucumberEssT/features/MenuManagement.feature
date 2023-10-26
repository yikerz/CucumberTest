Feature: Menu Management

  Background: Setup a menu item
    Given I have a menu item with name "Bread" and price 10
    When I add the item into the menu
    Then The menu should include the item "Bread"
    
  @SmokeTest
  Scenario: Add menu item
    Given I have a menu item with name "Steak" and price $20
    When I add the item into the menu
    Then The menu should include the item "Steak"

  @RegularTest
  Scenario: Add another menu item
    Given I have a menu item with name "Salad" and price 15
    When I add the item into the menu
    Then The menu should include the item "Salad"

  @NightlyBuildTest @RegularTest
  Scenario: Add third menu item
    Given I have a menu item with name "Bread" and price 10
    When I add the item into the menu
    Then I should see an error message with value "Duplicate Item"
