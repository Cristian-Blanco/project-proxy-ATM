/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protection;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jackl
 */
public class Client implements IClient {

    private String nombre;
    private double dinero;
    private int IDCuenta;
    private int password;
    private boolean state;

    public Client(String nombre, double dinero, int IDCuenta, int password) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.IDCuenta = IDCuenta;
        this.password = password;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public int getIDCuenta() {
        return IDCuenta;
    }

    public void setIDCuenta(int IDCuenta) {
        this.IDCuenta = IDCuenta;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String loginState(int IDCuenta, int password) {
        this.setState(true);
        return "Accediendo a la cuenta " + IDCuenta;
        
    }

    @Override
    public void retirar(double cantidad, int IDCuenta, int password) {
        System.out.println("Retirando " + cantidad);
        if (cantidad > this.getDinero()) {
            System.out.println("No posee fondos suficientes para realizar esta operacion");
        } else {
            this.setDinero(this.getDinero() - cantidad);
            System.out.println("Recoja su dinero");
            System.out.println("Su saldo actual es " + this.getDinero());
            
        }
        try {
            this.setState(false);
            Thread.sleep(5000);
            System.out.println("Operacion terminada");
        } catch (InterruptedException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
