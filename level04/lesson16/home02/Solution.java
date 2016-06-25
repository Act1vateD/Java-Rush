package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/


import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        Integer n1 = sc.nextInt();
        Integer n2 = sc.nextInt();
        Integer n3 = sc.nextInt();

        if (n1 > n2 && n1 < n3)
            System.out.println(n1);
        else if (n2 > n1 && n2 < n3)
            System.out.println(n2);
        else if (n3 > n2 && n3 < n1)
            System.out.println(n3);
        else if (n1 < n2 && n1 > n3)
            System.out.println(n1);
        else if (n2 < n1 && n2 > n3)
            System.out.println(n2);
        else if (n3 < n2 && n3 > n1)
            System.out.println(n3);
    }
}
