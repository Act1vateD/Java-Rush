package com.javarush.test.level14.lesson08.home01;


public class SuspensionBridge implements Bridge
{

    @Override
    public int getCarsCount()
    {
        int count =0;
        count++;
        count++;

        return count;
    }
}
