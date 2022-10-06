package co.com.choucair.certification.RetoTecnicoAnalistaFinancial.userinterface;

import net.thucydides.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicesPage extends PageObject {

    public static final Target SCROLL_MOBILE_DEVICE     = Target.the("Mobile Device")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div"));

    public static final Target SELECT_MOBILE_DEVICE     = Target.the("Select Mobile device")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));

    public static final Target SCROLL_MODEL             = Target.the("Model")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div"));

    public static final Target SELECT_MODEL             = Target.the("Select Model")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));

    public static final Target SCROLL_OPERATING_SYSTEM  = Target.the("Operating System:")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div"));

    public static final Target SELECT_OPERATING_SYSTEM  = Target.the("Select Operating System:")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));

    public static final Target BUTTON_NEXT_LAST_STEP    = Target.the("Next Last Step")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}
