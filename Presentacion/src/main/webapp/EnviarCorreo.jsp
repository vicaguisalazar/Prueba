<%-- 
    Document   : EnviarCorreo
    Created on : 30-jul-2014, 20:52:23
    Author     : Victor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
        <script type="text/javascript" src="ckeditor/ckeditor.js"></script>
        <script type="text/javascript" src="js/plugins/tables/jquery.dataTables.min.js"></script>
        <script type="text/javascript" src="js/files/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/files/functions.js"></script>
        <script type="text/javascript">
            $(function()
            {
                CKEDITOR.replace('editor');
            });
        </script>
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

        <!-- WYSIWYG editor -->
        <div class="widget">
            <div class="navbar">
                <div class="navbar-inner">
                    <h6>WYSIWYG editor</h6>
                    <ul class="dropdown-menu pull-right">
                        <li><a href="#"><i class="icon-plus"></i>Add new option</a></li>
                        <li><a href="#"><i class="icon-reorder"></i>View statement</a></li>
                        <li><a href="#"><i class="icon-cogs"></i>Parameters</a></li>
                    </ul>
                </div>
            </div>

            <textarea name="editor">
&lt;h1&gt;&lt;img alt=&quot;Saturn V carrying Apollo 11&quot; class=&quot;right&quot; src=&quot;img/demo/sample.jpg&quot;/&gt; Apollo 11&lt;/h1&gt; &lt;p&gt;&lt;b&gt;Apollo 11&lt;/b&gt; was the spaceflight that landed the first humans, Americans &lt;a href=&quot;http://en.wikipedia.org/wiki/Neil_Armstrong&quot; title=&quot;Neil Armstrong&quot;&gt;Neil Armstrong&lt;/a&gt; and &lt;a href=&quot;http://en.wikipedia.org/wiki/Buzz_Aldrin&quot; title=&quot;Buzz Aldrin&quot;&gt;Buzz Aldrin&lt;/a&gt;, on the Moon on July 20, 1969, at 20:18 UTC. Armstrong became the first to step onto the lunar surface 6 hours later on July 21 at 02:56 UTC.&lt;/p&gt; &lt;p&gt;Armstrong spent about &lt;strike&gt;three and a half&lt;/strike&gt; two and a half hours outside the spacecraft, Aldrin slightly less; and together they collected 47.5 pounds (21.5&amp;nbsp;kg) of lunar material for return to Earth. A third member of the mission, &lt;a href=&quot;http://en.wikipedia.org/wiki/Michael_Collins_(astronaut)&quot; title=&quot;Michael Collins (astronaut)&quot;&gt;Michael Collins&lt;/a&gt;, piloted the &lt;a href=&quot;http://en.wikipedia.org/wiki/Apollo_Command/Service_Module&quot; title=&quot;Apollo Command/Service Module&quot;&gt;command&lt;/a&gt; spacecraft alone in lunar orbit until Armstrong and Aldrin returned to it for the trip back to Earth.&lt;/p&gt; &lt;h2&gt;Broadcasting and &lt;em&gt;quotes&lt;/em&gt; &lt;a id=&quot;quotes&quot; name=&quot;quotes&quot;&gt;&lt;/a&gt;&lt;/h2&gt; &lt;p&gt;Broadcast on live TV to a world-wide audience, Armstrong stepped onto the lunar surface and described the event as:&lt;/p&gt; &lt;blockquote&gt;&lt;p&gt;One small step for [a] man, one giant leap for mankind.&lt;/p&gt;&lt;/blockquote&gt; &lt;p&gt;Apollo 11 effectively ended the &lt;a href=&quot;http://en.wikipedia.org/wiki/Space_Race&quot; title=&quot;Space Race&quot;&gt;Space Race&lt;/a&gt; and fulfilled a national goal proposed in 1961 by the late U.S. President &lt;a href=&quot;http://en.wikipedia.org/wiki/John_F._Kennedy&quot; title=&quot;John F. Kennedy&quot;&gt;John F. Kennedy&lt;/a&gt; in a speech before the United States Congress:&lt;/p&gt; &lt;blockquote&gt;&lt;p&gt;[...] before this decade is out, of landing a man on the Moon and returning him safely to the Earth.&lt;/p&gt;&lt;/blockquote&gt; &lt;h2&gt;Technical details &lt;a id=&quot;tech-details&quot; name=&quot;tech-details&quot;&gt;&lt;/a&gt;&lt;/h2&gt; &lt;table align=&quot;right&quot; border=&quot;1&quot; bordercolor=&quot;#ccc&quot; cellpadding=&quot;5&quot; cellspacing=&quot;0&quot; style=&quot;border-collapse:collapse;margin:10px 0 10px 15px;&quot;&gt; &lt;caption&gt;&lt;strong&gt;Mission crew&lt;/strong&gt;&lt;/caption&gt; &lt;thead&gt; &lt;tr&gt; &lt;th scope=&quot;col&quot;&gt;Position&lt;/th&gt; &lt;th scope=&quot;col&quot;&gt;Astronaut&lt;/th&gt; &lt;/tr&gt; &lt;/thead&gt; &lt;tbody&gt; &lt;tr&gt; &lt;td&gt;Commander&lt;/td&gt; &lt;td&gt;Neil A. Armstrong&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;Command Module Pilot&lt;/td&gt; &lt;td&gt;Michael Collins&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;Lunar Module Pilot&lt;/td&gt; &lt;td&gt;Edwin &amp;quot;Buzz&amp;quot; E. Aldrin, Jr.&lt;/td&gt; &lt;/tr&gt; &lt;/tbody&gt; &lt;/table&gt; &lt;p&gt;Launched by a &lt;strong&gt;Saturn V&lt;/strong&gt; rocket from &lt;a href=&quot;http://en.wikipedia.org/wiki/Kennedy_Space_Center&quot; title=&quot;Kennedy Space Center&quot;&gt;Kennedy Space Center&lt;/a&gt; in Merritt Island, Florida on July 16, Apollo 11 was the fifth manned mission of &lt;a href=&quot;http://en.wikipedia.org/wiki/NASA&quot; title=&quot;NASA&quot;&gt;NASA&lt;/a&gt;&amp;#39;s Apollo program. The Apollo spacecraft had three parts:&lt;/p&gt; &lt;ol&gt; &lt;li&gt;&lt;strong&gt;Command Module&lt;/strong&gt; with a cabin for the three astronauts which was the only part which landed back on Earth&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Service Module&lt;/strong&gt; which supported the Command Module with propulsion, electrical power, oxygen and water&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Lunar Module&lt;/strong&gt; for landing on the Moon.&lt;/li&gt; &lt;/ol&gt; &lt;p&gt;After being sent to the Moon by the Saturn V&amp;#39;s upper stage, the astronauts separated the spacecraft from it and travelled for three days until they entered into lunar orbit. Armstrong and Aldrin then moved into the Lunar Module and landed in the &lt;a href=&quot;http://en.wikipedia.org/wiki/Mare_Tranquillitatis&quot; title=&quot;Mare Tranquillitatis&quot;&gt;Sea of Tranquility&lt;/a&gt;. They stayed a total of about 21 and a half hours on the lunar surface. After lifting off in the upper part of the Lunar Module and rejoining Collins in the Command Module, they returned to Earth and landed in the &lt;a href=&quot;http://en.wikipedia.org/wiki/Pacific_Ocean&quot; title=&quot;Pacific Ocean&quot;&gt;Pacific Ocean&lt;/a&gt; on July 24.&lt;/p&gt; &lt;hr/&gt; &lt;p style=&quot;text-align: right;&quot;&gt;&lt;small&gt;Source: &lt;a href=&quot;http://en.wikipedia.org/wiki/Apollo_11&quot;&gt;Wikipedia.org&lt;/a&gt;&lt;/small&gt;&lt;/p&gt;

            </textarea>
        </div>
        <!-- /WYSIWYG editor -->

    </div>
    <!-- /content wrapper -->

</div>
<!-- /content -->

</div>
<!-- /content container -->
<%@include file="PiePagina.jsp" %>
</body>
</html>

