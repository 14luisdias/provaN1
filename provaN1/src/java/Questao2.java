/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author W7
 */
@WebServlet(urlPatterns = {"/questao2"})
public class Questao2 extends HttpServlet {

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
        
        String m1 = null,m2 = null,m3 = null,m4 = null;
       //int gf = 0,gk = 0;
        int gc = Integer.valueOf(request.getParameter("grausCel"));
        if( gc>0){
            int gf = (int) (gc*1.8+32);
            gc = (int) ((gf-32)/1.8);
            int gk = (int) (gc+273.15);
            gc = (int) (gk-273.15);
        
            m1="Grau Fahrenheit:  "+gf;
            m2="Grau Celsius:  "+gc;
            m3="Grau Kelvin :  "+gk;
            m4="Grau Celsius :  "+gc;
        }
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Questao2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<b1>"+m1+"</b1><br>");
            out.println("<b1>"+m2+"</b1><br>");
            out.println("<b1>"+m3+"</b1><br>");
            out.println("<b1>"+m4+"</b1><br>");
            out.println("<a href=\"http://localhost:8080/provaN1/questao2.jsp\">Voltar</a>");
            out.println("<h1>Servlet Questao2 at " + request.getContextPath() + "</h1>");
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
