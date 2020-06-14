package Decor_R;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Event_R extends TreeDecorator{
    public Event_R(ChristmasTree tree) {
        super(tree);
    }
    public void draw(Pane paneEvent) {
        super.draw(paneEvent);
        drawEvent(paneEvent);
    }
    private void drawEvent(Pane paneEvent) {
        Circle ev = new Circle();
        ev.setCenterX(25);
        ev.setCenterY(25);
        ev.setRadius(20);
        ev.setFill(Color.GREENYELLOW);
        paneEvent.getChildren().addAll(ev);
    }
}

