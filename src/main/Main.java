package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
            primaryStage.setTitle("JavaFx Project");
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
            // When we have multiple scenes, we can add them the same CSS file or separate
            // css files by storing the css =
            // this.getClass().getResource("main.css").toExternalForm(); in a string and
            // then reusing that for every scene in getstylesheets().add(css);

            primaryStage.setScene(scene);
            primaryStage.show();
            // TODO: Lambda functions in Java, arrow functions in JS
            primaryStage.setOnCloseRequest(event -> {
                event.consume();
                exit(primaryStage);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void exit(Stage stage) {
        // Add alert box

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText("Are you sure you want to exit?");
        alert.setContentText("Press OK to exit.");
        if (alert.showAndWait().get() == ButtonType.OK) {
            System.out.println("Successfully logged out!");
            stage.close();
        }
        // System.exit(0);
    }
}