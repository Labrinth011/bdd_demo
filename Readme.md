### Project Setup

* Create an empty gradle project with following dependencies
  1. spock-core
  2. cucumber-java 
  3. cucumber-junit


* Use Gradle as the build automation tool

### Add the feature file

* Usually tests are written by looking at the specification
* But with BBD, specification is the test itself
* Plain text file with .feature extension - describes a product feature
* Written in Gherkin
* May contain one or more scenarios
* Create fizzbuzz.feature file in src/test/resources/features

### Configure Runner

* Acts as the Entry point - When integrated to the build pipeline
* To run tests with JUnit, a special runner class is needed
* Very basic form of the file is an empty class with @RunWith annotation
* Groovy is used to write in our case
* Specify feature path using @CucumberOptions

### Add step definitions

* Once feature path is mentioned UndefinedStepException - Implement the 
  steps backing up the feature file to come up with an executable feature
* Create FizzBuzzSteps.groovy inside src/test/groovy/integration/steps
* Copy and paste the IDEA suggested step definitions and include them in FizzBuzzSteps.groovy
* Import the annotations of io.cucumber such as given, when, then

