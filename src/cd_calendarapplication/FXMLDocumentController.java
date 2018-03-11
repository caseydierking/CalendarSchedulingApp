/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cd_calendarapplication;

import java.net.URL;
import java.util.Locale;
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
    private Label label;
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
     
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    
    
    public void loginAndConnect(ActionEvent event){
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
      // This allows multiple languages to be supported for the login screen. Uncomment French and comment US to test.
      //Locale.setDefault(new Locale("fr", "FR"));
      
      Locale.setDefault(new Locale("en", "US"));//English - en_US
      ResourceBundle reb = ResourceBundle.getBundle("language_files/rb");
	
      loginLabel.setText(reb.getString("Login"));
      usernameLabel.setText(reb.getString("username"));  
      passwordLabel.setText(reb.getString("password"));
      
      
        
    }    
    
}
