package com.danielstone;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{

    Stage window;
    Scene scene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Label label1 = new Label("Welcome to the first scene!");


        //Button 1
        Button button = new Button("Click Me");
        button.setOnAction(event -> AlertBox.display("Alert", "Example Alert"));

        //Layout 2 -
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        scene = new Scene(layout, 600, 300);

        window.setScene(scene);
        window.setTitle("Title");
        window.show();

    }

}
