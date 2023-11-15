Feature: To check search functionality of That Shopping List application

  Scenario: Search a product and add to cart
    Given I open the That Shopping List apllication
    And Search for Tomato in the searchbox
    And I added it to the cart
    When I eneter the amount of tomatoes to be bought
    Then I should be able to close the application
