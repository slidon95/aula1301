Feature: Calculator test
	
	@teste1
  Scenario: add two numbers
    Given I have a calculator
    When I add 6 and 3
    Then the result should be 9
  
  @teste2 
  Scenario: add two numbers
    Given I have a calculator
    When I add 2 and 3
    Then the result should be 5
    
  @TestDivision
  Scenario: Divide two numbers
    Given I have a calculator
    When I divide 2 and 2
    Then the result should be 1
    
  @TestDivision
  Scenario: Divide by zero
    Given I have a calculator
    When I divide 2 and 0
    Then Console must throw exeption "Cannot divide by zero"

  @teste3
  Scenario: Sub two numbers
    Given I have a calculator
    When I sub 6 and 3
    Then the result should be 3
  
  @teste4 
  Scenario: Sub two numbers
    Given I have a calculator
    When I sub 3 and 2
    Then the result should be 5
	
