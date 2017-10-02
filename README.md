# com.qa.testautomation.ebay.new
This is an empty Java+Selenium+Cucumber maven project

1. Download this repository to get the maven project containing all dependencies needed.
2. Write automated tests for the given scenario using the project setup provided. (Include any Classes and packages/folders to suit your designed solution)
3. Provide the solution as a .zip which we can import and run the tests. They shall run as a JUnit test
4. Provide an answer to the 5 questions below

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
### Questions
```
1. What did you think of the provided acceptance criteria?
2. If this were a real story from a real life Product Owner - what questions would you ask?
3. Why did you choose to structure your code in the way you did?
4. If you had more time what improvements would you make to your code?
5. What is your usual approach to testing on a project?
```
