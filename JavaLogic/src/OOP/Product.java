package OOP;

public class Product {
    //Atributo
    private String nombre;
    private double precio;

    //Constructor
    public Product(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void descuento(){
        double num = 15.0;
        System.out.println(nombre + " tiene un precio de: $"+ precio);
        double desc = precio * (num/100);
        System.out.println(desc);
    }
}
