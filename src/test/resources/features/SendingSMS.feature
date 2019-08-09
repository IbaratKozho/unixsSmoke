@SendingSMS
Feature: Sending SMS to Attendees about event

  Scenario: Sending SMS to attendees verification
    Given User is on the homepage
    When User fills out Recipients and Message fields
    And User click on send button
    Then User should see successful confirmation message