package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = reader.readLine();
        int nNum = Integer.parseInt(sNum);

        if (nNum == 1) System.out.println("понедельник");
        if (nNum == 2) System.out.println("вторник");
        if (nNum == 3) System.out.println("среда");
        if (nNum == 4) System.out.println("четверг");
        if (nNum == 5) System.out.println("пятница");
        if (nNum == 6) System.out.println("суббота");
        if (nNum == 7) System.out.println("воскресенье");
        if ((nNum >7)||(nNum<1) ) System.out.println("такого дня недели не существует");
        //напишите тут ваш код

    }

}