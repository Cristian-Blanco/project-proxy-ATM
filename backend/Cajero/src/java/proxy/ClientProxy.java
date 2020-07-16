/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.util.HashMap;
import Protection.Client;
import Protection.IClient;

public class ClientProxy implements IClient {

    public static HashMap<Integer, Client> client;
    private static boolean state;

    public ClientProxy() {
        client = new HashMap<>();
        client.put(12345, new Client("Pepito Perez", 200000, 12345, "2015"));
        client.put(12346, new Client("Jack Luna", 300000, 12346, "2016"));
        client.put(12347, new Client("Cristian Martinez", 300000, 12347, "2017"));
    }
    
    

    /*static {
        client = new HashMap<>();
        client.put(12345, new Client("Pepito Perez", 200000, 12345, "2015"));
        client.put(12346, new Client("Jack Luna", 300000, 12346, "2016"));
        client.put(12347, new Client("Cristian Martinez", 300000, 12347, "2017"));
    }*/

    public static HashMap<Integer, Client> getClient() {
        return client;
    }

    public static void setClient(HashMap<Integer, Client> client) {
        ClientProxy.client = client;
    }

    public static boolean isState() {
        return state;
    }

    public static void setState(boolean state) {
        ClientProxy.state = state;
    }

    @Override
    public String loginState(int IDCuenta, String password) {

        if (client.containsKey(IDCuenta)) {
            if (client.get(IDCuenta).getPassword().equals(password)) {

                this.setState(true);
                return client.get(IDCuenta).loginState(IDCuenta, password);
            } else {
                this.setState(false);
                return "Password o cuenta incorrecta";
            }
        } else {
            this.setState(false);
            return "La cuenta no existe...";
        }
    }

    @Override
    public String registerState(String name, int IDcuenta, String password, double cantidad) {
        client.put(IDcuenta, new Client(name, cantidad, IDcuenta, password));
        return client.get(IDcuenta).registerState(name, IDcuenta, password, cantidad);
    }

    @Override
    public String retirar(double cantidad, int IDCuenta, String password) {
        this.setState(false);
        return client.get(IDCuenta).retirar(cantidad, IDCuenta, password);

    }

    @Override
    public double getDinero(int IDCuenta) {

        return client.get(IDCuenta).getDinero();

    }
    @Override
    public String getNombre(int IDCuenta){
        return client.get(IDCuenta).getNombre();
    }

}
