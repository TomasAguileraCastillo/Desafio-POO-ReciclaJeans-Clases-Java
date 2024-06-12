package cl.ReciclaJeans.Modelo;

import cl.ReciclaJeans.Utilidad.Utilidad;

import java.io.*;
import java.util.Iterator;

/**
 * Nombre del Package :cl.ReciclaJeans.Modelo
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : sábado 08 de junio de 2024
 * 08-06-2024 18:25
 * Nombre del Proyecto DesafioReciclaJeans
 */
//public class ArchivoServicio extends Importar {
public class ArchivoServicio {

    //Constructor Vacio
    public ArchivoServicio() {
    }

    //Constructor  Completo


    public ArchivoServicio(ProductoSercicio producImp) {
        this.producImp = producImp;
    }

    //Metodos
    Utilidad utilidad = new Utilidad();
    ProductoSercicio producImp = new ProductoSercicio();
    public void cargarDatos(ProductoSercicio cargaproducto , String ruta){
        String rutaCompleta;
        rutaCompleta = ruta + "/ProductosImportados.csv";
        FileReader fr = null;
        String lineaArchivo = "";
        File file = new File(rutaCompleta);

        try {
            if (!file.exists()) {
                System.out.println("El Directorio no Existe!");
            }
        }catch (Exception e){
            System.out.println("No es posible cargar el directorio" + e);
        }
        try {
            FileReader fileReader = new FileReader(rutaCompleta);
            BufferedReader br = new BufferedReader(fileReader);
            System.out.println("Comenzara la importacion del Archivo al Sistema");
            while((lineaArchivo = br.readLine()) != null ) {
                String [] data = lineaArchivo.split(",");
                cargaproducto.agregarProductosimportar( data[0], data[1], data[2],
                        data[3], data[4], data[5], data[6]);
            }
            utilidad.espera();
            System.out.println("Se ha realizado la importacion de datos");
        }catch(IOException e) {
            System.out.println("El archivo no pudo ser cargado" );
        }

    }

    //Getters y Setters


    public ProductoSercicio getProducImp() {
        return producImp;
    }

    public void setProducImp(ProductoSercicio producImp) {
        this.producImp = producImp;
    }
}
