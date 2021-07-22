package io.study;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private int age;
}
