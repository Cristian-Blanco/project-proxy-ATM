/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Protection.IClient;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import proxy.ClientProxy;

/**
 *
 * @author jackl
 */
public class Redirect extends HttpServlet {

    private static int cuenta;
    private static String password;
    
    public static IClient proxie = new ClientProxy();

    public int getCuenta() {
        return cuenta;
    }

    public String getPassword() {
        return password;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    


    
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        this.setCuenta(Integer.parseInt(request.getParameter("nombre-usuario")));
        this.setPassword(request.getParameter("password-user"));
       
       
        if (proxie.loginState(Integer.parseInt(request.getParameter("nombre-usuario")), request.getParameter("password-user")).equals("Se ha accedido a la cuenta " + this.cuenta)) {
            response.sendRedirect("LandingPage");
        } else {
            response.sendRedirect("Error1.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
