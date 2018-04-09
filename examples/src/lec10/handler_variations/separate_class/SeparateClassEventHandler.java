package lec10.handler_variations.separate_class;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class SeparateClassEventHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event) {
        System.out.println("Event handled in a separate class.");
    }
}
