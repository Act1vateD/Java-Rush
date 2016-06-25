package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        HashMap<String, Cat> map = new HashMap<String, Cat>();
        map.put("barsik", new Cat("barsik"));
        map.put("persik", new Cat("perrsik"));
        map.put("muska", new Cat("muska"));
        map.put("koshka", new Cat("koshka"));
        map.put("koshko", new Cat("koshko"));
        map.put("barsik1", new Cat("barsik1"));
        map.put("persik1", new Cat("perrsik1"));
        map.put("muska1", new Cat("muska1"));
        map.put("koshka1", new Cat("koshka1"));
        map.put("koshko1", new Cat("koshko1"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        HashSet<Cat> cats = new HashSet<Cat>();
        for (Map.Entry<String, Cat> s : map.entrySet())
        {
            Cat a = s.getValue();
            cats.add(a);
        }
        return cats;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat : set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat " + this.name;
        }
    }
}
