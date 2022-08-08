import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Planner {
    @Test
    public void SkillAdd(){
        Configuration.browserSize = "1920x1080";

        Selenide.open("https://planner.lineate.com/accounts/login/?next=/employees/%3Fstatus%3Dactive%26left%3Dall%26employment_type%3Demployee");
        $(byId("id_username")).sendKeys("nikoloz_tsekvava");
        $(byId("id_password")).sendKeys("j*9*rsMNrP+vfzEE");
        $(byText("Log in")).click();
        $(byId("nameFilter")).sendKeys("Nikoloz");
        sleep(2000);
        $(byXpath("//*[@id=\"content\"]/div[2]/div/div[2]/div[2]/div[157]  /div[2]/h3/a")).click();
        $(byText("Add Skills")).click();
        $(byId("jstree-search")).sendKeys("QA");
        $(byXpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/ul/li[1]/ul/li[48]")).click();
        $(byText("Next Step")).click();
        sleep(1000);
        $(byXpath("//*[@id=\"NewSkillsTable\"]/tbody/tr/td[2]/span/span[2]")).click();
        $(by("data-select", "attitude")).selectOption("Interested");
        sleep(500);
        $(byId("saveNewSkills")).click();
        $(byText("QA: Git")).shouldBe(Condition.visible);
        sleep(1000);
    }
}