/*
 * Arithmetique.java                                          DATE : 26/01/2022
 * INFO1 2021-2022 , iut RODEZ 
 * Pas de droit d'auteur ni de copyright .
 */

package src.arithmetique;

/**
 * Différents outils d'arithmétique comme :
 * <ul>
 *   <li> Le calcul du pgcd de deux entiers </li>
 *   <li> Le calcul du ppcm de deux entiers </li>
 *   <li> Le calcul d'une racine carré </li>
 *   <li> La conversion d'un nombre sous la form IEEE-754 </li>
 *   <li> Le calcul d'une puissance avec un exposant de type floatant </li>
 * </ul>
 * @author Guillaume MEDARD
 */

public class Arithmetique {

    private Arithmetique() {
    }
    /**
     * Trouve le plus grand diviseur commun de deux entiers 
     * <br>
     * Tel que :
     * <ul>
     *   <li>  pgcd (a , b) == pgcd (b , a) </li>
     *   <li>  pgcd (a , 0) == pgcd (0 , a) == a </li>
     *   <li>  pgcd (-a , -b) == pgcd (a , b) </li>
     * </ul>
     * @param a entier dont on veut le pgcd avec 'b'
     * @param b entier dont on veut le pgcd avec 'a'
     * @return le plus grand diviseur entier commun à 'a' et 'b'
     */

    public static int pgcd(int a , int b) {

        if (a == 0 || b == 0) {
            return 0;
        }
        int reste = a * b;
        while ( reste != 0 ) {

            reste = a % b;
            a = b;
            b = reste;
        } 

        
        return a + b;
    }

    /**
     * Trouve le plus petit multiple commun de deux entiers
     * <br>
     * Tel que :
     * <ul>
     *   <li> </li>
     *   <li> </li>
     *   <li> </li>
     * </ul>
     * @param a entier dont on veut le ppcm avec 'b'
     * @param b entier dont on veut le ppcm avec 'a'
     * @return le plus petit multiple de 'a' et 'b'
     */

    public static int ppcm(int a , int b) {

        if (a == 0 || b == 0) {
            return 0;
        }
        return (a / pgcd(a,b)) * b;
    }

    /**
     * Eleve un entier a une puissance
     * <br>
     * Tel que :
     * <ul>
     *   <li> b => 0 </li>
     *   <li> </li>
     *   <li> </li>
     * </ul>
     * 
     * @param a entier que l'on va elever
     * @param b puissance a laquelle on veut elever
     * @return l'entier 'a' elever a la puissance 'b' 
     */
    //TODO Faire la méthode de calcul de puissance
    public static double Puissance(double a , double b) {
        if ( b == 0 ) {
            return 1;
        }
        boolean puissanceNegative = b < 0;
        b = Math.abs(b);
        while ( b % 2 == 0 ) {
            a *= a;
            b /= 2;
        }
        double result = 1;
        for (int compteur = 0; compteur < b;compteur++ ) {

            result *= a;
        }

        if (puissanceNegative) {
            result = 1 / result;
        }

        return result;
    }
    /**
     * Calcule la racine d'un entier en utilisant la méthode de newton
     * sur la fonction x² - a pour finalement trouver une approximation de x 
     * <br>
     * Tel que :
     * <ul>
     *   <li> x² = a </li>
     *   <li> </li>
     *   <li> </li>
     * </ul>
     * @param x nombre dont on veut la racine 
     * @return une racine approximative de 'a' 
     */
    public static double Racine(double x) {

        if (x < 0) {
            return -1;
        }

        int racineProcheDepart; // racine trés approximative pour réduire grandement le nombre d'itération
        double racine;

        racineProcheDepart = 0;

        while (Puissance(racineProcheDepart,2) < x) {
            racineProcheDepart++;
        }
        racine = racineProcheDepart;

        /* Methode de newton qui nous dit que x1 = x0 -f(x0)/f'(x0) */
        for (int nbIteration = 0; 
                 nbIteration < 10; nbIteration++) {

            racine = racine - (Puissance(racine,2) - x) / (2*racine);
        }

        
        return racine;
    }
    /**
     * Interprète un nombre sous la forme de la norme IEEE-754 et le converti en floatant
     * <br>
     * Tel que :
     * <ul>
     *   <li> pour exemple :| 0 | 10000000 | 10010010000110000000000</li>
     *   <li> 0 est l'interpretation du signe </li>
     *   <li> 10000000 est l'interpretation de l'exposant biasé </li>
     *   <li> 10010010000110000000000 la mantisse </li>
     * </ul>
     * @param IEEE nombre représenter selon la norme IEEE-754 que l'on veut interpréter
     *             en tant que floatant
     * @return l'interpretation de IEEE en floatant
     */
    public static double IEEEToDouble(String IEEE) {

        char[] IEEEChar;
        double mantisse;
        int exposant;
        int signe;
        IEEEChar = IEEE.toCharArray();

        signe = (IEEEChar[0] - 48);
        exposant = 0;
        for (int bit = 1 , rang = 7; bit < 9; bit++,rang--) {
            exposant += (IEEEChar[bit] - 48) * Math.pow(2,rang);
        }
        exposant -= 127;

        mantisse = Math.pow(2,exposant);
        for (int bit = 9, rang = exposant - 1; bit < 31; bit++,rang--) {

            
            mantisse += (IEEEChar[bit] - 48) * Math.pow(2,rang);
        }

        if (signe == 1 ) {
            mantisse *= -1;
        }

        return mantisse;
    }
}