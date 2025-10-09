package OOP;

public class Rectangle {
    protected int base;
    protected int altura;

    public void area(int base, int altura){
        int mult = base * altura;
        System.out.println("El área es: "+ mult);
    }

    public void perimetro(int base, int altura){
        int peri = 2 * (base + altura);
        System.out.println("El perímetro es: " + peri);
    }
}
