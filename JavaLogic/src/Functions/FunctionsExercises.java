package Functions;

/*
Clase 55 - Ejercicios: Funciones
Vídeo: https://youtu.be/JOAqpdM36wI?t=19521
*/

import java.util.ArrayList;

public class FunctionsExercises {

    public static void main(String[] args){
        welcomeChat();
        parametro("Wiky");
        numEnteros(15,10);
        cuadrado(7);
        par(10);
        System.out.println(comparar(7));
        int[] cadena = {1,10,20,50,100,50,9};
        System.out.println(cadenaLongitud(cadena));
        int[] enteros = {2,4,4};
        System.out.println(listadoEnteros(enteros));
        System.out.println(numeroFactorial(5));
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Wiky");
        nombres.add("Andres");
        nombres.add("Ospina");
        nombres.add("Hinestroza");
        recorrerElemento(nombres);
    }

        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
        public static void welcomeChat(){
            System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
        }
        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
        public static void parametro(String nombre){
            System.out.println("Hola " + nombre);
        }
        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
        public static void numEnteros(int numero1, int numero2){
            int resultado = numero1 - numero2;
            System.out.println(resultado);
        }
        // 4. Crea un método que calcule el cuadrado de un número (n * n).
        public static void cuadrado(int numero1){
            if (numero1 == numero1) {
                int i =numero1 * numero1;
                System.out.println("El cuadrado de " + numero1 + " es: " + i);
            }
        }
        // 5. Escribe una función que reciba un número y diga si es par o impar.
        public static void par(int pares){
            if (pares % 2 == 0){
                System.out.println(pares + " Es par");
            }else{
                System.out.println(pares + " Es impar");
            }
        }
        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
        public static boolean comparar(int edad){
            if (edad >= 18){
                return true;
            }
            return false;
        }
        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        public static int cadenaLongitud(int[] cadena){
           return cadena.length; //Tener en cuenta cuando se retornar o no algo, para así poner o no el VOID.
        }
        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
        public static int listadoEnteros(int[] enteros){
        int suma = 0;
            for (int i = 0; i < enteros.length; i++){
                suma += enteros[i];
            }
            return suma;
        }
        // 9. Escribe un método que reciba un número y retorna su factorial.
        public static int numeroFactorial(int numero){
        int factorial = 1;
        var resultado = 0;
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            return factorial;
        }
        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
        public static void recorrerElemento(ArrayList<String> nombres){
            for (String hola : nombres){
                System.out.println(hola);
            }
    }
}