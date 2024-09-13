package org.example;

import java.util.*;

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

    public Optional<Person> findByName(String name) {
        for (Person person : persons.values()) {
            if (person.name().equals(name)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public List<Person> findPersonsByWeekday(Week weekday) {
        List<Person> personsList = new ArrayList<>();
        for (Person person : persons.values()) {
            if (person.favoriteDay() == weekday) {
                personsList.add(person);
            }
        }
        return personsList;
    }
}
