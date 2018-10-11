package org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/org/test/customer.feature"},glue= {"org.test"},plugin= {"html:new"})

public class TestRunner {

}
