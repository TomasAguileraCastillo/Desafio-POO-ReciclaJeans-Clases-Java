Desafío - ReciclaJeans
--

 En este desafío validaremos nuestros conocimientos vistos en las sesiones anteriores.
Lee todo el documento antes de comenzar el desarrollo individual o grupal, para asegurarte
de tener el máximo de puntaje y enfocar bien los esfuerzos.

-Descripción

Una tienda consciente con el cuidado del medioambiente recolecta Jeans de distintas partes
de Chile para reciclarlos y darles un nuevo uso fabricando agendas para mujeres de escasos
recursos. Sin embargo, existen otras prendas que llegan casi nuevas y deciden venderlas para
solventar el negocio. Es por esto que le solicitan a usted ayuda para modernizar la tienda y
llevar un control de aquellas prendas que puedan venderse.

En base a lo anterior, debemos desarrollar una aplicación que contenga un menú de acceso
y que deberá contar con los siguientes requerimientos:

Requerimientos
--

1) Crear la clase <b><i>Producto</i></b> con los siguientes parámetros:
   (2 Puntos)
    
    - String articulo.
    - String precio.
    - String descripcion.
    - String codigo.
    - String talla.
    - String marca.
    - String color.
   
2) Generar los getters y setters correspondientes en la clase Producto y el toString.
   (2 Puntos)


3) Generar una clase <b><i>ProductoServicio</i></b> que contendrá una ArrayList llamada
   listaProductos, con su respectivo getters y setters. Además, esta clase debe contar
   con el siguiente método y su respectiva aplicación:
   (1 Punto)


4) Generar una clase <b><i>ArchivoServicio</i></b> para hacer la carga de datos externos. Crear el
   método cargarDatos() y generar aquellos códigos que nos ayuden a importar la lista
   de productos desde un archivo <b>“ProductosImportados.csv”</b>.
   (2 Puntos)


5) Crear una clase <b><i>Menu</i></b> que contendrá un menú similar al que vemos a continuación,
   recordar que debemos generar todas las instancias de scanner en esta clase.
   (2 puntos)


       1 Listar Producto
       2 Editar Datos
       3 Importar Datos
       4 Salir
       Ingrese una opción:

6) Crear una clase <b><i>Utilidad</i></b> para usar métodos de limpieza de pantalla y tiempo de
   espera.
   (1 Punto)



Caso: Listar Producto

    1 Listar Producto
    2 Editar Datos
    3 Importar Datos
    4 Salir
    Ingrese una opción:
    1
    Datos del Producto:
    Nombre articulo: Jean
    Código: 1500
    Marca: Levis
    Color: Azul Marino
    Descripcion: Es un Jean muy lindo con hermosos detalles
    Precio: 15000
    Talla: 42
    ---------------------------------
    Datos del Producto:
    Nombre articulo: Jean
    Código: 1501
    Marca: IndianaJeans
    Color: Blanco
    Descripcion: Es un Jean caro pero hermoso hermoso
    Precio: 25000
    Talla: 46

Caso: Editar Datos

    1 Listar Producto
    2 Editar Datos
    3 Importar Datos
    4 Salir
    Ingrese una opción:
    2
    Editar Producto
    Ingrese el número 1 para editar los datos ingresados del Producto
    1
    Ingrese código del producto:
    1500
    1.-El nombre del articulo actual es: Jean
    2.-El código del producto: 1500
    3.-El color del producto: Azul Marino
    4.-La descripción del producto: Es un Jean muy lindo con hermosos
    detalles
    5.-La marca del producto: Levis
    6.-El precio del producto: 15000
    7.-La talla del producto: 42
    Ingrese la opción a editar de los datos del producto:
    7
    Ingrese la nueva talla del producto:
    46
    ----------------------------
    //Si volvemos a Listar nos dará:
    Datos del Producto:
    Nombre articulo: Jean
    Código: 1500
    Marca: Levis
    Color: Azul Marino
    Descripcion: Es un Jean muy lindo con hermosos detalles
    Precio: 15000
    Talla: 46

Caso: Importar Datos.

    1 Listar Producto
    2 Editar Datos
    3 Importar Datos
    4 Salir
    Ingrese una opción:
    3
    Cargar Datos
    Ingresa la ruta en donde se encuentra el archivo
    ProductosImportados.csv:
    /home/desafioLatam
    [Producto [articulo=Jean, precio=15000, descripcion=Es un Jean muy lindo
    con hermosos detalles, codigo=1500, talla=42, marca=Levis, color=Azul
    Marino], Producto [articulo=Jean, precio=25000, descripcion= Es un Jean
    caro pero hermoso hermoso, codigo=1501, talla=46, marca= IndianaJeans,
    color= Blanco]]
    Datos cargados correctamente en la lista

Caso: Salir.

    1 Listar Producto
    2 Editar Datos
    3 Importar Datos
    4 Salir
    Ingrese una opción:
    4
    Abandonando el sistema de clientes...
    Acaba de salir del sistema



Nota : Para probar el Desafio se debera crear una carpeta en disco C: donde se debe descargar el archivo de prueba
<i>"ProductosImportados.csv"</i> es la que se ingresara al elegir la opcion importar(4) 

Imagenes de proyecto 








