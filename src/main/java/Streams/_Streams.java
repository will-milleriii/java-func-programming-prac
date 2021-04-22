package Streams;


import java.util.List;
import java.util.stream.Collectors;

public class _Streams {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", Person.Gender.MALE),
                new Person("Michele", Person.Gender.FEMALE),
                new Person("Mike", Person.Gender.MALE),
                new Person("Jess", Person.Gender.FEMALE),
                new Person("Josh", Person.Gender.MALE)
        );

        //creating a stream
        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
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

        enum Gender {
            MALE, FEMALE
        }

    }
}
