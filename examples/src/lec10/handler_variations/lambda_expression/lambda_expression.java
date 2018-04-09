package lec10.handler_variations.lambda_expression;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class lambda_expression extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane sp = new StackPane();
        Button btClick = new Button("Click Me!");

        //Add the handler which is a separate class.
        btClick.setOnAction(event -> {
            System.out.println("Event handled in a lambda expression.");
        });

        sp.getChildren().add(btClick);

        Scene scene = new Scene(sp);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}