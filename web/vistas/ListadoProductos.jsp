<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Petshop</title>
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

        
        <div class="container mt-2">
            <div class="row">
                
                <c:forEach var="p" items="${productos}">
                       <div class="col-sm-4">
                        <div class="card">
                            <div class="card-header">
                                <label>${p.getDescripcion()}</label>
                            </div>
                            <div class="card-body">
                               
                                <img src="" width="100" />
                                 <img src="${pageContext.request.contextPath}/vistas/IMG/${p.getImagen()} "style="width: 100px;" alt="imagen producto">
                            </div>
                            <div class="card-footer text-center">
                                <label>${p.getPrecio()}</label>
                                <div>
                                    <a href="#" class="btn btn-outline-info">Agregar al carrito</a>
                                </div>

                            </div>
                        </div>
                    </div>
                </c:forEach>
                
              
                
             
            </div>
        </div>
     <!--FOOTER INICIO -->
    
    <section>
        <div class="container-fluid bg-dark  btn-lg-square text-light mt-5 py-5">
            <div class="container py-5x">
                <div class="row g-5 ">
                    <div class="col-lg-4 col-md-6">
                        <h4 id="conocenos"
                            class="d-inline-block text-uppercase border-bottom border-5 border-secondary mb-4">VISÍTANOS
                        </h4>
                        <p id="color" class="mb-2"><i class="fa fa-map-marker-alt  me-3"></i>Av. Jorge Chávez Mz. L1 Lote 16
                            A. Ex canal Balarezo. Castilla - Piura. </p>
                        <p id="color" class="mb-2"><i class="fa fa-envelope  me-3"></i>allqovet@hotmail.com</p>
                        <p id="color" class="mb-0"><i class="fa fa-phone-alt me-3"></i>979444796 / 073 343638</p>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <h4 id="conocenos"
                            class="d-inline-block text-uppercase border-bottom border-5 border-secondary mb-4">ENLACES
                            RÁPIDOS</h4>
                        <div class="d-flex flex-column justify-content-start">
                            <a id="color" class="mb-2" href="#"><i class="fa fa-angle-right me-2"></i>Inicio</a>
                            <a id="color" class="mb-2" href="#"><i class="fa fa-angle-right me-2"></i>Conócenos</a>
                            <a id="color" class="mb-2" href="#"><i class="fa fa-angle-right me-2"></i>Servicios</a>
                            <a id="color" class="mb-2" href="#"><i class="fa fa-angle-right me-2"></i>Contáctanos</a>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <h4 id="conocenos"
                            class="d-inline-block text-uppercase border-bottom border-5 border-secondary mb-4">
                            CORRESPONDENCIA</h4>
                        <form action="">
                            <div class="input-group">
                                <input type="text" class="form-control p-3 border-0" placeholder="Ingresa tu correo">
                                <button id="color" class="btn">Enviar</button>
                            </div>
                        </form>
                        <h6 id="conocenos" class="text-uppercase mt-4 mb-3">Síguenos</h6>
                        <div class="d-flex">
                            <a id="color" class="btn btn-lg btn-lg-square rounded-circle me-2" href="#"><i
                                    class="fab fa-facebook-f"></i></a>
                            <a id="color" class="btn btn-lg btn-lg-square rounded-circle" href="#"><i
                                    class="fab fa-instagram"></i></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
     </section>
    <!-- FOOTER FINAL -->
   
    </body>
</html>
