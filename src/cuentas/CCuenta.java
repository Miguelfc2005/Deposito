package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 * Permite realizar operaciones básicas como ingresar y retirar dinero.
 */
public class CCuenta {

    /** Nombre del titular de la cuenta */
    private String nombre;

    /** Número identificativo de la cuenta */
    private String cuenta;

    /** Saldo actual de la cuenta */
    private double saldo;

    /** Tipo de interés aplicado a la cuenta */
    private double tipoInteres;

    /**
     * Constructor por defecto.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param nom Nombre del titular
     * @param cue Número de cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInteres = tipo;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     *
     * @return saldo actual
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa una cantidad en la cuenta.
     *
     * @param cantidad Cantidad a ingresar
     * @throws Exception si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de la cuenta.
     *
     * @param cantidad Cantidad a retirar
     * @throws Exception si la cantidad es negativa o no hay saldo suficiente
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    /**
     * Devuelve el nombre del titular.
     *
     * @return nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular.
     *
     * @param nombre Nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el número de cuenta.
     *
     * @return número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     *
     * @param cuenta número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo actual.
     *
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     *
     * @param saldo saldo a establecer
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de interés.
     *
     * @return tipo de interés
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Establece el tipo de interés.
     *
     * @param tipoInteres tipo de interés
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
