import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FacteursPremier {


    public static List<Integer> generate(int nbre) {
        return new ArrayList<Integer>();
    }


    public static List<Integer> generate1(int nbr) {
        List<Integer> facteurs = new ArrayList<Integer>();
        if (nbr > 1) {
            facteurs.add(2);
        }
        return facteurs;
    }
}