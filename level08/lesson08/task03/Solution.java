package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();

        System.out.println(getCountTheSameFirstName(map, "Ольга"));
        System.out.println(getCountTheSameLastName(map, "Дякун"));
    }

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("Крячко", "Сергей");
        map.put("Шумейко", "Ольга");
        map.put("Ендовицкий", "Максим");
        map.put("Дякун", "Людмила");
        map.put("Дякун", "Александр");
        map.put("Дякун", "Ольга");
        map.put("Табаков", "Александр");
        map.put("Ярмантович", "Станислав");
        map.put("Скочеляс", "Ольга");
        map.put("Хомышин", "Антон");
        map.put("Андрей", "Серяков");
        map.put("Илья", "Данилов");
        map.put("Илья", "Петров");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count  = 0;
        for(Map.Entry<String, String> pair : map.entrySet()){
            String value = pair.getValue();
            if(name.equals(value)){
                count++;
            }

        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count1= 0;
        for(Map.Entry<String, String> pair1 : map.entrySet()){
            String key = pair1.getKey();

            if(familiya.equals(key)){
                count1++;
            }

        }
        return count1;

    }
}
