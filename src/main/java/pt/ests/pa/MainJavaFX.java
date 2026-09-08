package pt.ests.pa;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainJavaFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Application");
        Label hello = new Label("Hello world!");

        StackPane root = new StackPane();
        root.getChildren().add(hello);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
