function cargarMenu() {
    document.querySelector('#leftMenu').innerHTML =
            '<div class="left-sidebar-pro">' +
            '<nav id="sidebar" class="">' +
                '<div class="sidebar-header">' +
                    '<a href="#"><img class="main-logo" src="img/logo/logo.png" alt="" /></a>' +
                    '<strong><a href="#"><img src="img/logo/logosn.png" alt="" /></a></strong>' +
                '</div>' +
                '<div class="left-custom-menu-adp-wrap comment-scrollbar">' +
                    '<nav class="sidebar-nav left-sidebar-menu-pro">' +
                        '<ul class="metismenu" id="menu1">' +
                            '<li class="active">' +
                                '<a class="has-arrow" href="#" aria-expanded="false">' +
                                    '<span class="educate-icon educate-student icon-wrap"></span>' +
                                    '<span class="mini-click-non">Alumnos</span>' +
                                '</a>' +
                                '<ul class="submenu-angle" aria-expanded="false">' +
                                    '<li><a title="Listado con foto" href="consultarAlumnos.html"><span class="mini-sub-pro">Orla</span></a></li>' +
                                    '<li><a title="Listado de alumnos" href="listadoAlumnos.html"><span class="mini-sub-pro">Listados</span></a>' +
                                    '</li>' +
                                '</ul>' +
                            '</li>' +
                            /*
                            '<li>' +
                                '<a class="has-arrow" href="#" aria-expanded="false">' +
                                    '<span class="educate-icon educate-course icon-wrap"></span>' +
                                    '<span class="mini-click-non">Cursos</span></a>' +
                                '<ul class="submenu-angle" aria-expanded="false">' +
                                    '<li><a title="All Courses" href="#"><span class="mini-sub-pro">Mostrar cursos</span></a>' +
                                    '</li>' +
                                    '<li><a title="Add Courses" href="#"><span class="mini-sub-pro">Añadir curso</span></a>' +
                                    '</li>' +
                                    '<li><a title="Edit Courses" href="#"><span class="mini-sub-pro">Editar curso</span></a>' +
                                    '</li>' +
                                    '<li><a title="Courses Profile" href="#"><span class="mini-sub-pro">Perfil del curso</span></a></li>' +
                                '</ul>' +
                            '</li>' +
                            '<li>' +
                                '<a class="has-arrow" href="#" aria-expanded="false">' +
                                    '<span class="educate-icon educate-department icon-wrap"></span>' +
                                        '<span class="mini-click-non">Departmentos</span></a>' +
                                '<ul class="submenu-angle" aria-expanded="false">' +
                                    '<li><a title="Departments List" href="#">' +
                                        '<span class="mini-sub-pro">Mostrar Departamentos</span></a></li>' +
                                    '<li><a title="Add Departments" href="#">' +
                                        '<span class="mini-sub-pro">Añadir Departamento</span></a></li>' +
                                    '<li><a title="Edit Departments" href="#">' +
                                        '<span class="mini-sub-pro">Editar Departamento</span></a></li>' +
                                '</ul>' +
                            '</li>' +
                            '<li id="removable">' +
                                '<a class="has-arrow" href="#" aria-expanded="false">' +
                                    '<span class="educate-icon educate-pages icon-wrap"></span>' +
                                    '<span class="mini-click-non">Configuración</span></a>' +
                                '<ul class="submenu-angle page-mini-nb-dp" aria-expanded="false">' +
                                    '<li><a title="Login" href="login.html"><span class="mini-sub-pro">Login</span></a></li>' +
                                    '<li><a title="Register" href="#"><span class="mini-sub-pro">Registrarse</span></a></li>' +
                                    '<li><a title="Lock" href="#"><span class="mini-sub-pro">Lock</span></a></li>' +
                                    '<li><a title="Password Recovery" href="#"><span class="mini-sub-pro">Recuperar contraseña</span></a></li>' +
                                '</ul></li> 
                                */
                                '</ul></nav></div></nav></div>'
                                ;
}