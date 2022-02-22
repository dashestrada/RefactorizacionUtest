package co.com.Refactorizacion.Utest.tasks;

import co.com.Refactorizacion.Utest.model.UtestData;
import co.com.Refactorizacion.Utest.userinterface.UserDevicesPage;
import cucumber.api.java.es.E;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.Refactorizacion.Utest.userinterface.UserDevicesPage.*;

public class EnterDevices implements Task {

    List<UtestData> data;

    public EnterDevices(List<UtestData> data) {
        this.data = data;
    }

    public static EnterDevices theUthestPage(List<UtestData> data) {
        return Tasks.instrumented(EnterDevices.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CONTAINER_COMPUTER),
                Enter.theValue(data.get(0).getStrComputer()).into(COMPUTER).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTAINER_VERSION),
                Enter.theValue(data.get(0).getStrVersionComputer()).into(VERSION).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTAINER_LANGUAGE),
                Enter.theValue(data.get(0).getStrLanguaje()).into(LANGUAGE).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTAINER_DEVICES_MOVIL),
                Enter.theValue(data.get(0).getStrMovilDevices()).into(DEVICES_MOVIL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTAINER_MODEL_DEVICES),
                Enter.theValue(data.get(0).getStrModelDevicesModel()).into(MODEL_DEVICE).thenHit(Keys.ENTER),
                Click.on(CONTAINER_OS),
                Enter.theValue(data.get(0).getStrSoMovil()).into(OS).thenHit(Keys.ENTER),
                Click.on(LAST_STEP)

        );
    }
}
