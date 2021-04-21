package Imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Main {


    public static void main(String[] args) {
       List<Person> people = List.of(
               new Person("John", Gender.MALE),
               new Person("Michele", Gender.FEMALE),
               new Person("Mike", Gender.MALE),
               new Person("Jess", Gender.FEMALE),
               new Person("Josh", Gender.MALE)
       );

        System.out.println("Imperative Approach Below");
        //imperative approach
        List<Person> females = new ArrayList<>();

        for (Person person: people){
            if (Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for (Person female : females){
            System.out.println(female);
        }

        System.out.println("Declarative Approach Below");

        //Declarative approach
        Predicate<Person> personPredicate = person -> Gender.MALE.equals(person.gender);

        List<Person> males = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());
        males.forEach(System.out::println);

    }

    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE
    }

}
