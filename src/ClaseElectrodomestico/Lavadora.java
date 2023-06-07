package ClaseElectrodomestico;

import enums.Colores;

public class Lavadora extends Electrodomestico {
    public static int carga = 0;
    public Lavadora() {
        super(precioBase,consumo,color,peso);
        this.carga = 5;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, consumo,color, peso);
        this.carga = 5;
    }

    public Lavadora(double precioBase, Character consumo, Colores color, double peso,int carga) {
        super(precioBase, consumo, color, peso);
        this.carga = carga;
    }

    public static int getCarga() {
        return carga;
    }
    public static void setCarga(int carga) {
        Lavadora.carga = carga;
    }

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (carga >= 30) {
            precio += 30;
        }
        return precio;
    }
}
