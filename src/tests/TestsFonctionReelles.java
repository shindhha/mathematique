/*
 * TestsFonctionReelles.java                                  14 mars 2022
 * IUT de Rodez, Info1 2021-2022 Groupe 3, pas de copyright 
 */
package tests;
import static arithmetique.FonctionReellles.*;
/** TODO commenter la responsabilité de cette classe
 * @author guillaume.medard
 *
 */
public class TestsFonctionReelles {
    
    private static void TestPuissance() {

        final int PRECISION = 1000;
        double puissance;

        final double[][] JEU_DE_TEST = {

            {          0.0,          0 },
            {        -56.0,          0 },
            {          0,         73 },
            {        128,          3 },
            {        -54,          3 },
            {     64.128,          3 },
            {          3,         -3 }
            
            
        };

        final double[] RESULTATS_ATTENDU = 
        {1, 1, 0, 2097152, -157464, 263720.011, 0.037};

        for (int noTest = 0; noTest < JEU_DE_TEST.length; noTest++) {

            puissance = Puissance( JEU_DE_TEST[noTest][0] , JEU_DE_TEST[noTest][1] );
            puissance *= PRECISION;
            puissance = (int) puissance;
            puissance /= PRECISION;

            if (  puissance
                == RESULTATS_ATTENDU[noTest] ) {

                System.out.println("Reussite du test puissance no " + ( noTest + 1 ) );
            } else {

                System.out.println("Echec du test puissance no " + ( noTest + 1 ) );
            }
        }


    }
    /**
     * Tests pour la methode Racine
     * 
     */
    private static void TestRacine() {

        final int PRECISION = 1000;
        double racine;

        final double[] JEU_DE_TEST = 
        { 4,-52, 800, 780.12, 0.1 };
        

        final double[] RESULTATS_ATTENDU = 
        { 2, -1, 28.284, 27.930, 0.316 };
            
        
        for (int noTest = 0; noTest < JEU_DE_TEST.length; noTest++) {

            racine = Racine( JEU_DE_TEST[noTest] );
            racine *= PRECISION;
            racine = (int) racine;
            racine /= PRECISION;

            if ( racine == RESULTATS_ATTENDU[noTest] ) {

                System.out.println("Reussite du test Racine no " + ( noTest + 1 ) );
            } else {

                System.out.println("Echec du test Racine no " + ( noTest + 1 ) );
            }
        }
    }

}
