package com.danielstone;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
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

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        //name input
        TextField nameInput = new TextField();
        GridPane.setConstraints(nameInput, 0, 0);

        //name label
        Button button = new Button("Click Me");
        button.setOnAction(event -> isInteger(nameInput, nameInput.getText()));
        GridPane.setConstraints(button, 0, 1);


        gridPane.getChildren().addAll(button, nameInput);

        scene = new Scene(gridPane, 300, 200);

        window.setScene(scene);
        window.setTitle("GridPane");
        window.show();
    }

    public boolean isInteger(TextField textField, String message) {

        try {
            int age = Integer.parseInt(message);
            System.out.println("User is:" + age);
            return true;
        } catch(NumberFormatException e) {
            System.out.println("Error: " + message + "is not a number");
            return false;
        }


    }

}
