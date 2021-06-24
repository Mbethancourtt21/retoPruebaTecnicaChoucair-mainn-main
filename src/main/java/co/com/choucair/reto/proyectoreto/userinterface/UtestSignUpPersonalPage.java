package co.com.choucair.reto.proyectoreto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestSignUpPersonalPage {

    public static final Target FIRST_NAME = Target.the("Input first name")
            .located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Input last name")
            .located(By.id("lastName"));
    public static final Target EMAIL_ADDRESS = Target.the("Input email address")
            .located(By.id("email"));
    public static final Target BIRTH_MONTH = Target.the("Input birth month")
            .located(By.id("birthMonth"));
    public static final Target BIRHT_DAY = Target.the("Input birth day")
            .located(By.id("birthDay"));
    public static final Target BIRTH_YEAR = Target.the("Input birth year")
            .located(By.id("birthYear"));
    public static final Target LANGUAGE = Target.the("Text area to write the language")
            .located(By.xpath("//input[@type='search']"));
    public static final Target NEXT_LOCATION = Target.the("Button to next section")
            .located(By.xpath("//span[contains(text(),'Next: Location')]"));
}
