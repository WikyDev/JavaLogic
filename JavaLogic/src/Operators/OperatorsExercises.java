package Operators;

/*
Clase 23 - Ejercicios: Operadores
Vídeo: https://youtu.be/JOAqpdM36wI?t=8085
*/

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        var a = 5;
        var b = 7;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a%b);
        // 2. Crea una variable para cada tipo de operación de asignación.
        int c =10;
        int d = 5;
        c = d;
        System.out.println(c);
        c += 2;
        System.out.println(c);
        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        int e = 3;
        int f = 4;
        System.out.println(e != f);
        System.out.println(e <= f);
        System.out.println(e < f);
        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(e == f);
        System.out.println(e >= f);
        System.out.println(e > f);
        // 5. Utiliza el operador lógico and.
        System.out.println(false && false);
        // 6. Utiliza el operador lógico or.
        System.out.println(true || false);
        // 7. Combina ambos operadores lógicos.
        System.out.println(true || true && false);
        // 8. Añade alguna negación.
        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        int ejemplo1 = 50;
        int ejemplo2 = 30;
        System.out.println(++ejemplo1);
        System.out.println(+ejemplo1);
        System.out.println(--ejemplo2);
        // 10. Combina operadores aritméticos, de comparación y lógicos.
        System.out.println(a+b == 8 && true);
    }
}