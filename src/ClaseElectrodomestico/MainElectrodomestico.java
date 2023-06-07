package ClaseElectrodomestico;

import enums.Colores;

import java.util.Scanner;

public class MainElectrodomestico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Electrodomestico [] electrodomesticos = new Electrodomestico[10];
        for (int i = 0; i < electrodomesticos.length; i++) {
            if ((electrodomesticos.length % 2) == 0) {
                electrodomesticos[i] = new Lavadora(sc.nextDouble(),sc.nextLine().charAt(0),Colores.AZUL,sc.nextDouble(),sc.nextInt());
            } else {
                electrodomesticos[i] = new Television(sc.nextDouble(),sc.nextLine().charAt(0),Colores.GRIS,sc.nextDouble(),sc.nextInt(),false);
            }
        }
    }
}