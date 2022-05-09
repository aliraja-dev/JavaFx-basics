package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Node;

public class Scene2Controller {
    @FXML
    Label InputLabel;

    private Stage stage;
    private Scene scene;

    public void getLabel(String s) {
        InputLabel.setText(s);
    }

    public void switchToScene1(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
