package io.study.unit3;

import io.study.unit1.Person;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Aa", "Kim", 10),
                new Person("Bb", "Park", 20),
                new Person("Cc", "Choi", 30),
                new Person("Dd", "Kim", 40)
        );
        System.out.println("Printing all persons");
        // System.out :: println === p -> System.out.println(p)
        performConditionally(people, p -> true, System.out :: println);

    }

    private static void performConditionally(List<Person> people,
                                             Predicate<Person> predicate,
                                             Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }


}
