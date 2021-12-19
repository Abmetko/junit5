package com.wimix.ui;

/*
    javac Application.java
    java Application arg1 arg2 arg3

    or

    java Application.java arg1 arg2 arg3
 */
public class Application {

    public static void main(String[] args) {
        for (String i : args) {
            System.out.println(i);
        }
    }
}