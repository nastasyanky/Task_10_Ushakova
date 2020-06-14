package Decor_R;

import com.sun.javafx.fxml.builder.TriangleMeshBuilder;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Tree_R extends TreeDecorator{
    public Tree_R(ChristmasTree tree) {
        super(tree);
    }

    public void draw(Pane paneTree) {
        super.draw(paneTree);
        drawTree(paneTree);
    }
    private void drawTree(Pane paneTree){
        Polygon tr = new Polygon();
        tr.getPoints().addAll(new Double[]{
            0.,200.,
            75.,0.,
            150.,200.,
        });
        tr.setFill(Color.DARKGREEN );
        paneTree.getChildren().addAll(tr);
    }
}
