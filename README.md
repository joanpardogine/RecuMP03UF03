# MP03 - UF03: Fonaments de gestió de fitxers
## Recuperació curs **2021-2022**
### dilluns, 13 de juny de 2022

Cal que creeu un repositori remot privat al vostre github, el nom del qual ha de ser **```<CognomNom>RecuMP03UF03```**, i que convideu a l'usuari **```joanpardogine```**. Cal que feu un **``**``commit``**``**, cada **15 minuts**, amb el missatge **```Control HH:MM```**. On **```HH:MM```** és l'hora en què s'ha de fer el **``commit``**. En el repositori **```RecuMP03UF03```** de l'usuari **```joanpardogine```** trobareu el programa que faré servir per corregir aquesta activitat.

[**```Enunciat 1```**](README.md#enunciat-1)<BR>

[**```Enunciat 2```**](README.md#enunciat-2)<BR>

[**```Enunciat 3```**](README.md#enunciat-3)

## Enunciat 1
Aquest és el contingut del fitxer [**```RecuMP03UF03.java```**](./RecuMP03UF03.java).

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

Aquest és el contingut del fitxer [**```prova.txt```**](./prova.txt).
```
Hola
Hi
Hello
```

Aquesta és la sortida de l'execució del fitxer [**```RecuMP03UF03.java```**](./RecuMP03UF03.java), tal i com està ara, és a dir, sense fer l'activitat.

```
Entra el nom del fitxer a llegir: prova.txt
El fitxer prova.txt té 1 línia!
```

I aquesta és la sortida de l'execució del fitxer [**```RecuMP03UF03.java```**](./RecuMP03UF03.java), tal i com **hauria de ser**, un cop feta l'activitat.

```
Entra el nom del fitxer a llegir: prova.txt
El fitxer prova.txt té 3 línies!
```
## Enunciat 2

Aquest és el contingut dels fitxers:
| [**```noms.txt```**](./noms.txt)|[**```cognoms1.txt```**](./cognoms1.txt)|[**```cognoms2.txt```**](./cognoms2.txt)|
|---|---|---|
|Martina<br>Marc<br>Júlia<br>Jan<br>Pol<br>Emma<br>Nil|Garcia<br>Martínez<br>López<br>Sánchez<br>Rodríguez<br>Fernández<br>Pérez|Gómez<br>Ruiz<br>Martin<br>Jiménez<br>Moreno<br>Hernández<br>Muñoz|

Aquesta és la sortida de l'exemple
|**```nomsFinals.txt```** (Op. A)|**```nomsFinals.txt```** (Op. B)|
|---|---|
|Jan Fernández Martin<br>Júlia Garcia Moreno<br>Martina Martínez Ruiz|Fernández Martin, Jan<br>Garcia Moreno, Júlia<br>Martínez Ruiz, Martina|

## Enunciat 3

Aquest és el contingut del fitxer:

[**```NotesClasse.txt```**](./NotesClasse.txt)

```
10#8,5#4,5#8#5#3,75#6#7,5#8#6,5#6#2,5#9#5#6,5#-1
```

El fitxer resultant [**```NotesClasseHisto.txt```**](./NotesClasseHisto.txt) contindria el següent:
```
Excel·lent : **
Notable    : ****
Aprovat    : ******
Suspès     : ***
```

