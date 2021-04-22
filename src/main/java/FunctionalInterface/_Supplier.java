package FunctionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    //supplier returns any kind of value that you designate

    public static void main(String[] args) {
        System.out.println(getFavoriteSoccerClub());

        //supplier needs .get
        System.out.println(getFavFootballersSupplier.get());
    }

    static String getFavoriteSoccerClub(){
        return "FC Barcelona";
    }

    //supplier version of above code
    static Supplier<List<String>> getFavFootballersSupplier = ()
            -> List.of(
            "Messi",
            "Neymar",
            "Pedri"
    );

}
