package cl.ReciclaJeans.Utilidad;

/**
 * Nombre del Package :cl.ReciclaJeans.Modelo
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : domingo 09 de junio de 2024
 * 09-06-2024 21:00
 * Nombre del Proyecto DesafioReciclaJeans
 */
public class Utilidad {




    public void espera() {
        int tiempoEspera = 20;
        try {
            for(int i = 0; i < tiempoEspera; i++) {
                Thread.sleep(150);
            }
        }catch(InterruptedException ie) {
            System.out.println("Error en timer");
        }
    }

    public  void limpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {

        }
    }

    public void limpiaespera() {
        espera();
        limpiarPantalla ();
    }








}
