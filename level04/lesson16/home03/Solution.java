package com.javarush.test.level04.lesson16.home03;

        import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/
        import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        String stroka;
        while (true) {
            stroka = s.next();
            sum += Integer.parseInt(stroka);
            if (stroka.equals("-1")) {
                break;
            }
        }
        System.out.println(sum);
    }
}