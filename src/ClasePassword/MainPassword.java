package ClasePassword;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud de las contraseñas: ");
        int longitud = sc.nextInt();
        System.out.println("Introduce el número de passwords que vas a querer: ");
        int passTotales = sc.nextInt();
        ArrayList<Password> passwords = new ArrayList<>(passTotales);
        ArrayList<Boolean> sonFuertes = new ArrayList<>(passTotales);
        for (int i = 0; i < passTotales; i++) {
            passwords.add(new Password(longitud));
            sonFuertes.add(passwords.get(i).esFuerte());
            System.out.println(passwords.get(i).getPassword() + " valor " + sonFuertes.get(i));
        }
    }
}
