package co.com.choucair.reto.proyectoreto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestWelcomePage {

    public static final Target MESSAGE = Target.the("Get the Welcome msg")
            .located(By.xpath("//div[@class='welcome-page']//h1[contains(text(),'Welcome')]"));
}
