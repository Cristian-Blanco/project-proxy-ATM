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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import proxy.ClientProxy;

/**
 *
 * @author Cristian
 */
@WebServlet(name = "registerpage", urlPatterns = {"/registerpage"})
public class registerpage extends HttpServlet {

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
        //datos para el registro
        String name = request.getParameter("nombre-usuario");
        int account = Integer.parseInt(request.getParameter("cuenta-usuario"));
        String password = request.getParameter("password-user");
        double amount = Double.parseDouble(request.getParameter("amount"));
        
        IClient intento = new ClientProxy();
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("   <meta charset=\"UTF-8\">\n" +
                    "        <title>Cajero CajaGrupal</title>\n" +
                    "        <link rel=\"icon\"  type=\"image/png\" href=\"\">\n" +
                    "        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">\n" +
                    "        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/homepage_style.css\">");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"container\">\n" +
            "            <div class=\"form\">\n" +
            "                <div class=\"form-header\">\n" +
            "                    <h1 class=\"form-title\"><span>Cajero CajaGrupal</span></h1>\n" +
            "                    <h3 class=\"form-title\"><span>Felicidad Por Siempre</span></h3>\n" +
            "                </div>\n" +
            "                <label for=\"full-name\" class=\"form-label\">"+intento.registerState(name, account, password, amount)+"</label>\n" +
            "                <a href=\"index.jsp\" type=\"button\" class=\"btn btn-primary btn-lg btn-block\">Inicio</a>      \n" +
            "            </div>\n" +
            "        </div>");
            out.println("</body>");
            out.println("</html>");
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
