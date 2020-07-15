/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proxy;

import java.util.HashMap;
import Protection.Client;
import Protection.IClient;


public class ClientProxy implements IClient{
    
    public static HashMap <Integer, Client> client;
    static{
        client = new HashMap<>();
        client.put(12345, new Client("Pepito Perez",200000,12345,"2015"));
        client.put(12346, new Client("Jack Luna",300000,12346,"2016"));
        client.put(12347, new Client("Cristian Martinez",300000,12347,"2017"));
    }

    @Override
    public String loginState(int IDCuenta, String password) {
       
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
    public String registerState(String name, int IDcuenta, String password, double cantidad){
        if(client.containsKey(IDcuenta)){
            return "La cuenta ya existe por favor ingrese una nueva cuenta";
        }
        else{
            client.put(IDcuenta, new Client(name,cantidad,IDcuenta,password));
            return client.get(IDcuenta).registerState(name, IDcuenta, password, cantidad);
        }
    }
    
    @Override
    public void retirar(double cantidad,int IDCuenta, String password ){
        if(this.loginState(IDCuenta, password).equals("Se ha accedido de forma satisfactoria a la cuenta")){
            System.out.println("El retiro es de "+cantidad);
            client.get(IDCuenta).retirar(cantidad, IDCuenta, password);
           
        }else{
            System.out.println("Acceso Denegado");
        }
        
        
    }
    
}
