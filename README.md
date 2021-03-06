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

CAPITULO 4:

Hemos renombrado nuestro controlador a InventoryController y le hemos dado una referencia a ProductManager por lo que ahora podemos recuperar una lista de productos para mostrar.

Entonces hemos definido algunos datos de prueba para rellenar objetos de negocio.

A continuaci�n hemos modificado la p�gina JSP para usar una ubicaci�n de mensajes y hemos a�adido un loop forEach para mostrar una lista din�mica de productos.

Despu�s hemos creado un formulario para disponer de la capacidad de incrementar los precios.

Finalmente hemos creado un controlador de formulario que valida los datos introducidos, hemos desplegado y probado las nuevas caracter�sticas

CAPITULO 5:

Ya hemos completado la capa de persistencia y en la pr�xima parte vamos a integrarla con nuestra aplicaci�n web. Pero primero, resumamos r�pidamente todo lo que hemos hecho en esta parte.

Primero hemos configurado nuestra base de datos y ejecutado las sentencias SQL para crear una tabla en la base de datos y cargar algunos datos de prueba.

Hemos creado una clase DAO que manejar� el trabajo de persistencia mediante JPA usando la clase Product.

Finalmente hemos creado tests de integraci�n para comprobar su funcionamiento.

CAPITULO 6:

Hemos completado las tres capas de la aplicaci�n -- la capa web, la capa de servicio y la capa de persistencia. En esta �ltima parte hemos reconfigurado la aplicaci�n.

Primero hemos modificado la capa de servicio para usar la interface ProductDAO.

Despu�s hemos tenido que arreglar algunos fallos en los tests de la capa de servicio y la capa web.

A continuaci�n, hemos introducido un nuevo applicationContext para separar la configuraci�n de la capa de servicio y de la capa de persistencia de la configuraci�n de la capa web.



