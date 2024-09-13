package org.example;

//Step 1: Create an enum DaysOfWeek with the weekdays (Monday to Sunday).
//Step 2: Write a method that returns the passed weekday as a string if it is a weekday (Monday to Friday), otherwise return 'Weekend'.
//Step 3: Create a record 'Person' with the properties 'id', 'name', and 'favoriteDay', where 'favoriteDay' is of type DaysOfWeek.
//Step 4: Create a class PersonRepository with a list/map of persons.
//Step 5: Write a method in the class PersonRepository that searches for and returns a person based on their id from the list/map.
// The method should return an Optional.
//Step 6: In your main method, check if the person exists. If they do, print the name and favorite day of the week to the console.

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(1,"Oliver", Week.FRIDAY);
        Person person2 = new Person(2,"Bob", Week.MONDAY);
        Person person3 = new Person(3,"Jack", Week.WEDNESDAY);

        PersonRepository personRepository = new PersonRepository();
        personRepository.add(person1);
        personRepository.add(person2);
        personRepository.add(person3);

        int personId = 5;
        if (personRepository.findById(personId).isPresent()){
            System.out.println("Name: " + personRepository.findById(personId).get().name() + " Favorite day of week: " + personRepository.findById(personId).get().favoriteDay());
        }
        else {
            System.out.println("There is no person with id " + personId);
        }

    }

    public static String getWeekDay(Week day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
                return day.toString();
            case SATURDAY, SUNDAY:
                return "Weekend";
            default:
                return "No such week day";
        }
    }
}