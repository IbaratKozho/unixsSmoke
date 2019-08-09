@CreatingEvent
Feature: Creating an event in the calendar

  Scenario: Event creation verification.
    Given User is on the homepage
    When  User opens list option
    And   User creates event with all information in it
    Then  Event is created