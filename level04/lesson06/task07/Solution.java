package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Integer t1 = sc.nextInt();
        Integer t2 = sc.nextInt();
        Integer t3 = sc.nextInt();

        if (t1 == t2)
            System.out.println("3");
        else if (t2 == t3)
            System.out.println("1");
        if (t1 == t3)
            System.out.println("2");
    }
}
