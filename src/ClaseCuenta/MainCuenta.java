package ClaseCuenta;

public class MainCuenta {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("Pepe Luis");
        System.out.println(cuenta.getCantidad());
        cuenta.ingresar(200);
        cuenta.retirar(100);
        System.out.println(cuenta.getCantidad());
    }
}
