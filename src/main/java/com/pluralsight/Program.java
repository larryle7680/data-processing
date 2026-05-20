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


        //Traditional Loop to find people from prompting the user to search
        //Prompt the user to find a name
        System.out.println("Please enter a first name to search: ");
        System.out.println();
        String userSearch = theScanner.nextLine();
        
        for(Person name : personList){
            if(name.getFirstName().equalsIgnoreCase(userSearch))
                System.out.println(name);
        }


        //Traditional Loop to add all the ages together
        int totalAge = 0;
        for(Person age : personList){
            totalAge += age.getAge();
        }
        System.out.println("The total age of everyone is " + totalAge);

        //Traditional Loop to find the eldest person
        //Need to Pick a spot in the Array List
        Person eldest = personList.get(0);
        for(Person person : personList){
            if(person.getAge() > eldest.getAge()){
                eldest = person;
            }
        }
        System.out.println("The Eldest Person is: \n" + eldest);

    }

}
