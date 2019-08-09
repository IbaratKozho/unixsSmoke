@AttendeesModification
Feature: Attendees modification verification

  Scenario: Attendees modification verification
    When User clicks on checkbox at attendee list
    Then User clicks on dropdown menu
    And Selects first element
    Then User deletes second element from Attendees
    Then One attendee should disappear from the list