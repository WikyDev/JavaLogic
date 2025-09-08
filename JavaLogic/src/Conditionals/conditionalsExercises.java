package Conditionals;

/*
Clase 38 - Ejercicios: Condicionales
Vídeo: https://youtu.be/JOAqpdM36wI?t=11021
*/

public class conditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        int edad = 14;

        if (edad >= 18) {
            System.out.println("Puede votar");
        } else {
            System.out.println("No puede votar");
        }
        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int numero1 = 7;
        int numero2 = 12;
        if (numero1 > numero2){
            System.out.println(numero1 + "Es mayor");
        } else if (numero1 == numero2){
            System.out.println("Son iguales");
        } else {
            System.out.println(numero2 + " Es mayor");
        }
        // 3. Dado un número, verifica si es positivo, negativo o cero.
        if (numero1 >= 1){
            System.out.println("Positivo");
        } else if (numero1 == 0) {
            System.out.println("Es cero");
        } else {
            System.out.println(numero1 + " Negativo");
        }
        // 4. Crea un programa que diga si un número es par o impar.
        if (numero1 % 2 == 0){
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
        // 5. Verifica si un número está en el rango de 1 a 100.
        if (numero2 >= 1 && numero2 <= 100) {
            System.out.println("Esta en rango de 1 a 100");
        }
        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        var semana = 6;
        switch (semana){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case (7) :
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Se sale del rango");
        }
        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        int nota = 95;
        if (nota <= 30){
            System.out.println("Suspendido");
        } else if (nota <= 60) {
            System.out.println("Aprobado");
        } else if (nota <= 100){
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Salió del rango (100)");
        }
        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        boolean acompañante = true;
        if (edad >= 15){
            System.out.println("Puedes ingresar");
        } else if (acompañante == true) {
            System.out.println("Puedes ingresar");
        } else {
            System.out.println("No puede ingresar");
        }
        // 9. Crea un programa que diga si una letra es vocal o consonante.
        String letra = "W";
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            System.out.println("La letra: " + letra + " Es una vocal");
        } else {
            System.out.println("La letra: " + letra + " Es una Consonante");
        }
        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        var tipo1 = 77;
        var tipo2 = 78;
        var tipo3 = 76;
        if (tipo1 > tipo2 && tipo1> tipo3){
            System.out.println(tipo1 + " Es mayor");
        } else if (tipo2 > tipo3) {
            System.out.println(tipo2 + " Es mayor");
        } else {
            System.out.println(tipo3 + " Es mayor");
        }
    }
}
