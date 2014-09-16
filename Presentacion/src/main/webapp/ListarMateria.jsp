<%-- 
    Document   : ListarMateria
    Created on : 31-jul-2014, 0:15:36
    Author     : Victor
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="pe.com.vs.entity.Materia"%>
<%@page import="pe.com.vs.context.appContext"%>
<%@page import="pe.com.vs.business.MateriaBusiness"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Usuario u = (Usuario) session.getAttribute("usuarioInicio");
    MateriaBusiness materiaBusiness =(MateriaBusiness) appContext.getService("MateriaBusiness");
    Iterable<Materia> listar = new ArrayList<Materia>();
    if(u.getNPrivilegio()!='E'){
        listar = materiaBusiness.ListarPersonalizado();
    }else{
        listar = materiaBusiness.ListarTodo();
    }
            
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
        <title>Intranet VS</title>
        <link href="css/main.css" rel="stylesheet" type="text/css" />
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,600,700' rel='stylesheet' type='text/css'>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.9.2/jquery-ui.min.js"></script>
        <script type="text/javascript" src="http://maps.googleapis.com/maps/api/js?key=AIzaSyDY0kkJiTPVd2U7aTOAwhc9ySH6oHxOIYM&amp;sensor=false"></script>
        <script type="text/javascript" src="js/plugins/charts/jquery.sparkline.min.js"></script>
        <script type="text/javascript" src="js/plugins/ui/jquery.easytabs.min.js"></script>
        <script type="text/javascript" src="js/plugins/ui/jquery.collapsible.min.js"></script>
        <script type="text/javascript" src="js/plugins/ui/jquery.mousewheel.js"></script>
        <script type="text/javascript" src="js/plugins/ui/jquery.bootbox.min.js"></script>
        <script type="text/javascript" src="js/plugins/ui/jquery.colorpicker.js"></script>
        <script type="text/javascript" src="js/plugins/ui/jquery.timepicker.min.js"></script>
        <script type="text/javascript" src="js/plugins/ui/jquery.jgrowl.js"></script>
        <script type="text/javascript" src="js/plugins/ui/jquery.fancybox.js"></script>
        <script type="text/javascript" src="js/plugins/ui/jquery.fullcalendar.min.js"></script>
        <script type="text/javascript" src="js/plugins/ui/jquery.elfinder.js"></script>
        <script type="text/javascript" src="js/plugins/uploader/plupload.js"></script>
        <script type="text/javascript" src="js/plugins/uploader/plupload.html4.js"></script>
        <script type="text/javascript" src="js/plugins/uploader/plupload.html5.js"></script>
        <script type="text/javascript" src="js/plugins/uploader/jquery.plupload.queue.js"></script>
        <script type="text/javascript" src="js/plugins/forms/jquery.uniform.min.js"></script>
        <script type="text/javascript" src="js/plugins/forms/jquery.autosize.js"></script>
        <script type="text/javascript" src="js/plugins/forms/jquery.inputlimiter.min.js"></script>
        <script type="text/javascript" src="js/plugins/forms/jquery.tagsinput.min.js"></script>
        <script type="text/javascript" src="js/plugins/forms/jquery.inputmask.js"></script>
        <script type="text/javascript" src="js/plugins/forms/jquery.select2.min.js"></script>
        <script type="text/javascript" src="js/plugins/forms/jquery.listbox.js"></script>
        <script type="text/javascript" src="js/plugins/forms/jquery.validation.js"></script>
        <script type="text/javascript" src="js/plugins/forms/jquery.validationEngine-en.js"></script>
        <script type="text/javascript" src="js/plugins/forms/jquery.form.wizard.js"></script>
        <script type="text/javascript" src="js/plugins/forms/jquery.form.js"></script>
        <script type="text/javascript" src="js/plugins/tables/jquery.dataTables.min.js"></script>
        <script type="text/javascript" src="js/files/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/files/functions.js"></script>
    </head>
    <body>
        <%@include file="Cabecera.jsp" %>
    </div>
</div>
</div>
<!-- /sidebar -->


<!-- Content -->
<div id="content">

    <!-- Content wrapper -->
    <div class="wrapper">

        <!-- Breadcrumbs line -->
        <div class="crumbs">
            <ul id="breadcrumbs" class="breadcrumb"> 
                <li><a href="index.html">Dashboard</a></li>
                <li class="active"><a href="calendar.html" title="">Calendar</a></li>
            </ul>
        </div>

        </br>


        <!-- Table with toolbar -->
        <div class="widget">
            <div class="navbar"><div class="navbar-inner"><h6>Lista de Seccion</h6></div></div>
            <ul class="toolbar">
                <li><a href="Materia.jsp?txtOption=1" title=""><i class="icon-heart"></i><span>New file</span></a></li>
                <li><a href="#" title=""><i class="icon-heart"></i><span>Upload file</span></a></li>
                <li><a href="#" title=""><i class="icon-download-alt"></i><span>Download file</span></a></li>
            </ul>
            <div class="table-overflow">
                <table class="table" style="font-family: Arial, Helvetica, sans-serif; font-size: 12px;" >
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Nombre</th>
                            <th>Estado</th>
                            <th>Editar</th>
                            <th>Eliminar</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            for (Materia m : listar) {
                        %>
                        <tr>
                            <td><%=m.getIdMateria() %> </td>
                            <td><%=m.getNNombre() %></td>
                            <%
                                if (m.getNEstado()) {
                            %>
                            <td>Activo</td>
                            <%
                            } else {
                            %>
                            <td>Inactivo</td>
                            <%
                                }
                            %>
                            <td> <a href="Materia.jsp?txtOption=2&txtCodigo=<%=m.getIdMateria() %>" class="tip" title="Editar"><i class="fam-pencil"></i></a></td>
                            <td><a href="MateriaController?txtOption=3&txtCodigo=<%=m.getIdMateria() %>" class="tip" title="Eliminar"><i class="fam-cross"></i></a></td>
                        </tr>
                        <%
                            }
                        %>
                    </tbody>
                </table>
            </div>
                    <div class="table-footer">
                        
                        <div class="pagination">
                            <ul>
                                <li><a href="#">Prev</a></li>
                                <li><a href="#">1</a></li>
                                <li><a href="#">2</a></li>
                                <li class="active"><a href="#">3</a></li>
                                <li><a href="#">4</a></li>
                                <li><a href="#">Next</a></li>
                            </ul>
                        </div>
                    </div>
        </div>
        <!-- /table with toolbar -->

    </div>
    <!-- /content wrapper -->

</div>
<!-- /content -->

</div>
<!-- /content container -->
<%@include file="PiePagina.jsp" %>
</body>
</html>

