package com.javarush.test.level04.lesson06.task05;

/* 18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
*/

import java.io.*;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String t1 = sc.nextLine();
        Integer t2 = sc.nextInt();
        if (t2 < 18)
            System.out.println("Подрасти еще");
    }
}