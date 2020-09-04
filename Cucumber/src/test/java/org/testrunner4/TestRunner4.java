package org.testrunner4;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/asmap.feature",glue="org.stepdefinition4",monochrome=true,
plugin="pretty",dryRun=false)
public class TestRunner4 {

}
