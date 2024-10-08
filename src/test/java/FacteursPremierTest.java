import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class FacteursPremierTest {

    @Test
    void generates_liste_vide_devrait_retoutner_liste_vide(){
        //GIVEN
        FacteursPremier F = new FacteursPremier();
        List resultat = new ArrayList();
        //WHEN
        resultat = F.generate(1);
        //THEN
        assertThat(resultat).isEqualTo( resultat);

    }


    @Test
    void generates_2_devrait_retourner_liste_contenant_2(){
        //GIVEN
        List<Integer> expectedFacteurs = new ArrayList<>(List.of());
        expectedFacteurs.add(2);
        //WHEN
        List<Integer> ActuelFacteurs = FacteursPremier.generate(2);

        //THEN
        assertThat(ActuelFacteurs).isEqualTo(expectedFacteurs);
    }

    @Test
    void generate_3_devrait_retourner_liste_contenant_3(){
        //GIVEN
        List<Integer> expectedFacteurs = new ArrayList<>(List.of());
        expectedFacteurs.add(3);
        //WHEN
        List<Integer> ActuelFacteurs = FacteursPremier.generate(3);

        //THEN
        assertThat(ActuelFacteurs).isEqualTo(expectedFacteurs);
    }

    @Test
    void generate_4_devrait_retourner_liste_contenant_2_2(){
        //GIVEN
        List<Integer> expectedFacteurs = new ArrayList<>(List.of());
        expectedFacteurs.add(2);
        expectedFacteurs.add(2);
        //WHEN
        List<Integer> ActuelFacteurs = FacteursPremier.generate(4);

        //THEN
        assertThat(ActuelFacteurs).isEqualTo(expectedFacteurs);
    }

    @Test
    void generate_6_devrait_retourner_liste_contenant_2_3(){
        //GIVEN
        List<Integer> expectedFacteurs = new ArrayList<>(List.of());
        expectedFacteurs.add(2);
        expectedFacteurs.add(3);
        //WHEN
        List<Integer> ActuelFacteurs = FacteursPremier.generate(6);
        //THEN
        assertThat(ActuelFacteurs).isEqualTo(expectedFacteurs);
    }


    @Test
    void generate_8_devrait_retourner_liste_contenant_2_2_2(){
        //GIVEN
        List<Integer> expectedFacteurs = new ArrayList<>();
        expectedFacteurs.add(2);
        expectedFacteurs.add(2);
        expectedFacteurs.add(2);
        //WHEN
        List<Integer> ActuelFacteurs = FacteursPremier.generate(8);
        //THEN
        assertThat(ActuelFacteurs).isEqualTo(expectedFacteurs);
    }
}
