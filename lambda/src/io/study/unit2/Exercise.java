package io.study.unit2;

import io.study.unit1.Person;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Exercise {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Aa", "Kim", 10),
                new Person("Bb", "Park", 20),
                new Person("Cc", "Choi", 30),
                new Person("Dd", "Kim", 40)
                );

        // Step 1: Sort list by last name

        /*
            java 7
        */
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        /*
            java 8
        */
        Collections.sort(people, (Person o1, Person o2) -> o1.getLastName().compareTo(o2.getLastName()));

        // step 2: Create a method that prints all elements in the list
        /*
            java 7
        */
        System.out.println("Print All Person");
        printAll(people);

        /*
            java 8
        */
        printConditionallyWithPredicate(people, person -> true);
        printConditionallyWithConsumer(people, person -> true, person -> System.out.println(person));

        // step 3: Create a method that prints all people that have last name beginning with C
        /*
            java 7
        */
        System.out.println("Print All Person with last name beginning with C");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person person) {
                return person.getLastName().startsWith("C");
            }
        });
        /*
            java 8
        */
        printConditionallyWithPredicate(people, person -> person.getLastName().startsWith("C"));
        printConditionallyWithConsumer(people, person -> person.getLastName().startsWith("C"), person -> System.out.println(person));
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person person : people) {
            if(condition.test(person)){
                System.out.println(person);
            }
        }
    }

    // Predicate -> boolean test() ?????? -> ?????? ????????????X
    private static void printConditionallyWithPredicate(List<Person> people, Predicate<Person> predicate) {
        for (Person person : people) {
            if(predicate.test(person)){
                System.out.println(person);
            }
        }
    }

    // Predicate -> boolean test() ?????? -> ?????? ????????????X
    private static void printConditionallyWithConsumer(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person person : people) {
            if(predicate.test(person)){
                consumer.accept(person);
            }
        }
    }

    /*
    for java 7
     */
    private static void printAll(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

interface Condition {
    boolean test(Person person);
}
