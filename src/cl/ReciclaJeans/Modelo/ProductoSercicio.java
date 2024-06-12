package cl.ReciclaJeans.Modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Nombre del Package :cl.ReciclaJeans.Modelo
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : sábado 08 de junio de 2024
 * 08-06-2024 17:21
 * Nombre del Proyecto DesafioReciclaJeans
 */
public class ProductoSercicio {
    //Atributos
    private ArrayList<Producto>listaProductos =new ArrayList<>();
    //Constructor Vacio

    public ProductoSercicio() {
    }


    //Constructor Completo


    public ProductoSercicio(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    //Metodo
    public void listaProductos(){
        if (listaProductos.isEmpty()) {
            System.out.println("\n");
            System.out.println("   no hay datos a listar ");
        }else {
            //Estructura foreach
            for (Producto producto : listaProductos) {
                System.out.println("  ***********Listado del Producto************ ");
                System.out.println("\n");
                System.out.println("      Articulo : " + producto.getArticulo());
                System.out.println("      Precio : " + producto.getPrecio());
                System.out.println("      Descripcion : " + producto.getDescripcion());
                System.out.println("      Codigo : " + producto.getCodigo());
                System.out.println("      Talla : " + producto.getTalla());
                System.out.println("      Marca : " + producto.getMarca());
                System.out.println("      Color : " + producto.getColor());
                System.out.println("\n");
                System.out.println("  ****************************************** ");
            }

        }

    }

    public void agregarProductosimportar(String artic, String prec, String descr,
                                 String codi, String tall, String marc, String col) {
        Producto producto = new Producto(artic,prec, descr, codi, tall, marc, col);
        if (producto != null) {
            listaProductos.add(producto);
            //System.out.println("ddd"+listaProductos);
          /*  for (Iterator<Producto> iterador = listaProductos.iterator(); iterador.hasNext();) {
                Producto element = iterador.next();
                System.out.println(element);
            }*/
        }else {
            System.out.println("\n");
            System.out.println("   no es posible agregar producto");
        }
    }

    public void edicion(String codigoAeditar){

        for (Producto producto : listaProductos) {
            if (producto.getCodigo().equals(codigoAeditar)) {
                System.out.println("  ***********Listado del Producto************ ");
                System.out.println("\n");
                System.out.println("   1   Articulo : " + producto.getArticulo());
                System.out.println("   2   Precio : " + producto.getPrecio());
                System.out.println("   3   Descripcion : " + producto.getDescripcion());
                System.out.println("   4   Codigo : " + producto.getCodigo());
                System.out.println("   5   Talla : " + producto.getTalla());
                System.out.println("   6   Marca : " + producto.getMarca());
                System.out.println("   7   Color : " + producto.getColor());
                System.out.println("\n");
                System.out.println("  ****************************************** ");
                System.out.println("\n");
                System.out.println("Ingrese la opción a editar de los datos del producto:");
                Scanner sc = new Scanner(System.in);
                int opcionDetalle = sc.nextInt();
                if (opcionDetalle == 1) {
                    System.out.println("Ingrese el Nombre de Articulo:\n");
                    String nuevodato = sc.next();
                    producto.setArticulo(nuevodato);
                } else if (opcionDetalle == 2) {
                    System.out.println("Ingrese el nuevo Precio del producto:\n");
                    String nuevodato = sc.next();
                    producto.setPrecio(nuevodato);
                } else if (opcionDetalle == 3) {
                    System.out.println("Ingrese la nueva Descripcion del producto:\n");
                    String nuevodato = sc.next();
                    producto.setDescripcion(nuevodato);
                } else if (opcionDetalle == 4) {
                    System.out.println("Ingrese el nuevo codigo del producto:\n");
                    String nuevodato = sc.next();
                    producto.setCodigo(nuevodato);
                } else if (opcionDetalle == 5) {
                    System.out.println("Ingrese la nueva talla del producto:\n");
                    String nuevodato = sc.next();
                    producto.setTalla(nuevodato);
                } else if (opcionDetalle == 6) {
                    System.out.println("Ingrese la nueva Marca del producto:\n");
                    String nuevodato = sc.next();
                    producto.setMarca(nuevodato);
                }else {
                    System.out.println("Ingrese el nuevo Color del producto:\n");
                    String nuevodato = sc.next();
                    producto.setColor(nuevodato);
                }


            }
        }





    }




    //Getters y setters
    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }
    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
}
