package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ChoucairAcademyLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("Button that shows us the form login").located(By.xpath("(//a[@class='btn btn-info btn-sm text-white'])[1]"));
    public static final Target INPUT_USER = Target.the("where do we write user").located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write password").located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("Boton para confirmar el login").located(By.xpath("//button[@class='btn btn-primary']"));
    public static final Target INPUT_ALERT = Target.the("Mensaje de alerta que ahorrael sistema").located(By.xpath("(//div[@class='alert alert-danger'])[1]"));
}
