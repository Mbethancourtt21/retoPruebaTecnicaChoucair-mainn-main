package co.com.choucair.reto.proyectoreto.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.utest.com/")
public class UtestHomePage extends PageObject {
    public static  final Target JOIN_TODAY_BUTTON = Target.the("button that shows us the form to sign-in")
            .located(By.xpath("//a[@href='/signup/personal']"));

}
