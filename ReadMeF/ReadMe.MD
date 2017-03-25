--------------------New Project Steps-----------------
# Create java project
# Convert that project into maven project 
# Configure pom.xml file
# Rght click on the POM.XML file and run as maven clean | Maven Install | Maven Test
# Create a package for TestCases
# Create a test case class
# Create a folder for Library i.e. browserServer
# Add the browserServer into your porject
# Working on your test case
# Set up browserServer as a global 
# Write the test case steps 

----------------------------Internet explorer config--------------------------------------
Go to internet options>>Security, click on:'Reset all zones to default level and after that, ensure that 
the 'Enable protected mode' checkbox is ticked for all the four zones.

DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,org.openqa.selenium.UnexpectedAlertBehaviour.IGNORE);

String basePath = System.getProperty("user.dir");
String iePath = basePath + "\\lib\\IEDriverServer.exe";
System.setProperty("webdriver.ie.driver", iePath);
driver = new InternetExplorerDriver();
System.out.println("IE Browser executing");

OR
File file = new File("C:/Selenium/iexploredriver.exe");
System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
WebDriver driver = new InternetExplorerDriver();


-----------------------------------------------