/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.vs.controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pe.com.vs.business.UsuarioBusiness;
import pe.com.vs.context.appContext;
import pe.com.vs.entity.Usuario;

/**
 *
 * @author Victor
 */
public class IniciarSesionController extends HttpServlet {

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
        try {
            UsuarioBusiness usuarioBusiness = (UsuarioBusiness) appContext.getService("UsuarioBusiness");
            Iterable<Usuario> listar;
            listar = new ArrayList<Usuario>();
            listar = usuarioBusiness.ListarTodo();
            String usuario = request.getParameter("txtUsuario");
            String clave = request.getParameter("txtClave");
            boolean recordar = request.getParameter("chkRecordar") != null;
            for (Usuario u : listar) {
                if (u.getNUserID().equalsIgnoreCase(usuario) && u.getNClave().equalsIgnoreCase(clave)) {
                    HttpSession session = request.getSession(true);
                    session.setMaxInactiveInterval(60*60);
                    session.setAttribute("usuarioInicio", u);
                    response.sendRedirect("MenuPrincipal.jsp");
                    if (recordar) {
                        Cookie cookie = new Cookie("usuario", usuario);
                        cookie.setMaxAge(60 * 60);
                        response.addCookie(cookie);
                        cookie = new Cookie("clave", clave);
                        cookie.setMaxAge(60 * 60);
                        response.addCookie(cookie);
                    }
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println(e);
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
