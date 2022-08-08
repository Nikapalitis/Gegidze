import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Person {
    @Test
    public void Goals(){
        Configuration.browserSize = "1920x1080";

        Selenide.open("https://planner.lineate.com/accounts/login/?next=/employees/%3Fstatus%3Dactive%26left%3Dall%26employment_type%3Demployee");
        $(byId("id_username")).sendKeys("nikoloz_tsekvava");
        $(byId("id_password")).sendKeys("j*9*rsMNrP+vfzEE");
        $(byText("Log in")).click();
        $(byClassName("navbar__username")).click();
        $(byText("Goals")).click();
        $(byText("Add Subgoal")).click();
        $(byXpath("//*[@id=\"content\"]/div[2]/div/div[2]/div/div/div/div[2]/div[2]/span/div/div[3]/div/div[1]/span/input")).sendKeys("New SubGoal");
        $(byText("Save")).click();
        sleep(2000);
    }

    @Test
    public void GoalsEdit(){
        Selenide.open("https://planner.lineate.com/accounts/login/?next=/employees/%3Fstatus%3Dactive%26left%3Dall%26employment_type%3Demployee");
        $(byId("id_username")).sendKeys("nikoloz_tsekvava");
        $(byId("id_password")).sendKeys("j*9*rsMNrP+vfzEE");
        $(byText("Log in")).click();
        $(byClassName("navbar__username")).click();
        $(byText("Goals")).click();
        $(by("title", "Delete goal")).click();
    }
}