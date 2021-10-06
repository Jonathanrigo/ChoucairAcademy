package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Boton para acceder a universidad choucair").located(By.xpath("(//img[@class='card-img-top'])[1]"));
    public static final Target INPUT_BUSCARCURSO = Target.the("Campo para ingresar el curso a buscar").located(By.id("coursesearchbox"));
    public static final Target BUTTON_IRCURSO = Target.the("Boton que busca el curso ingresado").located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Selecciona el curso al cual acceder").located(By.xpath("//a[@href='https://operacion.choucairtesting.com/academy/course/view.php?id=489']"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso").located(By.className("aalink"));
}
