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
<body data-spy="scroll" data-target=".navbar-fixed-top">
     <!--NAVBAR SECTION-->
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
     <section id="home" class="text-center">
           <div class="container">
           <div class="row text-center pad-top">
            <div class="col-md-12 pad-top-more">
                <h1 class="white">Hola!</h1>
                <h2 class="white typed">Ingresa tu ID para obtener un carton</h2>
                <form name="idCliente Input Form" action="carton2.jsp">
                    <div class="col-md-6 col-lg-offset-3 text-center-mobile">
                        <input type="text" class="form-control form-white" name="idCliente" />
                        <input type="submit" class="btn btn-block btn-blue"  value="Enviar" />
                    </div> 
                </form>
                
            </div>
               
            </div>
           
        </div>
       </section>
    
    
    <!-- Holder for mobile navigation -->
    <div class="mobile-nav">
        <ul>
        </ul>
        <a href="#" class="close-link"><i class="arrow_up"></i></a>
    </div>
    <!-- Scripts -->
    <script src="js/jquery-1.11.1.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/wow.min.js"></script>
    <script src="js/typewriter.js"></script>
    <script src="js/jquery.onepagenav.js"></script>
    <script src="js/main.js"></script>
    
</body>
</html>
