/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.ReadOnlyStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author eduardo
 */
public class FXMLDocumentController implements Initializable {
    
    
    //String string = fXMLDocumentController1.getTxt();   
    
   
    @FXML
    private ComboBox combobox;   
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        
        Stage stage = new Stage(); 
        FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("../views/FXMLDocument1.fxml"));
                
        Parent parent =  fXMLLoader.load();
        Scene scene = new Scene(parent);
        
        stage.setScene(scene);
        stage.show();
        
        FXMLDocumentController1 fXMLDocumentController1 = fXMLLoader.getController();
        fXMLDocumentController1.txtProperty().addListener((obs, oldTxt, newTxt) -> {            
            combobox.getItems().addAll(newTxt);
        });          
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
