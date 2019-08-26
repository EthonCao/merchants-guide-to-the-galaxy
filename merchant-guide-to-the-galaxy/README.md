### Homework: Merchant_Guide_Galaxy

####### How to Run the Program ####### 
Run by IDE: 
1, Import projec to IDE
2, If the JRE System Library is jdk_1.5 so need upgrade to 1.7 or above
	eg for Eclipse: 
	Right click project name -> properties -> Java Compiler -> JDK Compliance -> Compiler compliance level -> 1.8
3, Open: /merchants-guide-to-the-galaxy/src/main/java/com/cao/interview/merchantsguide2galaxy/app/MainApp.java 
   Run the MainApp.java then will get the result.

Run by jar file:
1, Use below maven command to build the project:
	*	mvn clean install
2, Use below command to execute/start the application:
   *	java -jar ConferenceTrackManagement-0.0.1.jar 
   
Test input:
glob is I
prok is V
pish is X
tegj is L
glob glob Silver is 34 Credits
glob prok Gold is 57800 Credits
pish pish Iron is 3910 Credits
how much is pish tegj glob glob ?
how many Credits is glob prok Silver ?
how many Credits is glob prok Gold ?
how many Credits is glob prok Iron ?
how much wood could a woodchuck chuck if a woodchuck could chuck wood ?

Test Output:
pish tegj glob glob is 42
glob prok Silver is 68 Credits
glob prok Gold is 57800 Credits
glob prok Iron is 782 Credits
I have no idea what you are talking about

####### Design #################

#### Main Class: MainApp
		There is a main() function to represent the schedule as a string.

#### Service Interface (Service layer):
	
	1) AbstractDataConverter
		This interface is to mainly to convert Galaxy values to Roman and convert Roman to Arabic.

#### Value Object (vo layer)	
    Structure: Test input file -> String -> double -> String
	
#### Utility(common function)
	1) Dictionary 
		Used to maintains the assigned values in the Assigned value map and the Roman value in the Roman Numerials
	2) StringUtils
		Validate String related logic

#### Resource
	SampleInput.txt

#### Testing(total test case: 2)
	1) AbstractDataConverterTest
	2) ParserManagerTest
	
	Testing Data
	TestData.txt