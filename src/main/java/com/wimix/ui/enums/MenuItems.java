package com.wimix.ui.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MenuItems {

    HOME("Home"),
    SERVICE("Service"),
    CLIENTS("Clients"),
    ABOUT_WIMIX("about WIMIX"),
    CONTACT_US("Contact us");

    public final String value;
}