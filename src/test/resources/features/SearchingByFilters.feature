@SearchingByFilters
Feature: Searching by Filters

  Scenario: Searching by Filters Verification
    Given User is on the homepage
    When User is on selected date
    And User filtering the events by My events
    Then User should see his username in field with attendees for this event