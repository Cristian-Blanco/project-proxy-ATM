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
 

    public Client(String nombre, double dinero, int IDCuenta, String password) {

        this.nombre = nombre;
        this.dinero = dinero;
        this.IDCuenta = IDCuenta;
        this.password = password;
    }

   
    @Override
    public String getNombre(int IDCuenta) {
        return this.getNombre();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public double getDinero(int IDCuenta){
        return this.getDinero();
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
        
        return "Se ha accedido a la cuenta " + IDCuenta;
    }
    
    @Override
    public String registerState(String name, int IDcuenta, String password, double cantidad){
        return "La cuenta "+ IDcuenta + " fue registrada con exito";
    }

    @Override
    public String retirar(double cantidad, int IDCuenta, String password) {
       
        if (cantidad > this.getDinero()) {
            return "No posee fondos suficientes para realizar esta operacion";
           
        } else {
            this.setDinero(this.getDinero() - cantidad);
            return "Su saldo actual es "+String.valueOf(this.getDinero());
        
            
        }

    }

}
