package co.com.choucair.certification.academy.questions;

import co.com.choucair.certification.academy.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;
    String nameCourse;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        nameCourse = Text.of(SearchCoursePage.NAME_COURSE).viewedBy(actor).asString();
        if (question.equals(nameCourse)){
            return true;
        }else{
            return false;
        }
    }
}