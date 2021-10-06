package co.com.choucair.certification.academy.questions;

import co.com.choucair.certification.academy.userinterface.ChoucairAcademyLoginPage;
import co.com.choucair.certification.academy.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerLoginInvalido implements Question<Boolean> {
    private String question;
    String mensage;

    public AnswerLoginInvalido(String question) {
        this.question = question;
    }

    public static AnswerLoginInvalido alert(String question){
        return new AnswerLoginInvalido(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        mensage = Text.of(ChoucairAcademyLoginPage.INPUT_ALERT).viewedBy(actor).asString();
        System.out.println(mensage);
        System.out.println(question);
        if (question.equals(mensage)){
            return true;
        }else{
            return false;
        }
    }
}
