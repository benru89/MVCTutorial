MVCTutorial
===========

CAPITULO 1:

Una p�gina de inicio, 'index.jsp', la p�gina de bienvenida de nuestra aplicaci�n. Fue usada para comprobar que nuestra configuraci�n era correcta. M�s tarde la cambiaremos para proveer un enlance a nuestra aplicaci�n.

Un controlador frontal, DispatcherServlet, con el correspondiente archivo de configuraci�n 'app-config.xml'.

Un controlador de p�gina, HelloController, con funcionalidad limitada � simplemente devuelve un objeto ModelAndView. Actualmente tenemos un modelo vac�o, m�s tarde proveeremos un modelo completo.

Una unidad de test para la p�gina del controlador, HelloControllerTests, para verificar que el nombre de la vista es el que esperamos.

Una vista, 'hello.jsp'.

CAPITULO 2:

Echemos un vistazo r�pido a lo que hemos creado en la Parte 2.

Un archivo de cabecera 'include.jsp', el archivo JSP que contiene la directiva taglib que usaremos en todos nuestros archivos JSPs.

Estos son los componentes de la aplicaci�n que hemos cambiado en la Parte 2.

HelloControllerTests ha sido actualizado repetidamente para hacer al controlador referirse al nombre l�gico de la vista en lugar de a su localizaci�n y nombre completo.

El controlador de p�gina, HelloController, ahora hace referencia a la vista por su nombre l�gico mediante el uso del 'InternalResourceViewResolver' definido en 'app-config.xml'.

A continuaci�n puedes ver una captura de pantalla que muestra el aspecto que deber�a tener la estructura de directorios del proyecto despu�s de seguir todas las instrucciones anteriores.

