package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        int[] num1 = new int[10];
        int[] num2 = new int[10];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
            if (i < 10)
                num1[i] = array[i];
            else
                num2[i - 10] = array[i];
        }
        for (int x : num2)
            System.out.println(x);
    }
}