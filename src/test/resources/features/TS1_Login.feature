@All
Feature: Login

  @Positive
  Scenario: TC1 - Ensure user successfully Login with valid and registered credential

    Given user is on welcome page
    When user click Masuk button
    And user input registered Nomor HP or Nomor Member
    And user input registered Password
    And user click Lanjut button
    Then user is on Home page
    And user see Alfagift menu

  @Negative
  Scenario: TC4 - Ensure user failed Login with unregistered phone or member number

    Given user is on welcome page
    When user click Masuk button
    And user input unregistered Nomor HP or Nomor Member
    And user input unregistered Password
    And user click Lanjut button
    Then user see number unregistered modal

  @Negative
  Scenario: TC5 - Ensure user failed Login with registered phone or member number but wrong password

    Given user is on welcome page
    When user click Masuk button
    And user input registered Nomor HP or Nomor Member
    And user input unregistered Password
    And user click Lanjut button
    Then user see wrong password error message

  @Negative
  Scenario: TC6 - Ensure user failed Login with null phone or member number

    Given user is on welcome page
    When user click Masuk button
    And user input registered Password
    And user click Lanjut button
    Then user see number cant empty error message

  @Negative
  Scenario: TC7 - Ensure user failed Login with null password

    Given user is on welcome page
    When user click Masuk button
    And user input registered Nomor HP or Nomor Member
    And user click Lanjut button
    Then user see password cant empty error message

  @Negative
  Scenario: TC8 - Ensure user failed login with invalid phone or member number format

    Given user is on welcome page
    When user click Masuk button
    And user input invalid Nomor HP or Nomor Member format
    And user input registered Password
    And user click Lanjut button
    Then user see invalid phone or member number format error message

  @Negative
  Scenario: TC9 - Ensure user failed login with valid phone number format but less than 10 digit

    Given user is on welcome page
    When user click Masuk button
    And user input valid Nomor HP format but less than 10 digit
    And user input registered Password
    And user click Lanjut button
    Then user see phone number must between 10 until 16 char error message

  @Negative
  Scenario: TC10 - Ensure user failed fill number field with valid phone or member number format but more than 16 digit

    Given user is on welcome page
    When user click Masuk button
    And user input valid Nomor HP format but more than 16 digit
    Then user see number field just inputted with 16 chars

  @Negative
  Scenario: TC11 - Ensure user failed login with password less than 8 character

    Given user is on welcome page
    When user click Masuk button
    And user input registered Nomor HP or Nomor Member
    And user input password less than 8 char
    And user click Lanjut button
    Then user see password minimum 8 char error message

  @Negative
  Scenario: TC12 - Ensure user failed login when fill phone or member number with element except number

    Given user is on welcome page
    When user click Masuk button
    And user try input phone number with contains char except number
    And user click Lanjut button
    Then user see invalid phone or member number format error message

  @Negative
  Scenario: TC13 - Ensure user failed fill number field when scan any object other than valid barcode

    Given user is on welcome page
    When user click Masuk button
    And user click barcode icon
    And user scan any object other than a barcode
    Then user failed fill number field and cant move from scan barcodepage