package com.wimix.suite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

/*
 * for specific test classes use
 * @SelectClasses({ClientsTest.class, ServiceTest.class})
 */
@RunWith(JUnitPlatform.class)
@SuiteDisplayName("JUnit Platform Suite")
@SelectPackages("com.wimix.smoke")
public class JUnit5SuiteRunner {
}