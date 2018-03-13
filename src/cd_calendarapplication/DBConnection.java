
package cd_calendarapplication;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 *
 *
 */
public class DBConnection {
    
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String db = "U ÷04lGH";
    private static final String url = "jdbc:mysql://52.206.157.109:3366/" + db;
    private static final String user = "U04lGH";
    private static final String pass = "53688276376";


    
 

    
    private static Connection connDB;
    

    ResourceBundle rb = ResourceBundle.getBundle("language_files/rb");
        
    
    
    
    
    
    
    
    //Method that checks login credentials and returns true if successful.
        public boolean checkCredentials(String username,String password){
            
            try{
             Class.forName(driver);
             connDB = DriverManager.getConnection("jdbc:mysql://52.206.157.109:3306/U04lGH?" + 
                    "user=" + username + "&password=" + password);
             
             
            }catch (ClassNotFoundException ce){
            System.out.println("Cannot find the right class.  Did you remember to add the mysql library to your Run Configuration?");
            ce.printStackTrace();
            return false;
        }catch(Exception e){
            
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle(rb.getString("invalidtitle"));
            alert.setHeaderText(rb.getString("invalidheader"));
            alert.setContentText(rb.getString("invalidlogin"));
    

            alert.showAndWait();
            
            return false;
            
          
        }
            
            return true;
            
        }
        
        
        
        public static Connection getConn(){
    
        return connDB;
    }
        
        
        
         
    public static void closeConn(){
        try{
            connDB.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Connection closed.");
        }
    }
        
        //Method that allows the user to go ahead and login to the database. And then redirects to Customer Management.
        public void redirectToCustomerPortal(ActionEvent event) throws IOException{
            
           //redirect to Customer Managment Screen if successful login
            Parent customerManagementParent = FXMLLoader.load(getClass().getResource("CustomerManagement.fxml"));
            Scene customerManagementScene = new Scene(customerManagementParent);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(customerManagementScene);
            window.show();
        
          
        }
}
        
    

