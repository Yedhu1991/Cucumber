package org.testrunner3;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/twodialist.feature",glue="org.stepdefinition3",monochrome=true,
plugin="pretty",dryRun=false)
public class TestRunner3 {

}
