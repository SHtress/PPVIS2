package view;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import logic.Settings;

public class SettingsWindow {
    public void onSaveSettingsButtonPressed(){};
    public void onSearchTeamButtonPressed(){};
    private Settings settings;
    private AnchorPane anchorPane;

    public SettingsWindow(Settings settings){
        anchorPane = new AnchorPane();
        this.settings = settings;
        config();
    }

    public AnchorPane getAnchorPane() {
        return anchorPane;
    }

    private void config(){
        GridPane pane = new GridPane();

        Label gameCount = new Label("количесвто партий:     "+ settings.getCountOfGame());
        Label pointCount = new Label("количество очков в партии:    " + settings.getCountOfPoint());
        Label tiebreak = new Label("наличие тай-брейка:     "+settings.getTiebreak());
        Label countPintTiebreak = new Label("количество очков в тай-брейке:     "+settings.getCountOfPointInTiebreaker());

        pane.add(gameCount,0,0);
        pane.add(pointCount,0,1);
        pane.add(tiebreak,0,2);
        pane.add(countPintTiebreak,0,3);

        pane.setVgap(10);
        pane.setHgap(5);

        AnchorPane.setLeftAnchor(pane,50.0);
        AnchorPane.setTopAnchor(pane,50.0);
        anchorPane.getChildren().addAll(pane);
    }
}
