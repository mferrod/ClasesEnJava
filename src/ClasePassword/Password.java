package ClasePassword;

import java.util.Random;

public class Password {
    private static int longitud = 8;
    private static String password = "M32452km";

    public Password() {}

    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    public boolean esFuerte() {
        int may = 0;
        int min = 0;
        int num = 0;
        boolean torf = false;
        for (int i = 0; i < longitud; i++) {
            if (password.charAt(i) >= 48 || password.charAt(i) <= 57) {
                num++;
            } else if (password.charAt(i) >= 65 || password.charAt(i) <= 90) {
                may++;
            } else if (password.charAt(i) >= 97 || password.charAt(i) <= 122) {
                min++;
            }
        }
        if (num >= 5 && may >= 2 && min >= 1) {
            torf = true;
        } else torf = false;
        return torf;
    }
    private void generarPassword() {
        String pass = "";
    }
}
