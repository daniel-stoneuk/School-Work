package com.danielstone;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sun.reflect.generics.tree.Tree;

public class Main extends Application {

    Stage window;
    Scene scene;
    Button button;
    TreeView<String> tree;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        TreeItem<String> root, dan, edwin;

        root = new TreeItem<>();
        root.setExpanded(true);

        dan = makeBranch("Dan", root);
        makeBranch("Coding", dan);
        makeBranch("TV", dan);
        makeBranch("Hockey", dan);

        edwin = makeBranch("Edwin", root);
        makeBranch("Some other stuff", edwin);
        makeBranch("More", edwin);

        tree = new TreeView<>(root);
        tree.setShowRoot(false);
        tree.getSelectionModel().selectedIndexProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                System.out.println("new value " + newValue);
            }
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(tree);

        scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.setTitle("TreeView");
        window.show();
    }

    private TreeItem<String> makeBranch(String name, TreeItem<String> parent) {
        TreeItem<String> current = new TreeItem<>(name);
        current.setExpanded(true);
        parent.getChildren().add(current);

        return current;
    }


}
