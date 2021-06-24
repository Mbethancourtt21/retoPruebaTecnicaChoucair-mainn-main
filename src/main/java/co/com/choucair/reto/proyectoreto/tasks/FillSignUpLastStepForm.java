package co.com.choucair.reto.proyectoreto.tasks;

import co.com.choucair.reto.proyectoreto.model.UtestData;
import co.com.choucair.reto.proyectoreto.userinterface.UtestSignUpLastStepPage;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillSignUpLastStepForm implements Task {

    private UtestData user;



    public FillSignUpLastStepForm(UtestData user) {
        this.user = user;
    }

    public static Performable the(UtestData user) {
        return Tasks.instrumented(FillSignUpLastStepForm.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                        Enter.theValue(user.getPassword()).into(UtestSignUpLastStepPage.PASSWORD),
                        Enter.theValue(user.getPassword()).into(UtestSignUpLastStepPage.CONFIRM_PASSWORD),
                        Click.on(UtestSignUpLastStepPage.CONFIRM_TERMS),
                        Click.on(UtestSignUpLastStepPage.ACCEPT_PRIVACY),
                        Click.on(UtestSignUpLastStepPage.BUTTON_COMPLETE_SETUP)
                );
    }

}
