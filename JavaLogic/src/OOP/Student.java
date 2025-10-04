package OOP;

public class Student{
    protected int score;

    public int aprobacion(int score){
        if(score >= 60){
            System.out.println("Aprobó con puntaje de: "+ score);
        }else {
            System.out.println("no aprobó por puntaje de: "+ score);
        }
        return score;
    }
}
