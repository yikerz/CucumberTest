Feature: Final Bill Calculation

  @ScenarioOutlineExample
  Scenario Outline: Customer Bill Amount Calculation
    Given I have a Customer
    And User enters initial bill amount as <InitialBillAmount>
    And Sales Tax Rate is <TaxRate> Percent
    Then Final bill amount calculated is <TotalBillAmount>

    Examples: 
      | InitialBillAmount | TaxRate | TotalBillAmount |
      |               100 |      10 |             110 |
      |               200 |       8 |             216 |
      |               100 |    1.55 |          101.55 |
