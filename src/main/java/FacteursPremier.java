import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FacteursPremier {


    public static List<Integer> generate(int nbr) {
        List<Integer> facteurs = new ArrayList<Integer>();
        if (nbr > 1) {
            facteurs.add(nbr);
        }
        return facteurs;
    }
}