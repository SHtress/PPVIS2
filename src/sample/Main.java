package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import logic.Match;
import logic.SettingsClassicVoleyball;
import view.MainWindow;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Match match = new Match();
        SettingsClassicVoleyball settings = new SettingsClassicVoleyball();
        MainWindow window = new MainWindow(match, settings);

        Scene scene = new Scene(window.getAnchorPane(),500,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
