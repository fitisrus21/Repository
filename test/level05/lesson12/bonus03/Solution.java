package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

           int[] m  = new int[n];
        for  (int i =0; i < n; i++)
            m[i] =  Integer.parseInt(reader.readLine());


        int maximum = m[0];


        for (int i=0; i<n; i++)
        {
            if (m[i] > maximum) maximum = m[i];
        }
        System.out.println(maximum);



        //напишите тут ваш код


    }
}
