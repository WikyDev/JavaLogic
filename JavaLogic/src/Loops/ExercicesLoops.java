package Loops;

/*
Clase 50 - Ejercicios: Bucles
Vídeo: https://youtu.be/JOAqpdM36wI?t=17993
*/

import java.sql.Array;
import java.util.ArrayList;

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

        // 6. Usa for-each para recorrer un HashSet y un HashMap.

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.

        // 10. Crea un programa que calcule el factorial de un número dado.
    }
}