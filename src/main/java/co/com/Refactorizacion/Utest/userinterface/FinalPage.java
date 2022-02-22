package co.com.Refactorizacion.Utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinalPage extends PageObject {

    public static final Target PASSWORD = Target.the("Campo para ingresar la Contraseña")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Campo para Confirmar la Contraseña")
            .located(By.id("confirmPassword"));
    public static final Target CHECKBOX_STAY_INFORMED  = Target.the("Checkbox para mantenerse informado")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECKBOX_TERMS  = Target.the("Checkbox para terminos de uso de Utest")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECKBOX_PRIVACY  = Target.the("Checkbox para  Privacidad")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_COMPLETE  = Target.the("Botón para  Completar")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));

}
