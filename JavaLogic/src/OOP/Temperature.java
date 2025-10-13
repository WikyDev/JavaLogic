package OOP;

public class Temperature {
    private double celsius;

    public void setCelsius(double celsius) {
        if (celsius >= -100 && celsius <= 100) {
            this.celsius = celsius;
            System.out.println("El valor es Correcto");
        } else {
            System.out.println("No está dentro del rango");
        }
    }
}
