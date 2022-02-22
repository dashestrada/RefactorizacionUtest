package co.com.Refactorizacion.Utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinOnPage extends PageObject {

    public static final Target JOIN_TODAY = Target.the("Click on the button join today")
            .located(By.xpath("//div[@class='navbar navbar-default navbar-fixed-top unauthenticated-nav-bar']/div[3]/ul[2]/li[2]/a"));


}
