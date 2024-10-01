import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;


class FacteursPremierTest {

    @Test
    public static void test_Generates_liste_vide(){
    FacteursPremier F = new FacteursPremier();
    List resultat ;
    resultat = F.generate(1);
    assertThat(resultat).isEqualTo(null);

    }

}s
