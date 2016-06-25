package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Integer t1 = sc.nextInt();
        Integer t2 = sc.nextInt();
        Integer t3 = sc.nextInt();
        int count = 0;

        if (t1 > 0)
            count++;
        else
            count = 0;

        if (t2 > 0)
            count++;
        else
            count = 0;

        if (t3 > 0)
            count++;
        else
            count = 0;

        System.out.println(count);
    }
}
