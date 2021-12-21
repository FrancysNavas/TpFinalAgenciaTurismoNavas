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
                        <i class="pe-7s-plane icon-gradient bg-mean-fruit"> </i>
                        <div class="" src="" <img src="" alt="alt"/>AGENCIA DE TURISMO NAVAS</div>
                    
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
                            <i class="nav-link-icon fa fa-cog"></i>
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
                                    Inicia Sesion
                                </div>
                                <div class="widget-subheading">
                                    Administrador de Ventas
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
                            <a href="index.jsp" class="mm-active">
                                <i class="metismenu-icon pe-7s-home"></i>
                                Sistema Administrativo
                            </a>
                        </li>


                </div>

            </div>

        </div>    <div class="app-main__outer">
            <div class="app-main__inner">
                <div class="app-page-title">
                    <div class="page-title-wrapper">
                        <div class="page-title-heading">
                            <div class="page-title-icon">
                                <i class="pe-7s-plane icon-gradient bg-mean-fruit">
                                </i>
                            </div>
                            <div> <h1>Agencia de Turismo NAVAS</h1>
                                <div class="page-title-subheading">Sistema de Ingreso, Control y Venta de Servicios Turísticos.
                                </div>
                            </div>
                        </div>
                    </div>
                </div>           
            </div>
            <div class="container">
                <div>

                    <h3>Panel de Ingreso al Sistema</h3>
                    <br>
                </div>

                <div class="row">
                    <div class="col-md-12 col-lg-6">
                        <div class="mb-3 card">
                            <div class="card-header-tab card-header-tab-animation card-header">
                                <div class="card-header-title">
                                    <i class="header-icon lnr-apartment icon-gradient bg-love-kiss"> </i>
                                    Empleado Registrado
                                </div>
                            </div>
                            <div class="card-body">
                                <div class="tab-content">
                                    <div class="tab-pane fade show active" id="tabs-eg-77">
                                        <div class="card mb-6 widget-chart widget-chart2 text-left w-100">
                                            <div class="widget-chat-wrapper-outer">
                                                <div class="widget-chart-wrapper widget-chart-wrapper-lg opacity-10 m-0">
                                                    <form action="SvUsuario" method="POST">
                                                        <div class="mb-3">
                                                            <label for="" class="form-label">Usuario</label>
                                                            <input type="text" class="form-control" name="usuario" id="usuario">

                                                        </div>
                                                        <div class="mb-3">
                                                            <label for="" class="form-label">Contraseña</label>
                                                            <input type="password" class="form-control" name="pass" id="pass">
                                                        </div>
                                                        <div class="mb-3 form-check">

                                                        </div>
                                                        <button type="submit" class="btn btn-primary">Inicia Sesión</button>
                                                    </form>
                                                </div>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
            <div class="row">



                <div class="row">
                    <div class="col-md-12">

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
            </div>    </div>
        <script src="http://maps.google.com/maps/api/js?sensor=true"></script>
    </div>
</div>
<script type="text/javascript" src="./assets/scripts/main.js"></script></body>
</html>

