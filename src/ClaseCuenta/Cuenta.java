package ClaseCuenta;

public class Cuenta {
    private static String titular = "Sin Nombre";
    private static float cantidad = 0f;

    public Cuenta(String titular) {
        this.titular = titular;
    }
    public Cuenta(String titular, float cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return this.titular;
    }
    public float getCantidad() {
        return this.cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(float ingreso) {
        this.cantidad += ingreso;
        System.out.println("El titular " + titular + " ha ingresado un total de " + ingreso + "€");
    }
    public void retirar(float retiro) {
        if ((getCantidad() - retiro) < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= retiro;
            System.out.println("El titular " + titular + " ha retirado un total de " + retiro + "€");
        }
    }
}
