package OOP;

public class User {
    private String username;
    private String password;

    // Setter para username
    public void setUsername(String username) {
        this.username = username;
    }

    // Setter para password
    public void setPassword(String password) {
        this.password = password;
    }

    // Método para verificar la contraseña
    public boolean checkPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }
}
