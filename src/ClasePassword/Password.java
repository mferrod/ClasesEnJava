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
    public String getPassword() {
        return password;
    }
    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public boolean esFuerte() {
        int may = 0;
        int min = 0;
        int num = 0;
        boolean torf = false;
        for (int i = 0; i < longitud; i++) {
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                num++;
            } else if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
                may++;
            } else if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
                min++;
            }
        }
        System.out.println(num + " " +
                may + " " +
                min );
        if (num >= 5 && may >= 2 && min >= 1) {
            torf = true;
        } else torf = false;
        return torf;
    }
    private void generarPassword() {
        String pass = "";
        for (int i = 0; i < longitud; i++) {
            Random rand = new Random();
            int selecciono = rand.nextInt(3);
            switch (selecciono) {
                case 0:
                    char numero = (char) ((int) Math.floor(Math.random()*(57-48))+48);
                    pass += numero;
                    break;
                case 1:
                    char minus = (char) ((int) Math.floor(Math.random()*(122-97))+97);
                    pass += minus;
                    break;
                case 2:
                    char mayus = (char) ((int) Math.floor(Math.random()*(90-65))+65);
                    pass += mayus;
                    break;
                default:
                    break;
            }
        }
        this.password = pass;
    }
}
