package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException, Exception
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader buf = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));

        ArrayList<Integer> list = new ArrayList<Integer>();
        String line;
        while ((line = buf.readLine())!= null){

            list.add(Integer.parseInt(line));


        }
        Collections.sort(list);
        for (Integer num : list){
            if (num % 2 == 0)
            {
                System.out.println(num);
            }
        }
        buf.close();
    }
}
