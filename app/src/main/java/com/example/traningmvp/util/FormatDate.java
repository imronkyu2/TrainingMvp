package com.example.traningmvp.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {
    public static String date(String input) {
        try {
            SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
            Date date = fmt.parse(input);

            SimpleDateFormat fmtOut = new SimpleDateFormat("dd MMM yyyy");
            return fmtOut.format(date);

        } catch (ParseException e) {
            e.printStackTrace();
            return input;
        }
    }
}
