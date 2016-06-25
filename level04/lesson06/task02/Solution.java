package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        Integer t1 = sc.nextInt();
        Integer t2 = sc.nextInt();
        Integer t3 = sc.nextInt();
        Integer t4 = sc.nextInt();

        if (t1 > t2 && t1>t3 && t1 > t4){
            System.out.println(t1);}
        else if (t2 > t1 && t2 >t3 && t2 > t4){
        System.out.println(t2);}
        else if (t3 > t1 && t3 >t2 && t3 > t4){
            System.out.println(t3);}
        else if (t4 > t1 && t4 >t3 && t4 > t2){
            System.out.println(t4);}
    }
}
