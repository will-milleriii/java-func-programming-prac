package FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        //normal java example
        Customer austin = new Customer("Austin", "215-222-2321");
        greetCustomer(austin);

        //Consumer example
        greetCustomerConsumer.accept(austin);

        //Bi-Consumer example
        greetCustomerBiConsumer.accept(austin, false);
    }

    //Bi-Consumer ex
    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNum) ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number  "+
            (showPhoneNum ? customer.customerPhoneNumber : "********"));



    //Consumer (functional approach)
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName +
            ", thanks for registering phone number " + customer.customerPhoneNumber);


    //normal Java Function
    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number " + customer.customerPhoneNumber);
    }

    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber){
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }

}
