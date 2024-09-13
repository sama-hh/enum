package org.example;

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
}
