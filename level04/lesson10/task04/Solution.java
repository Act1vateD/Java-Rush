package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/


public class Solution {
    public static void main(String[] args) throws Exception {
        int i = 0;
        String s = "SSSSSSSSSS";
        while (i < 10) {
            System.out.println(s);
            i++;}
    }
}