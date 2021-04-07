/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rcm.user;

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
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author oke
 */
public class StartController implements Initializable {

    @FXML
    private ImageView customerImg;
    @FXML
    private ImageView adminImg;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    private void backStart(MouseEvent event) throws IOException {

        ((Node) event.getSource()).getScene().getWindow().hide();

        Parent root = FXMLLoader.load(getClass().getResource("Start.fxml"));

        Scene scene = new Scene(root);

        Stage stage = new Stage();

        stage.setScene(scene);
        stage.setTitle("RCM LOGIN");

        stage.show();

    }

    @FXML
    private void signIn(MouseEvent event) throws IOException {
        ((Node) event.getSource()).getScene().getWindow().hide();

        Parent root = FXMLLoader.load(getClass().getResource("SignIn.fxml"));

        Scene scene = new Scene(root);

        Stage stage = new Stage();

        stage.setScene(scene);
        stage.setTitle("RCM LOGIN");

        stage.show();
    }

}
