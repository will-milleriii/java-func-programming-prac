package CombinatorDesPattern;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(
                "Tim", "tim@gmail.com", "+02321321", LocalDate.of(2000, 2, 10)
        );

        System.out.println(new CustomerValidatorServ().isValidCustomer(customer));

        // using combinator design pattern

        System.out.println(CustomerRegValidation
                .isValidEmail()
                .and(CustomerRegValidation.isValidDob())
                .and(CustomerRegValidation.isValidPhoneNum())
        );



    }

}
