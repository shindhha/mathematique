/*
 * TestsFonctionReelles.java                                  14 mars 2022
 * IUT de Rodez, Info1 2021-2022 Groupe 3, pas de copyright 
 */
package tests;
import static arithmetique.FonctionReellles.*;
import static tests.Outillage.AssurerEgalite;
/** TODO commenter la responsabilité de cette classe
 * @author guillaume.medard
 *
 */
public class TestsFonctionReelles {
    
    private TestsFonctionReelles() {
    }
    
    private static void TestPuissance() {
        
        boolean ok;
        final double PRECISION = 0;
        
        ok = AssurerEgalite(Math.pow(0, 0), Puissance(0.0,0), PRECISION);
        ok &= AssurerEgalite(Math.pow(-56.0,0), Puissance(-56.0,0), PRECISION);
        ok &= AssurerEgalite(Math.pow(0, 0), Puissance(0.0,0), PRECISION);
        ok &= AssurerEgalite(Math.pow(128.0,3), Puissance(128.0,3), PRECISION);
        ok &= AssurerEgalite(Math.pow(-54,3), Puissance(-54,3), PRECISION);
        ok &= AssurerEgalite(Math.pow(64.128,3), Puissance(64.128,3), PRECISION);
        ok &= AssurerEgalite(Math.pow(3,-3), Puissance(3,-3), PRECISION);
        System.out.println(ok);
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
    
    /**
     * TODO commenter le rôle de cette méthode (SRP)
     * @param args non utilisé
     */
    public static void main(String[] args) {
        TestPuissance();
    }

}
