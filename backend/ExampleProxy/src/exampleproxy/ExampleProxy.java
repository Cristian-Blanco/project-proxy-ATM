/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exampleproxy;

import protection.IClient;
import proxy.ClientProxy;

/**
 *
 * @author jackl
 */
public class ExampleProxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IClient intento = new ClientProxy();
        System.out.println(intento.loginState(12345, 2015));
        intento.retirar(2000,12345, 2015);
        System.out.println(intento.loginState(12347, 2017));
        intento.retirar(2000,12347, 2017);
    }
    
}
