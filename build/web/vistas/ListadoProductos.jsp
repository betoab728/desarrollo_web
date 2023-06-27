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
        <div class="container mt-2">
            <div class="row">
                
                <c:forEach var="p" items="${productos}">
                     <div class="col-sm-4">
                        <div class="card">
                            <div class="card-header">
                                <label>${p.getDescripcion()}</label>
                            </div>
                            <div class="card-body">
                                <i>$33</i>
                                <img src="" width="100" />
                            </div>
                            <div class="card-footer text-center">
                                <label>Descripcion</label>
                                <div>
                                    <a href="#" class="btn btn-outline-info">Agregar al carrito</a>
                                </div>

                            </div>
                        </div>
                    </div>
                </c:forEach>
                
             
            </div>
        </div>
    </body>
</html>
