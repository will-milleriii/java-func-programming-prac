package FunctionalInterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println("Without predicate");
        System.out.println(isValidPhoneNum("07000020102"));
        System.out.println(isValidPhoneNum("09021234932"));
        System.out.println(isValidPhoneNum("070111121"));

        System.out.println("With Predicate");
        System.out.println(isValidPhoneNumPred.test("07000020102"));
        System.out.println(isValidPhoneNumPred.test("09021234932"));
        System.out.println(isValidPhoneNumPred.test("070111121"));

        // using multiple predicates with and
        System.out.println(isValidPhoneNumPred.and(containsNumber).test("07000020102"));

    }

    static boolean isValidPhoneNum(String phoneNum){
        return phoneNum.startsWith("07") && phoneNum.length() == 11;
    }

    static Predicate<String> isValidPhoneNumPred = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber = phoneNumber ->
            phoneNumber.contains("1");


}
