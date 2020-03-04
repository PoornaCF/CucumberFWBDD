Feature: Verify employees
  As a user of an employer app
  I want to be able to search employees
  So that I can get information

  @searchemployee
  Scenario: Verify employee name
    Given I look for employee id 2
    Then I can verify the employee city is Wisokyburgh
