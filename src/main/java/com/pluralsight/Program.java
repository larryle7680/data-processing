package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        //Create an empty List
        List<Person> person = new ArrayList<>();

        //add 10 people to the list
        person.add(new Person("Oliver", "Bennett", 34));
        person.add(new Person("Spencer", "Howell", 44));
        person.add(new Person("Faith", "Townsend", 22));
        person.add(new Person("Alonso", "Rhodes", 60));
        person.add(new Person("Virgil", "Bush", 19));
        person.add(new Person("Riley", "Underwood", 52));
        person.add(new Person("Ester", "Kramer", 12));
        person.add(new Person("Madeleine", "Valencia", 76));
        person.add(new Person("Lenora", "Hurst", 42));
        person.add(new Person("Morton", "Mcmahon", 80));

    }

}
