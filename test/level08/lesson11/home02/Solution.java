package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> cats = new HashSet<Cat>();

        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        //напишите тут ваш код

        return cats;
    }

    public static Set<Dog> createDogs()
    {
        HashSet<Dog> dogs = new HashSet<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

        //напишите тут ваш код
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        HashSet<Object> pets = new HashSet<>();
        //напишите тут ваш код
        Iterator iterator  = dogs.iterator();
        while (iterator.hasNext()){
            pets.add(iterator.next());
        }

        Iterator iterator1 = cats.iterator();
        while (iterator1.hasNext()){
            pets.add(iterator1.next());
        }

        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        Iterator iterator = cats.iterator();
       // Iterator iteratorP = pets.iterator();
        while (iterator.hasNext())
        {
            pets.remove(iterator.next());
        }
        //напишите тут ваш код
    }

    public static void printPets(Set<Object> pets)
    {
        Iterator iterator = pets.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


     /*  for (Object x : pets){
           System.out.println(x);
       }*/
        //напишите тут ваш код
    }

    public static class Cat{

    }
    public  static class Dog{

    }

    //напишите тут ваш код
}
