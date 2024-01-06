Feature: Form Submission

  Scenario: Form Submission
    Given User in home page
    When User click on "SignUp Form"
    Then User navigate to Registration Page
    And User fill the details and submit the form
    
    Scenario: drop and drop
    Given User navigate to home page
    When User click on "DragnDrop"
    Then User Drag and drop the element
