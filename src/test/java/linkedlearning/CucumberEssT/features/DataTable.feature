Feature: Data Table

  @ListOfListOfStrings
  Scenario: Bill Amount Generation
    Given I placed an order for the following items as list
      | Steak | 2 | 20 |
      | Salad | 1 | 15 |
    When I generate the bill
    Then A bill for $40 should be generated

  @ListOfMap
  Scenario: Bill Amount Generation
    Given I placed an order for the following items as map
      | ItemName | Units | UnitPrice |
      | Steak    |     2 |        20 |
      | Salad    |     1 |        15 |
    When I generate the bill
    Then A bill for $40 should be generated
