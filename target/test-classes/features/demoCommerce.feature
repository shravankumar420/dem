Feature: Loginto demo commerce

@Demo
Scenario: validate Login
Given user enter "admin@yourstore.com" text into "Email"
When user enter "admin" text into "Password"
When user click on "Log in"
And user click on "Catalog"
And user click on "Products"
Then assert "Products" is displayed in header
When user enter "Build your own computer" text into "SearchProductName"
And user click on "Product type" dropdown
And user click on "Simple"
And user click on "search-products" button
Then assert "Build your own computer" is displayed in section Learn more about "products"
When user enter "Samsung Series 9 NP900X4C Premium Ultrabook" text into "SearchProductName"
And user click on "search-products" button
#Then assert "Samsung Series 9 NP900X4C Premium Ultrabook" is displayed in section Learn more about "products"
And user click on "Categories"
Then assert "Categories" is displayed in header
When user enter "Apparel" text into "SearchCategoryName"
And user click on "Published" dropdown
And user click on "Published only"
And user click on "search-categories" button
Then assert "Apparel" is displayed in section Learn more about "categories"
And user click on "Manufacturers"
Then assert "Manufacturers" is displayed in header