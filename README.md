# com.qa.testautomation.ebay.new
empty java selenium cucumber test setup

1. Write automated tests for the given scenario using the project setup provided.
2. provide the solution as a .jar or .zip which we can import and run the tests. They shall run as a JUnit test

Scenario 1:
Given I am a non-registered customer
And I navigate to www.ebay.co.uk
When I search for an item
Then I get a list of matching results 
And the resulting items cards have: postage price, No of bids, price or show BuyItNow tag
And I can sort the item by Best Match, Lowest Price + P&P, Highest Price, Newly listed, etc
And I can filter the results by All Items, Auction, By it now
