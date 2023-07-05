<%-- 
    Document   : carrito
    Created on : 04/07/2023, 08:36:04 PM
    Author     : Marcos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
            <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title> PÁGINA WEB ALLQOVET </title>
    <link rel="stylesheet" href="css/estilos.css">
    <script src="https://kit.fontawesome.com/73f851add2.js" crossorigin="anonymous"></script>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
    <!-- ICÓNOS CSS -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">
    <!-- iconos -->
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>

    </head>
    <body>
        
      
    <!-- TOPBAR INICIO-->
    <div class="container-fluid py-2 border-bottom d-none d-lg-block">
        <div class="container">
            <div class="row">
                <div class="col-md-6 text-center text-lg-start mb-2 mb-lg-0">
                    <div class="d-inline-flex align-items-center">
                        <a class="text-decoration-none text-body pe-3" href=""><i
                                class="bi bi-telephone me-2"></i>979444796 / 073 343638</a>
                        <span class="text-body">|</span>
                        <a class="text-decoration-none text-body px-3" href=""><i
                                class="bi bi-envelope me-2"></i>allqovet@hotmail.com</a>
                    </div>
                </div>
                <div class="col-md-6 text-center text-lg-end">
                    <div class="d-inline-flex align-items-center">
                        <a class="text-body px-2" href="https://www.facebook.com/profile.php?id=100063494772897">
                            <i class="fab fa-facebook-f"></i>
                        </a>    
                        <a class="text-body px-2" href="">
                           <i class="fab fa-whatsapp"></i>
                        </a>   
                        <a class="text-body px-2" href="">
                          <i class="fa-brands fa-tiktok"></i>
                        </a> 
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- TOPBAR FINAL -->
    
     <!--NAV BAR O MENÚ-->

    <div class="row">
        <div class="col-md-11">
            <nav class="navbar navbar-expand-lg">
                <div class="container">
                    <a class="navbar-brand" href="#">
                        <img id="logo" src="img/Logoallqovet.png" alt="Logo" width="100"
                            class="d-inline-block align-text-top">
                    </a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                        aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNav">
                        <div class="navbar-nav mx-auto">
                            <a class="nav-link active" aria-current="page" href="index.html">Inicio</a>
                            <a class="nav-link" href="PAGINACONOCENOS.html">Conócenos</a>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                                    aria-expanded="false">
                                    Servicios
                                </a>
                                <ul class="dropdown-menu">
                                    <li><a class="dropdown-item" href="PAGINASERVICIOS.html">Clínicos</a></li>
                                    <li><a class="dropdown-item" href="estetica.html">Estética Canina</a></li>
                                    
                                    <li><a class="dropdown-item" href="ProductoController?accion=ListarProd" >Petshop</a></li>
                           
                                    <%-- <li><a class="dropdown-item" href="ProductoVista.php">Petshop</a></li> --%>
                                </ul>
                            </li>
                            <a class="nav-link" href="cita.php">Contáctanos</a>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-1">
                            <div class="counter-container">
                                <span id="counter">0</span>
                                <i class="fa-sharp fa-solid fa-cart-shopping" style="font-size: 22px;"></i>
                            </div>
                        </div>
                    </div>
                </div>
            </nav>
        </div>
    </div>
    <!--FIN NAV BAR O MENÚ-->
      
    <h1 class="text-center">Productos en su compra</h1>
        
    <div clas="">
        
    </div>
    
    </body>
</html>
