package OOP;

public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarArray(){
        System.out.println("Nombre: "+ nombre+ "| Edad: "+ edad);
    }
}
