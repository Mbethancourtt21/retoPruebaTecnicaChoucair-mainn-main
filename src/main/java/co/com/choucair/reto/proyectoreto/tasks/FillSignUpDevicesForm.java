package co.com.choucair.reto.proyectoreto.tasks;

import co.com.choucair.reto.proyectoreto.model.UtestData;
import co.com.choucair.reto.proyectoreto.userinterface.UtestSignUpDevicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class FillSignUpDevicesForm implements Task {


    private UtestData user;

    public FillSignUpDevicesForm(UtestData user) {
        this.user = user;
    }

    public static Performable the(UtestData user) {
        return Tasks.instrumented(FillSignUpDevicesForm.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestSignUpDevicesPage.LAST_STEP)
        );
    }
}
