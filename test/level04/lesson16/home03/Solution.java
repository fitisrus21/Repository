package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
      /*  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n = Integer.parseInt(s);
*/ BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int sum = 0;
        for (int i=1; i>0; i++)
        {

            String s = reader.readLine();
            int n = Integer.parseInt(s);

            sum += n;
            if (n==-1)
            {

                break;
            }

        }
        System.out.println(sum);
       // System.out.println(sum);
        //напишите тут ваш код
    }
}
