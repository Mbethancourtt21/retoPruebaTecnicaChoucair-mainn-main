package co.com.choucair.reto.proyectoreto.stepdefinitions;

import co.com.choucair.reto.proyectoreto.model.UtestData;
import co.com.choucair.reto.proyectoreto.questions.Answer;
import co.com.choucair.reto.proyectoreto.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.EventualConsequence;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class SignUpStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }



    @Given("^than brandom wants to join the uTest community$")
    public void thanBrandomWantsToJoinTheUTestCommunity() {
        OnStage.theActorCalled("Brandom").wasAbleTo(OpenUp.thePage(), Join.onThePage());
    }

    @When("^he fill out the registration form on the uTest web page\\.$")
    public void heFillOutTheRegistrationFormOnTheUTestWebPage(List<UtestData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillSignUpPersonalForm.the(data.get(0)),
                                                    FillSignUpLocationForm.the(data.get(0)),
                                                    FillSignUpDevicesForm.the(data.get(0)),
                                                    FillSignUpLastStepForm.the(data.get(0)));
    };

    @Then("^he should see the confirmation page$")
    public void heShouldSeeTheConfirmationPage(List<UtestData> data) {
        OnStage.theActorInTheSpotlight().should(EventualConsequence.eventually(GivenWhenThen.seeThat(
                Answer.toThe(data.get(0).getMessage()))
        ).waitingForNoLongerThan(50).seconds());
    }
}


