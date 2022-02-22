package co.com.Refactorizacion.Utest.tasks;

import co.com.Refactorizacion.Utest.userinterface.JoinOnPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.Refactorizacion.Utest.userinterface.JoinOnPage.*;

public class JoinToday implements Task {

    public static JoinToday OnThePage() {
        return Tasks.instrumented(JoinToday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
                actor.attemptsTo(Click.on(JOIN_TODAY));
    }
}
