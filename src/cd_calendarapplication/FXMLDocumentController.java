/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cd_calendarapplication;


import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;


/**
 *
 * @author caseydierking
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private Label usernameLabel;
    @FXML
    private Label passwordLabel;
    @FXML
    private Label loginLabel;
     @FXML
    private TextField usernameField;
     @FXML
    private TextField passwordField;
      
     
    
      

    
    
    //Method to test login and return alerts if false. Redirects user to Customer Management if true.
    public void loginAndConnect(ActionEvent event) throws IOException{
        DBConnection dbconnection = new DBConnection();
        String username = usernameField.getText();
        String password = passwordField.getText();
        
       //See if login is valid
       Boolean validLogin = dbconnection.checkCredentials(username,password);
       
       //If login is valid, then allow login and redirect to customer management portal.
       if(validLogin){
           dbconnection.redirectToCustomerPortal(event);
       
       } 
       
        
        
        
        
        
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    ResourceBundle reb = ResourceBundle.getBundle("language_files/rb");

     //Set labels based on Locale
      loginLabel.setText(reb.getString("Login"));
      usernameLabel.setText(reb.getString("username"));  
      passwordLabel.setText(reb.getString("password"));
      
      
        
    }    

   
    
}
