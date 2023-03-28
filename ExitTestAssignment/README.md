
#API Demos Automation Suite Information:-

##Testng File Description:
- testng.xml - define all parameters and tests.

##Packages Description:
* main: define all actions, dependencies and methods.
* Screens: define all screens needed for tests.
* Features: define all scenario and features description to be tested.
* Runner: define all runner class.
* StepdDefinition: define all step definitions which are related to feature files.

### main/java/main descriptions:
* BaseClass: This class defines all the dependencies.

### main/java/screens descriptions:
* Accessibility.java: It contains xpath accessibility services.
* Animation.java: It contains xpath and  animation default layout.
* App.java: It contains xpath, id and methods for Receive Result.
* AppFragment.java: It contains xpath id and methods for animate drawables.
* Text.java: It contains xpath and methods for log text box.


## main/recources:
* log4j2.properties: defines log4j2 properties.

## test/java/features descriptions:
* AccessibilityOption.feature: It is feature file containing scenarios for accessibility services.
* AnimationOption.feature: It is feature file containing scenario for default cloning.
* App.feature: It is feature file containing scenario for Action bar.
* AppFragment: It is feature file containing scenario for Receive Result.
* TextOption.feature: It is feature file containing scenario for log text box.


## hooks descriptions:
 This class defines @After, @Before.

## test/java/runner descriptions:
* TestRunner: This class defines and cucumber option like feature, glue, tags, etc.

## test/java/stepdef descriptions:
* AccessibilityStep: It defines Given,When, and Then for accessibility services.
* AnimationStep: It defines Given,When, and Then for default cloning.
* AppStep: It defines Given,When, and Then for Action Bar
* AppFragmentStep: It defines Given,When, and Then for Receive Result. 
* TextStep: It defines Given,When, and Then for log text box.


##test/resources:
* extent.properties: defines spark extent properties for spark report generation.
* extent-config.xml: defines extent properties for report generation.

##Reports:
* ExtentReport will be generated after run.
* TestNG report is generated as "Spark.html".

##Running through Bat file
* cmd.bat

