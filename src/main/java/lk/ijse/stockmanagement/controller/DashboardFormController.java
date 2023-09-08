package lk.ijse.stockmanagement.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardFormController {
    public AnchorPane rootNode;
    public AnchorPane node;

    public void btnCustomerOnAction(ActionEvent actionEvent) throws IOException {
        //open the customer manage form

        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/customer_form.fxml"));

        Scene scene = new Scene(rootNode);

//        Stage stage = new Stage();
//        stage.setScene(scene);
        Stage primaryStage = (Stage) this.rootNode.getScene().getWindow();
        primaryStage.setScene(scene);

        primaryStage.setTitle("Customer Manage");
       // stage.show();


    }

    public void btnItemOnAction(ActionEvent actionEvent) throws IOException {
        //open item manage form to the dashboard stage
        // dn tiyena window ekatama load krnna
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/item_form.fxml"));

        Scene scene = new Scene(rootNode);

        
        Stage primaryStage = (Stage) this.rootNode.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.setTitle("Item Manage");
        //primaryStage.show();



    }

    public void btnSupplierOnAction(ActionEvent actionEvent) throws IOException {
        //
       Parent root = FXMLLoader.load(this.getClass().getResource("/view/supplier_form.fxml"));

      // Scene scene = new Scene(root);
       this.node.getChildren().clear();
       this.node.getChildren().add(root);
    }
}
