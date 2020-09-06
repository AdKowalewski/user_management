package com.sda.jpa.utils;

import java.util.Scanner;

public class InputHelper {
    private InputHelper() {
        //NOP
    }

    private static Scanner scanner;

    public static Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
}
