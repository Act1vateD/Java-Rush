package com.javarush.test.level07.lesson09.task05;

import java.util.ArrayList;
import java.util.Scanner;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        //read strings and init ArrayList list here - считать строки с консоли и объявить ArrayList list тут
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; i < 10; i++){
            list.add(scanner.nextLine());
        }
        ArrayList<String> result = doubleValues(list);

        for(String x : result){
            System.out.println(x);
        }
        //print result - вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        int size = list.size();
        for(int i = 0; i < size * 2; i += 2){
            list.add(i, list.get(i));

        }
        return list;
    }
}
