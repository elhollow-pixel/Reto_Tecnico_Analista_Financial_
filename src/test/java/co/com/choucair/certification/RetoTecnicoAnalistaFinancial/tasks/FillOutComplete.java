package co.com.choucair.certification.RetoTecnicoAnalistaFinancial.tasks;

import co.com.choucair.certification.RetoTecnicoAnalistaFinancial.model.DataUser;
import cucumber.api.java.nl.En;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import static co.com.choucair.certification.RetoTecnicoAnalistaFinancial.userinterface.CompletePage.*;
public class FillOutComplete implements Task {

    private List<DataUser> dataUser;

    public FillOutComplete(List<DataUser> dataUser) {
        this.dataUser = dataUser;
    }

    public static FillOutComplete thePage(List<DataUser> dataUser) {
        return Tasks.instrumented(FillOutComplete.class, dataUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataUser.get(0).getPassword()).into(INPUT_CREATE_PASSWORD),
                Enter.theValue(dataUser.get(0).getPassword()).into(INPUT_CONFIRM_PASSWORD),
                Click.on(CHECK_BOX_1),
                Click.on(CHECK_BOX_2),
                Click.on(CHECK_BOX_3),
                Click.on(BUTTON_COMPLETED_SETUP)
        );

    }
}
