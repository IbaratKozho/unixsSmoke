@DeletingEvent
Feature: Deleting an event in the calendar

  Scenario: Event deletion verification
    Given User is on the homepage
    When  User creates an event for 31 st of July
    And  User clicks on delete button
    Then Event is deleted