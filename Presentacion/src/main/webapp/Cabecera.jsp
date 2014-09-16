<%-- 
    Document   : Cabecera
    Created on : 29-jul-2014, 23:10:43
    Author     : Victor
--%>
<%@page import="pe.com.vs.entity.Usuario"%>
<%@page session="true" %>
<%
    Usuario u1 = (Usuario) session.getAttribute("usuarioInicio");
%>
<div id="top">
    <div class="fixed">
        <a href="MenuPrincipal.jsp" title="" class="logo"><img src="" alt="" /></a>
        <ul class="top-menu">
            <li><a class="fullview"></a></li>
            <li><a class="showmenu"></a></li>
            <li class="dropdown">
                <a class="user-menu" data-toggle="dropdown"><img src="img/userpic.png" alt="" /><span>Hola <%=u1.getNApellido() + " " + u1.getNNombre()%> ! <b class="caret"></b></span></a>
                <ul class="dropdown-menu">
                    <li><a href="#" title=""><i class="icon-user"></i>Perfil</a></li>
                    <li><a href="#" title=""><i class="icon-inbox"></i>Mensajes<span class="badge badge-info">9</span></a></li>
                    <li><a href="#" title=""><i class="icon-cog"></i>Configuracion</a></li>
                    <li><a href="CerrarSesionController" title=""><i class="icon-remove"></i>Cerrar Session</a></li>
                </ul>
            </li>
        </ul>
    </div>
</div>
<div id="container">

    <!-- Sidebar -->
    <div id="sidebar">

        <div class="sidebar-tabs">
            <ul class="tabs-nav two-items">
                <li><a href="#general" title=""><i class="icon-reorder"></i></a></li>
                <li><a href="#stuff" title=""><i class="icon-cogs"></i></a></li>
            </ul>

            <div id="general">

                <!-- Sidebar user -->
                <div class="sidebar-user widget">
                    <div class="navbar"><div class="navbar-inner"><h6>Wazzup, <%=u1.getNNombre()%>!</h6></div></div>
                    <a href="#" title="" class="user"><img src="http://placehold.it/210x110" alt="" /></a>
                </div>


                <ul class="navigation widget">
                    <li class="active"><a href="MenuAdministrador.jsp" title=""><i class="icon-home"></i>Inicio</a></li>
                    <li><a href="#" title=""><i class="icon-picture"></i>Mi Perfil</a></li>
                        <%
                            if (u1.getNPrivilegio() != 'A' && u1.getNPrivilegio() != 'B') {
                        %>
                    <li><a href="#" title="" class="expand"><i class="icon-reorder"></i>Gestionar Examen</a>
                        <ul>
                            <li><a href="#" title="">Examenes en Lineas</a></li>
                            <li><a href="#" title="">Listas de Examenes</a></li>
                            <li><a href="#" title="">Generar Reportes</a></li>
                        </ul>
                    </li>
                    <%
                        }
                    %>
                    <%
                        if (u1.getNPrivilegio() != 'A' && u1.getNPrivilegio() != 'B') {
                    %>
                    <li><a href="#" title="" class="expand"><i class="icon-tasks"></i>Gestionar Noticias</a>
                        <ul>
                            <li><a href="#" title="">Lista de Noticias</a></li>
                        </ul>
                    </li>
                    <%
                        }
                    %>

                    <%
                        if (u1.getNPrivilegio() == 'D' && u1.getNPrivilegio() == 'E') {
                    %>
                    <li><a href="#" title="" class="expand"><i class="icon-tasks"></i>Gestionar Eventos</a>
                        <ul>
                            <li><a href="#" title="">Lista de Eventos</a></li>
                        </ul>
                    </li>
                    <%
                        }
                    %>
                    <%
                        if (u1.getNPrivilegio() != 'A' && u1.getNPrivilegio() != 'B') {
                    %>
                    <li><a href="#" title="" class="expand"><i class="icon-tasks"></i>Gestionar Recursos Humanos</a>
                        <ul>
                            <li><a href="ListaPersonal.jsp" title="">Lista de Personal</a></li>
                            <li><a href="ListaProfesor.jsp" title="">Lista de Profesores</a></li>
                            <li><a href="ListaApoderado.jsp" title="">Lista de Apoderados</a></li>
                            <li><a href="ListaAlumno.jsp" title="">Lista de Alumnos</a></li>
                            <li><a href="ListaAlumnoRetirado.jsp" title="">Lista de Alumnos Retirados</a></li>
                        </ul>
                    </li>
                    <%
                        }
                    %>
                    <%
                        if (u1.getNPrivilegio() == 'A' && u1.getNPrivilegio() == 'B' && u1.getNPrivilegio() == 'C') {
                    %>
                    <li><a href="#" title="" class="expand"><i class="icon-tasks"></i>Gestionar Comprobantes de Pagos</a>
                        <ul>
                            <li><a href="#" title="">Lista de Comprobantes de Pagos</a></li>
                            <li><a href="#" title="">Reportes de Pagos</a></li>
                        </ul>
                    </li>
                    <%
                        }
                    %>
                    <li><a href="#" title="" class="expand"><i class="icon-tasks"></i>Gestionar Correo Electronico</a>
                        <ul>
                            <li><a href="#" title="">Lista de Mensajes</a></li>
                            <li><a href="EnviarCorreo.jsp" title="">Envio de Mensajes</a></li>
                        </ul>
                    </li>
                    <%
                        if (u1.getNPrivilegio() != 'A' && u1.getNPrivilegio() != 'B' && u1.getNPrivilegio() != 'C') {
                    %>
                    <li><a href="#" title="" class="expand"><i class="icon-tasks"></i>Gestionar Horarios</a>
                        <ul>
                            <li><a href="#" title="">Lista de Horarios</a></li>
                            <li><a href="#" title="">Configuracion de Horarios</a></li>
                        </ul>
                    </li>
                    <%
                        }
                    %>
                    <%
                        if (u1.getNPrivilegio() != 'A' && u1.getNPrivilegio() != 'B' && u1.getNPrivilegio() != 'C') {
                    %>
                    <li><a href="#" title="" class="expand"><i class="icon-tasks"></i>Gestionar Grado y Seccion</a>
                        <ul>
                            <li><a href="ListaGrado.jsp" title="">Lista de Grados</a></li>
                            <li><a href="ListaSeccion.jsp" title="">Lista de Secciones</a></li>
                        </ul>
                    </li>
                    <%
                        }
                    %>
                    <%
                        if (u1.getNPrivilegio() != 'A' && u1.getNPrivilegio() != 'B' && u1.getNPrivilegio() != 'C') {
                    %>
                    <li><a href="#" title="" class="expand"><i class="icon-tasks"></i>Gestionar Materia y Curso</a>
                        <ul>
                            <li><a href="ListarMateria.jsp" title="">Lista de Materia</a></li>
                            <li><a href="ListaCurso.jsp" title="">Lista de Curso</a></li>
                            <li><a href="#" title="">Asignar Materia a Cursos</a></li>
                            <li><a href="#" title="">Asignar Profesor a Cursos</a></li>
                        </ul>
                    </li>
                    <%
                        }
                    %>
                    <%
                        if (u1.getNPrivilegio() != 'A' && u1.getNPrivilegio() != 'B' && u1.getNPrivilegio() != 'C') {
                    %>
                    <li><a href="#" title="" class="expand"><i class="icon-tasks"></i>Gestionar Examen y Nota</a>
                        <ul>
                            <li><a href="#" title="">Lista de Examen</a></li>
                            <li><a href="#" title="">Lista de Nota</a></li>
                            <li><a href="#" title="">Asignar Examen a Nota</a></li>
                        </ul>
                    </li>
                    <%
                        }
                    %>
                    <%
                        if (u1.getNPrivilegio() != 'A' && u1.getNPrivilegio() != 'B' && u1.getNPrivilegio() != 'C') {
                    %>
                    <li><a href="#" title="" class="expand"><i class="icon-tasks"></i>Gestionar Matricula</a>
                        <ul>
                            <li><a href="#" title="">Lista de Matriculas</a></li>
                            <li><a href="#" title="">Lista de Modalidades</a></li>
                        </ul>
                    </li>
                    <%
                        }
                    %>
                    <%
                        if (u1.getNPrivilegio() != 'A' && u1.getNPrivilegio() != 'B' && u1.getNPrivilegio() != 'C') {
                    %>
                    <li><a href="#" title="" class="expand"><i class="icon-tasks"></i>Gestionar Examen y Notas</a>
                        <ul>
                            <li><a href="#" title="">Lista de Examenes</a></li>
                            <li><a href="#" title="">Asignar Examen a Cursos</a></li>
                            <li><a href="#" title="">Ingresar Notas</a></li>
                        </ul>
                    </li>
                    <%
                        }
                    %>
                </ul>
