/*
 * Outillage.java                                  7 mars 2022
 * IUT de Rodez, Info1 2021-2022 Groupe 3, pas de copyright 
 */
package tests;

/** TODO commenter la responsabilité de cette classe
 * @author guillaume.medard
 *
 */
public class Outillage {
   
    /**
     * TODO commenter le rôle de cette méthode (SRP)
     * @param resultatAttendut 
     * @param resultat
     * @param precisionVoulut
     * @return si l'égalité est vraie
     */
    public static boolean AssurerEgalite(double resultatAttendut, 
                                         double resultat, 
                                         double precisionVoulut) {
        
        
        
        return resultatAttendut - resultat <= precisionVoulut;
    }
}
