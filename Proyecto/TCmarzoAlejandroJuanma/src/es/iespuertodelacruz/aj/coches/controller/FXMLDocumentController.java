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
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javax.swing.text.Element;
import javax.swing.text.html.ImageView;

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
    @FXML
    private TextArea txtArea;
    @FXML
    private Button btnInstrucciones;
    
    @FXML
    public void handleButtonAction(ActionEvent event) {
        
        txtArea.appendText("\nSeleccionar el coche pulsando con el ratón.\nLuego\n"
            + "Tecla 'e': Encender el coche\n"
            + "Tecla 'a': Apagar el coche\n"
            + "Tecla 's': Subir freno de mano\n"
            + "Tecla 'b': Bajar freno de mano\n"
            + "Arrow Keys: Mover coche en dirección establecida\n" );
    }

    
      private void redibujar(){
    
    }
  
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
        redibujar();

        
    }

    @FXML
    private void moverObjeto(KeyEvent event) {
        //txt label para mostrar la posicion en texto
    txtArea.setText("Seleccionar el coche pulsando con el ratón. Luego \n "
            + "Tecla 'e': Encender el coche\n"
            + "Tecla 'a': Apagar el coche\n"
            + "Tecla 's': Subir freno de mano\n"
            + "Tecla 'b': Bajar freno de mano\n"
            + "Arrow Keys: Mover coche en dirección establecida" );

    }

}
