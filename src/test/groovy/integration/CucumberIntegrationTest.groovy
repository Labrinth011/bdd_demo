package integration

import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

// JUnit Cucumber runner - supports running tests with JUnit, comes with Cucumber Junit library
// Starts executing this with Cucumber as a separate process when encountered @RunWith annotation
@RunWith(Cucumber.class)
// Tell the runner where the feature files are located
@CucumberOptions(features = ['src/test/resources/features']) //CLI runner options
class CucumberIntegrationTest {
}
