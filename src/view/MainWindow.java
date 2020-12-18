package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import logic.Match;
import logic.Settings;
import logic.SettingsClassicVoleyball;
import logic.Statistic;

public class MainWindow {
    public void onShowSettingsWindowButtonPressed(){};
    public void startButtonPressed(){};
    public void searchButtonPressed(){};
    private SettingsClassicVoleyball settings;
    private Match match;


    private AnchorPane anchorPane;
    public MainWindow(Match match, SettingsClassicVoleyball settings){
        this.match = match;
        this.settings = settings;
        anchorPane = new AnchorPane();
        config();
    }

    public AnchorPane getAnchorPane(){
        return this.anchorPane;
    }

    private void config(){
        Button showSettings = new Button("Меню");
        Button startButton = new Button("Старт");
        Button searchButton = new Button("Поиск");
        GridPane pane = new GridPane();

        showSettings.setPrefSize(140,48);
        startButton.setPrefSize(140,48);
        searchButton.setPrefSize(140,48);

        Label firstTeam = new Label("команда А");
        Label secondTeam = new Label("команда В") ;
        Label timer = new Label("Таймер");

        showSettings.setOnAction(settingEq);
        startButton.setOnAction(startEq);
        searchButton.setOnAction(searchEq);

        pane.add(showSettings,1,1);
        pane.add(startButton,0,1);
        pane.add(searchButton,2,1);
        pane.add(firstTeam,0,0);
        pane.add(secondTeam,2,0);
        pane.add(timer,1,0);
        pane.setHgap(5);
        pane.setVgap(10);

        AnchorPane.setLeftAnchor(pane,50.0);
        AnchorPane.setTopAnchor(pane,50.0);
        anchorPane.getChildren().addAll(pane);
    }

    private EventHandler<ActionEvent> settingEq = e -> {
        SettingsWindow settingsWindow = new SettingsWindow(settings);
        Scene scene = new Scene(settingsWindow.getAnchorPane(), 500, 300);
        Stage newWindow = new Stage();
        newWindow.setScene(scene);
        newWindow.show();
    };

    private EventHandler<ActionEvent> startEq = e -> {
        GameWindow gameWindow = new GameWindow(match);
        Scene scene = new Scene(gameWindow.getAnchorPane(), 500, 300);
        Stage newWindow = new Stage();
        newWindow.setScene(scene);
        newWindow.show();
    };

    private EventHandler<ActionEvent> searchEq = e -> {
        SearchWindow searchWindow = new SearchWindow();
        Scene scene = new Scene(searchWindow.getAnchorPane(), 500, 300);
        Stage newWindow = new Stage();
        newWindow.setScene(scene);
        newWindow.show();
    };

}
