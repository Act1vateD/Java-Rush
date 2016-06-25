package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        ArrayList<Integer> words = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++)
        {
            if (isNumber(array[i])) nums.add(i);
            else words.add(i);
        }

        // сортируем числа
        for (int i = 0; i < nums.size(); i++)
        {
            for (int j = i; j < nums.size(); j++)
            {
                if (Integer.parseInt(array[nums.get(i)]) < Integer.parseInt(array[nums.get(j)]))
                {
                    String tmp = array[nums.get(i)];
                    array[nums.get(i)] = array[nums.get(j)];
                    array[nums.get(j)] = tmp;
                }
            }
        }
        // сортируем слова
        for (int i = 0; i < words.size(); i++)
        {
            for (int j = i; j < words.size(); j++)
            {
                if (isGreaterThen(array[words.get(i)], array[words.get(j)]))
                {
                    String tmp = array[words.get(i)];
                    array[words.get(i)] = array[words.get(j)];
                    array[words.get(j)] = tmp;
                }
            }
        }

    }

    private static boolean isGreaterThen(String s, String s1)
    {
        return s.compareTo(s1) > 0;
    }

    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
