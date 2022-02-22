package co.com.Refactorizacion.Utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalDataPage extends PageObject {

    public static final Target NAME = Target.the("Campo para Nombre del usuario")
            .located(By.id("firstName"));
    public static final Target LASTNAME = Target.the("Campo para el Apellido del usuario")
            .located(By.id("lastName"));
    public static final Target EMAIL= Target.the("Campo para el correo del usuario")
            .located(By.id("email"));
    public static final Target BIRTH_MONTH = Target.the("Campo para mes de nacimiento de usuario")
            .located(By.id("birthMonth"));
    public static final Target BIRTHDAY = Target.the("Campo para dia de nacimiento de usuario")
            .located(By.id("birthDay"));
    public static final Target BIRTH_YEAR = Target.the("Campo para año de nacimiento de usuario")
            .located(By.id("birthYear"));
    public static final Target BOTON_LOCATION = Target.the("Botón para ir a Location")
            .located(By.xpath("//a[@class='btn btn-blue']"));

}
