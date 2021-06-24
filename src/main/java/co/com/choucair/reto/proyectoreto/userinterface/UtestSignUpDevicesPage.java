package co.com.choucair.reto.proyectoreto.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtestSignUpDevicesPage {
    public static final Target LAST_STEP = Target.the("Button to last step")
            .located(By.xpath("//span[contains(text(),'Next: Last Step')]"));
}
