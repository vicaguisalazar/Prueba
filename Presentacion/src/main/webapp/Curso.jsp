<%-- 
    Document   : Curso
    Created on : 05-ago-2014, 20:30:21
    Author     : victoralfonsoaguilarsalazar
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="pe.com.vs.entity.Materia"%>
<%@page import="pe.com.vs.business.MateriaBusiness"%>
<%@page import="pe.com.vs.business.base.OperacionEnum"%>
<%@page import="pe.com.vs.entity.Curso"%>
<%@page import="pe.com.vs.context.appContext"%>
<%@page import="pe.com.vs.business.CursoBusiness"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%    
CursoBusiness cursoBusiness = (CursoBusiness) appContext.getService("CursoBusiness");
    Curso curso = new Curso();
    Integer txtoption = Integer.parseInt(request.getParameter("txtOption"));
    if (txtoption == 2) {
        curso = cursoBusiness.ejecutar(OperacionEnum.OBTENER, null, txtoption);
    }
    MateriaBusiness materiaBusiness = (MateriaBusiness) appContext.getService("MateriaBusiness");
    Iterable<Materia> listarMateria = new ArrayList<Materia>();
    listarMateria = materiaBusiness.ListarPersonalizado();

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
        <script type="text/javascript" src="js/globalize/globalize.js"></script>
        <script type="text/javascript" src="js/globalize/globalize.culture.de-DE.js"></script>
        <script type="text/javascript" src="js/globalize/globalize.culture.ja-JP.js"></script>
        <script type="text/javascript" src="js/plugins/tables/jquery.dataTables.min.js"></script>
        <script type="text/javascript" src="js/files/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/files/functions.js"></script>

    </head>

    <body>

        <%@include file="Cabecera.jsp" %>
    </div>
</div>
</div>

<!-- Content -->
<div id="content">

    <!-- Content wrapper -->
    <div class="wrapper">

        <!-- Breadcrumbs line -->
        <div class="crumbs">
            <ul id="breadcrumbs" class="breadcrumb"> 
                <li><a href="index.html">Dashboard</a></li>
                <li><a href="forms.html">Form elements</a></li>
                <li class="active"><a href="forms.html" title="">Form components</a></li>
            </ul>
        </div>



        <!-- Basic inputs -->
        <h5 class="widget-name"><i class="icon-align-justify"></i>Gestionar Seccion</h5>

        <%            if (txtoption == 2) {
        %>
        <form class="form-horizontal" action="CursoController?txtOption=2">
            <%
            } else {
            %>
            <form class="form-horizontal" action="CursoController?txtOption=1">
                <%}%>
                <fieldset>

                    <!-- General form elements -->
                    <div class="widget row-fluid">
                        <div class="navbar">
                            <div class="navbar-inner">
                                <h6>Lista de Secciones</h6>
                            </div>
                        </div>

                        <div class="well">

                            <div class="control-group">
                                <label class="control-label">Codigo: </label>
                                <%
                                    if (txtoption == 2) {
                                %>
                                <div class="controls"><input class="input-mini" type="text" name="txtCodigo" readonly value="<%=curso.getIdCurso()%>"/></div>
                                    <%
                                    } else {
                                    %>
                                <div class="controls"><input class="input-mini" type="text" name="txtCodigo" readonly value=""/></div>
                                    <%
                                        }
                                    %>
                            </div>
                            <input name="txtOption" type="hidden" value="<%= request.getParameter("txtOption")%>"/>
                            <div class="control-group">
                                <label class="control-label">Nombre: </label>
                                <%
                                    if (txtoption == 2) {
                                %>
                                <div class="controls"><input type="text" name="txtNombre" maxlength="10" placeholder="Ingresa Nombre" class="input-xlarge" value="<%=curso.getNNombre()%>" /></div>
                                    <%
                                    } else {
                                    %><div class="controls"><input type="text" name="txtNombre" maxlength="10" placeholder="Ingresa Nombre" class="input-xlarge" /></div>
                                    <%
                                        }
                                    %>
                            </div>
                            <div class="control-group">
                                <label class="control-label">Cantidad Horas: </label>
                                <%
                                    if (txtoption == 2) {
                                %>
                                <div class="controls"><input type="text" name="txtHora" maxlength="10" placeholder="Ingresa Cant. Horas" class="input-xlarge" value="<%=curso.getNCantidadHora() %>" /></div>
                                    <%
                                    } else {
                                    %><div class="controls"><input type="text" name="txtHora" maxlength="10" placeholder="Ingresa Cant. Horas" class="input-xlarge" /></div>
                                    <%
                                        }
                                    %>
                            </div>
                            <div class="control-group">
                                <label class="control-label">Materia:</label>
                                <div class="controls">
                                    <select data-placeholder="Seleccionar Materia" id="clear-results" tabindex="2" name="cmbMateria" >
                                        <%
                                            if (txtoption == 2) {
                                        %>
                                        <option value="<%=curso.getIdMateria().getIdMateria()%>"><<%=curso.getIdMateria().getNNombre()%>></option> 
                                        <%
                                            }
                                        %>
                                        <%
                                            for (Materia m : listarMateria) {
                                        %>
                                        <option value="<%=m.getIdMateria()%>"><%=m.getNNombre()%></option> 
                                        <%
                                            }
                                        %>
                                    </select>
                                </div>             
                            </div>
                            <div class="control-group">
                                <label class="control-label">Estado: </label>
                                <div class="controls"><input type="checkbox" value="ON" name="chkEstado" class="styled" checked></div>
                            </div>

                            <div class="form-actions align-right">
                                <button type="submit" class="btn btn-primary">Enviar</button>
                                <button type="button" class="btn btn-danger">Cancelar</button>
                            </div>

                        </div>
                    </div>
                    <!-- /general form elements -->


                </fieldset> 

            </form>
            <!-- /basic inputs -->

    </div>
    <!-- /content wrapper -->

</div>
<!-- /content -->
</div>
<%@include file="PiePagina.jsp" %>
</body>

</html>
