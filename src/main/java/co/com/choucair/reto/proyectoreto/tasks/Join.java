package co.com.choucair.reto.proyectoreto.tasks;


import co.com.choucair.reto.proyectoreto.userinterface.UtestHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Join implements Task {

    public static Join onThePage() {
        return Tasks.instrumented(Join.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestHomePage.JOIN_TODAY_BUTTON));
    }
}
