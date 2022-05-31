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
 * @author doanh
 */
@WebServlet(urlPatterns = {"/PrintURL"})
public class PrintURL extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>URL関連情報の表示</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("RequestURL=" + request.getRequestURL());
            out.println("<br>");
            out.println("Scheme=" + request.getScheme());
            out.println("<br>");
            out.println("ServerName=" + request.getServerName());
            out.println("<br>");
            out.println("ServerPort=" + request.getServerPort());
            out.println("<br>");
            out.println("RequestURI=" + request.getRequestURI());
            out.println("<br>");
            out.println("ContextPath=" + request.getContextPath());
            out.println("<br>");
            out.println("ServletPath=" + request.getServletPath());
            out.println("<br>");
            out.println("PathInfo=" + request.getPathInfo());
            out.println("<br>");
            out.println("PathTranslated=" + request.getPathTranslated());
            out.println("<br>");
            out.println("QueryString=" + request.getQueryString());
            out.println("</body>");
            out.println("</html>");
            out.close();
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
