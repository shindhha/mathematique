/*
 * Outillage.java                                  7 mars 2022
 * IUT de Rodez, Info1 2021-2022 Groupe 3, pas de copyright 
 */
package tests;

/** TODO commenter la responsabilit� de cette classe
 * @author guillaume.medard
 *
 */
public class Outillage {
   
    /**
     * TODO commenter le r�le de cette m�thode (SRP)
     * @param resultatAttendut 
     * @param resultat
     * @param precisionVoulut
     * @return si l'�galit� est vraie
     */
    public static boolean AssurerEgalite(double resultatAttendut, 
                                         double resultat, 
                                         double precisionVoulut) {
        
        
        
        return resultatAttendut - resultat <= precisionVoulut;
    }
}
