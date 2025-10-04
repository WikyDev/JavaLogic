package OOP;

/*
Clase 58 - Ejercicios: Clases y objetos
Vídeo: https://youtu.be/JOAqpdM36wI?t=21434
*/

public class ClassesExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        var book = new Book("Wiky", "Andres");
        book.saludo();

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        var dog = new Dog();
        dog.ladrar();
        // 3. Añade un constructor a la clase Book que reciba title y author.
        var book2 = new Book("Hola", "Yo");
        book2.saludo();
        // 4. Crea una clase Car con atributos brand y model y un método showData().
        var car = new Car();
        car.showData();
        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
        var student = new Student();
        student.aprobacion(70);
        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
    }
}