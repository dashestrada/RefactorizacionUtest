package co.com.Refactorizacion.Utest.question;

import co.com.Refactorizacion.Utest.model.UtestData;
import co.com.Refactorizacion.Utest.userinterface.FinalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Answer implements Question<Boolean> {

    private List<UtestData> data;

    public Answer(List<UtestData> data) {
        this.data = data;
    }

    public static Answer thoThe(List<UtestData> data) { return new Answer(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String text_button_final = Text.of(FinalPage.BUTTON_COMPLETE).viewedBy(actor).asString();
        result = data.get(0).getStrFinalText().equals(text_button_final)?true:false;
        return result;
    }
}
