package lk.ijse.stockmanagement.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;



public class CustomerFormController {
    public AnchorPane root;

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/dashboard_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage stage = (Stage) this.root.getScene().getWindow();

        stage.setScene(scene);

        stage.setTitle("DashBoard");
    }
}
