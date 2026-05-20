package com.pluralsight.streams;
import com.pluralsight.Person;

import javax.print.attribute.standard.MediaSize;
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

        //Prompt User for the name
        System.out.println("What is the first name you're searching for");
        String nameSearch = theScanner.nextLine();

        personList.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase(nameSearch))
                .forEach(System.out::println);

    }
}
