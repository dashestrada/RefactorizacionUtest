package co.com.Refactorizacion.Utest.stepdefinitions;

import co.com.Refactorizacion.Utest.model.UtestData;
import co.com.Refactorizacion.Utest.question.Answer;
import co.com.Refactorizacion.Utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RegisterUtest {

    @Before
    public  void sepUp(){
        setTheStage(new OnlineCast());
    }

    @Given("^the Dayana wants to enter the Utest page$")
    public void theDayanaWantsToEnterTheUtestPage() {
        theActorCalled("Dayana").wasAbleTo(OpenUp.theUtestPage(), JoinToday.OnThePage());
    }

    @When("^she performs the registration of your personal data$")
    public void shePerformsTheRegistrationOfYourPersonalData(List<UtestData> data) {
       theActorInTheSpotlight().attemptsTo(EnterPersonalData.theUtestPage(data), EnterLocationData.theUtestPage(data),
                EnterDevices.theUthestPage(data), EnterFinalData.theUtestPage(data));
    }

    @Then("^she has successfully registered$")
    public void sheHasSuccessfullyRegistered(List<UtestData> data) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.thoThe(data)));
    }
}







