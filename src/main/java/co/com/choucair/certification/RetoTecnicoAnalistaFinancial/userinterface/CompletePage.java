package co.com.choucair.certification.RetoTecnicoAnalistaFinancial.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CompletePage extends PageObject {

    public static final Target INPUT_CREATE_PASSWORD   = Target.the("Create Password")
            .located(By.id("password"));

    public static final Target INPUT_CONFIRM_PASSWORD  = Target.the("Confirm Password")
            .located(By.id("confirmPassword"));

    public static final Target CHECK_BOX_1 = Target.the("Check Box 1")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));

    public static final Target CHECK_BOX_2 = Target.the("Check Box 2")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CHECK_BOX_3 = Target.the("Check Box 3")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BUTTON_COMPLETED_SETUP  = Target.the("Completed Setup")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));

}
