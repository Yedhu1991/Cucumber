package org.testrunner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/scenaout.feature",glue="org.stepdefiniton1",monochrome=true,
plugin="pretty",dryRun=false)
public class TestRunner1 {

}
