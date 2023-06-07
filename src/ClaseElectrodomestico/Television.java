package ClaseElectrodomestico;

import enums.Colores;
import sun.dc.pr.PRError;

public class Television extends Electrodomestico {
    public static double resolucion = 0;
    public static boolean TDT = false;
    public Television() {
        super(precioBase,consumo,color,peso);
        Television.resolucion = 20;
        Television.TDT = false;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, consumo, color, peso);
        Television.resolucion = 20;
        Television.TDT = false;
    }

    public Television(double precioBase, Character consumo, Colores color, double peso, int resolucion, boolean TDT) {
        super(precioBase, consumo, color, peso);
        Television.resolucion = resolucion;
        Television.TDT = TDT;
    }

    public static double getResolucion() {
        return resolucion;
    }
    public static void setResolucion(double resolucion) {
        Television.resolucion = resolucion;
    }
    public static boolean isTDT() {
        return TDT;
    }
    public static void setTDT(boolean TDT) {
        Television.TDT = TDT;
    }

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (resolucion > 40 && TDT) {
            precio += (precio * .3);
            precio += 50;
        } else if (resolucion > 40) {
            precio += (precio * .3);
        }
        return precio;
    }

}
