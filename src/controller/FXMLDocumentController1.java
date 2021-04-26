/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.ResourceBundle;
import javafx.beans.property.ReadOnlyListProperty;
import javafx.beans.property.ReadOnlyListWrapper;
import javafx.beans.property.ReadOnlyStringProperty;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author eduardo
 */
public class FXMLDocumentController1 implements Initializable {
    
    
    @FXML
    public Button retornar; 
    
    @FXML
    public TextField texto; 
    
    private final ObservableList<String> lista = FXCollections.observableArrayList();

    private final ReadOnlyListWrapper<String> txt = new ReadOnlyListWrapper<>();
    
    public ReadOnlyListProperty<String> txtProperty(){
        return txt.getReadOnlyProperty();
    } 
    
    public List<String> getTxt(){
        return txt.get();
    }    
    
    @FXML
    public void handleButtonAction(ActionEvent event){         
        Stage stage = (Stage) retornar.getScene().getWindow();
       
        lista.add("A");
        lista.add("B");
        lista.add("C");
        
        txt.set(lista);
        
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {        
                
    }
    
}
