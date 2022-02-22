package co.com.Refactorizacion.Utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationUser extends PageObject {

    public static final Target CITY = Target.the("Campo para Ciudad del usuario")
            .located(By.id("city"));
    public static final Target POSTAL_CODE = Target.the("Campo para Código postal del usuario")
            .located(By.id("zip"));
    public static final Target COUNTRY_CONTAINER = Target.the("Contenedor de los paises")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target COUNTRY = Target.the("Campo para el País del usuario")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BUTTON_DEVICES = Target.the("Botón para ir a Devices")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}
