package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String st = reader.readLine();
        SimpleDateFormat formatForDate = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        try {
            date = formatForDate.parse(st);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        SimpleDateFormat formatForDateNow = new SimpleDateFormat("MMM dd, yyyy", Locale.US);
        System.out.println(formatForDateNow.format(date).toUpperCase());
    }
}
