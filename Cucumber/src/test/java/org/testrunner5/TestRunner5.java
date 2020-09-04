package org.testrunner5;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/asMaps.feature",glue="org.stepdefinition5",monochrome=true,
plugin="pretty",dryRun=false)
public class TestRunner5 {

}
