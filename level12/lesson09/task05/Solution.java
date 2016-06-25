package com.javarush.test.level12.lesson09.task05;

/* Класс Human и интерфейсы Run, Swim
Напиши public класс Human(человек) и  public интерфейсы Run(бежать/ездить), Swim(плавать).
Добавь в каждый интерфейс по одному методу.
Добавь эти интерфейсы классу Human, но не реализуй методы.
Объяви класс Human абстрактным.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public abstract class Human implements Run, Swim
    {
        public int cross(int km)
        {
            return 0;
        }

        public int distance(int metr)
        {
            return 0;
        }
    }

    public interface Run
    {
        public int cross(int km);

    }

    public interface Swim
    {
        public int distance(int metr);

    }
}
