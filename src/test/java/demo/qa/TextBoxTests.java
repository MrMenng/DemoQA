package demo.qa;

import Pages.RegPage;
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
        Configuration.timeout = 10000;
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1280";
        Configuration.pageLoadStrategy = "none";
    }

    @Test
    void fillFormTest() {
        String userName = "Egor";

        new RegPage().openPage();

        new RegPage().setUserName(userName);
        new RegPage().setUserEmail("Egor@egor.com");

        $("#userEmail").setValue("Egor@egor.com");
        $("#currentAddress").setValue("Address 1");
        $("#permanentAddress").setValue("Address 2");
        $("#submit").click();

        $("#output").$("#name").shouldHave(text("Egor"));
        $("#output").$("#email").shouldHave(text("Egor@egor.com"));
        $("#output").$("#currentAddress").shouldHave(text("Address 1"));
        $("#output").$("#permanentAddress").shouldHave(text("Address 2"));
    }
}