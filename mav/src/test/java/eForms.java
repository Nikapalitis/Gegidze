import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class eForms {
    @Test
    public void Forms(){
        Selenide.open("https://dineshvelhal.github.io/testautomation-playground/forms.html");
        $(byId("exp")).sendKeys("1");
        $(byId("exp_help")).shouldHave(Condition.text("1"));
        sleep(200);

        $(byId("check_java")).click();
        $(byId("check_validate")).shouldHave(Condition.text("java"));
        sleep(200);

        $(byId("rad_selenium")).click();
        $(byId("rad_validate")).shouldHave(Condition.text("selenium"));
        sleep(200);

        $(byId("select_tool")).selectOption("Cypress");
        $(byId("select_tool_validate")).shouldHave(Condition.text("cyp"));
        sleep(200);

        $(by("value", "java")).click();
        $(byId("select_lang_validate")).shouldHave(Condition.text("java"));
        sleep(200);

        $(byId("notes")).sendKeys("This is the best Note ever");
        $(byId("area_notes_validate")).shouldHave(Condition.text("This is the best Note ever"));
        sleep(200);

        $(byId("common_sense")).shouldBe(Condition.attribute("readonly"));
        sleep(200);

        $(byText("Speaks German?")).click();
        $(byId("german_validate")).shouldHave(Condition.text("true"));
        sleep(200);


        $(byId("fluency")).setValue("1");
        $(byId("fluency_validate")).shouldNotHave(Condition.text("1"));
        $(byId("salary")).shouldBe(Condition.disabled);
        sleep(200);
        // ======================



        $(byText("Submit Form")).click();
        $(byId("invalid_city")).shouldBe(Condition.visible);
        $(byId("invalid_state")).shouldBe(Condition.visible);
        $(byId("invalid_state")).shouldBe(Condition.visible);
        $(byId("invalid_terms")).shouldBe(Condition.visible);
        sleep(1000);

        $(byId("validationCustom03")).sendKeys("Tbilisi");
        $(byId("validationCustom04")).sendKeys("Georgia");
        $(byId("validationCustom05")).sendKeys("10036");
        $(withText("Agree to")).click();




        sleep(2000);

    }
}
