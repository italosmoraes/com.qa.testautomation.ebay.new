# com.qa.testautomation.ebay.new
This is an empty Java+Selenium+Cucumber maven project

1. You should have Java JDK 8 installed
2. Extract the given maven project from the provided .zip file
3. From the shell/command-line 
    1. Navigate to the unziped folder
    2. Run “mvn test”
    3. You should get a build success result, showing undefined 
4. Import the maven project in your preferred IDE. Make sure the project is loaded correct and there are no import errors.
5. Write automated tests for the given scenario using the project setup provided. (Include any Classes and packages/folders to suit your designed solution)
6. To run your tests, from the shell/command-line use command:
    1. mvn -Dtest=TestRunner -Dcucumber.options="--tags @Scenario001" test (or run it as JUnit in your IDE)
    2. Your tests should begin to run
    3. Results are shown and the build is successful
7. Provide the solution as a .zip file that can be extracted and ran the same way you have done locally.

Notes: 
- We are providing WebDrivers for Chrome and Firefox. You can use either, just beware that Firefox driver currently only runs on top of Firefox version 47.
- The WebDrivers are found in the 'resources' folder so you can reference from your project.

```
Scenario 1:
Given I am a non-registered customer 
And I navigate to www.ebay.co.uk
When I search for an item
Then I get a list of matching results 
And the resulting items cards have: postage price, No of bids, price or show BuyItNow tag
Then I can sort the results by Lowest Price
And the results are listed in the page in the correct order
Then I can sort the results by Highest Price
And the results are listed in the page in the correct order
Then I can filter the results by ‘Buy it now’
And all the results shown in the page have the ’Buy it now’ tag 

Scenario 2:
Given I am a non-registered customer 
And I navigate to www.ebay.co.uk
When I enter a search term and select a specific Category
Then I get a list of matching results
And I can verify that the results shown belong to the selected category

Scenario 3:
Given I am a non-registered customer 
And I navigate to www.ebay.co.uk
When I search for an item
Then I get a list of matching results 
And the results show more than one page
Then the user can navigate through the pages to continue looking at the items
```
