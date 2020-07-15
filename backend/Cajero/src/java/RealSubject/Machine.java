/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealSubject;
import Abstract.Atm;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Cristian
 */
public class Machine implements Atm{
    HashMap dictionary_password = new HashMap();
    HashMap dic_amount = new HashMap();
    
    @Override
    public int signIn(String name, String password) {
        if(dictionary_password.containsKey(name)){
            if(password == dictionary_password.get(name).toString()){
                return 1;
            }
            else{return 2;}
        }
        else{return 0;}
    }

    @Override
    public void register(String name, String password) {
        dictionary_password.put(name,password);
    }
            
    @Override
    public String showValue(String key) {
        if(dic_amount.containsKey(key)){//si la llave existe
            return dic_amount.get(key).toString();//muestre el monto
        }
        else{
            return "no existe algun monto relacionado con el nombre";
        }
    }
    //el metodo removeAmount nos ayudara a sumarle dinero al monto antiguo
    @Override
    public void insertAmount(String key, int amount) {//le ponemos como parametros de entrada la llave y el monto a cambiar
        if(dic_amount.containsKey(key)){//si la llave existe entonces
            int amount_changed = Integer.parseInt(dic_amount.get(key).toString());//cambiamos el monto a entero para poder manipularlo matematicamente
            amount_changed = amount_changed + amount;//le añadimos el nuevo monto de llegada
            dic_amount.put(key, String.valueOf(amount_changed));//le asignamos a el diccionario el nuevo monto con la llave correspondiente
            System.out.println("Monto añadido correctamente");
        }
        else{
            System.out.println("El nombre digitado no existe");
        }
    }
    //el metodo removeAmount nos ayudara a restarle dinero al monto antiguo
    @Override
    public void removeAmount(String key, int amount) {
        if(dic_amount.containsKey(key)){//si la llave existe entonces
            int amount_changed = Integer.parseInt(dic_amount.get(key).toString());//cambiamos el monto a entero para poder manipularlo matematicamente
            amount_changed = amount_changed - amount;//le restamos el nuevo monto de llegada
            dic_amount.put(key, String.valueOf(amount_changed));//le asignamos a el diccionario el nuevo monto con la llave correspondiente
            System.out.println("Monto añadido correctamente");
        }
        else{
            System.out.println("El nombre digitado no existe");
        }
    }

    
    
}
