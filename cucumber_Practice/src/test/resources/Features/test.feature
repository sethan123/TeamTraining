
Feature: Reset functionality on login page of application

Scenario Outline: Verification of reset button
    Given Open the chrome and launch the application
    When Enter the below credits username "<username>"  and password "<password>"
   
    Then Reset the credential 
    
    
    Examples: 
     |username  |password |	
		|chethan   |password1|	
		|User2     |password2|	
		|User3     |password3| 
    
    