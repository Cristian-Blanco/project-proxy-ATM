/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proxy;

import java.util.HashMap;
import protection.Client;
import protection.IClient;

/**
 *
 * @author jackl
 */
public class ClientProxy implements IClient{
    
    public static HashMap <Integer, Client> client;
    static{
        client = new HashMap<>();
        client.put(12345, new Client("Pepito Perez",200000,12345,2015));
        client.put(12346, new Client("Jack Luna",300000,12346,2016));
        client.put(12347, new Client("Cristian Martinez",300000,12347,2017));
    }

    @Override
    public String loginState(int IDCuenta, int password) {
       
        if(client.containsKey(IDCuenta)){
            if(client.get(IDCuenta).getPassword()==password){
                System.out.println(client.get(IDCuenta).loginState(IDCuenta, password));;
                return "Se ha accedido de forma satisfactoria a la cuenta";       
            }
            else{
                return "Password o cuenta incorrecta";
            }
        }
        else{
            return "La cuenta no existe...";
        }
    }
    @Override
    public void retirar(double cantidad,int IDCuenta, int password ){
        if(this.loginState(IDCuenta, password).equals("Se ha accedido de forma satisfactoria a la cuenta")){
            System.out.println("El retiro es de "+cantidad);
            client.get(IDCuenta).retirar(cantidad, IDCuenta, password);
           
        }else{
            System.out.println("Acceso Denegado");
        }
        
        
    }
    
}
