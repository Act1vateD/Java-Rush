package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            String str = reader.readLine();
            list.add(str);
        }
        String max = "";
        for (int i = 0; i < 5; i++) {
            String a = list.get(i);
            if (max.length() < a.length())
                max = a;
        }
        for (int i = 0; i < 5; i++) {
            String a = list.get(i);
            if (max.length() == a.length())
                System.out.println(list.get(i));
        }
    }
}
