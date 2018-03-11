/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cd_calendarapplication;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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
      private static Connection connDB;
     
    
      
    ResourceBundle reb = ResourceBundle.getBundle("language_files/rb");

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    
    
    public void loginAndConnect(ActionEvent event){
        
        
        
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            /* Replace the X's with the information for your database instance */
            connDB = DriverManager.getConnection("jdbc:mysql://52.206.157.109:3306/U04lGH?" + 
                    "user=" + usernameField.getText() + "&password=" + passwordField.getText());
        }catch (ClassNotFoundException ce){
            System.out.println("Cannot find the right class.  Did you remember to add the mysql library to your Run Configuration?");
            ce.printStackTrace();
        }catch(Exception e){
            
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle(reb.getString("invalidtitle"));
            alert.setHeaderText(reb.getString("invalidheader"));
            alert.setContentText(reb.getString("invalidlogin"));
    

            alert.showAndWait();
           
}
        
        
        
        
        
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
     //Set labels based on Locale
      loginLabel.setText(reb.getString("Login"));
      usernameLabel.setText(reb.getString("username"));  
      passwordLabel.setText(reb.getString("password"));
      
      
        
    }    
    
}
