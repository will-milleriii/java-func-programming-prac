package Lambdas;

import java.util.Locale;
import java.util.function.BiFunction;

public class Lambdas {

    public static void main(String[] args) {

        Integer num = null;

        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            int count = 0;
            //logic
            if (name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(upperCaseName.apply("Adam", null));

    }



}
