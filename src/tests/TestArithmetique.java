/*
 * TestArithmetique.java                                          DATE : 26/01/2022
 * INFO1 2021-2022 , iut RODEZ 
 * Pas de droit d'auteur ni de copyright .
 */

package src.tests;

import static src.arithmetique.Arithmetique.pgcd;
import static src.arithmetique.Arithmetique.ppcm;
import static src.arithmetique.Arithmetique.Puissance;
import static src.arithmetique.Arithmetique.Racine;
import static src.arithmetique.Arithmetique.IEEEToDouble;

/**
 * Liste de tests pour les méthodes de la classe Arithmetique
 * 
 * 
 * @author Guillaume MEDARD
 */
public class TestArithmetique {


    private TestArithmetique() {
    }
    
    private static void TestPuissance() {

        final int PRECISION = 1000;
        double puissance;

        final double[][] JEU_DE_TEST = {

            {          0,          0 },
            {        -56,          0 },
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
    private static void TestPgcd() {

        
        final int[][] JEU_DE_TEST = {

            {          0,          0 },
            {        -56,          0 },
            {          0,         73 },
            {        128,        128 },
            {        -54,        -93 },
            {         64,        -24 },
            {         11,          7 },
            {      17894,      12345 },
            { 1000000000,-2000000000 }
            
        };

        final int[] RESULTATS_ATTENDU = 
        {0, 0, 0, -8, 128, -3, 1, -8, 77, 1, 1000000000};
            
        

        for (int noTest = 0; noTest < JEU_DE_TEST.length; noTest++) {

            if ( pgcd( JEU_DE_TEST[noTest][0] , JEU_DE_TEST[noTest][1] ) 
                == RESULTATS_ATTENDU[noTest] ) {

                System.out.println("Reussite du test pgcd no " + ( noTest + 1 ) );
            } else {

                System.out.println("Echec du test pgcd no " + ( noTest + 1 ) );
            }
        }

    }


    private static void TestPpcm() {

        
        final int[][] JEU_DE_TEST = {

            {          0,          0 },
            {        -56,          0 },
            {          0,         73 },
            {        128,        128 },
            {        -70,        -56 },
            {         64,        -24 },
            {         11,          7 },
            {      17894,      12345 },
            { 1000000000,-2000000000 }
            
        };

        final int[] RESULTATS_ATTENDU = 
        {0, 0, 0, 128, -280, 192, 77, 220901430, -2000000000};
            
        

        for (int noTest = 0; noTest < JEU_DE_TEST.length; noTest++) {

            if( ppcm( JEU_DE_TEST[noTest][0] , JEU_DE_TEST[noTest][1] ) 
                == RESULTATS_ATTENDU[noTest] ) {

                System.out.println("Reussite du test ppcm no " + ( noTest + 1 ) );
            } else {

                System.out.println("Echec du test ppcm no " + ( noTest + 1 ) );
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
    // TODO écrire les tests pour la méthode IEEEtoDouble
    /**
     * Methode de test de l'outil pgcd de la classe "Arithmetique"
     *
     * @param args non utilis�
     */
    public static void main(String[] args) {

        TestPuissance();
        
    }

}