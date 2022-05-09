package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Node;

public class Controller {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Circle circle;
    @FXML
    private TextField inputField;
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
            String inputText = inputField.getText();
            System.out.println(inputText);
            FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
            root = loader.load();

            Scene2Controller scene2Controller = loader.getController();
            scene2Controller.getLabel(inputText);

            // root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}