package Loops;

/*
Clase 50 - Ejercicios: Bucles
Vídeo: https://youtu.be/JOAqpdM36wI?t=17993
*/

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ExercicesLoops {

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.
        int index = 1;
        while (index < 11){
            System.out.println(index);
            index++;
        }
        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        ArrayList<Integer> lista = new ArrayList<>();
            lista.add(10);
            lista.add(20);
            lista.add(30);
            lista.add(40);

            int a = 0;
            do {
                System.out.println("Números: " + lista);
                a++;
            }while (a > lista.size());
        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        for (int e = 1; e <= 10; e++){
            System.out.println(e * 5);
        }
        for (int i = 1; i <= 70; i++){
            if (i % 7 == 0){
                System.out.println(i);
            }
        }
        // 4. Recorre un Array de 5 números e imprime la suma total.
        int[] o = new int[]{5,20,12,8};
        int suma = 0;
        for (int u = 0; u < o.length; u++){
            suma += o[u];
        }
        System.out.println(suma);
        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        for(int w = 0; w < o.length; w++){
            System.out.println(o[w]);
        }
        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        HashSet<String> sett = new HashSet<>();
        sett.add("Wilson");
        sett.add("Andres");
        sett.add("Ospina");

        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(25, "Hinestroza");
        mapa.put(30, "Anyi");

        for (String setters : sett){
            System.out.println(setters);
        }
        for (var mapas : mapa.entrySet()){
            System.out.println("Edad: " + mapas.getKey() + "," + "Nombre: " +mapas.getValue() + "\n");
        }
        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int z = 10; z < 11 && z > 0; z--){
            System.out.println(z);
        }
        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for(int q = 1; q <= 20; q++){
            if (q % 3 == 0){
                continue;
            }
            System.out.println(q);
        }
        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int[] negativos = new int[]{15,20,7,-30,8};

        for (int r : negativos) {
            if (r < 0){
                System.out.println("Número negativo encontrado: " + r);
                break;
            }
            System.out.println("Números: " + r);
        }
        // 10. Crea un programa que calcule el factorial de un número dado.
        int numero = 5;
        long factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i; /*La Variable factorial, guarda lo múltiplicado para hacer nuevamente la operación hasta donde permita el Búcle.*/
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    }
}