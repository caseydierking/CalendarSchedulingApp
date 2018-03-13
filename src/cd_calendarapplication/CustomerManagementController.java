/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cd_calendarapplication;

import cd_calendarapplication.Models.Customer;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author caseydierking
 */
public class CustomerManagementController implements Initializable {
    
         @FXML private TableView<Customer> customerTable;
         @FXML private TableColumn<Customer, Integer> customerIdColumn;
         @FXML private TableColumn<Customer, String> customerNameColumn;
         @FXML private TableColumn<Customer, Integer> addressIdColumn;
         @FXML private TableColumn<Customer, Integer> isActiveColumn;
   
        private static Connection connDB;

    
        
        
        
         private void showCustomerDetails(Customer selectedCustomer) {
     
        //.setText(selectedCustomer.getCustomerId());
      //  nameText.setText(selectedCustomer.getCustomerName());
       // addressText.setText(selectedCustomer.getAddressId());
       // zipText.setText(selectedCustomer.getActive());

    }
        
        
        
        
        
        
        
        
        
        
    
    private List<Customer> parseCustomerList() {
      
        Integer id;
        String name;
        Integer addressId;
        Integer active;
        ArrayList<Customer> customerList = new ArrayList();
        try(
            
            
        PreparedStatement statement = DBConnection.getConn().prepareStatement("SELECT customer.customerId, customer.customerName FROM customer, address WHERE customer.addressId = address.addressId;");
            
                
                
                ResultSet rs = statement.executeQuery();){
           
            
            while (rs.next()) {
                id = rs.getInt("customer.customerID");
                
                name = rs.getString("customer.customerName");

                addressId = rs.getInt("address.address");
                
                active = rs.getInt("address.postalCode");

                customerList.add(new Customer(id, name, addressId, active));

            }
          
        } catch (SQLException sqe) {
            System.out.println("Check your SQL");
             System.out.println(sqe);
        } catch (Exception e) {
            System.out.println("Something besides the SQL went wrong.");
        }

         
        return customerList;

    }
    
    
    
    
    
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        customerIdColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
         customerNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
         addressIdColumn.setCellValueFactory(new PropertyValueFactory<>("address"));
         isActiveColumn.setCellValueFactory(new PropertyValueFactory<>("active"));
         
         customerTable.getItems().setAll(parseCustomerList()); /* takes the list from the parseCustomerList() 
         method, and addes the rows to the TableView */
         
         customerTable.getSelectionModel().selectedItemProperty().addListener(
            (observable, oldValue, newValue)->showCustomerDetails(newValue));
        
    }    
    
}
