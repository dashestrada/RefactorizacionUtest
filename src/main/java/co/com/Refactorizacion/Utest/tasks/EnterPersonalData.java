package co.com.Refactorizacion.Utest.tasks;

import co.com.Refactorizacion.Utest.model.UtestData;
import co.com.Refactorizacion.Utest.userinterface.PersonalDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.Refactorizacion.Utest.userinterface.PersonalDataPage.*;

public class EnterPersonalData implements Task {

    private List<UtestData> data;

    public EnterPersonalData(List<UtestData> data) {
        this.data = data;
    }

    public static EnterPersonalData theUtestPage(List<UtestData> data) {
        return Tasks.instrumented(EnterPersonalData.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrName()).into(NAME),
                Enter.theValue(data.get(0).getStrLastname()).into(LASTNAME),
                Enter.theValue(data.get(0).getStrEmail()).into(EMAIL),
                SelectFromOptions.byVisibleText(data.get(0).getStrBirthMonth()).from(BIRTH_MONTH),
                SelectFromOptions.byVisibleText(data.get(0).getStrBirthday()).from(BIRTHDAY),
                SelectFromOptions.byVisibleText(data.get(0).getStrBirthYear()).from(BIRTH_YEAR),
                Click.on(BOTON_LOCATION)
        );
    }

}
