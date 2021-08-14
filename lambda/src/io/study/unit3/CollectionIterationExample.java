package io.study.unit3;

import io.study.unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionIterationExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Aa", "Kim", 10),
                new Person("Bb", "Park", 20),
                new Person("Cc", "Choi", 30),
                new Person("Dd", "Kim", 40)
        );

        System.out.println("Using for loop");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
        System.out.println("Using for each loop");
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("Using lambda for each loop");
        people.forEach(p-> System.out.println(p));
        people.forEach(System.out::println);
    }
}
