package demo.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.timeout = 50000;
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1280";
        Configuration.pageLoadStrategy = "none";
    }

    @Test
    void fillFormTest() {
        open("/text-box");
        $("#userName").setValue("Egor");
        $("#userEmail").setValue("Egor@egor.com");
        $("#currentAddress").setValue("Address 1");
        $("#permanentAddress").setValue("Address 2");
        $("#submit").click();

        $("#submit").click();
        $("#output").$("name").shouldHave(text("Egor"));
        $("#output").$("email").shouldHave(text("Egor@egor.com"));
        $("#output").$("currentAddress").shouldHave(text("Address 1"));
        $("#output").$("permanentAddress").shouldHave(text("Address 1"));
    }
}