package CombinatorDesPattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorServ {

    public boolean isValidEmail(String email){
        return email.contains("@");
    }

    public boolean isValidPhoneNum(String phoneNum){
        return phoneNum.startsWith("+0");
    }

    public boolean isValidDob(LocalDate dob){
        return Period.between(dob, LocalDate.now()).getYears() > 16;
    }
}
