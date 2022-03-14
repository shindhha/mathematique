/*
 * FonctionReellles.java                                  14 mars 2022
 * IUT de Rodez, Info1 2021-2022 Groupe 3, pas de copyright 
 */
package arithmetique;

/** TODO commenter la responsabilit� de cette classe
 * @author guillaume.medard
 *
 */
public class FonctionReellles {

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
        
        if (b < 0) {
            throw new IllegalArgumentException("Erreur ! puissance n�gative non autoris� !");
        }
        boolean puissanceNegative = b < 0;
        b = Math.abs(b);
        
        if ( b == 0 ) {
            return 1;
        }
        double result = 1;
        while ( a != 1 ) {
            
            if (a % 2 == 0) {
                a *= a;
                b /= 2;
            } else {
                result *= a;
                b--;
            }
            
        }
        
        
        for (int compteur = 0; compteur < b;compteur++ ) {

            result *= a;
        }

//        if (puissanceNegative) {
//            result = 1 / result;
//        }

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

        while (Math.pow(racineProcheDepart,2) < x) {
            racineProcheDepart++;
        }
        racine = racineProcheDepart;

        /* Methode de newton qui nous dit que x1 = x0 -f(x0)/f'(x0) */
        for (int nbIteration = 0; 
                 nbIteration < 10; nbIteration++) {

            racine = racine - (Math.pow(racine,2) - x) / (2*racine);
        }

        
        return racine;
    }
}
