<%-- 
    Document   : index
    Created on : 17 dic. 2021, 17:47:40
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta http-equiv="Content-Language" content="en">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <title>Agencia de Turismo NAVAS</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no, shrink-to-fit=no" />
        <meta name="description" content="This is an example dashboard created using build-in elements and components.">
        <meta name="msapplication-tap-highlight" content="no">
        <!--
        =========================================================
        * ArchitectUI HTML Theme Dashboard - v1.0.0
        =========================================================
        * Product Page: https://dashboardpack.com
        * Copyright 2019 DashboardPack (https://dashboardpack.com)
        * Licensed under MIT (https://github.com/DashboardPack/architectui-html-theme-free/blob/master/LICENSE)
        =========================================================
        * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
        -->
        <link href="main.css" rel="stylesheet"></head>
    <body>
        <div class="app-container app-theme-white body-tabs-shadow fixed-sidebar fixed-header">
            <div class="app-header header-shadow">
                <header>
                    <div class="app-header__logo">
                        <div class="" src="" <img src="" alt="alt"/>
                        <i class="pe-7s-plane icon-gradient bg-mean-fruit"> </i>
                        AGENCIA DE TURISMO NAVAS</div>
                    <div class="header__pane ml-auto">

                    </div>
            </div>
        </header>
        <div class="app-header__menu">
            <span>

            </span>
        </div>    <div class="app-header__content">
            <div class="app-header-left">

                <ul class="header-menu nav">
                    <li class="nav-item">
                        <a href="" class="nav-link">
                            <i class="nav-link-icon  pe-7s-folder"> </i>
                            Paquetes Turísticos
                        </a>
                    </li>
                    <li class="btn-group nav-item">
                        <a href="" class="nav-link">
                            <i class="nav-link-icon fa fa-edit"></i>
                            Servicios Turisticos
                        </a>
                    </li>
                    <li class="dropdown nav-item">
                        <a href="" class="nav-link">
                            <i class="nav-link-icon pe-7s-user"></i>
                            Usuarios
                        </a>
                    </li>
                </ul>        </div>
            <div class="app-header-right">
                <div class="header-btn-lg pr-0">
                    <div class="widget-content p-0">
                        <div class="widget-content-wrapper">
                            <div class="widget-content-left">
                                <div class="">
                                    <a aria-expanded="false" class="p-0 btn">
                                        <img width="42" class="rounded-circle" src="assets/images/avatars/iconousuario.png" alt="">
                                        <i class="fa fa-angle-down ml-2 opacity-8"></i>
                                    </a>

                                </div>
                            </div>
                            <div class="widget-content-left  ml-3 header-user-info">
                                <div class="widget-heading">
                                    Administrador
                                </div>
                                <div class="widget-subheading">
                                    Empleado Administrador
                                </div>
                            </div>

                        </div>
                    </div>
                </div>        </div>
        </div>
    </div>        
    <div class="app-main">
        <div class="app-sidebar sidebar-shadow">
            <div class="app-header__logo">
                <div class="logo-src"></div>
                <div class="header__pane ml-auto">

                </div>
            </div>

            <div class="app-header__menu">
                <span>
                    <button type="button" class="btn-icon btn-icon-only btn btn-primary btn-sm mobile-toggle-header-nav">
                        <span class="btn-icon-wrapper">
                            <i class="fa fa-ellipsis-v fa-w-6"></i>
                        </span>
                    </button>
                </span>
            </div>    
            <div class="scrollbar-sidebar">
                <div class="app-sidebar__inner">
                    <ul class="vertical-nav-menu">
                        <li class="app-sidebar__heading">Principal</li>
                        <li>
                            <a href="menu.jsp" class="mm-active">
                                <i class="metismenu-icon pe-7s-home"></i>
                                Pagina Principal
                            </a>
                        </li>

                        <li class="app-sidebar__heading">SERVICIOS</li>

                        <li class="mm-active">
                            <a href="#">
                                <i class="metismenu-icon pe-7s-user"></i>
                                Clientes
                                <i class="metismenu-state-icon pe-7s-angle-down caret-left"></i>
                            </a>
                            <ul  class="mm-show">
                                <li>
                                    <a href="altaCliente.jsp">
                                        <i class="metismenu-icon"></i>
                                        Nuevo Cliente
                                    </a>
                                </li>
                                <li>
                                    <a href="SvClienteLista">
                                        <i class="metismenu-icon">
                                        </i>Lista Clientes
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li class="mm-active">
                            <a href="#">
                                <i class="metismenu-icon pe-7s-id"></i>
                                Empleados
                                <i class="metismenu-state-icon pe-7s-angle-down caret-left"></i>
                            </a>
                            <ul  class="mm-show">
                                <li>
                                    <a href="altaEmpleado.jsp">
                                        <i class="metismenu-icon"></i>
                                        Nuevo Empleado
                                    </a>
                                </li>
                                <li>
                                    <a href="construccion.jsp">
                                        <i class="metismenu-icon">
                                        </i>Lista Empleados
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li class="mm-active">
                            <a href="#">
                                <i class="metismenu-icon pe-7s-plane"></i>
                                Ventas
                                <i class="metismenu-state-icon pe-7s-angle-down caret-left"></i>
                            </a>
                            <ul  class="mm-show">
                                <li>
                                    <a href="construccion.jsp">
                                        <i class="metismenu-icon"></i>
                                        Nueva Venta
                                    </a>
                                </li>
                                <li>
                                    <a href="construccion.jsp">
                                        <i class="metismenu-icon">
                                        </i>Lista Ventas
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li class="mm-active">
                            <a href="#">
                                <i class="metismenu-icon pe-7s-gift"></i>
                                Paquetes Turisticos
                                <i class="metismenu-state-icon pe-7s-angle-down caret-left"></i>
                            </a>
                            <ul  class="mm-show">
                                <li>
                                    <a href="construccion.jsp">
                                        <i class="metismenu-icon"></i>
                                        Ver Paquetes
                                    </a>
                                </li>
                                <li>
                                    <a href="construccion.jsp">
                                        <i class="metismenu-icon">
                                        </i>ServiciosTuristicos
                                    </a>
                                </li>
                            </ul>
                        </li>
                </div>
                <form id="form-logout" action="index.jsp" method="POST">
                    <button type="submit" class="mb-2 mr-2 btn btn-danger btn-lg btn-block pe-7s-power">Cerrar Sesión
                </button> 
                </form>
            </div>

        </div>    
        <div class="app-main__outer">
            <div class="app-main__inner ">
                <div class="app-page-title">

                    <div class="page-title-heading">
                        <div class="page-title-icon">
                            <i class="pe-7s-attention icon-gradient bg-mean-fruit">
                            </i>
                        </div>
                        <div>
                            <h3>ADMINISTRACIÓN</h3>
                            <div class="page-title-subheading">Sistema de Ingreso, Control y Venta de Servicios Turísticos.
                            </div>
                        </div>

                    </div>
                    <div>
                        <br>
                        <h2>AREA EN CONSTRUCCIÓN</h2>
                        <br>
                    </div>
                    <div class="row">
                        <div class="col-md-12 col-lg-12">
                            <div class="mb-3 card">
                                <div class="card-header-tab card-header-tab-animation card-header">

                                    <div class="card-header-title">
                                        <i class="header-icon pe-7s-attention icon-gradient bg-love-kiss"> </i>
                                        ¡ Lo sentimos...!
                                        
                                    </div>
                                 </div>

                            </div>
                            <div class="col-md-12 col-lg-12">
                            <div class="mb-3 card">
                                <div class="card-header-tab card-header-tab-animation card-header">

                                    <div class="card-header-title">
                                        <i class="header-icon pe-7s-attention icon-gradient bg-love-kiss"> </i>
                                        ¡estamos desarrollando el área...!
                                        
                                    </div>
                                 </div>

                            </div>
                            
                        </div>
                        
                        </div>
                    </div>   
                </div>        
            </div>



            <div class="app-wrapper-footer">
                <div class="app-footer">
                    <div class="app-footer__inner">
                        <div class="app-footer-left">
                            <ul class="nav">
                                <li class="nav-item">
                                    <p>
                                        Copyright@2021      Realizado por:<b>  Francys Navas</b>  para PoloTic Misiones Java FullStack 2021
                                    </p>
                                </li>

                            </ul>
                        </div>

                    </div>
                </div>
            </div>    
            <script src="http://maps.google.com/maps/api/js?sensor=true"></script>
        </div>
    </div>
    <script type="text/javascript" src="./assets/scripts/main.js"></script>
</body>
</html>

