package com.javarush.test.level10.lesson11.home04;

/* Большая зарплата
Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.
Образец:
Я не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] CharArray = s.toCharArray();


      //  System.out.println(CharArray);
        int i = 0;
        while ( i < 40)
        {
            for (int j = i; j < CharArray.length; j++)
            {
                System.out.print(CharArray[j]);

            }
            System.out.println("");
            i++;
        }

        //напишите тут ваш код
    }

}
