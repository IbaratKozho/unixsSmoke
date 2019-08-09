@EditingEvent
Feature: Editing an event in the calendar

  Scenario: Event edition verification.
    Given User is on the homepage
    When User creates an event for tomorrow
    And User edits this event with Start date later than End date
    Then System is displaying error message
    And We delete the event