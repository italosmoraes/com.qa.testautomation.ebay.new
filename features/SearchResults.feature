Feature: Search Results. Where one can sort, filter and see details of resulting products.

@Scenario001
Scenario: Search Results. Where one can sort, filter and see details of resulting products. 
Given I am a non-registered customer 
And I navigate to www.ebay.co.uk
When I search for an item
Then I get a list of matching results 
And the resulting items cards have: postage price, No of bids, price or show BuyItNow tag
And I can sort the item by Best Match, Lowest Price + P&P, Highest Price, Newly listed, etc
And I can filter the results by All Items, Auction, By it now

