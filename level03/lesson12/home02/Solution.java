package com.javarush.test.level03.lesson12.home02;

/* Я не хочу изучать Java, я хочу большую зарплату
Вывести на экран десять раз надпись «Я не хочу изучать Java, я хочу большую зарплату»
*/

public class Solution
{
    public static void main(String[] args)
    {
        String n = "Я не хочу изучать Java, я хочу большую зарплату";
        int i = 0;
        while (i < 10)
        {
            i++;
            System.out.println(n);
        }
    }
}