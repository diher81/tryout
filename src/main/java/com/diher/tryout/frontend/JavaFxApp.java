package com.diher.tryout.frontend;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;

public class JavaFxApp extends Application {

    private ApplicationContext springContext;
    private Button button;

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("my first fx application");
        button = new Button();
        button.setText("knoppeke");

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        stage.show();


    }
}
