package co.com.choucair.reto.proyectoreto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestSignUpLastStepPage {

    public static final Target PASSWORD = Target.the("Input to write the password")
            .located(By.id("password"));

    public static final Target CONFIRM_PASSWORD = Target.the("Input to write the confirmation password")
            .located(By.id("confirmPassword"));

    public static final Target CONFIRM_TERMS = Target.the("Checkbox terms of use")
            .located(By.id("termOfUse"));
    public static final Target ACCEPT_PRIVACY = Target.the("Checbox terms of privacy")
            .located(By.id("privacySetting"));

    public static final Target BUTTON_COMPLETE_SETUP = Target.the("Button to confirm your registration")
            .located(By.id("laddaBtn"));
}
