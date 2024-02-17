package Cuentas;
/**
 * La clase CCuenta representa una cuenta bancaria.
 */
public class CCuenta {


    private String nombre;// Nombre del titular de la cuenta
    private String cuenta;// Número de cuenta bancaria
    private double saldo;// Saldo actual de la cuenta
    private double tipoInterés;// Tipo de interés aplicado a la cuenta

    
    /**
     * Constructor por defecto de la clase CCuenta.
     */
    
    public CCuenta()
    {
    }
    
    /**
     * Constructor con parámetros de la clase CCuenta.
     *
     * @param nom    Nombre del titular de la cuenta.
     * @param cue    Número de cuenta bancaria.
     * @param sal    Saldo inicial de la cuenta.
     * @param tipo   Tipo de interés aplicado a la cuenta.
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Devuelve el saldo actual de la cuenta.
     *
     * @return El saldo actual de la cuenta.
     */
    
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Ingresa una cantidad de dinero en la cuenta.
     *
     * @param cantidad   Cantidad a ingresar en la cuenta.
     * @throws Exception Si la cantidad es negativa.
     */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Retira una cantidad de dinero de la cuenta.
     *
     * @param cantidad   Cantidad a retirar de la cuenta.
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo en la cuenta.
     */
    
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    //Encapsulamos los campos con getters y setters

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }
//comentario de prueba
    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    

    
    
}
