package OOP;

/*
Clase 60 - Ejercicios: Modificadores de acceso
Vídeo: https://youtu.be/JOAqpdM36wI?t=23202
*/

public class ExercisesModifiers {

    public static void main(String[] args) {

        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
        var persona2 = new Person2();
        persona2.setName("Wiky");
        System.out.println(persona2.getName());
        persona2.setAge(25);
        System.out.println(persona2.getAge());
        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
        var product = new Product("Agua", 100);
        product.setPrecio(3000);
        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
        var bankaccount = new BankAccount(3000);
        bankaccount.deposito(1000);
        //  4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
        var book3 = new Book("Emisario", "Wiky", "Crepúsculo");
        System.out.println(book3.getTittle2());
        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
        var temperature = new Temperature();
        temperature.setCelsius(25);
        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
        var user = new User();
        user.setUsername("Wiky");
        user.setPassword("12345");

        if (user.checkPassword("12345")) {
            System.out.println("Contraseña correcta ✅");
        } else {
            System.out.println("Contraseña incorrecta ❌");
        }

        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
        var employee = new Employee(5000);
        employee.raiseSalary(-50);
        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.
        var rectangle = new Rectangle();
        rectangle.setWidth(30);
        rectangle.setHeigh(30);
        rectangle.calculateArea();
        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
        var student = new Student();
        student.setGrade(65);
        System.out.println(student.isPassed());
        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
        var car = new Car();
        car.setSpeed(100);
        car.accelerate(120);
        car.brake(50);
    }
}
