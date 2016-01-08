package com.danielstone;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{

    Stage window;
    Scene scene;
    boolean result;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        window.setOnCloseRequest(event1 -> {
            event1.consume();
            closeProgram();
        });

        //Button 1
        Button button = new Button("Close Program");
        button.setOnAction(event -> closeProgram());

        //Layout
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        scene = new Scene(layout, 600, 300);

        window.setScene(scene);
        window.setTitle("Title");
        window.show();

    }

    private void closeProgram() {
        Boolean answer = ConfirmBox.display("Alert", "Are you sure you want to exit?");

        if (answer) {
            window.close();
        }
    }

}
