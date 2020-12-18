package view;

import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.awt.*;

public class SearchWindow {
    public void onSearchTeamButtonPressed(){};

    private AnchorPane anchorPane;
    private javafx.scene.control.TextField toSearch;

    public SearchWindow(){
        anchorPane = new AnchorPane();
        config();
    }

    public AnchorPane getAnchorPane() {
        return anchorPane;
    }

    private void config(){
        GridPane pane = new GridPane();

        javafx.scene.control.Button search = new javafx.scene.control.Button("Поиск");
        toSearch = new TextField();

        pane.add(search,0,2);
        pane.add(toSearch,0,0,3,1);

        pane.setVgap(10);
        pane.setHgap(5);

        AnchorPane.setLeftAnchor(pane,50.0);
        AnchorPane.setTopAnchor(pane,50.0);
        anchorPane.getChildren().addAll(pane);
    }
}
