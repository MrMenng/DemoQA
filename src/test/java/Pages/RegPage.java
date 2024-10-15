package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegPage {
    private SelenideElement
            userNameInput = $("#userName"),
            userEmailInput = $("#userEmail");

    public void openPage() {
        open("/text-box");
    }

    public void setUserName(String value) {
        userNameInput.setValue(value);
    }

    public void setUserEmail(String value) {
        userEmailInput.setValue(value);
    }
}


