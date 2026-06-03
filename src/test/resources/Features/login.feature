Feature: Login Feature

  Scenario Outline: Successful Login

    Given user launches browser
    And user opens login page
    When user enters "<username>" and "<password>"
    And clicks login button
    Then user should see dashboard "<result>"

    Examples:
      | username | password | result  |
      | admin    | admin123 | success |
      | user     | user123  | failed  |