package OOP;

public class Student{
    protected int score;
    private int grade;

    public int aprobacion(int score){
        if(score >= 60){
            System.out.println("Aprobó con puntaje de: "+ score);
        }else {
            System.out.println("no aprobó por puntaje de: "+ score);
        }
        return score;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public boolean isPassed(){
        return grade >= 60;
    }
}
