package cl.ReciclaJeans.Utilidad;

import cl.ReciclaJeans.Modelo.ArchivoServicio;
import cl.ReciclaJeans.Modelo.ProductoSercicio;

import java.util.Scanner;

/**
 * Nombre del Package :cl.ReciclaJeans.Modelo
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : domingo 09 de junio de 2024
 * 09-06-2024 18:50
 * Nombre del Proyecto DesafioReciclaJeans
 */
public class Menu {

    Scanner sc = new Scanner(System.in);
    Utilidad utilidad = new Utilidad();
    ProductoSercicio productoSercicio = new ProductoSercicio();
    ArchivoServicio importar = new ArchivoServicio();

    //Constructor
    public Menu() {
    }
    //Metodos
    public void menuOpciones(){
        int op;
        do {
            utilidad.limpiarPantalla();
            System.out.println("\n");
            System.out.println(" **  Menu de Opciones ** ");
            System.out.println("\n");
            System.out.println(" 1_ Listar Producto ");
            System.out.println(" 2_ Editar Datos ");
            System.out.println(" 3_ Importar Datos  ");
            System.out.println(" 4_ Salir           ");
            System.out.print("\n");
            System.out.print("   Ingrese una Opcion : ");
            op = sc.nextInt();
            System.out.println("\n");
            if (op == 1) { //listar
                utilidad.limpiarPantalla();
                listar();
            } else if (op == 2) {//Editar
                utilidad.limpiarPantalla();
                editar();

            } else if (op == 3) {//importar
                importar();

            } else if (op == 4) {//salir
                System.out.println("Se ha terminado el programa");
                utilidad.limpiaespera();
                System.exit(0);
            }else{
                System.out.println("Debe ingresar opcion del 1 al 4");
            }
        } while (op>=1 && op <=4 );
    }

///////////////////////////////////////////////////////////////
    public void listar(){
       productoSercicio.listaProductos();
        utilidad.espera();
        utilidad.espera();
    }
//////////////////////////////////////////////////////////////
    public void editar(){

        System.out.println("Ingrese el número 1 para editar los datos ingresados del Producto");
        int edit = sc.nextInt();
        System.out.println(" Ingrese código del producto:");
        String codigoedicion = sc.next();
        productoSercicio.edicion(codigoedicion);
        utilidad.espera();
        utilidad.espera();
    }

/////////////////////////////////////////////////////////////
    public void importar(){
        System.out.println("Cargar Datos");
        System.out.print("\n");
        System.out.println("Ingresa la ruta en donde se encuentra el archivo ProductosImportados.csv ");
        String rutaaimportar = sc.next();
        importar.cargarDatos(productoSercicio, rutaaimportar);
        utilidad.espera();
        utilidad.espera();
    }





}
