Feature: Payment functionality

Background: User successfully clicked on initial login page
When user provide "webdriver.chrome.driver" and exe location as "F:\\Automation Support\\chromedriver.exe"
When user provide url as "https://www.flipkart.com/"
When user cancel initial login page
When user navigate on Login
When user click on My Profile
When user enter as "mohinispujari@gmail.com" as username
When user enter as "mohini123"as password
When user click on Login button


@SmokeTest
Scenario: Payment with valid dada
When user click on My Profile
When user enter as "mohinispujari@gmail.com" as username
When user enter as "mohini123"as password
When user click on Login button





	