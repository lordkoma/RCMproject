/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rcm.user;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author oke
 */
public class SignInController implements Initializable {

    @FXML
    private Label lblOut;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void backStart(MouseEvent event) throws IOException {

        ((Node) event.getSource()).getScene().getWindow().hide();

        Parent root = FXMLLoader.load(getClass().getResource("Start.fxml"));

        Scene scene = new Scene(root);

        Stage stage = new Stage();

        
        stage.setScene(scene);
        stage.setTitle("RCM");

        stage.show();

    }
    
    @FXML
    private void customerRegister(MouseEvent event) throws IOException {

        ((Node) event.getSource()).getScene().getWindow().hide();

        Parent root = FXMLLoader.load(getClass().getResource("customerRegister.fxml"));

        Scene scene = new Scene(root);

        Stage stage = new Stage();

        
        stage.setScene(scene);
        stage.setTitle("RCM");

        stage.show();

    }

    
}
