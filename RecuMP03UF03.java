import java.util.Scanner;

/**
 * Main
 */
public class RecuMP03UF03 {
   
    static Scanner teclat = new Scanner(System.in);
    /** 
     * Funció enunciat 1
     */
    public static int liniesDelFitxer(String nomFitxer){
        // el vostre codi va aquí
        
        return 1; // Aquesta línia cal que la modifiqueu amb la que vosaltres creieu oportú.
    }
    
    public static void main(String[] args) {
        String nomFitxerALlegir;
        int qtatLiniesFitxer;
        System.out.print("Entra el nom del fitxer a llegir: ");
        nomFitxerALlegir = teclat.nextLine();
        qtatLiniesFitxer = liniesDelFitxer(nomFitxerALlegir);
        System.out.print("El fitxer " +
            nomFitxerALlegir  +
            " té " + qtatLiniesFitxer +
            ((qtatLiniesFitxer==1)? " línia!":" línies!") );
    }
}