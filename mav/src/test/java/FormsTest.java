import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class FormsTest {
    @Test
    public void InputForms(){

        Selenide.open("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
        $(by("name", "name")).sendKeys("Nikanor");
        $(byXpath("//*[@id=\"register_form\"]/fieldset[1]/p[2]/input")).sendKeys("Tsekvava");
        $(byXpath("//*[@id=\"register_form\"]/fieldset[2]/div/label[2]")).click();
        $(byText("Dance")).click();
        $(by("value", "India")).selectRadio("India");
        $(byXpath("//*[@id=\"register_form\"]/fieldset[5]/div[1]/select")).selectOption(1);
        $(byXpath("//*[@id=\"register_form\"]/fieldset[5]/div[2]/select")).selectOption(1);
        $(byXpath("//*[@id=\"register_form\"]/fieldset[5]/div[3]/select")).selectOption("2014");
        $(by("name", "phone")).sendKeys("555-25-24-23");
        $(by("name", "username")).sendKeys("Magnus Donovan");
        $(by("name", "email")).sendKeys("SuperMen@gmail.com");
        $(byXpath("//*[@id=\"register_form\"]/fieldset[10]/textarea")).sendKeys("This is super description about me!");
        $(by("name", "password")).sendKeys("qweqwe1");
        $(by("name", "c_password")).sendKeys("qweqwe1");
        sleep(500);
        $(by("value", "submit")).click();
        sleep(2000);


    }
}
