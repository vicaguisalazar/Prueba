<%-- 
    Document   : IniciarSesion
    Created on : 28-jul-2014, 23:32:41
    Author     : Victor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String usuario = "";
    String clave = "";
    if (request.getCookies() != null) {
        Cookie[] cookies = request.getCookies();
        for (Cookie c : cookies) {
            if (c.getName().equalsIgnoreCase("txtUsuario")) {
                usuario = c.getValue();
            } else if (c.getName().equalsIgnoreCase("txtClave")) {
                clave = c.getValue();
            }
        }
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
        <script type="text/javascript" src="js/plugins/forms/jquery.uniform.min.js"></script>
        <script type="text/javascript" src="js/files/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/files/login.js"></script>
    </head>

    <body class="no-background">
        <div id="top">
            <div class="fixed">
                <a href="#" title="" class="logo"><img src="" alt="" /></a>
            </div>
        </div>
        <div class="login">
            <div class="navbar">
                <div class="navbar-inner">
                    <h6><i class="icon-user"></i>Iniciar Sesion</h6>
                </div>
            </div>
            <div class="well">
                <form action="IniciarSesionController" class="row-fluid">
                    <div class="control-group">
                        <label class="control-label">Usuario:</label>
                        <div class="controls"><input class="span12" type="text" name="txtUsuario" placeholder="Ingresar Usuario" /></div>
                    </div>

                    <div class="control-group">
                        <label class="control-label">Clave:</label>
                        <div class="controls"><input class="span12" type="password" name="txtClave" placeholder="Ingresar Clave" /></div>
                    </div>

                    <div class="control-group">
                        <div class="controls"><label class="checkbox inline"><input type="checkbox" name="chkRecordar" class="styled" value="" checked="checked">Recordar Sesion</label></div>
                    </div>

                    <div class="login-btn"><input type="submit" value="Ingresar" class="btn btn-danger btn-block" /></div>
                </form>
            </div>
        </div>
        <!-- /login block -->


        <!-- Footer -->
        <div id="footer">
            <div class="copyrights">&copy;  Solutions VS</div>
        </div>
        <!-- /footer -->

    </body>
</html>
