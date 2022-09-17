Feature: Buy Product
  Scenario: User want to add product to cart
    Given user open elevania on browser
    And user redirect to home page
    When user search product by keyword "Komputer"
    And user sort product by Produk Terlaris
    And user click first of list product
    And user redirect to product detail page
    And user fill quantity is "3"
    And user add product to cart
    And user redirect to cart page
    Then user will view quantity is "3" on cart page
    And user want to change courier
    And user delete cart
    And product will deleted
    And user close browser
