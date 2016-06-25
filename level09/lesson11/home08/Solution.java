package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<int[]>();
        int[] mas1 = new int[]{13, 412, 123, 412, 123};
        int[] mas2 = new int[]{13312, 412342};
        int[] mas3 = new int[]{12313, 41312, 123113, 421212};
        int[] mas4 = new int[]{0013, 41200, 1233, 41682, 12993, 567, 23412};
        int[] mas5 = new int[0];
        list.add(mas1);
        list.add(mas2);
        list.add(mas3);
        list.add(mas4);
        list.add(mas5);

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
