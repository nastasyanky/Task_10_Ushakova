package Decor_R;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;


public class Gateways_R extends TreeDecorator {
    public Gateways_R(ChristmasTree tree) {
        super(tree);
    }
    public void draw(Pane paneGW) {
        super.draw(paneGW);
        drawGateWays(paneGW);
    }
    private void drawGateWays(Pane paneGW){
        Polygon  gw = new Polygon();
        gw.getPoints().addAll(new Double[]{
                25.,0.,
                0.,25.,
                25.,50.,
                50.,25.,
        });
        gw.setFill(Color.BLUEVIOLET);

        paneGW.getChildren().addAll(gw);
    }
}
