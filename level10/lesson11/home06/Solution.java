package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public static class Human
    {
        private String name;
        private int age;
        private boolean sex;
        private String job;
        private String houseAdress;
        private String proffessoin;

        public Human(String job, String proffessoin)
        {
            this.job = job;
            this.proffessoin = proffessoin;
        }

        public Human(String name, int age, boolean sex, String proffessoin, String job)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.proffessoin = proffessoin;
            this.job = job;
        }

        public Human(String name, int age, boolean sex, String houseAdress)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.houseAdress = houseAdress;
        }

        public Human(String name, String job, String proffessoin)
        {
            this.name = name;
            this.job = job;
            this.proffessoin = proffessoin;
        }

        public Human(String name, boolean sex, String houseAdress)
        {
            this.name = name;
            this.sex = sex;
            this.houseAdress = houseAdress;
        }

        public Human(int age, String proffessoin)
        {
            this.age = age;
            this.proffessoin = proffessoin;
        }

        public Human(String name, int age, boolean sex, String job, String houseAdress, String proffessoin)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.job = job;
            this.houseAdress = houseAdress;
            this.proffessoin = proffessoin;
        }

        public Human(String name, boolean sex, String houseAdress, String proffessoin)
        {
            this.name = name;
            this.sex = sex;
            this.houseAdress = houseAdress;
            this.proffessoin = proffessoin;
        }

        public Human(boolean sex, String job, String proffessoin)
        {
            this.sex = sex;
            this.job = job;
            this.proffessoin = proffessoin;
        }

        public Human(boolean sex, String proffessoin)
        {
            this.sex = sex;
            this.proffessoin = proffessoin;
        }
    }
}
