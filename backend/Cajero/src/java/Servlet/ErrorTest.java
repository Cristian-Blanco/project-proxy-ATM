/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servlet;

import Protection.IClient;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import proxy.ClientProxy;

/**
 *
 * @author jackl
 */
public class ErrorTest extends HttpServlet {
     private static String nombre;
     private static int IDcuenta;
     private static String password;
     private static double cantidad;
     public static IClient proxie = new ClientProxy();;
        /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     
    

     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        this.IDcuenta = Integer.parseInt(request.getParameter("cuenta-usuario"));
        this.cantidad = Double.parseDouble(request.getParameter("amount"));
        this.nombre = request.getParameter("nombre-usuario");
        this.password = request.getParameter("password-user");
        if(proxie.registerState(this.nombre, this.IDcuenta, this.password, this.cantidad).equals("La cuenta ya existe por favor ingrese una nueva cuenta")){
            response.sendRedirect("Error2.jsp");
        }else{
            response.sendRedirect("RegisterPage");
        }
    }
    
    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        ErrorTest.nombre = nombre;
    }

    public static int getIDcuenta() {
        return IDcuenta;
    }

    public static void setIDcuenta(int IDcuenta) {
        ErrorTest.IDcuenta = IDcuenta;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        ErrorTest.password = password;
    }

    public static double getCantidad() {
        return cantidad;
    }

    public static void setCantidad(double cantidad) {
        ErrorTest.cantidad = cantidad;
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

    String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
