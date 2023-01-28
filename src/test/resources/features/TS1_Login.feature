Feature: Login

  Scenario: TC1 - Ensure user successfully Login with valid and registered credential

    Given user is on welcome page
    When user click Masuk button
    And user input registered Nomor HP or Nomor Member
    And user input registered Password
    And user click Lanjut button
    Then user is on Home page
    And user see Alfagift menu