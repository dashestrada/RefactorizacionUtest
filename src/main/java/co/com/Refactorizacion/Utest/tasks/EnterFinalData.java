package co.com.Refactorizacion.Utest.tasks;

import co.com.Refactorizacion.Utest.model.UtestData;
import co.com.Refactorizacion.Utest.userinterface.FinalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.Refactorizacion.Utest.userinterface.FinalPage.*;

public class EnterFinalData implements Task {
    private List<UtestData> data;

    public EnterFinalData(List<UtestData> data) {
        this.data = data;
    }

    public static EnterFinalData theUtestPage(List<UtestData> data) {
        return Tasks.instrumented(EnterFinalData.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getStrPassword()).into(PASSWORD),
                Enter.theValue(data.get(0).getStrPassword()).into(CONFIRM_PASSWORD),
                Click.on(CHECKBOX_STAY_INFORMED),
                Click.on(CHECKBOX_TERMS),
                Click.on(CHECKBOX_PRIVACY),
                Click.on(BUTTON_COMPLETE)

        );
    }
}
