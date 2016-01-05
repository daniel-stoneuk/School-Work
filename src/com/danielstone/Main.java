package com.danielstone;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title of the window");


        button = new Button();
        button.setText("Click me");

        //LAMBDA
        button.setOnAction(e -> {
            System.out.println("HEY NOW");
        });

        /*
        *ANONYMOUS INNER CLASS
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("I am anonymous inner class");
            }
        });
        */

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 500, 400);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

}
