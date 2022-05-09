package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Node;

public class Controller {
    private Stage stage;
    private Scene scene;
    @FXML
    private Circle circle;
    private double x;
    private double y;

    public void initialize() {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
    }

    public void up(ActionEvent event) {
        // System.out.println("Button clicked!");
        circle.setCenterY(y -= 10);
    }

    public void down(ActionEvent event) {
        circle.setCenterY(y += 10);
    }

    public void left(ActionEvent event) {
        circle.setCenterX(x -= 10);
    }

    public void right(ActionEvent event) {
        circle.setCenterX(x += 10);
    }

    public void switchToScene2(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
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