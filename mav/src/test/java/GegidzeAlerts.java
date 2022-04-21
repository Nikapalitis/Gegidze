import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideTargetLocator;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GegidzeAlerts {
    @Test
    public void Alerts(){
        Selenide.open("https://www.way2automation.com/way2auto_jquery/alert.php#load_box");
        switchTo().frame($(byXpath("//*[@id=\"example-1-tab-1\"]/div/iframe")));
        $(byXpath("/html/body/button")).click();
        sleep(1000);
        Selenide.confirm();
        sleep(2000);
    }
}
