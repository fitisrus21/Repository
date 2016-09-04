package com.javarush.JavaRush.myData;

/**
 * Created by Михаил on 04.09.2016.
 */
public class TestMethod
{
    String name;
    int age;

    public TestMethod(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

   // TestMethod men = new TestMethod("Михаил", 31);

    public static void print(TestMethod men)
    {
        System.out.println(men.name);
    }

    public static void main(String[] args)
    {
        TestMethod men = new TestMethod("Михаил", 31);
        print(men);
    }
}
