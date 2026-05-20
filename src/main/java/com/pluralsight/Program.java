package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Program {
static Scanner theScanner = new Scanner(System.in);
    public static void main(String[] args) {

        //Create an empty List
        List<Person> personList = new ArrayList<>();

        //add 10 people to the list
        personList.add(new Person("Oliver", "Bennett", 34));
        personList.add(new Person("Spencer", "Howell", 44));
        personList.add(new Person("Faith", "Townsend", 22));
        personList.add(new Person("Alonso", "Rhodes", 60));
        personList.add(new Person("Virgil", "Bush", 19));
        personList.add(new Person("Riley", "Underwood", 52));
        personList.add(new Person("Ester", "Kramer", 12));
        personList.add(new Person("Madeleine", "Valencia", 76));
        personList.add(new Person("Lenora", "Hurst", 42));
        personList.add(new Person("Morton", "Mcmahon", 80));

        //Prompt the user to find a name
        System.out.println("Please enter a first name to search: ");
        System.out.println();
        String userSearch = theScanner.nextLine();
        
        for(Person name : personList){
            if(name.getFirstName().equalsIgnoreCase(userSearch))
                System.out.println(name);
        }

    }

}
