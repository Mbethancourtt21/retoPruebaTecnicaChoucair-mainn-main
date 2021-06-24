package co.com.choucair.reto.proyectoreto.tasks;

import co.com.choucair.reto.proyectoreto.model.UtestData;
import co.com.choucair.reto.proyectoreto.userinterface.UtestSignUpPersonalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.type.Type;
import org.openqa.selenium.Keys;

public class FillSignUpPersonalForm implements Task {
    private UtestData user;

    public FillSignUpPersonalForm(UtestData user){
        this.user = user;
    }

    public static FillSignUpPersonalForm the(UtestData user) {
        return Tasks.instrumented(FillSignUpPersonalForm.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.getFirstName()).into(UtestSignUpPersonalPage.FIRST_NAME),
                Enter.theValue(user.getLastName()).into(UtestSignUpPersonalPage.LAST_NAME),
                Enter.theValue(user.getEmail()).into(UtestSignUpPersonalPage.EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText(user.getBirthMonth()).from(UtestSignUpPersonalPage.BIRTH_MONTH),
                SelectFromOptions.byVisibleText(user.getBirthDay()).from(UtestSignUpPersonalPage.BIRHT_DAY),
                SelectFromOptions.byVisibleText(user.getYear()).from(UtestSignUpPersonalPage.BIRTH_YEAR),
                Type.theValue(user.getLanguage()).into(UtestSignUpPersonalPage.LANGUAGE).thenHit(Keys.ENTER),
                Click.on(UtestSignUpPersonalPage.NEXT_LOCATION)
        );
    }
}
