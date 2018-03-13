/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cd_calendarapplication;

import java.sql.Connection;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author caseydierking
 */
public class CD_CalendarApplication extends Application {
    
        private static Connection connection;

        private static Connection conn = null;
	

    
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         // This allows multiple languages to be supported for the login screen. Uncomment French and comment US to test.
         // Locale.setDefault(new Locale("fr", "FR"));
             ResourceBundle rb = ResourceBundle.getBundle("language_files/rb");

      
      Locale.setDefault(new Locale("en", "US"));//English - en_US

        launch(args);
 

		
		
        
        
    }
    
}
