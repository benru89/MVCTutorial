MVCTutorial
===========

CAPITULO 1:

Una página de inicio, 'index.jsp', la página de bienvenida de nuestra aplicación. Fue usada para comprobar que nuestra configuración era correcta. Más tarde la cambiaremos para proveer un enlance a nuestra aplicación.

Un controlador frontal, DispatcherServlet, con el correspondiente archivo de configuración 'app-config.xml'.

Un controlador de página, HelloController, con funcionalidad limitada – simplemente devuelve un objeto ModelAndView. Actualmente tenemos un modelo vacío, más tarde proveeremos un modelo completo.

Una unidad de test para la página del controlador, HelloControllerTests, para verificar que el nombre de la vista es el que esperamos.

Una vista, 'hello.jsp'.

CAPITULO 2:

Echemos un vistazo rápido a lo que hemos creado en la Parte 2.

Un archivo de cabecera 'include.jsp', el archivo JSP que contiene la directiva taglib que usaremos en todos nuestros archivos JSPs.

Estos son los componentes de la aplicación que hemos cambiado en la Parte 2.

HelloControllerTests ha sido actualizado repetidamente para hacer al controlador referirse al nombre lógico de la vista en lugar de a su localización y nombre completo.

El controlador de página, HelloController, ahora hace referencia a la vista por su nombre lógico mediante el uso del 'InternalResourceViewResolver' definido en 'app-config.xml'.

A continuación puedes ver una captura de pantalla que muestra el aspecto que debería tener la estructura de directorios del proyecto después de seguir todas las instrucciones anteriores.

