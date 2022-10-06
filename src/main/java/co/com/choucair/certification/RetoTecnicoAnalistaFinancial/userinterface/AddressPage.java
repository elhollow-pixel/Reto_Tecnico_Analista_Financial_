package co.com.choucair.certification.RetoTecnicoAnalistaFinancial.userinterface;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddressPage extends PageObject {

    public static final Target INPUT_CITY                  = Target.the("City")
            .located(By.id("city"));

    public static final Target INPUT_ZIP_OR_POSTAL_CODE    = Target.the("Zip or Postal Code")
            .located(By.id("zip"));

    public static final Target SCROLL_COUNTRY              = Target.the("Scroll Country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));

    public static final Target SELECT_COUNTRY              = Target.the("Select Country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target BUTTON_NEXT_LOCATION        = Target.the("Next Location")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
