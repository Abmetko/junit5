package com.wimix;

import com.codeborne.selenide.Selenide;
import com.wimix.suite.JUnit5SuiteRunner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Configuration.timeout;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith({SetupExtension.class})
public abstract class Base extends JUnit5SuiteRunner {

    private static final String URL = "https://wimix.com/";
    protected boolean isPageOpen;

    @BeforeAll
    void setUp() {
        timeout = 10000;
        open(URL);
    }

    @AfterAll
    void tearDown() {
        closeWebDriver();
    }

    @AfterEach
    public void sleep() {
        Selenide.sleep(1000);
    }
}