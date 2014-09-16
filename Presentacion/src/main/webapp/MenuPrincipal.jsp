<%-- 
    Document   : MenuAdministrador
    Created on : 29-jul-2014, 20:55:54
    Author     : Victor
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <script type="text/javascript" src="js/plugins/charts/excanvas.min.js"></script>
        <script type="text/javascript" src="js/plugins/charts/jquery.flot.js"></script>
        <script type="text/javascript" src="js/plugins/charts/jquery.flot.resize.js"></script>
        <script type="text/javascript" src="js/plugins/charts/jquery.sparkline.min.js"></script>
        <script type="text/javascript" src="js/plugins/ui/jquery.easytabs.min.js"></script>
        <script type="text/javascript" src="js/plugins/ui/jquery.collapsible.min.js"></script>
        <script type="text/javascript" src="js/plugins/ui/jquery.mousewheel.js"></script>
        <script type="text/javascript" src="js/plugins/ui/prettify.js"></script>
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
        <script type="text/javascript" src="js/charts/graph.js"></script>
        <script type="text/javascript" src="js/charts/chart1.js"></script>
        <script type="text/javascript" src="js/charts/chart2.js"></script>
        <script type="text/javascript" src="js/charts/chart3.js"></script>
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
        <h5 class="widget-name"><i class="icon-th"></i>Noticias Principales</h5>

                <!-- With titles -->
				<div class="media row-fluid">

					<div class="span3">
						<div class="widget">
						    <div class="well">
						    	<div class="view">
									<a href="img/demo/big.jpg" class="view-back lightbox"></a>
							    	<img src="http://placehold.it/580x380" alt="" />
							    </div>
						    	<div class="item-info">
						    		<a href="#" title="" class="item-title">Aenean Malesuada Consectetur Risus</a>
						    		<p>Donec id elit non mi porta gravida at eget metus. Praesent commodo cursus magna, vel scelerisque nisl consectetur mollis ornare vel leo.</p>
						    		<p class="item-buttons">
						    			<a href="#" class="btn btn-info tip" title="Edit"><i class="icon-pencil"></i></a>
						    			<a href="#" class="btn btn-danger tip" title="Move to trash"><i class="icon-trash"></i></a>
						    		</p>
						    	</div>
						    </div>
						</div>

						<div class="widget">
						    <div class="well">
						    	<div class="view">
									<a href="img/demo/big.jpg" class="view-back lightbox"></a>
							    	<img src="http://placehold.it/580x380" alt="" />
							    </div>
						    	<div class="item-info">
						    		<a href="#" title="" class="item-title">Aenean Malesuada Consectetur Risus</a>
						    		<p>Donec id elit non mi porta gravida at eget metus. Praesent commodo cursus magna, vel scelerisque nisl consectetur mollis ornare vel leo.</p>
						    		<p class="item-buttons">
						    			<a href="#" class="btn btn-info tip" title="Edit"><i class="icon-pencil"></i></a>
						    			<a href="#" class="btn btn-danger tip" title="Move to trash"><i class="icon-trash"></i></a>
						    		</p>
						    	</div>
						    </div>
						</div>
					</div>

					<div class="span3">
						<div class="widget">
						    <div class="well">
						    	<div class="view">
									<a href="img/demo/big.jpg" class="view-back lightbox"></a>
							    	<img src="http://placehold.it/580x380" alt="" />
							    </div>
						    	<div class="item-info">
						    		<a href="#" title="" class="item-title">Aenean Malesuada Consectetur Risus</a>
						    		<p>Donec id elit non mi porta gravida at eget metus. Praesent commodo cursus magna, vel scelerisque nisl consectetur mollis ornare vel leo.</p>
						    		<p class="item-buttons">
						    			<a href="#" class="btn btn-info tip" title="Edit"><i class="icon-pencil"></i></a>
						    			<a href="#" class="btn btn-danger tip" title="Move to trash"><i class="icon-trash"></i></a>
						    		</p>
						    	</div>
						    </div>
						</div>

						<div class="widget">
						    <div class="well">
						    	<div class="view">
									<a href="img/demo/big.jpg" class="view-back lightbox"></a>
							    	<img src="http://placehold.it/580x380" alt="" />
							    </div>
						    	<div class="item-info">
						    		<a href="#" title="" class="item-title">Aenean Malesuada Consectetur Risus</a>
						    		<p>Donec id elit non mi porta gravida at eget metus. Praesent commodo cursus magna, vel scelerisque nisl consectetur mollis ornare vel leo.</p>
						    		<p class="item-buttons">
						    			<a href="#" class="btn btn-info tip" title="Edit"><i class="icon-pencil"></i></a>
						    			<a href="#" class="btn btn-danger tip" title="Move to trash"><i class="icon-trash"></i></a>
						    		</p>
						    	</div>
						    </div>
						</div>
					</div>

					<div class="span3">
						<div class="widget">
						    <div class="well">
						    	<div class="view">
									<a href="img/demo/big.jpg" class="view-back lightbox"></a>
							    	<img src="http://placehold.it/580x380" alt="" />
							    </div>
						    	<div class="item-info">
						    		<a href="#" title="" class="item-title">Aenean Malesuada Consectetur Risus</a>
						    		<p>Donec id elit non mi porta gravida at eget metus. Praesent commodo cursus magna, vel scelerisque nisl consectetur mollis ornare vel leo.</p>
						    		<p class="item-buttons">
						    			<a href="#" class="btn btn-info tip" title="Edit"><i class="icon-pencil"></i></a>
						    			<a href="#" class="btn btn-danger tip" title="Move to trash"><i class="icon-trash"></i></a>
						    		</p>
						    	</div>
						    </div>
						</div>

						<div class="widget">
						    <div class="well">
						    	<div class="view">
									<a href="img/demo/big.jpg" class="view-back lightbox"></a>
							    	<img src="http://placehold.it/580x380" alt="" />
							    </div>
						    	<div class="item-info">
						    		<a href="#" title="" class="item-title">Aenean Malesuada Consectetur Risus</a>
						    		<p>Donec id elit non mi porta gravida at eget metus. Praesent commodo cursus magna, vel scelerisque nisl consectetur mollis ornare vel leo.</p>
						    		<p class="item-buttons">
						    			<a href="#" class="btn btn-info tip" title="Edit"><i class="icon-pencil"></i></a>
						    			<a href="#" class="btn btn-danger tip" title="Move to trash"><i class="icon-trash"></i></a>
						    		</p>
						    	</div>
						    </div>
						</div>
					</div>

					<div class="span3">
						<div class="widget">
						    <div class="well">
						    	<div class="view">
									<a href="img/demo/big.jpg" class="view-back lightbox"></a>
							    	<img src="http://placehold.it/580x380" alt="" />
							    </div>
						    	<div class="item-info">
						    		<a href="#" title="" class="item-title">Aenean Malesuada Consectetur Risus</a>
						    		<p>Donec id elit non mi porta gravida at eget metus. Praesent commodo cursus magna, vel scelerisque nisl consectetur mollis ornare vel leo.</p>
						    		<p class="item-buttons">
						    			<a href="#" class="btn btn-info tip" title="Edit"><i class="icon-pencil"></i></a>
						    			<a href="#" class="btn btn-danger tip" title="Move to trash"><i class="icon-trash"></i></a>
						    		</p>
						    	</div>
						    </div>
						</div>

						<div class="widget">
						    <div class="well">
						    	<div class="view">
									<a href="img/demo/big.jpg" class="view-back lightbox"></a>
							    	<img src="http://placehold.it/580x380" alt="" />
							    </div>
						    	<div class="item-info">
						    		<a href="#" title="" class="item-title">Aenean Malesuada Consectetur Risus</a>
						    		<p>Donec id elit non mi porta gravida at eget metus. Praesent commodo cursus magna, vel scelerisque nisl consectetur mollis ornare vel leo.</p>
						    		<p class="item-buttons">
						    			<a href="#" class="btn btn-info tip" title="Edit"><i class="icon-pencil"></i></a>
						    			<a href="#" class="btn btn-danger tip" title="Move to trash"><i class="icon-trash"></i></a>
						    		</p>
						    	</div>
						    </div>
						</div>
					</div>
				</div>
                <!-- /with titles -->

        
    </div>
    <!-- /content wrapper -->

</div>
<!-- /content -->

</div>
<!-- /content container -->
<%@include file="PiePagina.jsp" %>
</body>
</html>
