
@SalesForceAppFeature
Feature: As a user 
I want to register and want to view the products and services 

#Background:
 #Given user is in base page http://store.demoqa.com/
 #And he click on login button in base page

@Registration
Scenario Outline: User registration
 Given user is in base page http://store.demoqa.com/
 And he click on login button in base page
 When he choose register option to register in login page
 And he enters user name as <username>
 And he enters email as <email> 
 And click on register button 
 Then he closes the driver
 Then Message displayed registered Successfully
 
 #And he enters first name as <firstname>
 #And he enters last name as <lastname>
 #And he enters job title as <jobtitle>
 #And he enters email as <email>
 #And he enters phone no as <phone>
 #And he enters company as <company>
 #And he enters employees count as <employees>
 #And he enters country as <country>
 #And he enters language as <language>
 #And he click on I agree check box
 #And click on start free trail button 
 
 
	#When he fill the registration details and click on register
  #Then he should register successfully and should see logout button

#Examples:
# | firstname  | lastname | jobtitle | email  | phone | company | employees | country  | language |
# | Jyothi | M | Personal Interest | marreddyjyothi39@gmail.com |7756958059 | Intel | 1001 + employees | India | English | 
  
Examples:
 | username | email  |
 | shivi | shividhanda92@gmail.com |
 | piya | piya@gmail.com |