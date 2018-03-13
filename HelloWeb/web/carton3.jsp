<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <!--[if IE]>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <![endif]-->
    <title>Bingoooo!! </title>
    <!-- BOOTSTRAP CORE STYLE CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONT AWESOME STYLE CSS -->
    <link href="assets/font-awesome-4.1.0/css/font-awesome.min.css" rel="stylesheet" />
    <!-- CUSTOM STYLE CSS -->
    <link href="assets/css/style.css" rel="stylesheet" />    
    <!-- GOOGLE FONT -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />

</head>
    <body style="background-color: white;">
        <div class="navbar navbar-inverse navbar-fixed-top scrollclass" >
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">Bingo</a>
            </div>
            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="index.html">HOME</a></li>
                </ul>
            </div>
        </div>
    </div>
        <section style="background-color: lightblue;" id="services" class="section">
            <div class="container" >
                    <div class="row text-center pad-top">
                    <div class="col-sm-10 text-center-mobile">
                        <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.Bingo" />
                        
                        
                        <h1 class="bounceInDown animated" style="color: white;">Escoje el tipo de juego</h1>
                        <h2 class="bounceInLeft animated" style="color: white;">CId #<jsp:getProperty name="mybean" property="idCliente" /> </h2>
                        <h2 class="bounceInLeft animated" style="color: white;">Carton #<jsp:getProperty name="mybean" property="num_carton" /> </h2>
                        <h2 class="bounceInLeft animated" style="color: white;"><jsp:getProperty name="mybean" property="saveCarton" /></h2>
                    </div>
                            </div>



                    </div>
            </section>

<script>
$(document).ready(function(){
    $('[data-toggle="tooltip"]').tooltip();   
});
</script>
</body>
</html>