package co.com.choucair.certification.RetoTecnicoAnalistaFinancial.tasks;

import co.com.choucair.certification.RetoTecnicoAnalistaFinancial.model.DataUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;


import java.util.List;
import static co.com.choucair.certification.RetoTecnicoAnalistaFinancial.userinterface.DevicesPage.*;
public class FillOutDevice implements Task {

    private List<DataUser>dataUser;

    public FillOutDevice(List<DataUser> dataUser) {
        this.dataUser = dataUser;
    }

    public static FillOutDevice thePage(List<DataUser>dataUser) {
        return Tasks.instrumented(FillOutDevice.class, dataUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SCROLL_MOBILE_DEVICE),
                Enter.theValue(dataUser.get(0).getMobile()).into(SELECT_MOBILE_DEVICE).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(SCROLL_MODEL),
                Enter.theValue(dataUser.get(0).getModel()).into(SELECT_MODEL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(SCROLL_OPERATING_SYSTEM),
                Enter.theValue(dataUser.get(0).getOperatingSystem()).into(SELECT_OPERATING_SYSTEM).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(BUTTON_NEXT_LAST_STEP)
        );
    }
}
