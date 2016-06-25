package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> month = new HashMap<String, Integer>();
        String num = reader.readLine();
        month.put("January", 1);
        month.put("February", 2);
        month.put("March", 3);
        month.put("April", 4);
        month.put("May", 5);
        month.put("June", 6);
        month.put("July", 7);
        month.put("August", 8);
        month.put("September", 9);
        month.put("October", 10);
        month.put("November", 11);
        month.put("December", 12);
        Iterator<Map.Entry<String, Integer>> iterator = month.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            int val = pair.getValue();
            if (num.equalsIgnoreCase(key))
                System.out.println(key + " is " + val + " month");
        }
    }
}
