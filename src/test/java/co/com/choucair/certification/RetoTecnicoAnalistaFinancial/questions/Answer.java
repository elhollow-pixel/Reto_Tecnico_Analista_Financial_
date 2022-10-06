package co.com.choucair.certification.RetoTecnicoAnalistaFinancial.questions;

import co.com.choucair.certification.RetoTecnicoAnalistaFinancial.model.DataUser;
import co.com.choucair.certification.RetoTecnicoAnalistaFinancial.userinterface.CompletePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;


public class Answer implements Question<Boolean> {

    private List<DataUser> dataUser;

    public Answer(List<DataUser> dataUser) {
        this.dataUser = dataUser;
    }

    public static Answer toThe(List<DataUser> dataUser) {
        return new Answer(dataUser);
    }


    @Override
    public Boolean answeredBy(Actor actor) {

        String Button_Complete = Text.of(CompletePage.BUTTON_COMPLETED_SETUP).viewedBy(actor).asString();
        return dataUser.get(0).getAnswerFinal().equals(Button_Complete);
    }
}
