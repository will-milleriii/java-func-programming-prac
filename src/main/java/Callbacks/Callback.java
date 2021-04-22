package Callbacks;

import java.util.function.Consumer;

public class Callback {

    public static void main(String[] args) {

        hello("Joe", null, value -> {
            System.out.println("No last name provided for " + value);
        });

    }

    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);
        if (lastName != null){
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }

    }

}
