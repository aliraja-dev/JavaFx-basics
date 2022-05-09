package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
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
    }

    public static void main(String[] args) {
        launch(args);
    }
}