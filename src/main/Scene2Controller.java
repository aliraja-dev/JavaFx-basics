package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;

public class Scene2Controller {
    @FXML
    private Label InputLabel;
    @FXML
    private Button exitBtn;
    @FXML
    private ImageView imageView;
    @FXML
    private Button changeImage;
    @FXML
    private Button ageCheckBtn;
    @FXML
    private TextField ageField;
    @FXML
    private Label signInLabel;

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

    public void exit(ActionEvent event) {
        // Add alert box

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText("Are you sure you want to exit?");
        alert.setContentText("Press OK to exit.");
        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            System.out.println("Successfully logged out!");
            stage.close();
        }
        // System.exit(0);
    }

    public void changeImage(ActionEvent event) {
        Image image = new Image(getClass().getResourceAsStream("../images/File2.png"));
        imageView.setImage(image);
    }

    public void signIn(ActionEvent event) {
        try {
            int age = Integer.parseInt(ageField.getText());
            if (age >= 18) {
                signInLabel.setText("You are eligible to sign in!");
            } else {
                signInLabel.setText("You are not eligible to sign in!");
            }
        } catch (NumberFormatException e) {
            signInLabel.setText("Please enter a valid Number!");
            System.out.println("Please enter valid number");
        }

        catch (Exception e) {
            signInLabel.setText("Error");
            System.out.println("Please enter valid number");
        }
    }
}