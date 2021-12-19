package com.wimix.ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.$;

public class ContainerHeader {

    public final SelenideElement componentContainer = $(Locators.ROOT);

    public ElementsCollection getMenuItems() {
        return componentContainer.$$(Locators.MENU_ITEM);
    }

    public SelenideElement getMenuItem(String name) {
        return getMenuItems()
                .stream()
                .filter(menuItem -> menuItem.getText().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow();
    }

    public void selectHeaderMenu(String name) {
        getMenuItem(name)
                .shouldBe(Condition.enabled)
                .shouldBe(Condition.visible)
                .click();
    }

    public boolean isMenuItemSelected(String name) {
        return Objects.requireNonNull(getMenuItem(name).getAttribute("class")).contains("active");
    }

    private static class Locators {
        private static final String ROOT = "div.container";
        private static final String MENU_ITEM = "li > a";
    }
}