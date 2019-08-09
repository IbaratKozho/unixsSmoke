@SearchingByGroups
Feature: Searching by Groups

  Scenario: Searching by Groups Verification
    Given User is on the homepage
    When User clicks on Group By button
    And User clicks on Responsible option
    And User selects Add custom Group option
    Then User sees By Day in the list