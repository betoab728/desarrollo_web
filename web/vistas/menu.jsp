<%-- 
    Document   : menu
    Created on : 23/05/2023, 12:44:06 AM
    Author     : ELIAS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Allqovet</title>
     <!-- bootstrap -->
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
     
     <!-- css -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/vistas/css/estilo-menu.css">

</head>
<body>

    <section>
        <div class="container-fluid p-3" style="background-color:#5f3061;"><h1 class="text-center text-light p-3">Veterinaria Allqovet</h1></div>

    <div class="container mt-5">
        <h1 class="text-center mb-5"> MANTENIMIENTO</h1>
        <hr>

        <div class="row mt-5">
            
            <div class="col">
                <a class="admin  text-decoration-none" href="UsuarioController?accion=listarproductos" method="GET">
                    <div class="card shadow p-3" style="width: 20rem;">
                        <img src="${pageContext.request.contextPath}/vistas/IMG/pastias.png" class="card-img-top" alt="imagen producto">
                        <div class="card-body">
                            <h5 class="card-title fs-3 fw-bold text-center admin">Gestion de Productos</h5>
                        </div>
                    </div>
                </a>
            </div>
            <div class="col">
                <a class="admin  text-decoration-none" href="">
                    <div class="card shadow p-3" style="width: 20rem;">
                        <img src="${pageContext.request.contextPath}/vistas/IMG/pastias.png" class="card-img-top" alt="...">
                        <div class="card-body">
                            <h5 class="card-title fs-3 fw-bold text-center admin" >Gestion de Usuarios</h5>
                        </div>
                    </div>      

                </a>
            </div>

            <div class="col">
               <a class="admin  text-decoration-none" href="">
                <div class="card shadow p-3" style="width: 20rem;">
                    <img src="${pageContext.request.contextPath}/vistas/IMG/gestion-de-equipos.png" class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title fs-3 fw-bold text-center admin">Gestion de Clientes.</h5>
                    </div>
                </div>
               </a>        
            </div>

            <div class="col mt-3">
                <a class="admin  text-decoration-none" href="">
                    <div class="card shadow p-3" style="width: 20rem;">
                        <img src="${pageContext.request.contextPath}/vistas/IMG/gestion-de-equipos.png" class="card-img-top" alt="imagen equipo">
                        <div class="card-body">
                            <h5 class="card-title fs-3 fw-bold text-center admin">Gestion de Pedidos</h5>
                        </div>
                    </div>      

                </a>
            </div>

        </div>
    </div>
    </section>
    

     <!--FOOTER INICIO -->
  <div class="container-fluid btn-lg-square text-light mt-5 py-5" style="background-color:#5f3061;">
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
                    <a id="color" style="text-decoration:none; color:white;"  class="mb-2" href="#"><i class="fa fa-angle-right me-2"></i>Inicio</a>
                    <a id="color" style="text-decoration:none; color:white;" class="mb-2" href="#"><i class="fa fa-angle-right me-2"></i>Conócenos</a>
                    <a id="color" style="text-decoration:none; color:white;" class="mb-2" href="#"><i class="fa fa-angle-right me-2"></i>Servicios</a>
                    <a id="color" style="text-decoration:none; color:white;" class="mb-2" href="#"><i class="fa fa-angle-right me-2"></i>Contáctanos</a>
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
<!-- FOOTER FINAL -->
</body>
</html>