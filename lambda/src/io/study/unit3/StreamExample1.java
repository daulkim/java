package io.study.unit3;

import io.study.unit1.Person;

import java.util.Arrays;
import java.util.List;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Aa", "Kim", 10),
                new Person("Bb", "Park", 20),
                new Person("Cc", "Choi", 30),
                new Person("Dd", "Kim", 40)
        );

        people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .forEach(p -> System.out.println(p.getFirstName()));
    }
}
