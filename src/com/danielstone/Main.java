package com.danielstone;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene;
    Button button;
    ComboBox<String> comboBox;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        button = new Button("Submit");
        button.setOnAction(e -> printMovie());

        comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "Pasta",
                "Pizza",
                "Steak"
        );
        //comboBox.setPromptText("What is your favourite food?");
        comboBox.setEditable(true);

        comboBox.setOnAction(e -> System.out.println("User selected: " + comboBox.getValue()));

        layout.getChildren().addAll(comboBox, button);

        scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.setTitle("ComboBox");
        window.show();
    }

    private void printMovie() {
        System.out.println(comboBox.getValue());
    }

}
