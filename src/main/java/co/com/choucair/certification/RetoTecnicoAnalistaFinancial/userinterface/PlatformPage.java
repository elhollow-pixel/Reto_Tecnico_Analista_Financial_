package co.com.choucair.certification.RetoTecnicoAnalistaFinancial.userinterface;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


@DefaultUrl("https://www.utest.com/")
public class PlatformPage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("Join button")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
}
