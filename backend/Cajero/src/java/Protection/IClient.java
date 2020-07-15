/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Protection;



public interface IClient {
    public String loginState(int IDCuenta, String password);
    public void retirar(double cantidad, int IDCuenta, String password);
    public String registerState(String name, int IDcuenta, String password, double cantidad);//metodo añadido
    
    
}
