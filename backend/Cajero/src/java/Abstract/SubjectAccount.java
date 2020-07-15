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
public interface SubjectAccount {
    public void signIn(String name, String password);
    public void register(String name, String password);
}
