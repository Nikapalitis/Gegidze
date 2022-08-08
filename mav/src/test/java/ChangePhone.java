import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.github.javafaker.Faker;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class ChangePhone extends Credentails{
    @Test
    public void Change() {
        Configuration.browserSize = "1920x1080";



        Selenide.open("https://planner.lineate.com/accounts/login/?next=/employees/%3Fstatus%3Dactive%26left%3Dall%26employment_type%3Demployee");
        $(byId("id_username")).sendKeys("nikoloz_tsekvava");
        $(byId("id_password")).sendKeys("j*9*rsMNrP+vfzEE");
        $(byText("Log in")).click();
        $(byClassName("navbar__username")).click();
        $(byXpath("/html/body/div[1]/header/div[2]/div[2]/ul/li[1]/a")).click();
        $(byText("Edit Profile")).click();


        Faker faker = new Faker();
        faker.phoneNumber();

        $(byId("id_second_phone_number")).sendKeys(faker.number().digits(10));
        sleep(2000);
    }
}
