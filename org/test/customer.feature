#Author: your.email@your.domain.com
Feature: To Test add customer functionality
  @tag2
  Scenario Outline: Adding Customers
    Given The user in Guru login page
    And The user login in as manager using username and password
        |mngr154050|zamynEs|
    And The user navigates to add customer page   
    When The user enters customer details  "<custname>","<gender>","<dob>","<address>","<city>","<state>","<pin>","<mobile>","<email>","<password>" 
    And The user clicks reset button
    Then the user should be in add new customer page
    Examples: 
      | custname| gender | dob | address | city | state | pin | mobile | email | password |
      | usera |f| 12/12/1986 |palavakkam|chennai|TN| 600041| 9884524231|joy1@gmail.com|Hello12|
      | userb |f | 12/12/1984| Minjur| mumbai| Maharastra|400045|8838507728|victor@gmail.com|hai123|
