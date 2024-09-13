package org.example;

//Expand the Person record with an enum Gender (Male, Female, Diverse).
//Write a method in the PersonRepository that counts the number of persons by gender and outputs the results.
//Add a method in the PersonRepository that searches and returns a person by their name. The method should return an Optional.
//Write a method in the PersonRepository that searches and returns all persons by their favorite weekday. The method should return a list.

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(1,"Oliver", Week.FRIDAY, Gender.MALE);
        Person person2 = new Person(2,"Jane", Week.MONDAY, Gender.FEMALE);
        Person person3 = new Person(3,"Jack", Week.WEDNESDAY, Gender.MALE);

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

        //

        personRepository.getPersonsByGender(Gender.FEMALE);
        personRepository.getPersonsByGender(Gender.MALE);

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