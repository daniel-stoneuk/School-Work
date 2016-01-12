package com.danielstone;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
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

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Tuna");

        box1.setSelected(true);

        Button button = new Button("Order Now!");
        button.setOnAction(event -> {handleOptions(box1, box2);});

        layout.getChildren().addAll(box1, box2, button);
        scene = new Scene(layout, 300, 200);

        window.setScene(scene);
        window.setTitle("GridPane");
        window.show();
    }

    private void handleOptions(CheckBox box1, CheckBox box2) {
        String message = "Users order\n";

        if(!(!(box1.isSelected()) && !(box2.isSelected()))) {

            if (box1.isSelected())
                message += "Bacon \n";

            if (box2.isSelected())
                message += "Tuna";

            System.out.println(message);

        } else {
            System.out.println("Check some boxes");
        }

    }

}
