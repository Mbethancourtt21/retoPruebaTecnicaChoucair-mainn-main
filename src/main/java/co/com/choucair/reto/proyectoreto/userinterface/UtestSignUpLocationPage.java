package co.com.choucair.reto.proyectoreto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestSignUpLocationPage {

    public static final Target CITY = Target.the("Input to write the city")
            .located(By.id("city"));
    public static final Target ZIP_CODE = Target.the("Input to write the postal code or zip")
            .located(By.id("zip"));
    public static final Target NEXT_DEVICES = Target.the("Button to next section")
            .located(By.xpath("//span[contains(text(),'Next: Devices')]"));


}
