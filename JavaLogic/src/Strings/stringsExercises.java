package Strings;

/*
Clase 34 - Ejercicios: Strings
Vídeo: https://youtu.be/JOAqpdM36wI?t=9838
*/

import java.util.Locale;

public class stringsExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String a = "Wiky";
        System.out.println(a + " " + "Ospina");
        // 2. Muestra la longitud de una cadena de texto.
        System.out.println(a.length());
        // 3. Muestra el primer y último carácter de un string.
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(3));
        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(a.contains("y"));
        // 6. Formatea un string con un entero.
        System.out.println("Wiky".replace("Wiky", "7"));
        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println(a.trim());
        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(a.trim());
        // 9. Comprueba si dos strings son iguales.

        // 10. Comprueba si dos strings tienen la misma longitud.
    }
}