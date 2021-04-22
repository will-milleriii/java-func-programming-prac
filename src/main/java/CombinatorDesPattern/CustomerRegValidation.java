package CombinatorDesPattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface CustomerRegValidation extends Function<Customer, CustomerRegValidation.ValidationResult> {

    static CustomerRegValidation isValidEmail(){
        return customer -> customer.getEmail().contains("@") ?
                ValidationResult.SUCCESS : ValidationResult.EMAIL_INVALID;
    }

    static CustomerRegValidation isValidPhoneNum(){
        return customer -> customer.getPhoneNum().startsWith("+0") ?
                ValidationResult.SUCCESS : ValidationResult.PHONE_NUM_INVALID;
    }

    static CustomerRegValidation isValidDob(){
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ?
                ValidationResult.SUCCESS : ValidationResult.DOB_INVALID;
    }

    default CustomerRegValidation and (CustomerRegValidation other){
        return customer -> {
            ValidationResult validationResult = this.apply(customer);
            return validationResult.equals(ValidationResult.SUCCESS) ? other.apply(customer) : validationResult;
        };
    }


    enum ValidationResult{
        SUCCESS,
        PHONE_NUM_INVALID,
        EMAIL_INVALID,
        DOB_INVALID
    }
}
