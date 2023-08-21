package com.kyattonippu;

import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selenide.*;

public class SearchTestSteps {

    public SearchTestSteps openMyShows() {
        open("https://myshows.me/");

        return this;
    }

    public SearchTestSteps searchTvSeries(String seriesname) {
        $(".Search-input").setValue(seriesname).pressEnter();

        return this;
    }

    public SearchTestSteps checkTvSeries(String seriesname) {
        $(".DefaultLayout-content").shouldHave(Condition.text(seriesname));

        return this;
    }
}
