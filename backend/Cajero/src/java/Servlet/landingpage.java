/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "landingpage", urlPatterns = {"/landingpage"})
public class landingpage extends HttpServlet {
    
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
        //Datos enviados desde el formulario en el index.jsp
        int account = Integer.parseInt(request.getParameter("cuenta-usuario"));
        String password = request.getParameter("password-user");
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("   <meta charset=\"UTF-8\">\n" +
                        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                        "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
                        "    <title>Cajero CajaGrupal</title>\n" +
                        "    <link rel=\"stylesheet\" href=\"css/style.css\">\n" +
                        "    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">");            
            out.println("</head>");
            out.println("<header>");
            out.println(" <div class=\"contenedor\">\n" +
                    "        <h1 class=\"icon-dog\">Cajero CajaGrupal</h1>\n" +
                    "        <input type=\"checkbox\" id=\"menu-bar\">\n" +
                    "    </div>");
            out.println("</header>");
            out.println("<body>");
            out.println("   <main>\n" +
                        "      <section id=\"banner\">\n" +
                        "          <img src=\"https://images.unsplash.com/photo-1574288061782-da2d3f79a72e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1267&q=80\">\n" +
                        "          <div class=\"contenedor\">\n" +
                        "              <h2>Sientase Seguro y Feliz</h2>\n" +
                        "              <p>¿Por que preocuparse? su dinero esta en CajaGrupal</p>\n" +
                        "              <button type=\"button\" class=\"btn btn-outline-success\" data-toggle=\"modal\" data-target=\"#retirar-monto\">\n" +
                        "                Retirar\n" +
                        "            </button> \n" +
                        "          </div>\n" +
                        "      </section>\n" +
                        "\n" +
                        "      <div class=\"modal fade\" id=\"retirar-monto\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n" +
                        "        <div class=\"modal-dialog modal-dialog-centered\">\n" +
                        "        <div class=\"modal-content\">\n" +
                        "            <div class=\"modal-header\">\n" +
                        "            <h5 class=\"modal-title\" id=\"exampleModalLabel\">Retirar</h5>\n" +
                        "            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n" +
                        "                <span aria-hidden=\"true\">&times;</span>\n" +
                        "            </button>\n" +
                        "            </div>\n" +
                        "            <div class=\"modal-body\">\n" +
                        "                <form action=\"\" method=\"POST\">\n" +
                        "                    <div class=\"form-group\">\n" +
                        "                      <label for=\"nombre-usuario\">Monto a Retirar</label>\n" +
                        "                      <input type=\"text\" class=\"form-control\" id=\"nombre-usuario\" aria-describedby=\"emailHelp\">\n" +
                        "                      <small id=\"emailHelp\" class=\"form-text text-muted\">Saldo Actual: -----</small>\n" +
                        "                    </div>                 \n" +
                        "            </div>\n" +
                        "            <div class=\"modal-footer\">\n" +
                        "            <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n" +
                        "            <input type=\"submit\" class=\"btn btn-primary\" value=\"Enviar\">\n" +
                        "            </div>\n" +
                        "        </form>\n" +
                        "        </div>\n" +
                        "        </div>\n" +
                        "    </div>\n" +
                        "      \n" +
                        "      <section id=\"bienvenidos\">\n" +
                        "      <div class=\"contenedor\">\n" +
                        "          <h2>BIENVENIDOS A CAJERO DE CAJAGRUPAL</h2>\n" +
                        "          <p>Tu saldo actual es de:</p>\n" +
                        "          </div>\n" +
                        "      </section>\n" +
                        "      \n" +
                        "      <section id=\"blog\">\n" +
                        "          <h3>Saldo Actual</h3>\n" +
                        "      </section>\n" +
                        "      \n" +
                        "      <section id=\"info\">\n" +
                        "          <h3>Dato Principal, Tu nombre</h3>\n" +
                        "          <div class=\"contenedor\">\n" +
                        "              <div class=\"info-pet\">\n" +
                        "                  <img src=\"https://images.unsplash.com/photo-1593642532842-98d0fd5ebc1a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80\" alt=\"\">\n" +
                        "                  <h4>Nombre Completo</h4>\n" +
                        "              </div>\n" +
                        "          </div>\n" +
                        "      </section>\n" +
                        "  </main>\n" +
                        "    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n" +
                        "    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n" +
                        "    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\" integrity=\"sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI\" crossorigin=\"anonymous\"></script>");
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
