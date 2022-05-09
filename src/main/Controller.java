package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;

public class Controller {

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

}