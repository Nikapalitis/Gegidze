import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Credentails {

    @Test
    public void Creds(){
        Configuration.browserSize = "1920x1080";



        Selenide.open("https://planner.lineate.com/accounts/login/?next=/employees/%3Fstatus%3Dactive%26left%3Dall%26employment_type%3Demployee");
        $(byId("id_username")).sendKeys("nikoloz_tsekvava");
        $(byId("id_password")).sendKeys("j*9*rsMNrP+vfzEE");
        $(byText("Log in")).click();
    }
}
