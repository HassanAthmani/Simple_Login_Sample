/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_dialog;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class DashboardController implements Initializable {

    @FXML
    private Button backBtn;

    @FXML
    void BackToLogin(ActionEvent event) throws IOException {
        
         //setting scene variable
        Parent sceneFxml= FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene newScene=new Scene(sceneFxml);
        
        //getting stage
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        //setting scene on stage
        window.setScene(newScene);
        window.show();

    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
