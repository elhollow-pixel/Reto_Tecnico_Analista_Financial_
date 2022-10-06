package co.com.choucair.certification.RetoTecnicoAnalistaFinancial.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PersonalPage extends PageObject {

    public static final Target INPUT_FIRST_NAME     = Target.the("First Name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME      = Target.the("Last Name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL_ADDRESS  = Target.the("Email Address")
            .located(By.id("email"));
    public static final Target INPUT_MONTH          = Target.the("Month")
            .located(By.id("birthMonth"));
    public static final Target INPUT_DAY            = Target.the("Day")
            .located(By.id("birthDay"));
    public static final Target INPUT_YEAR           = Target.the("Year")
            .located(By.id("birthYear"));
    public static final Target BUTTON_NEXT_LOCATION= Target.the("Next Location")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}