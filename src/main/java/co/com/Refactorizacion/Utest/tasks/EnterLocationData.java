package co.com.Refactorizacion.Utest.tasks;

import co.com.Refactorizacion.Utest.model.UtestData;
import co.com.Refactorizacion.Utest.userinterface.LocationUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.Refactorizacion.Utest.userinterface.LocationUser.*;

public class EnterLocationData implements Task {

private List<UtestData> data;

    public EnterLocationData(List<UtestData> data) {
        this.data = data;
    }

    public static Performable theUtestPage(List<UtestData> data) {
        return Tasks.instrumented(EnterLocationData.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrCity()).into(CITY),
                Hit.the(Keys.ARROW_DOWN).into(CITY),
                Hit.the(Keys.ENTER).into(CITY),
                Enter.theValue(data.get(0).getStrPostalCode()).into(POSTAL_CODE),
                Click.on(COUNTRY_CONTAINER),
                Enter.theValue(data.get(0).getStrCountry()).into(COUNTRY),
                Click.on(BUTTON_DEVICES)
        );
    }

}
