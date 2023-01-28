Feature: Login

  Scenario: TC1 - Ensure user successfully Login with valid and registered credential

    Given user is on welcome page
    When user click Masuk button
    And user input registered Nomor HP or Nomor Member
    And user input registered Password
    And user click Lanjut button
    Then user is on Home page
    And user see Alfagift menu

  Scenario: TC3 - Ensure user failed Login with unregistered phone or member number

    Given user is on welcome page
    When user click Masuk button
    And user input unregistered Nomor HP or Nomor Member
    And user input unregistered Password
    And user click Lanjut button
    Then user see number unregistered modal

  Scenario: TC5 - Ensure user failed Login with registered phone or member number but wrong password

    Given user is on welcome page
    When user click Masuk button
    And user input registered Nomor HP or Nomor Member
    And user input unregistered Password
    And user click Lanjut button
    Then user see wrong password error message

  Scenario: TC6 - Ensure user failed Login with null phone or member number

    Given user is on welcome page
    When user click Masuk button
    And user input registered Password
    And user click Lanjut button
    Then user see number cant empty error message

  Scenario: TC7 - Ensure user failed Login with null password

    Given user is on welcome page
    When user click Masuk button
    And user input registered Nomor HP or Nomor Member
    And user click Lanjut button
    Then user see password cant empty error message