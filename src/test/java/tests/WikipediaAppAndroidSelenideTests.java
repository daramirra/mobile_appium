package tests;

import annotations.JiraIssue;
import annotations.JiraIssues;
import io.appium.java_client.MobileBy;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class WikipediaAppAndroidSelenideTests extends TestBase {

    @Test
    @Owner("dlapshinova")
    @JiraIssues({@JiraIssue("HOMEWORK-268")})
    void checkContentTest() {

        step("Экран содержит запись 'The Free Encyclopedia …in over 300 languages'", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("The Free Encyclopedia …in over 300 languages"));
        });

        step("Нажать 'Сontinue'", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click());

        step("Экран содержит запись 'New ways to explore'", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("New ways to explore"));
        });

        step("Нажать 'Сontinue'", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click());

        step("Экран содержит запись 'Reading lists with sync'", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("Reading lists with sync"));
        });

        step("Нажать 'Сontinue'", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click());

        step("Экран содержит запись 'Send anonymous data'", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("Send anonymous data"));
        });
    }
}
