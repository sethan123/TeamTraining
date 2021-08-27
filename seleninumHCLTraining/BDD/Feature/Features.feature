Feature: test KSRTC application
Scenario: test the sign in page with valid users
Given Open Chrome browser and url of the application
When Enter username and password and click Submit button
And Successfully sign in
And Select two cities
And Select two dates
And Select the Checkbox
Then Click on search button