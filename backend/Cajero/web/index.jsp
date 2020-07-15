<%-- 
    Document   : index
    Created on : 15/07/2020, 08:51:36 AM
    Author     : Cristian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Cajero CajaGrupal</title>
        <link rel="icon"  type="image/png" href="https://cdn.pixabay.com/photo/2018/06/20/18/05/bank-3487033_960_720.png">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="css/homepage_style.css">
    </head>
    <body>
       
        <div class="container">
            <div class="form">
                <div class="form-header">
                    <h1 class="form-title"><span>Cajero CajaGrupal</span></h1>
                    <h3 class="form-title"><span>Felicidad Por Siempre</span></h3>
                </div>
                <!-- Button trigger modal -->
                <button type="button" class="button-submit" data-toggle="modal" data-target="#inicio-sesion">
                    Iniciar Sesion
                </button>              

                <label class="form-label"> </label>
                
                <button type="button" class="button-submit" data-toggle="modal" data-target="#registrar-sesion">
                    Registrar
                </button>  
            </div>
        </div>

        <!--Modal de iniciar sesion-->
        <div class="modal fade" id="inicio-sesion" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered">
            <div class="modal-content">
                <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Iniciar Sesion</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                </div>
                <div class="modal-body">
                    <form action="Redirect" method="POST">
                        <div class="form-group">
                          <label for="nombre-usuario">Cuenta</label>
                          <input type="number" class="form-control" id="nombre-usuario" name="nombre-usuario" aria-describedby="emailHelp" required>
                          <small id="emailHelp" class="form-text text-muted">Escribe correctamente tu usuario de CajaGrupal.</small>
                        </div>
                        <div class="form-group">
                          <label for="exampleInputPassword1">Contraseña</label>
                          <input type="password" class="form-control" id="password-user" name="password-user" required>
                          <small id="emailHelp" class="form-text text-muted">Escribe correctamente tu contraseña de CajaGrupal.</small>
                        </div>                      
                </div>
                <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <input type="submit" class="btn btn-primary" value="Enviar">
                </div>
            </form>
            </div>
            </div>
        </div>

         <!--Modal de Registrar-->
         <div class="modal fade" id="registrar-sesion" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered">
            <div class="modal-content">
                <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Registrar</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                </div>
                <div class="modal-body">
                    <form action="registerpage" method="POST">
                        <div class="form-group">
                          <label for="nombre-usuario">Nombre de Usuario</label>
                          <input type="text" class="form-control" id="nombre-usuario" name="nombre-usuario" aria-describedby="emailHelp" required>
                          <small id="emailHelp" class="form-text text-muted">Escribe correctamente tu usuario de CajaGrupal.</small>
                        </div>
                        <div class="form-group">
                          <label for="nombre-usuario">Nueva Cuenta</label>
                          <input type="number" class="form-control" id="cuenta-usuario" name="cuenta-usuario" aria-describedby="emailHelp" required>
                          <small id="emailHelp" class="form-text text-muted">Crea tu nueva cuenta en caja grupal.</small>
                        </div>
                        <div class="form-group">
                          <label for="exampleInputPassword1">Nueva Contraseña</label>
                          <input type="password" class="form-control" id="password-user" name="password-user" required>
                          <small id="emailHelp" class="form-text text-muted">Escribe correctamente tu contraseña de CajaGrupal.</small>
                        </div>  
                        <div class="form-group">
                            <label for="exampleInputPassword1">Monto Inicial</label>
                            <input type="number" class="form-control" id="amount" name="amount" required>
                            <small id="emailHelp" class="form-text text-muted">Escribe la cantidad de dinero a ingresar.</small>
                        </div>                    
                </div>
                <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <input type="submit" class="btn btn-primary" value="Enviar">
                </div>
            </form>
            </div>
            </div>
        </div>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </body>
</html>
