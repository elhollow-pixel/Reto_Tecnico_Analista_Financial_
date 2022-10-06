package co.com.choucair.certification.RetoTecnicoAnalistaFinancial.tasks;

import co.com.choucair.certification.RetoTecnicoAnalistaFinancial.model.DataUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;



import java.util.List;
import static co.com.choucair.certification.RetoTecnicoAnalistaFinancial.userinterface.PersonalPage.*;
public class FillOutAbout implements Task {
    private List<DataUser>dataUser;


    public FillOutAbout(List<DataUser> dataUser) {
        this.dataUser = dataUser;
    }

    public static FillOutAbout thePage(List<DataUser> dataUser) {
        return Tasks.instrumented(FillOutAbout.class, dataUser);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataUser.get(0).getFirstName()).into(INPUT_FIRST_NAME),
                Enter.theValue(dataUser.get(0).getLastName()).into(INPUT_LAST_NAME),
                Enter.theValue(dataUser.get(0).getEmailAddress()).into(INPUT_EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText(dataUser.get(0).getMoth()).from(INPUT_MONTH),
                SelectFromOptions.byVisibleText(dataUser.get(0).getDay()).from(INPUT_DAY),
                SelectFromOptions.byVisibleText(dataUser.get(0).getYear()).from(INPUT_YEAR),
                Click.on(BUTTON_NEXT_LOCATION)
        );
    }
}
