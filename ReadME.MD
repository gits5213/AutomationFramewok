# 
# Search all method inside the class by ctrl + o
*************Instruction of the Project from the scratch to Architecture Level*****************

# Create a Java Project 

# Convert the Project to Maven Project
	- download maven into local machine (https://maven.apache.org/download.cgi)
	- Set up environment for maven
	-Validation 
		- CMD>mvn -version (appear version number)

# Add dependencies into POM.XML File
	<build>
	<plugins>
	<plugin>
	<configuration>
	<dependencies>
	<dependency>

# Create a TestNG.XML suite for all test cases
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">

<suite name = "google" verbose="1">
	<test name = "googleTest">
		<classes>
			<class name ="TestCases.GmailCreate">
				<methods>
				 <include name="logInCreate" />
				</methods>
			</class>
		</classes>
	</test>

</suite>

# Create a simple Test Case under the src folder
	- GmailRegistrationTest (straight forward test case which is can be executed from the test case level)
	- Validate
		- Execute properly
			- Break down this Test Case into multipule packages (use TestNG framework concept and POM concept)

# Create Package for TestCases

 	- Create a base class (BaseTest) for TestNG Framework
 		- @@Parameters("browser")
		- @BeforeClass (Browser configuration globally)
		- @BeforeMethod (Navigate to the URL)
		- @AfterMethod
		- @AfterClass (Close the browser)
		- Creare Customize Thread.sleep

	- Create Test Class For TestCase
		- @Test
		
# Create Package for PageObjectModel (POM Pages)
	- Create a BasePage (abstract class) for initalization of webelement
	
	- Create a Pom Pages Class corresponding to the eatch web pages

# Create Package Global for String enam & Int enam also data Provider class 
		- Create Data Provider Class for accessing the data into test class
			- @DataProvider(name="LogInTest")


# Add TestNG Listner Class into the project for Fail Test case to execute  




# TestNG Parameterization with Excel
	- add poi api library file
	- add Excell reading file (ExcelReader which is I created into project 
	- Create a Test Class 
		- @DataProvider
			- Create a method 
				- Create a object of the ExcelReader class file
				- Add the excel sheet into the project
					- Name it testngdata
					- Sheet name loginTest
				- Create a variable of the row Count
				- Create a variable of the column count
				







 
# Generating Custom Report (relevantcodes.com)
	http://extentreports.com/docs/versions/3/java/
	https://mvnrepository.com/artifact/com.aventstack/extentreports/3.0.3
	add the dependencis into POM file


# Create connection to DataBase (MySQL)
	add jar file (mysql-connector-java)
	sqljdbc4
	
	Add test class file 
		DbManager.java
		TestCofig.java
	
	Create a test class and call the DbManager class into it
	