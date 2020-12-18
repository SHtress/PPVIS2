package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import logic.Match;
import logic.Settings;

public class GameWindow {
    public void onStartButtonPressed(){};
    public void onAddPointFirstTeamButtonPressed(){};
    public void onAddPointSecondTeamButtonPressed(){};
    public void onRemovePointFirstTeamButtonPressed(){};
    public void onRemovePointSecondTeamButtonPressed(){};
    public void onTimeoutFirstTeamButtonPressed(){};
    public void onTimeoutSecondTeamButtonPressed(){};
    private Match match;
    private AnchorPane anchorPane;


    public GameWindow(Match match){
        anchorPane = new AnchorPane();
        this.match = match;
        config();
    }

    public AnchorPane getAnchorPane() {
        return anchorPane;
    }

    private void config(){
        GridPane pane = new GridPane();
        Button startButton = new Button("Старт");
        Button addPointFirstTeam = new Button("Команда А +1");
        Button addPointSecondTeam = new Button("Команда В +1");
        Button subPointFirstTeam = new Button("Команда А -1");
        Button subPointSecondTeam = new Button("Команда В -1");
        Button addTimeOut = new Button("Таймаут А");
        Button subTimeout = new Button("Таймаут В");


        Label firstPoint = new Label("счет А:   0");
        Label secondPoint = new Label("0    : счет В");
        Label timeout = new Label("Таймаут: 0");

        pane.add(firstPoint,0,0);
        pane.add(secondPoint,1,0);
        pane.add(timeout,0,1);
        pane.add(startButton,0,2);
        pane.add(addPointFirstTeam,0,3);
        pane.add(subPointFirstTeam,1,3);
        pane.add(addPointSecondTeam,0,4);
        pane.add(subPointSecondTeam,1,4);
        pane.add(addTimeOut,0,5);
        pane.add(subTimeout,1,5);

        pane.setVgap(10);
        pane.setHgap(5);

        AnchorPane.setLeftAnchor(pane,50.0);
        AnchorPane.setTopAnchor(pane,50.0);
        anchorPane.getChildren().addAll(pane);
    }
}
