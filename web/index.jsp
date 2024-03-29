<%-- 
    Document   : index
    Created on : 24-abr-2023, 22:56:57
    Author     : Seminario
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

    <!-- MENÚ -->

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

    <!-- IMAGEN INICIO ( SLIDER ) -->

    <div class="container-slider">
        <div class="slider" id="slider">
            <div class="slider_img">

                <img class="slider__img" src="./img/doc.jpg" alt="Imagen 1">

            </div>
            <div class="slider_img">

                <img class="slider__img" src="./img/slide1.jpg" alt="Imagen 2">
            </div>
            <div class="slider_img">

                <img class="slider__img" src="./img/front.jpg" alt="Imagen 3">
            </div>
        </div>
        <div class="slider__btn slider__btn--right" id="btn-right"><i class="fa-solid fa-circle-chevron-right"></i>
        </div>
        <div class="slider__btn slider__btn--left" id="btn-left"><i class="fa-solid fa-circle-chevron-left"></i></div>
    </div>

    <!-- JAVA SCRIPT-->
    <script src="./js/slider.js"></script>

    <!-- IMAGEN INICIO - FIN ( SLIDER ) -->

    <!-- CONÓCENOS -->
    <section>
        <div id="Conocenos" class="container-fluid py-5">
            <div class="container">
                <div class="row gx-5">
                    <div class="col-lg-5 mb-5 mb-lg-0" style="min-height: 500px;">
                        <div class="position-relative h-100">
                            <img class="position-absolute w-100 h-100 rounded" src="img/nath.jpg"
                                style="object-fit: cover;">
                        </div>
                    </div>
                    <div class="col-lg-7">
                        <div class="mb-4">
                            <h4 id="conocenos" class="d-inline-block text-uppercase border-bottom border-3">Conócenos</h4>
                            <h1 id="titulo3">CENTRO VETERINARIO ALLQOVET</h1>
                        </div>
                        <p id="parrafo">Por la necesidad de mejorar la calidad de vida de las mascotas,emprendimos esta
                            empresa cumpliendo con todos los reglamentos requeridos.Se inició el 22 de diciembre del 2015
                            con dos trabajadoras,teniendo como primera clienta a Tequila, quien hasta ahora nos visita.Poco
                            a poco hemos ido creciendo tanto a nivel personal como a nivel profesional.Al igual que nuestro
                            equipo de trabajo, servicios y en nuestra zona PetShop</p>
                    </div>
                </div>
            </div>
        </div>
        </div>
    </section>
    <!-- CONÓCENOS FINAL -->

    <!-- MISIÓN -->
    <section>
        <div class="container-fluid py-5">
            <div class="container">
                <div class="row gx-5">
                    <div class="col-lg-5 mb-5 mb-lg-0" style="min-height: 500px;">
                        <div class="position-relative h-100">
                            <img class="position-absolute w-100 h-100 rounded" src="img/thor2.jpg"
                                style="object-fit: cover;">
                        </div>
                    </div>
                    <div class="col-lg-7">
                        <div class="mb-4">
                            <h4 id="conocenos" class="d-inline-block text-uppercase border-bottom border-3">Conócenos</h4>
                            <h1 id="titulo3">MISIÓN</h1>
                        </div>
                        <p id="parrafo">"Nuestro principal compromiso es el bienestar de los que actualmente son
                            considerados miembros importantes de la familia. Nuestro equipo de trabajo busca concientizar a
                            los propietarios para que mantengan la responsabilidad y cuidado de sus engreídos."</p>
                    </div>
                </div>
            </div>
        </div>
        </div>
    </section>
    <!-- MISIÓN FINAL -->


    <!-- VISIÓN -->
    <section>
        <div class="container-fluid py-5">
            <div class="container">
                <div class="row gx-5">
                    <div class="col-lg-5 mb-5 mb-lg-0" style="min-height: 400px;">
                        <div class="position-relative h-100">
                            <img class="position-absolute w-100 h-100 rounded" src="img/doc.jpg" style="object-fit: cover;">
                        </div>
                    </div>
                    <div class="col-lg-7">
                        <div class="mb-4">
                            <h4 id="conocenos" class="d-inline-block text-uppercase border-bottom border-3">Conócenos</h4>
                            <h1 id="titulo3">VISIÓN</h1>
                        </div>
                        <p id="parrafo">"Ser reconocidos como el mejor Centro Veterinario, buscando la excelencia en todos
                            los servicios que brindamos. Así mismo, seguir creando las condiciones adecuadas de bienestar y
                            salud para colaborar con la calidad de vida de nuestros pacientes."</p>
                    </div>
                </div>
            </div>
        </div>
        </div>
    </section>
    <!-- VISIÓN FINAL -->

    <section>
        <div class="container-fluid py-5">
            <div class="container">
                <blockquote class="tiktok-embed"
                    cite="https://www.tiktok.com/@veterinaria_allqovet/video/7141486248581025029"
                    data-video-id="7141486248581025029" style="max-width: 650px;min-width: 325px;">
                    <section> <a target="_blank" title="@veterinaria_allqovet"
                            href="https://www.tiktok.com/@veterinaria_allqovet?refer=embed">@veterinaria_allqovet</a> Hoy
                        nos visitaron Max, Perla y Akira para su bañito 🐾💜...#vet<a title="veterinariaperu"
                            target="_blank" href="https://www.tiktok.com/tag/veterinariaperu?refer=embed">erinariaperu
                            #ce</a>n<a title="centroveterinarioallqovet" target="_blank"
                            href="https://www.tiktok.com/tag/centroveterinarioallqovet?refer=embed">troveterinarioallqovet
                            #ve</a>t<a title="veterinariaallqovet" target="_blank"
                            href="https://www.tiktok.com/tag/veterinariaallqovet?refer=embed">erinariaallqovet #ve</a>t<a
                            title="veterinariapiuraperu" target="_blank"
                            href="https://www.tiktok.com/tag/veterinariapiuraperu?refer=embed">erinariapiuraperu</a> <a
                            target="_blank" title="♬ Happy - Pharrell Williams"
                            href="https://www.tiktok.com/music/Happy-6448513875884608270?refer=embed">♬ Happy - Pharrell
                            Williams</a> </section>
                </blockquote>
                <script async src="https://www.tiktok.com/embed.js"></script>
            </div>
        </div>
    </section>
    <!-- VISIÓN FINAL -->



    <!--Separa una cita-->

    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="titulo-cita">
                    <h2>Separa una cita</h2>
                </div>
            </div>
        </div>
    </div>


    <!--formulario contacto -->
    <section>
        <div class="contacto">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">

                        <form class="formulario">
                            <div class="row">
                                <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6">
                                    <input class="form-control" placeholder="Nombre" type="text" name="Your Name">
                                </div>
                                <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6">
                                    <input class="form-control" placeholder="Correo" type="text" name="Email">
                                </div>
                                <div class=" col-md-12">
                                    <input class="form-control" placeholder="Telefono" type="text" name="Phone">
                                </div>
                                <div class="col-md-12">
                                    <textarea class="textarea" placeholder="Mensaje"></textarea>
                                </div>
                                <div class=" col-md-12">
                                    <button class="boton">Enviar</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!--fin separa una cita-->



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
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8"
        crossorigin="anonymous"></script>
    <script type="text/javascript" src="js/slider.js"></script>

</body>

</html>