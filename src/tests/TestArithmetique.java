/*
 * TestArithmetique.java                                          DATE : 26/01/2022
 * INFO1 2021-2022 , iut RODEZ 
 * Pas de droit d'auteur ni de copyright .
 */

package tests;

import static arithmetique.Arithmetique.pgcd;
import static arithmetique.Arithmetique.ppcm;
import static arithmetique.Arithmetique.IEEEToDouble;
import static tests.Outillage.AssurerEgalite;

/**
 * Liste de tests pour les méthodes de la classe Arithmetique
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
        {0, 0, 0, 128,-3 ,-8 , 1, 1, 1000000000};
            
        

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

    // TODO écrire les tests pour la méthode IEEEtoDouble
    /**
     * Methode de test de l'outil pgcd de la classe "Arithmetique"
     *
     * @param args non utilis�
     */
    public static void main(String[] args) {
        
        boolean ok;
        
        
    }

    

}