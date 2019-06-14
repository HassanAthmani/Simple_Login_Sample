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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;



/**
 *
 * @author User
 */
public class FXMLDocumentController implements Initializable {
    

  
    @FXML
    private Button login_btn;

   @FXML
    private PasswordField password;
   
    @FXML
    private TextField username;

         
    @FXML
    void login(ActionEvent event) throws IOException {
        
       String pass=String.valueOf(password.getText());
     String user= String.valueOf(username.getText());
     
     //Checks whether the password and user name fit the ones given
     
     if(user.equals("kenya") && "12345".equals(pass) ){
        System.out.println("Access granted");
        /*int response = JOptionPane.showConfirmDialog(
        null,"Access granted","Access Confirmed",JOptionPane.DEFAULT_OPTION);*/
        
        //setting scene variable
        Parent sceneFxml= FXMLLoader.load(getClass().getResource("dashboard.fxml"));
        Scene newScene=new Scene(sceneFxml);
        
        //getting stage
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        //setting scene on stage
        window.setScene(newScene);
        window.show();
        
        /*Stage stage = (Stage) login.getScene().getWindow();
        stage.close();*/
        //System.exit(0);
      }
     
     //Checks whether the password field and username filed is empty
     
     else if(password.getText().isEmpty() &&username.getText().isEmpty()){
         int response = JOptionPane.showConfirmDialog(
        null,"Username field and password field should not be empty ","Access Denied",JOptionPane.DEFAULT_OPTION);  
     }
     
     //Checks whether the password field is empty
     
    else if(password.getText().isEmpty()){
         int response = JOptionPane.showConfirmDialog(
        null,"The password field should not be empty ","Access Denied",JOptionPane.DEFAULT_OPTION);  
     } 
    
     //Checks whether the username field is empty
    
     else if(username.getText().isEmpty()){
        int response = JOptionPane.showConfirmDialog(
        null,"Username field should not be empty ","Access Denied",JOptionPane.DEFAULT_OPTION);   
     }
     
      //If the password or username is wrong
     else {
         int response = JOptionPane.showConfirmDialog(
        null,"Wrong password or username","Access Denied",JOptionPane.DEFAULT_OPTION);   
         
             
             }
    }
    

    
       
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
