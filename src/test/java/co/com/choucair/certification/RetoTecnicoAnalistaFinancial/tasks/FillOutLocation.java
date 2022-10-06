package co.com.choucair.certification.RetoTecnicoAnalistaFinancial.tasks;
import co.com.choucair.certification.RetoTecnicoAnalistaFinancial.model.DataUser;
import cucumber.api.java.es.E;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;
import static co.com.choucair.certification.RetoTecnicoAnalistaFinancial.userinterface.AddressPage.*;
public class FillOutLocation implements Task {

    private List<DataUser> dataUser;

    public FillOutLocation(List<DataUser> dataUser) {
        this.dataUser = dataUser;
    }

    public static FillOutLocation thePage(List<DataUser>dataUser) {
        return Tasks.instrumented(FillOutLocation.class, dataUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataUser.get(0).getCity()).into(INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_CITY),
                Hit.the(Keys.ENTER).into(INPUT_CITY),
                Enter.theValue(dataUser.get(0).getZip()).into(INPUT_ZIP_OR_POSTAL_CODE),
                Click.on(SCROLL_COUNTRY),
                Enter.theValue(dataUser.get(0).getCountry()).into(SELECT_COUNTRY),
                Click.on(BUTTON_NEXT_LOCATION)
        );
    }
}
