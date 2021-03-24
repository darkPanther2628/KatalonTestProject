Feature: Login Feature

Scenario Outline: Title of your scenario outline
 	Given User is at login page <url>
	When User enters <username> and <password>
	And Click on 'Submit' button
	Then Home page should be displayed

    Examples: 
      | url  | username | password  |
      | https://www.amazon.in/ |lalithapadalalk@gmail.com | Amazon@123450 |