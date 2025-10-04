package OOP;

public class Book {
    //Atributos
    protected String tittle;
    protected String author;

    //Constructor de parámetros
    public Book(String tittle, String author){ //Se usa para que reciba los parámetros desde otra parte
        this.tittle = tittle;
        this.author = author;
    }

    //método
    public void saludo(){
        System.out.println("Tittle: " + tittle + " y Author: "+ author);
    }
}
