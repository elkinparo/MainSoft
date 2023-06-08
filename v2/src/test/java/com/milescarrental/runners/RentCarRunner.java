package com.milescarrental.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/rentcar.feature",
        glue = {"com.milescarrental.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE, tags = "")

public class RentCarRunner {
}
