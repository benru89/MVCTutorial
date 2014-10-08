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

CAPITULO 3:

Hemos implementado el objeto de dominio Product, la interface de servicio ProductManager y la clase concreta SimpleProductManager, todos como POJOs.

Hemos escrito tests unitarios para todas las clases que hemos implementado.

No hemos escrito ni una sola linea de c�digo de Spring. �ste es un ejemplo de lo no-intrusivo que es realmente Spring Framework. Uno de sus prop�sitos principales es permitir a los programadores centrarse en la parte m�s importante de todas: modelar e implementar requerimientos de negocio. Otro de sus prop�sitos es hacer seguir las mejores pr�cticas de programaci�n de una manera sencilla, como por ejemplo implementar servicios usando interfaces y usar tests unitarios m�s all� de las obligaciones pr�gmaticas de un proyecto dado.



