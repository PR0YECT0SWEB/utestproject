package co.com.choucair.certification.secondutest.stepdefinitions;

import co.com.choucair.certification.secondutest.model.UtestData;
import co.com.choucair.certification.secondutest.questions.Validation;
import co.com.choucair.certification.secondutest.tasks.Join;
import co.com.choucair.certification.secondutest.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

public class StepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than derlevin wants to enter the utest page to automate$")
    public void thanDerlevinWantsToEnterTheUtestPageToAutomate() {
        OnStage.theActorCalled("derlevin").wasAbleTo(OpenUp.ThePage());
    }


    @When("^he fills out the form$")
    public void heFillsOutTheForm(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Join.onThePage(utestData
                .get(0).getStrName(),utestData.get(0).getStrLastName(),utestData.get(0).getStrMail(),utestData.get(0).getStrPassword()));
    }

    @Then("^he finds the name$")
    public void heFindsTheName(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validation.toThe(utestData.get(0).getStrValidation())));
    }
}
