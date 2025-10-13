package OOP;

/*
Clase 58 - Ejercicios: Clases y objetos
Vídeo: https://youtu.be/JOAqpdM36wI?t=21434
*/

import java.util.ArrayList;

public class ClassesExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        var book = new Book("Wiky", "Andres", "...");
        book.saludo();

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        var dog = new Dog();
        dog.ladrar();
        // 3. Añade un constructor a la clase Book que reciba title y author.
        var book2 = new Book("Hola", "Yo", "...");
        book2.saludo();
        // 4. Crea una clase Car con atributos brand y model y un método showData().
        var car = new Car();
        car.showData();
        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
        var student = new Student();
        student.aprobacion(70);
        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        var bankaccount = new BankAccount(1500);
        bankaccount.deposito(200); //El método de la clase recibe la cantidad como parámetro.
        bankaccount.deposito(-500);
        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        var rectangle = new Rectangle();
        rectangle.area(8,5);
        rectangle.perimetro(8,5);
        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        //...
        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Wilson", 25));
        personas.add(new Persona("Andres", 26));
        personas.add(new Persona("Dany", 14));
        personas.add(new Persona("Anyi", 23));

        for (int i = 0; i < personas.size(); i++) {
            personas.get(i).mostrarArray();
        }
        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        var product = new Product("Banano", 200000);
        product.descuento();
    }
}