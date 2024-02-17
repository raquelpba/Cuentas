package Cuentas;
/**
 * La clase Main es la clase principal que contiene el método main para probar la funcionalidad de la clase CCuenta.
 */
public class Main {
    /**
     * Método principal que se encarga de iniciar la aplicación y probar la funcionalidad de la clase CCuenta.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        operativa_cuenta (cuenta1,2300);
    }
    /**
     * Realiza operaciones sobre una cuenta bancaria, como retirar dinero e ingresar dinero.
     * @param cuenta1 La cuenta bancaria sobre la cual realizar las operaciones.
     * @param cantidad La cantidad de dinero a retirar de la cuenta y luego a ingresar en ella.
     */
    
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {

        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
