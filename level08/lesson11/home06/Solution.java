package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> children = new ArrayList<Human>();
        Human father = new Human("father", true, 55, children);
        Human mother = new Human("mother", false, 48, children);
        ArrayList<Human> papmam = new ArrayList<Human>();
        papmam.add(father);
        papmam.add(mother);
        Human child1 = new Human("Ванечка", true, 12, papmam);
        Human child2 = new Human("Петенька", true, 9, papmam);
        Human child3 = new Human("Илонка", false, 5, papmam);
        children.add(child1);
        children.add(child2);
        children.add(child3);
        Human grandFather = new Human("grandFather", true, 90, papmam);
        Human grandFather1 = new Human("grandFather1", true, 88, papmam);
        Human grandMother = new Human("grandMother", false, 85, papmam);
        Human grandMother1 = new Human("grandMother1", false, 82, papmam);

        System.out.println(grandFather);
        System.out.println(grandFather1);
        System.out.println(grandMother);
        System.out.println(grandMother1);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }
}
