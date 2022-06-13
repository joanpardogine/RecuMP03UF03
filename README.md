# MP03 - UF03: Fonaments de gestió de fitxers
## Recuperació curs **2021-2022**
### dilluns, 13 de juny de 2022

Cal que creeu un repositori remot privat al vostre github, el nom del qual ha de ser **```<CognomNom>RecuMP03UF03```**, i que convideu a l'usuari **```joanpardogine```**. Cal que feu un **``**``commit``**``**, cada **15 minuts**, amb el missatge **```Control HH:MM```**. On **```HH:MM```** és l'hora en què s'ha de fer el **``commit``**. En el repositori **```RecuMP03UF03```** de l'usuari **```joanpardogine```** trobareu el programa que faré servir per corregir aquesta activitat.

Aquest és el contingut del fitxer ```RecuMP03UF03.java```.

```java
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
```

I aquesta és la sortida de l'execució del fitxer ```RecuMP03UF03.java```, tal i com està ara, és a dir, sense fer l'activitat.
```
Entra el nom del fitxer a llegir: prova.txt
El fitxer prova.txt té 1 línia!
```