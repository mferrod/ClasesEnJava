package ClaseElectrodomestico;

import enums.Colores;

public class Electrodomestico {
    public static double precioBase = 0;
    public static Character consumo = '.';
    public static Colores color = null;
    public static double peso = 0;

    public Electrodomestico() {
        Electrodomestico.precioBase = 100;
        Electrodomestico.consumo = 'F';
        Electrodomestico.color = Colores.BLANCO;
        Electrodomestico.peso = 5;
    }
    public Electrodomestico(double precioBase, double peso) {
        Electrodomestico.precioBase = precioBase;
        Electrodomestico.consumo = 'F';
        Electrodomestico.color = Colores.BLANCO;
        Electrodomestico.peso = peso;
    }
    public Electrodomestico(double precioBase, Character consumo, Colores color, double peso) {
        Electrodomestico.precioBase = precioBase;
        Electrodomestico.consumo = consumo;
        Electrodomestico.color = color;
        Electrodomestico.peso = peso;
    }

    public static double getPrecioBase() {
        return precioBase;
    }
    public static Character getConsumo() {
        return consumo;
    }
    public static Colores getColor() {
        return color;
    }
    public static double getPeso() {
        return peso;
    }

    public static void setPrecioBase(double precioBase) {
        Electrodomestico.precioBase = precioBase;
    }
    public static void setConsumo(Character consumo) {
        Electrodomestico.consumo = consumo;
    }
    public static void setColor(Colores color) {
        Electrodomestico.color = color;
    }
    public static void setPeso(double peso) {
        Electrodomestico.peso = peso;
    }

    public void comprobarConsumoEnergetico(Character consumo) {
        switch (consumo) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                System.out.println("LETRA DE CONSUMO CORRECTA");
                break;
            default:
                System.out.println("LETRA DE CONSUMO INCORRECTA");
                Electrodomestico.setConsumo('F');
                break;
        }
    }
    public void comprobarColor(Colores color) {
        switch (color) {
            case BLANCO:
            case AZUL:
            case GRIS:
            case NEGRO:
                System.out.println("COLOR EN LA PALETA DE COLORES");
                break;
            default:
                System.out.println("EL COLOR NO ESTÁ EN LA PALETA DE COLORES");
                Electrodomestico.setColor(Colores.BLANCO);
        }
    }

    public double precioFinal() {
        double precio = precioBase;
        switch (consumo) {
            case 'A':
                precio += 100;
                break;
            case 'B':
                precio += 80;
                break;
            case 'C':
                precio += 60;
            case 'D':
                precio += 50;
            case 'E':
                precio += 30;
            case 'F':
                precio += 10;
        }
        if (peso > 0 && peso <= 19) {
            precio += 10;
        } else if (peso > 20 && peso <= 49) {
            precio += 50;
        } else if (peso > 50 && peso <= 79) {
            precio += 80;
        } else {
            precio += 100;
        }
        return precio;
    }
}
