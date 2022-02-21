/*
 * TestArithmetique.java                                          DATE : 26/01/2022
 * INFO1 2021-2022 , iut RODEZ 
 * Pas de droit d'auteur ni de copyright .
 */

package tests;

import static arithmetique.Arithmetique.pgcd;
import static arithmetique.Arithmetique.ppcm;
import static arithmetique.Arithmetique.Puissance;
import static arithmetique.Arithmetique.Racine;
import static arithmetique.Arithmetique.IEEEToDouble;

/**
 * Liste de tests pour les m√©thodes de la classe Arithmetique
 * 
 * 
 * @author Guillaume MEDARD
 */
public class TestArithmetique {


    private TestArithmetique() {
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
     * Tests pour la methode Puissance
     * 
     */
    private static void TestRacine() {
        
        final double[] JEU_DE_TEST = 
        { 4,-52, 800, 780.12, 0.1 };
            
            
        

        final double[] RESULTATS_ATTENDU = 
        { 2, -1, 28.2842712475, 27.9306283495, 0.31622776601 };
            
        
        //TODO amÈliorer la comparaison pour ne comparer que jusqu'a un certain degrÈs de prÈcision
        for (int noTest = 0; noTest < JEU_DE_TEST.length; noTest++) {

            if ( Racine( JEU_DE_TEST[noTest] ) == RESULTATS_ATTENDU[noTest] ) {

                System.out.println("Reussite du test Racine no " + ( noTest + 1 ) );
            } else {

                System.out.println("Echec du test Racine no " + ( noTest + 1 ) );
            }
        }
    }
    // TODO √©crire les tests pour la m√©thode IEEEtoDouble
    /**
     * Methode de test de l'outil pgcd de la classe "Arithmetique"
     *
     * @param args non utilisÈ
     */
    public static void main(String[] args) {

        TestPpcm();
        TestPgcd();
        TestRacine();
        
    }

}