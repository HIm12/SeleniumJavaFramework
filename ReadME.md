##Flipkart Java Selenium Exit Test Assignment.

##Tools Used:-
•	Selenium
•	Java
•	TestNG
•	Maven

##Config.properties & Excel sheet is using for taking input.

##Info and Steps to Run the Project:-

Clone repo from the github link :- **https://github.com/Him12/SeleniumJavaFramework**

## Important Note

- To change browser - change the browser in "SeleniumJavaFramework\ExitTest\src\test\java\config\config.properties"

## Mode options:-
Headless
Non- Headless

## Driver Options:-  
Chrome
Edge
Firefox

##For Reporting below option available.
Extent Report with Fail case screenshot in report.
Logger Report

##Test Can also be run on maven command line
command:- mvn clean test

## How to run through jenkins

- download jenkins.war file
- run in cmd 

```
java -jar jenkins.war --httpPort=8080

Note
•After running the project screenshots of failed tests are automatically saved in the project folder itself and also visible in extent report.
•A better experience of checking the testcases is to open ExtentReports >> ExtentReportResults.html
•Git and Jenkins also integrated screenshot available in word file for each steps.

## Implemented features

1.	Use the site: - https://www.flipkart.com/ to automate. **Done**
2.	Create at least 20 automated Test Case across different flows and screens. **Done**
3.	Implement POM (Page factory) **Done**
4.	Test data should be read from excel. User has the ability to selective run the test cases by marking yes in the "Execution Required" field in excel. **Done**
5.	Use config files for Global Parameters usage. **Done**
6.	Use proper waits i.e., implicit wait and explicit wait wherever necessary.**Done**
7.	The test should run on following browsers IE, Chrome, FF.**Done**
8.	There should be an option to run the test cases in headless mode.**Done**
9.	Use Grouping, Priority, and enable/disable when creating the TestNG Test Cases. **Done**
10.	Assertions should be used properly throughout the suite.**Done**
11.	Put proper assertions and error screenshot in the extent report.**Done**
12.	Create reusable libraries and import these as jars in the current project.
13.	Create a ReadMe document which has the steps to install and run the code.**Done**
14.	Integrate your test suite with Jenkins and GitHub for CI/CD part.**Done**
15.	Test Suite should be executable from command line using maven.**Done**
16.	Use Logger to implement logging in your test cases.**Done**

Please share us a word file in which you are required to paste the screenshots of integration from committing the code into git till the execution of builds in Jenkins.  **Done**


