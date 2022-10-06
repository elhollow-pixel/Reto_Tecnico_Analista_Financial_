package co.com.choucair.certification.RetoTecnicoAnalistaFinancial.tasks;

import co.com.choucair.certification.RetoTecnicoAnalistaFinancial.userinterface.PlatformPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private PlatformPage platformPage;

    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(platformPage),
                Click.on(PlatformPage.JOIN_BUTTON)
        );
    }
}
