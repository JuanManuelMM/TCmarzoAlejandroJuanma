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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
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
    
    private Punto punto;
    
    private CocheFX coche1;
    
    private CocheFX coche2;
    
    @FXML
    public void handleButtonAction(ActionEvent event) {
        
        txtLabel.setText("Instrucciones: \n 1)");
    }

    
      private void redibujar(){
    coche1.setLayoutX(coche1.coche.getPunto().x);
    coche1.setLayoutY(coche1.coche.getPunto().y);
    coche2.setLayoutX(coche2.coche.getPunto().x);
    coche2.setLayoutY(coche2.coche.getPunto().y);
    }
  
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        Punto punto1 = new Punto(160,160);
        coche1= new CocheFX();
        coche1.coche= new Coche(punto1);
        Button btn1 = coche1; 
        pnPaneEscenario.getChildren().add(coche1);
        
        Punto punto2 = new Punto(450,80);
        coche2= new CocheFX();
        coche2.coche= new Coche(punto2);
        Button btn2 = coche2;
        pnPaneEscenario.getChildren().add(coche2);
        
        
        redibujar();

        
    }

    @FXML
    private void moverObjeto(KeyEvent event) {
        //txt label para mostrar la posicion en texto
    txtLabel.setText("Instrucciones");

    }
      public void handle(KeyEvent ke) {
            if (ke.getCode() == KeyCode.UP) {
                Punto punto1 = coche1.coche.getPunto();
                double y = punto1.getY();
                y=-10;
                punto1.setY(y);
                coche1.coche.setPunto(punto1);
            }
            if (ke.getCode() == KeyCode.DOWN) {
                 Punto punto1 = coche1.coche.getPunto();
                double y = punto1.getY();
                y=+10;
                punto1.setY(y);
                coche1.coche.setPunto(punto1);
            }
            if (ke.getCode() == KeyCode.LEFT) {
                 Punto punto1 = coche1.coche.getPunto();
                double x = punto1.getX();
                x=+10;
                punto1.setX(x);
                coche1.coche.setPunto(punto1);
            }
            if (ke.getCode() == KeyCode.RIGHT) {
                 Punto punto1 = coche1.coche.getPunto();
                double x = punto1.getX();
                x=+10;
                punto1.setX(x);
                coche1.coche.setPunto(punto1);
            }
        }

}
