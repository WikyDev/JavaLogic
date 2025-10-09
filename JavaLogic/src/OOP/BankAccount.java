package OOP;

public class BankAccount {

    private double balance;

    public BankAccount(int balance){
        this.balance = balance;
    }

    public void deposito(int cantidad){
        if (cantidad > 0) {
            cantidad += balance;
            System.out.println("El deposito es de: " + cantidad);
        }else {
            System.out.println("La cantidad debe ser positiva");
        }
    }
}
