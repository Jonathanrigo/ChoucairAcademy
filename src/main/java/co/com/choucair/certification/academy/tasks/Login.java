package co.com.choucair.certification.academy.tasks;

import co.com.choucair.certification.academy.model.AcademyChoucairData;
import co.com.choucair.certification.academy.userinterface.ChoucairAcademyLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Login implements Task {
    private final String strUser;
    private final String strPassword;
    private List<AcademyChoucairData> academyChoucairDataList;

    public Login(List<AcademyChoucairData> academyChoucairDataList) {
        this.strUser = academyChoucairDataList.get(0).getStrUser();
        this.strPassword = academyChoucairDataList.get(0).getStrPassword();
        this.academyChoucairDataList = academyChoucairDataList;
    }

    public static Login onThePage(List<AcademyChoucairData> academyChoucairDataList){
        return Tasks.instrumented(Login.class, academyChoucairDataList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairAcademyLoginPage.LOGIN_BUTTON),
                Enter.theValue(strUser).into(ChoucairAcademyLoginPage.INPUT_USER),
                Enter.theValue(strPassword).into(ChoucairAcademyLoginPage.INPUT_PASSWORD),
                Click.on(ChoucairAcademyLoginPage.ENTER_BUTTON)
        );
    }
}
