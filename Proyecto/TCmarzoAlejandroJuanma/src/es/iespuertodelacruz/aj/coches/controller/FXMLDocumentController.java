/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package es.iespuertodelacruz.aj.coches.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import static javafx.scene.input.KeyCode.DOWN;
import static javafx.scene.input.KeyCode.LEFT;
import static javafx.scene.input.KeyCode.RIGHT;
import static javafx.scene.input.KeyCode.UP;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

/**
 *
 * @author Juan Manuel Morales Martín
 */
public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private Label txtLabel;
    @FXML
    private Button button;
    @FXML
    private Text txtTextoInstrucciones;
    @FXML
    private Pane pnPaneEscenario;

    @FXML
    public void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        txtLabel.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void moverObjeto(KeyEvent event) {
        KeyCode kc = event.getCode();
        switch (kc) {
            case UP: //System.out.println("arriba");
                mensaje = coche.moverArriba(paso);
                break;
            case DOWN: //System.out.println("abajo");
                mensaje = coche.moverAbajo(paso);
                break;
            case LEFT: //System.out.println("izquierda");
                mensaje = coche.moverIzquierda(paso);
                break;
            case RIGHT: //System.out.println("derecha");
                mensaje = coche.moverDerecha(paso);
                break;
        }

    }

}
