Feature: Reset functionality on login page of Application 

Scenario Outline: Verification of Reset button 
Given Open the Firefox and launch the application			
When Enter the "<username>" and "<password>"			
Then Reset the credential

Examples:

|username|password|
|user1|password1|
|user2|password2|
|user3|password3|