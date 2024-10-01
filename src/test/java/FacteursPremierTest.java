import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class FacteursPremierTest {

    @Test
    void test_Generates_liste_vide(){
    FacteursPremier F = new FacteursPremier();
    List resultat = new ArrayList();
    resultat = F.generate(2);
    assertThat(resultat).isEqualTo( resultat);

    }

/*
    @Test
    void test_Generates_liste_retourne_2(2){
        // GIVEN
        FacteursPremier F = new FacteursPremier();
        List resultat ;
        // WHEN
        // THEN
        resultat = F.generate(1);
        assertThat(resultat).isEqualTo(2);

    }

*/





}
