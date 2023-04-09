/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package es.iespuertodelacruz.aj.coches.controller;

import es.iespuertodelacruz.aj.coches.model.Coche;
import es.iespuertodelacruz.aj.coches.model.CocheFX;
import es.iespuertodelacruz.aj.coches.model.Punto;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventTarget;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import static javafx.scene.input.KeyCode.DOWN;
import static javafx.scene.input.KeyCode.UP;
import static javafx.scene.input.KeyCode.LEFT;
import static javafx.scene.input.KeyCode.RIGHT;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

/**
 *
 * @author Juan Manuel Morales Martín
 */
public class FXMLDocumentController implements Initializable {

    private Label txtLabel;
    @FXML
    private Text txtTextoInstrucciones;
    @FXML
    private Pane pnPaneEscenario;

    private Punto punto;

    @FXML
    private javafx.scene.image.ImageView coche1;

    @FXML
    private javafx.scene.image.ImageView coche2;

    CocheFX coche;

    @FXML
    private TextArea txtArea;
    @FXML
    private Button btnInstrucciones;

    @FXML
    public void handleButtonAction(ActionEvent event) {

        //txt label para mostrar la posicion en texto
        txtArea.setText("Seleccionar el coche pulsando con el ratón. Luego \n "
                + "Tecla 'e': Encender el coche\n"
                + "Tecla 'a': Apagar el coche\n"
                + "Tecla 's': Subir freno de mano\n"
                + "Tecla 'b': Bajar freno de mano\n"
                + "Arrow Keys: Mover coche en dirección establecida");

    }

    private void redibujar() {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        redibujar();
        coche = new CocheFX();
    }

    @FXML
    private void moverObjeto(KeyEvent event) {
        KeyCode kc = event.getCode();
        switch (kc) {
            case UP:
                System.out.println("arriba");
                //mensaje = coche.moverArriba(paso);
                break;
            case DOWN:
                System.out.println("abajo");
                //mensaje = coche.moverAbajo(paso);
                break;
            case LEFT:
                System.out.println("izquierda");
                //mensaje = coche.moverIzquierda(paso);
                break;
            case RIGHT:
                System.out.println("derecha");
                //mensaje = coche.moverDerecha(paso);
                break;
        }
    }

    @FXML
    private void seleccionarCoche(MouseEvent event) {
        EventTarget target = event.getTarget();
        
        if(target == coche1){
            coche1 = coche;
            System.out.println("Coche1");
        }else{
            coche2 = coche;
            System.out.println("Coche2");
        
        }
    }
}
