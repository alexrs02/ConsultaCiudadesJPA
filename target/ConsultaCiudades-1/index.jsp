<%-- 
    Document   : index
    Created on : 06-mar-2023, 20:52:20
    Author     : alexr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
        <div  class="container d-flex justify-content-center mt-4">
            <form method="get" action="ServletController">
                <div class="mb-3">
                    <label for="name" class="form-label">Codigo Postal</label>
                    <input type="text" name="name" class="form-control" id="name" aria-describedby="emailHelp">
                    <div id="name" class="form-text">Escribe un codigo postal para buscar las ciudades relacionadas.</div>
                </div>
                <button type="submit" class="btn btn-primary">Buscar</button>
            </form> 
        </div>

    </body>
</html>
