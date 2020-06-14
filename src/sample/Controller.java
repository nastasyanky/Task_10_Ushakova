package sample;

import Decor_R.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    public Button b_star;
    public Button b_activities;
    public Pane pane;
    public Pane paneGW;
    public Pane paneTree;
    public Pane paneActivities;
    public Pane paneEvent;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        paneTree.toFront();
        ChristmasTree tree = new Tree_R(new ChristmasTreeImpl());
        tree.draw(paneTree);
    }

    public void addActivities(ActionEvent actionEvent) {
        paneActivities.toFront();
        ChristmasTree tree = new Activities_R(new ChristmasTreeImpl());
        tree.draw(paneActivities);

    }
    public void addEvent(ActionEvent actionEvent) {
        paneEvent.toFront();
        ChristmasTree tree = new Event_R(new ChristmasTreeImpl());
        tree.draw(paneEvent);
    }
    public void addGateways(ActionEvent actionEvent) {
        paneGW.toFront();
        ChristmasTree tree = new Gateways_R(new ChristmasTreeImpl());
        tree.draw(paneGW);
    }

    public void onAll(ActionEvent actionEvent) {
        paneGW.toFront();
        ChristmasTree tree_1 = new Gateways_R(new ChristmasTreeImpl());
        tree_1.draw(paneGW);

        paneEvent.toFront();
        ChristmasTree tree_2 = new Event_R(new ChristmasTreeImpl());
        tree_2.draw(paneEvent);

        paneActivities.toFront();
        ChristmasTree tree_3 = new Activities_R(new ChristmasTreeImpl());
        tree_3.draw(paneActivities);
    }
}
