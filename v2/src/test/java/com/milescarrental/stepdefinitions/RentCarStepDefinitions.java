package com.milescarrental.stepdefinitions;

import com.milescarrental.questions.FinalMessage;
import com.milescarrental.tasks.rentcar;
import com.milescarrental.utils.Generate;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class RentCarStepDefinitions {

    @Managed
    WebDriver driver;

    @Given("actor enters the page")
    public void actorEntersThePage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Elkin").whoCan(BrowseTheWeb.with(driver));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://milescarrental.com/es/"));
    }

    @When("to send information for the {string} car")
    public void toSendInformationForTheCar(String option) {
        OnStage.theActorInTheSpotlight().attemptsTo(rentcar.format(Generate.dates(),option));
    }
    @Then("I see the make of the car {string}")
    public void iSeeTheMakeOfTheCar(String message) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(FinalMessage.is(), Matchers.equalTo(message)));
    }

}
