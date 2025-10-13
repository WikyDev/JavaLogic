package OOP;

public class Book {
    //Atributos
    protected String tittle;
    protected String author;
    private String tittle2;

    //Constructor de parámetros
    public Book(String tittle, String author, String tittle2){ //Se usa para que reciba los parámetros desde otra parte
        this.tittle = tittle;
        this.author = author;
        this.tittle2 = tittle2;
    }

    //método
    public void saludo(){
        System.out.println("Tittle: " + tittle + " y Author: "+ author);
    }

    public String getTittle2(){
        return tittle2;
    }
}
