package org.example;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PersonRepository {

    Map<Integer, Person> persons = new HashMap<>();

    public Optional<Person> findById(int id) {
        return Optional.ofNullable(persons.get(id));
    }

    public void add(Person person) {
        persons.put(person.id(), person);
    }

    public void getPersonsByGender(Gender gender) {
        int count = 0;
        for (Person person : persons.values()) {
            if (person.gender() == gender) {
                count++;
            }
        }
        System.out.println(gender + " count: " + count);
    }
}
