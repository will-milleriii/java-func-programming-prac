package FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        //function takes one argument and produces one result
        int increment = increment(0);
        System.out.println(increment);

        int funcInc = incByOneFunc.apply(1);
        System.out.println(funcInc);

        int multFunc = multByTen.apply(funcInc);
        System.out.println(multFunc);

        int addMult = addThenMultFunc.apply(2);
        System.out.println(addMult);

        //BiFunction ex takes two arguments and returns one result
        System.out.println(addThenMultBiFunc.apply(5, 4));

    }

    //this function is the same as the increment method below

    static Function<Integer, Integer> incByOneFunc = num -> num + 1;

    static Function<Integer, Integer> multByTen = num -> num * 10;

    //use andThen function to execute multiple functions inline
    static Function<Integer, Integer> addThenMultFunc = incByOneFunc.andThen(multByTen);

    //BiFunction example
    static BiFunction<Integer, Integer, Integer> addThenMultBiFunc =
            (numToInc, numToMultBy) -> (numToInc + 1) * numToMultBy;

    static int increment(int num){
        return num + 1;
    }
}
