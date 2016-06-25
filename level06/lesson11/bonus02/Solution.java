package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String grandFaName = br.readLine();
        Cat grandFaVasya = new Cat(grandFaName);
        String grandMaName = br.readLine();
        Cat grandMaMurka = new Cat(grandMaName);
        String FaName = br.readLine();
        Cat FaKotofey = new Cat(FaName, grandFaVasya, null);
        String MoName = br.readLine();
        Cat MaVasilissa = new Cat(MoName, null, grandMaMurka);
        String SonMurchikName = br.readLine();
        Cat SonMurchik = new Cat(SonMurchikName, FaKotofey, MaVasilissa);
        String DauName = br.readLine();
        Cat DauPush = new Cat(DauName, FaKotofey, MaVasilissa);
        System.out.println(grandFaVasya);
        System.out.println(grandMaMurka);
        System.out.println(FaKotofey);
        System.out.println(MaVasilissa);
        System.out.println(SonMurchik);
        System.out.println(DauPush);
    }

    public static class Cat
    {
        private String name;
        private Cat mom, dad;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat dad, Cat mom)
        {
            this.name = name;
            this.dad = dad;
            this.mom = mom;
        }

        @Override
        public String toString()
        {
            boolean m, d;
            m = (mom == null);
            d = (dad == null);
            if (m && d)
                return "Cat name is " + name + ", no mother, no father";
            else if (d)
                return "Cat name is " + name + ", mother is " + mom.name + ", no father";
            else if (m)
                return "Cat name is " + name + ", no mother," + " father is " + dad.name;
            else
                return "Cat name is " + name + ", mother is " + mom.name + ", father is " + dad.name;
        }
    }
}