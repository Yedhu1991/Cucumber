package org.Testrunner2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/datatablelis.feature",glue="org.stepdefiniton2",
monochrome=true,plugin="pretty")
public class TestRunner2 {

}
