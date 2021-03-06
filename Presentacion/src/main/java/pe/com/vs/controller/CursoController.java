/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.vs.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.com.vs.business.CursoBusiness;
import pe.com.vs.business.MateriaBusiness;
import pe.com.vs.business.base.OperacionEnum;
import pe.com.vs.context.appContext;
import pe.com.vs.entity.Curso;
import pe.com.vs.entity.Materia;

/**
 *
 * @author Victor
 */
public class CursoController extends HttpServlet {

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
            CursoBusiness cursoBusiness = (CursoBusiness) appContext.getService("CursoBusiness");
            MateriaBusiness materiaBusiness =(MateriaBusiness) appContext.getService("MateriaBusiness");
            Materia materia = new Materia();
            materia =materiaBusiness.ejecutar(OperacionEnum.OBTENER, null, Integer.parseInt(request.getParameter("cmbMateria")));
            Curso curso = new Curso();
            if (txtOption.equalsIgnoreCase("1") || txtOption.equalsIgnoreCase("2")) {
                curso.setNCantidadHora(Integer.parseInt(request.getParameter("txtHora")));
                curso.setNEstado(true);
                curso.setNNombre(request.getParameter("txtNombre"));
                curso.setIdMateria(materia);
                if (txtOption.equalsIgnoreCase("1")) {
                    cursoBusiness.ejecutar(OperacionEnum.REGISTRAR, curso, null);
                }else{
                    curso.setIdCurso(Integer.parseInt(request.getParameter("txtCodigo")));
                    cursoBusiness.ejecutar(OperacionEnum.EDITAR, curso, null);
                }
            }else{
                curso = cursoBusiness.ejecutar(OperacionEnum.OBTENER, null, Integer.parseInt(request.getParameter("txtCodigo")));
                curso.setNEstado(false);
                cursoBusiness.ejecutar(OperacionEnum.ELIMINAR , curso, null);
            }
            response.sendRedirect("ListaCurso.jsp");
        } catch (Exception e) {
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
