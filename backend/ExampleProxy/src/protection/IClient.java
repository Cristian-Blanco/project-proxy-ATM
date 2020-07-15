/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package protection;

/**
 *
 * @author jackl
 */
public interface IClient {
    public String loginState(int IDCuenta, int password);

    public void retirar(double cantidad, int IDCuenta, int password);
    
}
