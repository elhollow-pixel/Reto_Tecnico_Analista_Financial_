package co.com.choucair.certification.RetoTecnicoAnalistaFinancial.stepdefinitions;

import co.com.choucair.certification.RetoTecnicoAnalistaFinancial.model.DataUser;
import co.com.choucair.certification.RetoTecnicoAnalistaFinancial.questions.Answer;
import co.com.choucair.certification.RetoTecnicoAnalistaFinancial.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

public class UserRegisterStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^tatiana wants to sign up on the platform$")
    public void tatianaWantsToSignUpOnThePlatform()  {
        OnStage.theActorCalled("tatiana").wasAbleTo(OpenUp.thePage());
    }

    @When("^she send the required information$")
    public void sheSendTheRequiredInformation(List<DataUser>dataUser){
        OnStage.theActorInTheSpotlight().attemptsTo(FillOutAbout.thePage(dataUser),
                FillOutLocation.thePage(dataUser),
                FillOutDevice.thePage(dataUser),
                FillOutComplete.thePage(dataUser)
                );
    }

    @Then("^tatiana will be registered into the system$")
    public void tatianaWillBeRegisteredIntoTheSystem(List<DataUser>dataUser) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(dataUser)));
    }
}
