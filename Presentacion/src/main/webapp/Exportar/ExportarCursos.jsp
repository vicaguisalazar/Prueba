<%-- 
    Document   : ExportarCursos
    Created on : 31-jul-2014, 2:09:03
    Author     : Victor
--%>

<%@page import="pe.com.vs.entity.Curso"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pe.com.vs.business.CursoBusiness"%>
<%@page import="pe.com.vs.context.appContext"%>
<%@page import="pe.com.vs.entity.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Usuario u = (Usuario) session.getAttribute("usuarioInicio");
    CursoBusiness cursoBusiness = (CursoBusiness) appContext.getService("CursoBusiness");
    Iterable<Curso> listar = new ArrayList<Curso>();
    if (u.getNPrivilegio() != 'E') {
        listar = cursoBusiness.ListarPersonalizado();
    } else {
        listar = cursoBusiness.ListarTodo();
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Intranet VS</title>
    </head>
    <body>
        <h6>Lista de Seccion</h6>
        <%
            response.setHeader("Content-Disposition", "attachment;filename=\"ListaDeCurso.xls\"");
        %>
        <table>
            <thead>
                <tr>
                    <th>#</th>
                    <th>Materia</th>
                    <th>Nombre</th>
                    <th>Horas</th>
                    <th>Estado</th>
                </tr>
            </thead>
            <tbody>
                <%
                    for (Curso c : listar) {
                %>
                <tr>
                    <td><%=c.getIdCurso()%> </td>
                    <td><%=c.getIdMateria().getNNombre()%></td>
                    <td><%=c.getNNombre()%></td>
                    <td><%=c.getNCantidadHora()%></td>
                    <%
                        if (c.getNEstado()) {
                    %>
                    <td>Activo</td>
                    <%
                    } else {
                    %>
                    <td>Inactivo</td>
                    <%
                        }
                    %>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </body>
</html>
