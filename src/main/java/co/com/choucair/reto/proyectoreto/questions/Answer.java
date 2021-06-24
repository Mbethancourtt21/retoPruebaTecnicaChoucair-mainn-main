package co.com.choucair.reto.proyectoreto.questions;

import co.com.choucair.reto.proyectoreto.userinterface.UtestWelcomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean result;
        String message = Text.of(UtestWelcomePage.MESSAGE).viewedBy(actor).asString();
        if(question.equals(message)){
            result = true;
        } else{
            result = false;
        }
        return result;
    }

    @Override
    public String getSubject() {
        return null;
    }
}
