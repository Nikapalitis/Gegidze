import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class LocationCountry {
    @Test
    public void Location(){
        Configuration.browserSize = "1920x1080";



        Selenide.open("https://planner.lineate.com/accounts/login/?next=/employees/%3Fstatus%3Dactive%26left%3Dall%26employment_type%3Demployee");
        $(byId("id_username")).sendKeys("nikoloz_tsekvava");
        $(byId("id_password")).sendKeys("j*9*rsMNrP+vfzEE");
        $(byText("Log in")).click();
        $(byText("Location country")).click();
        $(byText("Georgia")).click();
        sleep(500);
        $(byXpath("//*[@id=\"content\"]/div[2]/div/div[1]/div[1]/div[2]/span[8]/span/div/div/div[2]/button")).click();

        sleep(2000);
    }
}
