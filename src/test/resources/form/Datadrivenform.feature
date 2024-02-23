#Sample Feature Definition Template
@tag
Feature: Datadriven testing for form 

  @tag2
  Scenario Outline: Title of your scenario outline
    Given User opens the browser and navigate to training from website 
    When User enter "<firstname>", "<lastname>", "<Email>" 
    And User is entering "<ContactNumber>", "<Messages>"
    And User clicks on submit 
    Then Aconfirmation popup is displayed 

    Examples: 
      | firstname  | lastname | Email          |  ContactNumber  |   Message  |
      | ABHI       | BOHRA    | 123@gmail.com  | 9874563210      |    Hello   |
      | ABHI       | DUTT     | 321@gmail.com  | 9874563201      |    Hello1  |
      | TEST1      | SELENIUM | 654@gmail.com  | 9874563210      |   Hello2   |
      | TEST2      | SELENIUM | 852@gmail.com  | 8974563210      |   Hello3   |
      | AKKI       | SHARMA   | 000@gmail.com  | 9874563214      |   Hello4   |
      | @31        | 0000     | 115#gmail.com  | 98745asda@      |   5245     |
      
      
      
      
      
      
      
