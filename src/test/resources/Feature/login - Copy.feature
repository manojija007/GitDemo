Feature: Validation of login page in facebook web application - I haved added the text - also copy files


@smoketest
Scenario: TC_01 Validation of login page with invalid credentials
Given User launch the facebook application
When User enters the invalid username and invalid password
And User clicks the login Button
Then User Verify the error message is displayed or not

@sanitytest
Scenario: TC_02 Validation of Create new Account Block
Given User launch the facebook application
When User maximize the browser
And User clicks the Create new account Button
Then User Verfity the create new account text displayed or not

@smoketest
Scenario Outline:	TC_03 Validation of login page with multiple invalid credentials
Given User launch the facebook application
When User enters the invalid "<username>" and invalid "<password>"
And User clicks the login Button
Then User Verify the error message is displayed or not - for practice demo

Examples:
|username|password|
|greens@123|hellowgreens|
|abc@123|hellowabc|
|hellowji@123|hellowji|
|zyc@123|HellowZyc|
