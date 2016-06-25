package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String name;
    private double ves = 3.0;
    private int age = 5;
    private String color;
    private String adress;

    public Cat(String name)
    {
        this.name = name;
    }

    public Cat(String name, double ves, int age)
    {
        this.name = name;
        this.ves = ves;
        this.age = age;
    }

    public Cat(String name, int age, double ves)
    {
        this.name = name;
        this.age = age;
        this.ves = ves;
    }

    public Cat(double ves, String color, String name, String adress, int age)
    {
        this.ves = ves;
        this.color = color;
        this.name = null;
        this.adress = null;
        this.age = age;
    }

    public Cat(double ves, String color, String adress)
    {
        this.ves = ves;
        this.color = color;
        this.adress = adress;
    }
}
