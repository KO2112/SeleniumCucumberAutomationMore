Feature: Wikipedia search functionallity and verification

  @WSF-45234

  Scenario: Wikipedia Search functioanllity and verification
    Given User is on wikipedia home page
    When User types "Steve Jobs" home page
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title