package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String t1 = sc.nextLine();
        String t2 = sc.nextLine();
        if (t1.equals(t2)) {
            System.out.println("Имена идентичны");
        } else if (t1.length() == t2.length()) {
            System.out.println("Длины имен равны");
        }
    }
}

