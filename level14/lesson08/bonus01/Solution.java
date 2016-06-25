package com.javarush.test.level14.lesson08.bonus01;

import javax.xml.bind.ValidationException;
import java.io.ObjectStreamException;
import java.nio.ReadOnlyBufferException;
import java.nio.channels.AcceptPendingException;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.OverlappingFileLockException;
import java.nio.file.FileSystemException;
import java.nio.file.ReadOnlyFileSystemException;
import java.security.acl.LastOwnerException;
import java.sql.BatchUpdateException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.TooManyListenersException;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        for (int j = 0; j < 10; j++)
        {
            try
            {
                float i = 1 / 0;

            }
            catch (Exception e)
            {
                exceptions.add(e);
            }
        }
    }
}