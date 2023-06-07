package ClasePassword;

public class MainPassword {
    public static void main(String[] args) {
        Password password = new Password();
        if (password.esFuerte()) {
            System.out.println("VAMOOO");
        } else {
            System.out.println("POZO");
        }
    }
}
