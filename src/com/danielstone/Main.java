package com.danielstone;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene;
    Button button;
    ListView<String> listView;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        listView = new ListView<>();
        listView.getItems().addAll("Film One", "Film Two", "Film Three", "Film Four");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        button = new Button("Submit");
        button.setOnAction(e -> buttonClicked());

        layout.getChildren().addAll(button, listView);

        scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.setTitle("ListView");
        window.show();
    }

    private void buttonClicked() {
        String message = "";
        ObservableList<String> movies;
        movies = listView.getSelectionModel().getSelectedItems();


        for (String m: movies) {
            message += m + "\n";
        }

        System.out.println(message);


    }

}
