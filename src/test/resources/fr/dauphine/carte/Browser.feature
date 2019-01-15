Feature: Browser

  Scenario: sell 1 item
    Given I have 1 item in my wallet
    When I give the item 1 to the other browser
    Then I ll have 0 in my wallet


  Scenario: buy 1 item
    Given I have 0 item in my wallet before buy
    When I buy the 1 item  from the other browser
    Then I ll have 1 in my wallet after buy


