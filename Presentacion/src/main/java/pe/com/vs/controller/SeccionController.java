/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.vs.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.com.vs.business.SeccionBusiness;
import pe.com.vs.business.base.OperacionEnum;
import pe.com.vs.context.appContext;
import pe.com.vs.entity.Seccion;

/**
 *
 * @author Victor
 */
public class SeccionController extends HttpServlet {

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
            String txtOption = "";
            boolean chkBox = Boolean.valueOf(request.getParameter("chkEstado"));
            txtOption = request.getParameter("txtOption");
            SeccionBusiness seccionBusiness = (SeccionBusiness) appContext.getService("SeccionBusiness");
            Seccion seccion = new Seccion();
            if (txtOption.equalsIgnoreCase("1") || txtOption.equalsIgnoreCase("2")) {
                seccion.setNSeccion(request.getParameter("txtNombre"));
                seccion.setNEstado(true);
                if (txtOption.equalsIgnoreCase("1")) {
                    seccionBusiness.ejecutar(OperacionEnum.REGISTRAR, seccion, null);
                } else {
                    seccion.setIdSeccion(Integer.parseInt("txtCodigo"));
                    seccionBusiness.ejecutar(OperacionEnum.EDITAR, seccion, null);
                }
            } else {
                seccion = seccionBusiness.ejecutar(OperacionEnum.OBTENER, null, Integer.parseInt(request.getParameter("txtCodigo")));
                seccion.setNEstado(false);
                seccionBusiness.ejecutar(OperacionEnum.ELIMINAR, seccion, null);
            }
            response.sendRedirect("ListaSeccion.jsp");

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
