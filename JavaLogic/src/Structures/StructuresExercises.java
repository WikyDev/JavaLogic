package Structures;

/*
Clase 44 - Ejercicios: Estructuras
Vídeo: https://youtu.be/JOAqpdM36wI?t=15680
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        String[] nombres = {"Wilson", "Andres", "Daniela"};
        System.out.println(nombres.length);
        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        nombres[1] = "Martha";
        System.out.println(nombres[1]);
        // 3. Crea un ArrayList vacío.
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names);
        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        names.add("Wilson");
        names.add("Andres");
        names.add("Nelson");
        names.add("Anyi");
        names.remove("Anyi");
        System.out.println(names);
        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<Integer> number = new HashSet<>();
        number.add(25);
        number.add(30);
        System.out.println(number);
        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        number.add(25);
        number.add(50);
        System.out.println(number);
        // 7. Elimina uno de los elementos del HashSet.
        number.remove(30);
        System.out.println(number);
        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        HashMap<String, Long> otro = new HashMap<>();
        otro.put("Anyi", 3152318262L); /*Con la L se da a conocer como un Long*/
        otro.put("Dany", 1365478520L); /*Con la L se da a conocer como un Long*/
        otro.put("Eugenia", 1256987640L); /*Con la L se da a conocer como un Long*/
        System.out.println(otro);
        // 9. Modifica uno de los contactos y elimina otro.
        otro.replace("Anyi", 789456123L);
        otro.remove("Eugenia");
        System.out.println(otro);
        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        String[] apellidos = {"Ospina", "Hinestroza"};

        // 2️⃣ Array → ArrayList
        ArrayList<String> lista = new ArrayList<>(Arrays.asList(apellidos));
        System.out.println("ArrayList: " + lista);
        HashSet<String> lista2 = new HashSet<>(lista);
        System.out.println("HashSet: " + lista2);
        HashMap<String, String> lista3 = new HashMap<>(); /*Map solo acepta otro Map, por tanto hay que recorrerlo primero para asignar
                                                            clave y index.*/
        for (String elemento : lista2) {
            lista3.put("Ospina", "elemento");
        }
        System.out.println("HashMap: " + lista3);
    }
}
