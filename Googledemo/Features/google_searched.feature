Feature: Search Functionality
Scenario Outline: To test the Search Functionality of google page
Given I am on the Search button
When I type "<searchText>" in Search button
And I click on the Search button
Then should get results for "<searchText>"
Examples:
|searchText|
|India |
|Pakistan |
|Srilanka |

 
 
 

 