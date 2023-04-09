/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iespuertodelacruz.aj.coches.model;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

/**
 *
 * @author dam
 */
public class Coche{

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }
    private boolean encendido;
    private boolean frenoDeManoPuesto;
    private Punto punto;



    public Coche() {
        
        frenoDeManoPuesto = true;
        encendido = false;
       

    }

    public String arrancar() {

        String respuesta = "";

        if (encendido == true) {
            respuesta = "Quieeeto, que te cargas el coche.";

        } else {
            respuesta = "Nice";
            encendido = true;
        }
        return respuesta;
    }

    public String apagar() {
        String respuesta = "";
        if (encendido == false) {
            respuesta = "Buena chaval, intentando apagar algo apagado.";

        } else {
            respuesta = "A la orden, coche apagado.";
            encendido = false;
        }
        return respuesta;

    }

    public String bajarFrenoMano() {
        String respuesta = "";
        if (frenoDeManoPuesto) {
            frenoDeManoPuesto = false;
            respuesta = "ok, Freno quitado";
        } else {
            respuesta = "El freno ya estaba quitado";
        }
        return respuesta;
    }

    public String subirFrenoMano() {
        String respuesta = "";
        if (frenoDeManoPuesto) {
            respuesta = "Freno ya puesto";
        } else {
            frenoDeManoPuesto = true;
            respuesta = "Ok, freno puesto";
        }
        return respuesta;
    }

        

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public boolean isFrenoDeManoPuesto() {
        return frenoDeManoPuesto;
    }

    public void setFrenoDeManoPuesto(boolean frenoDeManoPuesto) {
        this.frenoDeManoPuesto = frenoDeManoPuesto;
    }

    


}
