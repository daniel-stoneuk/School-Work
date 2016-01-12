package com.danielstone;

import javafx.application.Application;
import javafx.collections.ArrayChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    Stage window;
    Scene scene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().setAll("apples", "oranges", "bananas");
        choiceBox.setValue(choiceBox.getItems().get(0));

        choiceBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("You chose " + newValue + " from " + oldValue);
        });

        layout.getChildren().add(choiceBox);

        Button button = new Button("Click me");

        layout.getChildren().addAll(button);
        scene = new Scene(layout, 300, 200);

        window.setScene(scene);
        window.setTitle("VBox");
        window.show();
    }

}
