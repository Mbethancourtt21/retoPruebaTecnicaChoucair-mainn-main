package co.com.choucair.reto.proyectoreto.tasks;

import co.com.choucair.reto.proyectoreto.model.UtestData;
import co.com.choucair.reto.proyectoreto.userinterface.UtestSignUpLocationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class FillSignUpLocationForm implements Task {

    private UtestData user;

    public FillSignUpLocationForm(UtestData user) {
        this.user = user;
    }

    public static Performable the(UtestData user) {
        return Tasks.instrumented(FillSignUpLocationForm.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(user.getCity()).into(UtestSignUpLocationPage.CITY),
                Hit.the(Keys.ARROW_DOWN, Keys.ENTER).into(UtestSignUpLocationPage.CITY),
                Enter.theValue(user.getZip()).into(UtestSignUpLocationPage.ZIP_CODE),
                Click.on(UtestSignUpLocationPage.NEXT_DEVICES)
                );


    }
}
