package Decor_R;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Activities_R extends TreeDecorator {
    public Activities_R(ChristmasTree tree) {
        super(tree);
    }
   public void draw(Pane paneActivities) {
        super.draw(paneActivities);
        drawWithPresent(paneActivities);
    }
    private void drawWithPresent(Pane panePresent) {
        Rectangle active = new Rectangle();
        active.setX(10);
        active.setY(10);
        active.setWidth(70);
        active.setHeight(50);
        active.setArcWidth(10);
        active.setArcHeight(10);
        active.setFill(Color.DEEPPINK);

        panePresent.getChildren().addAll(active);
    }
}