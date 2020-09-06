package com.sda.jpa.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validators {
    public static boolean validateDateTime(String str) {
        Pattern pattern = Pattern.compile("[0-9]{4}-[0-1][0-9]-[0-3][0-9]{2}T[0-2][0-9]-[0-5][0-9]");
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
}
