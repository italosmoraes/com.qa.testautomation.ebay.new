# com.qa.testautomation.ebay.new
This is an empty Java+Selenium+Cucumber maven project

1. You should have Java JDK 8 installed
2. Extract the given maven project from the provided .zip file
3. Load the maven project in your preferred IDE
4. From the shell/command-line 
    1. Navigate to the project folder
    2. Run “mvn test”
    3. You should get a build success result
5. Write automated tests for the given scenario using the project setup provided. (Include any Classes and packages/folders to suit your designed solution)
6. To run your tests, from the shell/command-line use command:
    1. mvn -Dtest=TestRunner -Dcucumber.options="--tags @Scenario001" test
    2. Your tests should begin to run
    3. Results are shown and the build is successful
7. Provide the solution as a .zip file that can be extracted and ran the same way you have done locally.

Note: We are providing WebDrivers for Chrome and Firefox. You can use either, just beware that Firefox driver currently only runs on top of Firefox version 47.

### Scenario 1:
```
Given I am a non-registered customer
And I navigate to www.ebay.co.uk
When I search for an item
Then I get a list of matching results 
And the resulting items cards have: postage price, No of bids, price or show BuyItNow tag
And I can sort the item by Best Match, Lowest Price + P&P, Highest Price, Newly listed, etc
And I can filter the results by All Items, Auction, By it now
```
