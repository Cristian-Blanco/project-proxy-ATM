/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author Cristian
 */
public interface Atm {
    public int signIn(String name, String password);
    public void register(String name, String password);
    public String showValue(String key);
    public void insertAmount(String key, int amount);
    public void removeAmount(String key, int amount);
}
