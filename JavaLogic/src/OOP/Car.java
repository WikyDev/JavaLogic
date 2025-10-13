package OOP;

public class Car {
    protected String brand = "Suzuki";
    protected int model = 2025;
    private double speed;

    public void showData(){
        System.out.println("Brand : "+ brand + " Model: "+ model);
    }

    public void accelerate(int amount){
        speed += amount;
        System.out.println("Ahora la velocidad es de: " + speed);
    }

    public void brake(int amount){
        speed -= amount;
        System.out.println("Ahora la velocidad es de: " + speed);
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }
}
