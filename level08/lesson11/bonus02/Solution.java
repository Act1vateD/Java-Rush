package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/


public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<String, String>(); //список городов и фамилий в мапу/базу

        while (true)
        {
            String sity1 = reader.readLine();
            if (sity1.isEmpty())
                break;
            else {
                String lastName = reader.readLine();
                map.put(sity1, lastName);
            }
        }
        System.out.println("dawd name:");
        String cityKeyboard = reader.readLine(); //считываем с клавиатуры город, по которому нужно узнать фамилию

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getKey().equals(cityKeyboard))
                System.out.println(pair.getValue());
        }
    }
}

