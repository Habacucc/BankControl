/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Habacucc
 */
public class CuentaCheques {
    private int Cuenta;
    private String Cliente;
    private float Saldo=0;
    private int fechadia;
    private int fechames;
    private int fechaanio;

    public CuentaCheques() {
    }

    public CuentaCheques(int Cuenta, String Cliente, float Saldo,int fechadia,int fechames,int fechaanio) {
        this.Cuenta = Cuenta;
        this.Cliente = Cliente;
        this.Saldo= Saldo;
        this.fechadia= fechadia;
        this.fechames= fechames;
        this.fechaanio= fechaanio;
    }

    /**
     * @return the Cuenta
     */
    public int getCuenta() {
        return Cuenta;
    }

    /**
     * @param Cuenta the Cuenta to set
     */
    public void setCuenta(int Cuenta) {
        this.Cuenta = Cuenta;
    }

    /**
     * @return the Cliente
     */
    public String getCliente() {
        return Cliente;
    }

    /**
     * @param Cliente the Cliente to set
     */
    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    /**
     * @return the Saldo
     */
    public float getSaldo() {
        return Saldo;
    }

    /**
     * @param Saldo the Saldo to set
     */
    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }

    /**
     * @return the fechadia
     */
    public int getFechadia() {
        return fechadia;
    }

    /**
     * @param fechadia the fechadia to set
     */
    public void setFechadia(int fechadia) {
        this.fechadia = fechadia;
    }

    /**
     * @return the fechames
     */
    public int getFechames() {
        return fechames;
    }

    /**
     * @param fechames the fechames to set
     */
    public void setFechames(int fechames) {
        this.fechames = fechames;
    }

    /**
     * @return the fechaanio
     */
    public int getFechaanio() {
        return fechaanio;
    }

    /**
     * @param fechaanio the fechaanio to set
     */
    public void setFechaanio(int fechaanio) {
        this.fechaanio = fechaanio;
    }
    
    
}
