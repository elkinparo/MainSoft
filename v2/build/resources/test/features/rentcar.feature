# elkin.palacios.qa@gmail.com


Feature: as a quality analyst
  I want to test the login flow to the page
  to confirm its correct operation

  @rentacarCheap
  Scenario: rent a car in the florida city
    Given  actor enters the page
    When to send information for the "cheap" car
    Then I see the make of the car "Kia Soul"

  @rentacarExpensive
  Scenario: rent a car in the florida city
    Given  actor enters the page
    When to send information for the "expensive" car
    Then I see the make of the car "Toyota Corolla"