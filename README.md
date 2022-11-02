# Analizador_Lexico_C
Proyecto de Lenguajes y Automatas I, el cual contempla el desarrollo del analizador lexico del lenguaje c

Para el funcionamiento correcto del proyecto en tu equipo es necesario contar con java instalado al igual
que con javacc, para esto desde la pagina oficial de javacc:

https://javacc.github.io/javacc/

Seguido de esto descargue el archivo .zip comprimido, luego el contenido se puede extraer en cualquier
ruta del almacenamiento del equipo, se recomienda que se guarde en el disco C.

Para Windows se debe de agregar una variable de entorno al path para tener instalado correctamente javacc,
para esto en el menu de windows se busca "variables de entorno" tal y como en la ilustracion siguiente:

![image](https://user-images.githubusercontent.com/83856930/199394344-25a8b968-0854-412d-b4f8-35495517cd73.png)

Despues dar click en el boton de "Variables de entorno", se desplegara una ventana como la de la siguiente imagen

![image](https://user-images.githubusercontent.com/83856930/199394812-6fe821a2-106f-48f1-bc57-7ccaceaad31e.png)

Seguido de esto se debe de colocar en el apartado de "Variables del sistema" y seleccionar la opcion de "Path",
esta a su vez se pondra de color azul y tras seleccionarla se da click en el boton que esta debajo para editar,
lo que abrira nuevamente otra ventana para editar las variables de entorno, observe en la siguiente imagen.

![image](https://user-images.githubusercontent.com/83856930/199395293-ad6944ed-a6dd-4dec-bebc-e7e9e6845c56.png)

Para finalzar consta de seleccionar la opcion de "Nuevo" e ingresar la ruta donde esta alojada la carpeta que
se extrajo de javacc, simplemente se copia la ruta desde el explorador de archivos y se pega en la ventana para
añadir javacc al path de windows, dar click en aceptar y listo.

![image](https://user-images.githubusercontent.com/83856930/199397276-56d58895-f508-4cdc-a4c0-233f07220db2.png)

Despues de esto queda abrir un terminal ya sea el CMD o PowerShell y ejecutar el siguiente comando para verificar
que esta correctamente instalado el compilador de javacc:

javacc -version

![image](https://user-images.githubusercontent.com/83856930/199397900-3595f00c-ca31-443a-9f00-308c67e0666b.png)

Siguiendo estos pasos ya es posible poder trabajar con archivos .jj para la generacion de parsers y declaracion de
tokens desde algun editor de codigo o IDE como lo puede ser NetBeans o Eclipse.
