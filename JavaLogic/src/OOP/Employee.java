package OOP;

public class Employee {
    private double salary;

    public Employee(double salary){
        this.salary = salary;
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            salary += salary * (percent / 100);
            System.out.println("Nuevo salario: " + salary);
        } else {
            System.out.println("Error: el aumento debe ser positivo");
        }
    }

}
