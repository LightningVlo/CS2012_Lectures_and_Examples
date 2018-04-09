package lec10.handler_variations.inner_class;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class InnerClassHandlerExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane sp = new StackPane();
        Button btClick = new Button("Click Me!");

        //Add the handler which is a separate class.
        btClick.setOnAction(new InnerClassEventHandler());

        sp.getChildren().add(btClick);

        Scene scene = new Scene(sp);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //Inner class for the action handler.
    class InnerClassEventHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            System.out.println("Event handled in an inner class.");
        }
    }


}