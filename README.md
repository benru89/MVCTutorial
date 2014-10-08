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

CAPITULO 3:

Hemos implementado el objeto de dominio Product, la interface de servicio ProductManager y la clase concreta SimpleProductManager, todos como POJOs.

Hemos escrito tests unitarios para todas las clases que hemos implementado.

No hemos escrito ni una sola linea de código de Spring. Éste es un ejemplo de lo no-intrusivo que es realmente Spring Framework. Uno de sus propósitos principales es permitir a los programadores centrarse en la parte más importante de todas: modelar e implementar requerimientos de negocio. Otro de sus propósitos es hacer seguir las mejores prácticas de programación de una manera sencilla, como por ejemplo implementar servicios usando interfaces y usar tests unitarios más allá de las obligaciones prágmaticas de un proyecto dado.



