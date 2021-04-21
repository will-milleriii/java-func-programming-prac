package FunctionalInterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = increment(0);
        System.out.println(increment);

        int funcInc = incByOneFunc.apply(1);
        System.out.println(funcInc);
    }

    //this function is the same as the increment method below

    static Function<Integer, Integer> incByOneFunc = num -> num + 1;

    static int increment(int num){
        return num + 1;
    }
}
