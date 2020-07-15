/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Protection;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Client implements IClient {

    private String nombre;
    private double dinero;
    private int IDCuenta;
    private String password;
    private boolean state;

    public Client(String nombre, double dinero, int IDCuenta, String password) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String loginState(int IDCuenta, String password) {
        this.setState(true);
        return "Accediendo a la cuenta " + IDCuenta;
    }
    
    @Override
    public String registerState(String name, int IDcuenta, String password, double cantidad){
        return "La cuenta "+ IDcuenta + " fue registrada con exito";
    }

    @Override
    public void retirar(double cantidad, int IDCuenta, String password) {
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
