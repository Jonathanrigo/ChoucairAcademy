package co.com.choucair.certification.academy.stepdefinitions;

import co.com.choucair.certification.academy.model.AcademyChoucairData;
import co.com.choucair.certification.academy.questions.Answer;
import co.com.choucair.certification.academy.questions.AnswerLoginInvalido;
import co.com.choucair.certification.academy.tasks.Login;
import co.com.choucair.certification.academy.tasks.OpenUp;
import co.com.choucair.certification.academy.tasks.Search;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Than bradon wants to learn automation at the academy choucair$")
    public void thanBradonWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairDataList) {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), Login.onThePage(academyChoucairDataList));
    }


    @When("^He search for the course on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^He finds the course called$")
    public void heFindsTheCourseCalledResourcesAutomatizacionBancolombia(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }

    @Given("^Un usuario ingresa a academia choucair$")
    public void unUsuarioIngresaAAcademiaChoucair()  {
        OnStage.theActorCalled("User").wasAbleTo(OpenUp.thePage());
    }


    @When("^Ingresa datos incorrectos en la plataforma$")
    public void ingresaDatosIncorrectosEnLaPlataforma(List<AcademyChoucairData> academyChoucairDataList)  {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.onThePage(academyChoucairDataList));
    }

    @Then("^El sistema ahorra mensaje de error$")
    public void elSistemaAhorraMensajeDeError(List<AcademyChoucairData> academyChoucairData)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerLoginInvalido.alert(academyChoucairData.get(0).getStrCourse())));
    }
}
